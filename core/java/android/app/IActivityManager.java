//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package android.app;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager.StackInfo;
import android.app.ActivityManager.TaskDescription;
import android.app.ActivityManager.TaskSnapshot;
import android.app.ActivityManager.TaskThumbnail;
import android.app.ApplicationErrorReport.ParcelableCrashInfo;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.ParceledListSlice;
import android.content.pm.UserInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.IProgressListener;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.StrictMode.ViolationInfo;
import android.service.voice.IVoiceInteractionSession;
import android.text.TextUtils;
import com.android.internal.app.IVoiceInteractor;
import com.android.internal.os.IResultReceiver;
import com.android.internal.policy.IKeyguardDismissCallback;
import java.util.ArrayList;
import java.util.List;

public interface IActivityManager extends IInterface {
    ParcelFileDescriptor openContentUri(String var1) throws RemoteException;

    void handleApplicationCrash(IBinder var1, ParcelableCrashInfo var2) throws RemoteException;

    int startActivity(IApplicationThread var1, String var2, Intent var3, String var4, IBinder var5, String var6, int var7, int var8, ProfilerInfo var9, Bundle var10) throws RemoteException;

    void unhandledBack() throws RemoteException;

    boolean finishActivity(IBinder var1, int var2, Intent var3, int var4) throws RemoteException;

    Intent registerReceiver(IApplicationThread var1, String var2, IIntentReceiver var3, IntentFilter var4, String var5, int var6, int var7) throws RemoteException;

    void unregisterReceiver(IIntentReceiver var1) throws RemoteException;

    int broadcastIntent(IApplicationThread var1, Intent var2, String var3, IIntentReceiver var4, int var5, String var6, Bundle var7, String[] var8, int var9, Bundle var10, boolean var11, boolean var12, int var13) throws RemoteException;

    void unbroadcastIntent(IApplicationThread var1, Intent var2, int var3) throws RemoteException;

    void finishReceiver(IBinder var1, int var2, String var3, Bundle var4, boolean var5, int var6) throws RemoteException;

    void attachApplication(IApplicationThread var1) throws RemoteException;

    void activityIdle(IBinder var1, Configuration var2, boolean var3) throws RemoteException;

    void activityPaused(IBinder var1) throws RemoteException;

    void activityStopped(IBinder var1, Bundle var2, PersistableBundle var3, CharSequence var4) throws RemoteException;

    String getCallingPackage(IBinder var1) throws RemoteException;

    ComponentName getCallingActivity(IBinder var1) throws RemoteException;

    List<RunningTaskInfo> getTasks(int var1, int var2) throws RemoteException;

    void moveTaskToFront(int var1, int var2, Bundle var3) throws RemoteException;

    void moveTaskBackwards(int var1) throws RemoteException;

    int getTaskForActivity(IBinder var1, boolean var2) throws RemoteException;

    ContentProviderHolder getContentProvider(IApplicationThread var1, String var2, int var3, boolean var4) throws RemoteException;

    void publishContentProviders(IApplicationThread var1, List<ContentProviderHolder> var2) throws RemoteException;

    boolean refContentProvider(IBinder var1, int var2, int var3) throws RemoteException;

    void finishSubActivity(IBinder var1, String var2, int var3) throws RemoteException;

    PendingIntent getRunningServiceControlPanel(ComponentName var1) throws RemoteException;

    ComponentName startService(IApplicationThread var1, Intent var2, String var3, boolean var4, String var5, int var6) throws RemoteException;

    int stopService(IApplicationThread var1, Intent var2, String var3, int var4) throws RemoteException;

    int bindService(IApplicationThread var1, IBinder var2, Intent var3, String var4, IServiceConnection var5, int var6, String var7, int var8) throws RemoteException;

    boolean unbindService(IServiceConnection var1) throws RemoteException;

    void publishService(IBinder var1, Intent var2, IBinder var3) throws RemoteException;

    void activityResumed(IBinder var1) throws RemoteException;

    void setDebugApp(String var1, boolean var2, boolean var3) throws RemoteException;

    void setAlwaysFinish(boolean var1) throws RemoteException;

    boolean startInstrumentation(ComponentName var1, String var2, int var3, Bundle var4, IInstrumentationWatcher var5, IUiAutomationConnection var6, int var7, String var8) throws RemoteException;

    void addInstrumentationResults(IApplicationThread var1, Bundle var2) throws RemoteException;

    void finishInstrumentation(IApplicationThread var1, int var2, Bundle var3) throws RemoteException;

    Configuration getConfiguration() throws RemoteException;

    boolean updateConfiguration(Configuration var1) throws RemoteException;

    boolean stopServiceToken(ComponentName var1, IBinder var2, int var3) throws RemoteException;

    ComponentName getActivityClassForToken(IBinder var1) throws RemoteException;

    String getPackageForToken(IBinder var1) throws RemoteException;

    void setProcessLimit(int var1) throws RemoteException;

    int getProcessLimit() throws RemoteException;

    int checkPermission(String var1, int var2, int var3) throws RemoteException;

    int checkUriPermission(Uri var1, int var2, int var3, int var4, int var5, IBinder var6) throws RemoteException;

    void grantUriPermission(IApplicationThread var1, String var2, Uri var3, int var4, int var5) throws RemoteException;

    void revokeUriPermission(IApplicationThread var1, String var2, Uri var3, int var4, int var5) throws RemoteException;

    void setActivityController(IActivityController var1, boolean var2) throws RemoteException;

    void showWaitingForDebugger(IApplicationThread var1, boolean var2) throws RemoteException;

    void signalPersistentProcesses(int var1) throws RemoteException;

    ParceledListSlice getRecentTasks(int var1, int var2, int var3) throws RemoteException;

    void serviceDoneExecuting(IBinder var1, int var2, int var3, int var4) throws RemoteException;

    void activityDestroyed(IBinder var1) throws RemoteException;

    IIntentSender getIntentSender(int var1, String var2, IBinder var3, String var4, int var5, Intent[] var6, String[] var7, int var8, Bundle var9, int var10) throws RemoteException;

    void cancelIntentSender(IIntentSender var1) throws RemoteException;

    String getPackageForIntentSender(IIntentSender var1) throws RemoteException;

    void registerIntentSenderCancelListener(IIntentSender var1, IResultReceiver var2) throws RemoteException;

    void unregisterIntentSenderCancelListener(IIntentSender var1, IResultReceiver var2) throws RemoteException;

    void enterSafeMode() throws RemoteException;

    boolean startNextMatchingActivity(IBinder var1, Intent var2, Bundle var3) throws RemoteException;

    void noteWakeupAlarm(IIntentSender var1, int var2, String var3, String var4) throws RemoteException;

    void removeContentProvider(IBinder var1, boolean var2) throws RemoteException;

    void setRequestedOrientation(IBinder var1, int var2) throws RemoteException;

    int getRequestedOrientation(IBinder var1) throws RemoteException;

    void unbindFinished(IBinder var1, Intent var2, boolean var3) throws RemoteException;

    void setProcessImportant(IBinder var1, int var2, boolean var3, String var4) throws RemoteException;

    void setServiceForeground(ComponentName var1, IBinder var2, int var3, Notification var4, int var5) throws RemoteException;

    boolean moveActivityTaskToBack(IBinder var1, boolean var2) throws RemoteException;

    void getMemoryInfo(MemoryInfo var1) throws RemoteException;

    List<ProcessErrorStateInfo> getProcessesInErrorState() throws RemoteException;

    boolean clearApplicationUserData(String var1, IPackageDataObserver var2, int var3) throws RemoteException;

    void forceStopPackage(String var1, int var2) throws RemoteException;

    boolean killPids(int[] var1, String var2, boolean var3) throws RemoteException;

    List<RunningServiceInfo> getServices(int var1, int var2) throws RemoteException;

    TaskThumbnail getTaskThumbnail(int var1) throws RemoteException;

    TaskDescription getTaskDescription(int var1) throws RemoteException;

    List<RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException;

    ConfigurationInfo getDeviceConfigurationInfo() throws RemoteException;

    IBinder peekService(Intent var1, String var2, String var3) throws RemoteException;

    boolean profileControl(String var1, int var2, boolean var3, ProfilerInfo var4, int var5) throws RemoteException;

    boolean shutdown(int var1) throws RemoteException;

    void stopAppSwitches() throws RemoteException;

    void resumeAppSwitches() throws RemoteException;

    boolean bindBackupAgent(String var1, int var2, int var3) throws RemoteException;

    void backupAgentCreated(String var1, IBinder var2) throws RemoteException;

    void unbindBackupAgent(ApplicationInfo var1) throws RemoteException;

    int getUidForIntentSender(IIntentSender var1) throws RemoteException;

    int handleIncomingUser(int var1, int var2, int var3, boolean var4, boolean var5, String var6, String var7) throws RemoteException;

    void addPackageDependency(String var1) throws RemoteException;

    void killApplication(String var1, int var2, int var3, String var4) throws RemoteException;

    void closeSystemDialogs(String var1) throws RemoteException;

    android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] var1) throws RemoteException;

    void killApplicationProcess(String var1, int var2) throws RemoteException;

    int startActivityIntentSender(IApplicationThread var1, IIntentSender var2, IBinder var3, Intent var4, String var5, IBinder var6, String var7, int var8, int var9, int var10, Bundle var11) throws RemoteException;

    void overridePendingTransition(IBinder var1, String var2, int var3, int var4) throws RemoteException;

    boolean handleApplicationWtf(IBinder var1, String var2, boolean var3, ParcelableCrashInfo var4) throws RemoteException;

    void killBackgroundProcesses(String var1, int var2) throws RemoteException;

    boolean isUserAMonkey() throws RemoteException;

    WaitResult startActivityAndWait(IApplicationThread var1, String var2, Intent var3, String var4, IBinder var5, String var6, int var7, int var8, ProfilerInfo var9, Bundle var10, int var11) throws RemoteException;

    boolean willActivityBeVisible(IBinder var1) throws RemoteException;

    int startActivityWithConfig(IApplicationThread var1, String var2, Intent var3, String var4, IBinder var5, String var6, int var7, int var8, Configuration var9, Bundle var10, int var11) throws RemoteException;

    List<ApplicationInfo> getRunningExternalApplications() throws RemoteException;

    void finishHeavyWeightApp() throws RemoteException;

    void handleApplicationStrictModeViolation(IBinder var1, int var2, ViolationInfo var3) throws RemoteException;

    boolean isImmersive(IBinder var1) throws RemoteException;

    void setImmersive(IBinder var1, boolean var2) throws RemoteException;

    boolean isTopActivityImmersive() throws RemoteException;

    void crashApplication(int var1, int var2, String var3, int var4, String var5) throws RemoteException;

    String getProviderMimeType(Uri var1, int var2) throws RemoteException;

    IBinder newUriPermissionOwner(String var1) throws RemoteException;

    void grantUriPermissionFromOwner(IBinder var1, int var2, String var3, Uri var4, int var5, int var6, int var7) throws RemoteException;

    void revokeUriPermissionFromOwner(IBinder var1, Uri var2, int var3, int var4) throws RemoteException;

    int checkGrantUriPermission(int var1, String var2, Uri var3, int var4, int var5) throws RemoteException;

    boolean dumpHeap(String var1, int var2, boolean var3, boolean var4, boolean var5, String var6, ParcelFileDescriptor var7) throws RemoteException;

    int startActivities(IApplicationThread var1, String var2, Intent[] var3, String[] var4, IBinder var5, Bundle var6, int var7) throws RemoteException;

    boolean isUserRunning(int var1, int var2) throws RemoteException;

    void activitySlept(IBinder var1) throws RemoteException;

    int getFrontActivityScreenCompatMode() throws RemoteException;

    void setFrontActivityScreenCompatMode(int var1) throws RemoteException;

    int getPackageScreenCompatMode(String var1) throws RemoteException;

    void setPackageScreenCompatMode(String var1, int var2) throws RemoteException;

    boolean getPackageAskScreenCompat(String var1) throws RemoteException;

    void setPackageAskScreenCompat(String var1, boolean var2) throws RemoteException;

    boolean switchUser(int var1) throws RemoteException;

    void setFocusedTask(int var1) throws RemoteException;

    boolean removeTask(int var1) throws RemoteException;

    void registerProcessObserver(IProcessObserver var1) throws RemoteException;

    void unregisterProcessObserver(IProcessObserver var1) throws RemoteException;

    boolean isIntentSenderTargetedToPackage(IIntentSender var1) throws RemoteException;

    void updatePersistentConfiguration(Configuration var1) throws RemoteException;

    long[] getProcessPss(int[] var1) throws RemoteException;

    void showBootMessage(CharSequence var1, boolean var2) throws RemoteException;

    void killAllBackgroundProcesses() throws RemoteException;

    ContentProviderHolder getContentProviderExternal(String var1, int var2, IBinder var3) throws RemoteException;

    void removeContentProviderExternal(String var1, IBinder var2) throws RemoteException;

    void getMyMemoryState(RunningAppProcessInfo var1) throws RemoteException;

    boolean killProcessesBelowForeground(String var1) throws RemoteException;

    UserInfo getCurrentUser() throws RemoteException;

    boolean shouldUpRecreateTask(IBinder var1, String var2) throws RemoteException;

    boolean navigateUpTo(IBinder var1, Intent var2, int var3, Intent var4) throws RemoteException;

    void setLockScreenShown(boolean var1, int var2) throws RemoteException;

    boolean finishActivityAffinity(IBinder var1) throws RemoteException;

    int getLaunchedFromUid(IBinder var1) throws RemoteException;

    void unstableProviderDied(IBinder var1) throws RemoteException;

    boolean isIntentSenderAnActivity(IIntentSender var1) throws RemoteException;

    int startActivityAsUser(IApplicationThread var1, String var2, Intent var3, String var4, IBinder var5, String var6, int var7, int var8, ProfilerInfo var9, Bundle var10, int var11) throws RemoteException;

    int stopUser(int var1, boolean var2, IStopUserCallback var3) throws RemoteException;

    void registerUserSwitchObserver(IUserSwitchObserver var1, String var2) throws RemoteException;

    void unregisterUserSwitchObserver(IUserSwitchObserver var1) throws RemoteException;

    int[] getRunningUserIds() throws RemoteException;

    void requestBugReport(int var1) throws RemoteException;

    void requestTelephonyBugReport(String var1, String var2) throws RemoteException;

    long inputDispatchingTimedOut(int var1, boolean var2, String var3) throws RemoteException;

    void clearPendingBackup() throws RemoteException;

    Intent getIntentForIntentSender(IIntentSender var1) throws RemoteException;

    Bundle getAssistContextExtras(int var1) throws RemoteException;

    void reportAssistContextExtras(IBinder var1, Bundle var2, AssistStructure var3, AssistContent var4, Uri var5) throws RemoteException;

    String getLaunchedFromPackage(IBinder var1) throws RemoteException;

    void killUid(int var1, int var2, String var3) throws RemoteException;

    void setUserIsMonkey(boolean var1) throws RemoteException;

    void hang(IBinder var1, boolean var2) throws RemoteException;

    void moveTaskToStack(int var1, int var2, boolean var3) throws RemoteException;

    void resizeStack(int var1, Rect var2, boolean var3, boolean var4, boolean var5, int var6) throws RemoteException;

    List<StackInfo> getAllStackInfos() throws RemoteException;

    void setFocusedStack(int var1) throws RemoteException;

    StackInfo getStackInfo(int var1) throws RemoteException;

    boolean convertFromTranslucent(IBinder var1) throws RemoteException;

    boolean convertToTranslucent(IBinder var1, Bundle var2) throws RemoteException;

    void notifyActivityDrawn(IBinder var1) throws RemoteException;

    void reportActivityFullyDrawn(IBinder var1, boolean var2) throws RemoteException;

    void restart() throws RemoteException;

    void performIdleMaintenance() throws RemoteException;

    void takePersistableUriPermission(Uri var1, int var2, int var3) throws RemoteException;

    void releasePersistableUriPermission(Uri var1, int var2, int var3) throws RemoteException;

    ParceledListSlice getPersistedUriPermissions(String var1, boolean var2) throws RemoteException;

    void appNotRespondingViaProvider(IBinder var1) throws RemoteException;

    Rect getTaskBounds(int var1) throws RemoteException;

    int getActivityDisplayId(IBinder var1) throws RemoteException;

    boolean setProcessMemoryTrimLevel(String var1, int var2, int var3) throws RemoteException;

    String getTagForIntentSender(IIntentSender var1, String var2) throws RemoteException;

    boolean startUserInBackground(int var1) throws RemoteException;

    void startLockTaskModeById(int var1) throws RemoteException;

    void startLockTaskModeByToken(IBinder var1) throws RemoteException;

    void stopLockTaskMode() throws RemoteException;

    boolean isInLockTaskMode() throws RemoteException;

    void setTaskDescription(IBinder var1, TaskDescription var2) throws RemoteException;

    int startVoiceActivity(String var1, int var2, int var3, Intent var4, String var5, IVoiceInteractionSession var6, IVoiceInteractor var7, int var8, ProfilerInfo var9, Bundle var10, int var11) throws RemoteException;

    int startAssistantActivity(String var1, int var2, int var3, Intent var4, String var5, Bundle var6, int var7) throws RemoteException;

    Bundle getActivityOptions(IBinder var1) throws RemoteException;

    List<IBinder> getAppTasks(String var1) throws RemoteException;

    void startSystemLockTaskMode(int var1) throws RemoteException;

    void stopSystemLockTaskMode() throws RemoteException;

    void finishVoiceTask(IVoiceInteractionSession var1) throws RemoteException;

    boolean isTopOfTask(IBinder var1) throws RemoteException;

    void notifyLaunchTaskBehindComplete(IBinder var1) throws RemoteException;

    int startActivityFromRecents(int var1, Bundle var2) throws RemoteException;

    void notifyEnterAnimationComplete(IBinder var1) throws RemoteException;

    int startActivityAsCaller(IApplicationThread var1, String var2, Intent var3, String var4, IBinder var5, String var6, int var7, int var8, ProfilerInfo var9, Bundle var10, boolean var11, int var12) throws RemoteException;

    int addAppTask(IBinder var1, Intent var2, TaskDescription var3, Bitmap var4) throws RemoteException;

    Point getAppTaskThumbnailSize() throws RemoteException;

    boolean releaseActivityInstance(IBinder var1) throws RemoteException;

    void releaseSomeActivities(IApplicationThread var1) throws RemoteException;

    void bootAnimationComplete() throws RemoteException;

    Bitmap getTaskDescriptionIcon(String var1, int var2) throws RemoteException;

    boolean launchAssistIntent(Intent var1, int var2, String var3, int var4, Bundle var5) throws RemoteException;

    void startInPlaceAnimationOnFrontMostApplication(Bundle var1) throws RemoteException;

    int checkPermissionWithToken(String var1, int var2, int var3, IBinder var4) throws RemoteException;

    void registerTaskStackListener(ITaskStackListener var1) throws RemoteException;

    void notifyCleartextNetwork(int var1, byte[] var2) throws RemoteException;

    int createStackOnDisplay(int var1) throws RemoteException;

    int getFocusedStackId() throws RemoteException;

    void setTaskResizeable(int var1, int var2) throws RemoteException;

    boolean requestAssistContextExtras(int var1, IResultReceiver var2, Bundle var3, IBinder var4, boolean var5, boolean var6) throws RemoteException;

    void resizeTask(int var1, Rect var2, int var3) throws RemoteException;

    int getLockTaskModeState() throws RemoteException;

    void setDumpHeapDebugLimit(String var1, int var2, long var3, String var5) throws RemoteException;

    void dumpHeapFinished(String var1) throws RemoteException;

    void setVoiceKeepAwake(IVoiceInteractionSession var1, boolean var2) throws RemoteException;

    void updateLockTaskPackages(int var1, String[] var2) throws RemoteException;

    void noteAlarmStart(IIntentSender var1, int var2, String var3) throws RemoteException;

    void noteAlarmFinish(IIntentSender var1, int var2, String var3) throws RemoteException;

    int getPackageProcessState(String var1, String var2) throws RemoteException;

    void showLockTaskEscapeMessage(IBinder var1) throws RemoteException;

    void updateDeviceOwner(String var1) throws RemoteException;

    void keyguardGoingAway(int var1) throws RemoteException;

    int getUidProcessState(int var1, String var2) throws RemoteException;

    void registerUidObserver(IUidObserver var1, int var2, int var3, String var4) throws RemoteException;

    void unregisterUidObserver(IUidObserver var1) throws RemoteException;

    boolean isAssistDataAllowedOnCurrentActivity() throws RemoteException;

    boolean showAssistFromActivity(IBinder var1, Bundle var2) throws RemoteException;

    boolean isRootVoiceInteraction(IBinder var1) throws RemoteException;

    boolean startBinderTracking() throws RemoteException;

    boolean stopBinderTrackingAndDump(ParcelFileDescriptor var1) throws RemoteException;

    void positionTaskInStack(int var1, int var2, int var3) throws RemoteException;

    int getActivityStackId(IBinder var1) throws RemoteException;

    void exitFreeformMode(IBinder var1) throws RemoteException;

    void reportSizeConfigurations(IBinder var1, int[] var2, int[] var3, int[] var4) throws RemoteException;

    boolean moveTaskToDockedStack(int var1, int var2, boolean var3, boolean var4, Rect var5) throws RemoteException;

    void suppressResizeConfigChanges(boolean var1) throws RemoteException;

    void moveTasksToFullscreenStack(int var1, boolean var2) throws RemoteException;

    boolean moveTopActivityToPinnedStack(int var1, Rect var2) throws RemoteException;

    boolean isAppStartModeDisabled(int var1, String var2) throws RemoteException;

    boolean unlockUser(int var1, byte[] var2, byte[] var3, IProgressListener var4) throws RemoteException;

    boolean isInMultiWindowMode(IBinder var1) throws RemoteException;

    boolean isInPictureInPictureMode(IBinder var1) throws RemoteException;

    void killPackageDependents(String var1, int var2) throws RemoteException;

    boolean enterPictureInPictureMode(IBinder var1, PictureInPictureParams var2) throws RemoteException;

    void setPictureInPictureParams(IBinder var1, PictureInPictureParams var2) throws RemoteException;

    int getMaxNumPictureInPictureActions(IBinder var1) throws RemoteException;

    void activityRelaunched(IBinder var1) throws RemoteException;

    IBinder getUriPermissionOwnerForActivity(IBinder var1) throws RemoteException;

    void resizeDockedStack(Rect var1, Rect var2, Rect var3, Rect var4, Rect var5) throws RemoteException;

    int setVrMode(IBinder var1, boolean var2, ComponentName var3) throws RemoteException;

    ParceledListSlice getGrantedUriPermissions(String var1, int var2) throws RemoteException;

    void clearGrantedUriPermissions(String var1, int var2) throws RemoteException;

    boolean isAppForeground(int var1) throws RemoteException;

    void startLocalVoiceInteraction(IBinder var1, Bundle var2) throws RemoteException;

    void stopLocalVoiceInteraction(IBinder var1) throws RemoteException;

    boolean supportsLocalVoiceInteraction() throws RemoteException;

    void notifyPinnedStackAnimationStarted() throws RemoteException;

    void notifyPinnedStackAnimationEnded() throws RemoteException;

    void removeStack(int var1) throws RemoteException;

    void makePackageIdle(String var1, int var2) throws RemoteException;

    int getMemoryTrimLevel() throws RemoteException;

    void resizePinnedStack(Rect var1, Rect var2) throws RemoteException;

    boolean isVrModePackageEnabled(ComponentName var1) throws RemoteException;

    void swapDockedAndFullscreenStack() throws RemoteException;

    void notifyLockedProfile(int var1) throws RemoteException;

    void startConfirmDeviceCredentialIntent(Intent var1, Bundle var2) throws RemoteException;

    void sendIdleJobTrigger() throws RemoteException;

    int sendIntentSender(IIntentSender var1, IBinder var2, int var3, Intent var4, String var5, IIntentReceiver var6, String var7, Bundle var8) throws RemoteException;

    void setVrThread(int var1) throws RemoteException;

    void setRenderThread(int var1) throws RemoteException;

    void setHasTopUi(boolean var1) throws RemoteException;

    void requestActivityRelaunch(IBinder var1) throws RemoteException;

    boolean updateDisplayOverrideConfiguration(Configuration var1, int var2) throws RemoteException;

    void unregisterTaskStackListener(ITaskStackListener var1) throws RemoteException;

    void moveStackToDisplay(int var1, int var2) throws RemoteException;

    boolean requestAutofillData(IResultReceiver var1, Bundle var2, IBinder var3, int var4) throws RemoteException;

    void dismissKeyguard(IBinder var1, IKeyguardDismissCallback var2) throws RemoteException;

    int restartUserInBackground(int var1) throws RemoteException;

    void cancelTaskWindowTransition(int var1) throws RemoteException;

    void cancelTaskThumbnailTransition(int var1) throws RemoteException;

    TaskSnapshot getTaskSnapshot(int var1, boolean var2) throws RemoteException;

    void scheduleApplicationInfoChanged(List<String> var1, int var2) throws RemoteException;

    void setPersistentVrThread(int var1) throws RemoteException;

    void waitForNetworkStateUpdate(long var1) throws RemoteException;

    void setDisablePreviewScreenshots(IBinder var1, boolean var2) throws RemoteException;

    int getLastResumedActivityUserId() throws RemoteException;

    void backgroundWhitelistUid(int var1) throws RemoteException;

    void setShowWhenLocked(IBinder var1, boolean var2) throws RemoteException;

    void setTurnScreenOn(IBinder var1, boolean var2) throws RemoteException;

    public abstract static class Stub extends Binder implements IActivityManager {
        private static final String DESCRIPTOR = "android.app.IActivityManager";
        static final int TRANSACTION_openContentUri = 1;
        static final int TRANSACTION_handleApplicationCrash = 2;
        static final int TRANSACTION_startActivity = 3;
        static final int TRANSACTION_unhandledBack = 4;
        static final int TRANSACTION_finishActivity = 5;
        static final int TRANSACTION_registerReceiver = 6;
        static final int TRANSACTION_unregisterReceiver = 7;
        static final int TRANSACTION_broadcastIntent = 8;
        static final int TRANSACTION_unbroadcastIntent = 9;
        static final int TRANSACTION_finishReceiver = 10;
        static final int TRANSACTION_attachApplication = 11;
        static final int TRANSACTION_activityIdle = 12;
        static final int TRANSACTION_activityPaused = 13;
        static final int TRANSACTION_activityStopped = 14;
        static final int TRANSACTION_getCallingPackage = 15;
        static final int TRANSACTION_getCallingActivity = 16;
        static final int TRANSACTION_getTasks = 17;
        static final int TRANSACTION_moveTaskToFront = 18;
        static final int TRANSACTION_moveTaskBackwards = 19;
        static final int TRANSACTION_getTaskForActivity = 20;
        static final int TRANSACTION_getContentProvider = 21;
        static final int TRANSACTION_publishContentProviders = 22;
        static final int TRANSACTION_refContentProvider = 23;
        static final int TRANSACTION_finishSubActivity = 24;
        static final int TRANSACTION_getRunningServiceControlPanel = 25;
        static final int TRANSACTION_startService = 26;
        static final int TRANSACTION_stopService = 27;
        static final int TRANSACTION_bindService = 28;
        static final int TRANSACTION_unbindService = 29;
        static final int TRANSACTION_publishService = 30;
        static final int TRANSACTION_activityResumed = 31;
        static final int TRANSACTION_setDebugApp = 32;
        static final int TRANSACTION_setAlwaysFinish = 33;
        static final int TRANSACTION_startInstrumentation = 34;
        static final int TRANSACTION_addInstrumentationResults = 35;
        static final int TRANSACTION_finishInstrumentation = 36;
        static final int TRANSACTION_getConfiguration = 37;
        static final int TRANSACTION_updateConfiguration = 38;
        static final int TRANSACTION_stopServiceToken = 39;
        static final int TRANSACTION_getActivityClassForToken = 40;
        static final int TRANSACTION_getPackageForToken = 41;
        static final int TRANSACTION_setProcessLimit = 42;
        static final int TRANSACTION_getProcessLimit = 43;
        static final int TRANSACTION_checkPermission = 44;
        static final int TRANSACTION_checkUriPermission = 45;
        static final int TRANSACTION_grantUriPermission = 46;
        static final int TRANSACTION_revokeUriPermission = 47;
        static final int TRANSACTION_setActivityController = 48;
        static final int TRANSACTION_showWaitingForDebugger = 49;
        static final int TRANSACTION_signalPersistentProcesses = 50;
        static final int TRANSACTION_getRecentTasks = 51;
        static final int TRANSACTION_serviceDoneExecuting = 52;
        static final int TRANSACTION_activityDestroyed = 53;
        static final int TRANSACTION_getIntentSender = 54;
        static final int TRANSACTION_cancelIntentSender = 55;
        static final int TRANSACTION_getPackageForIntentSender = 56;
        static final int TRANSACTION_registerIntentSenderCancelListener = 57;
        static final int TRANSACTION_unregisterIntentSenderCancelListener = 58;
        static final int TRANSACTION_enterSafeMode = 59;
        static final int TRANSACTION_startNextMatchingActivity = 60;
        static final int TRANSACTION_noteWakeupAlarm = 61;
        static final int TRANSACTION_removeContentProvider = 62;
        static final int TRANSACTION_setRequestedOrientation = 63;
        static final int TRANSACTION_getRequestedOrientation = 64;
        static final int TRANSACTION_unbindFinished = 65;
        static final int TRANSACTION_setProcessImportant = 66;
        static final int TRANSACTION_setServiceForeground = 67;
        static final int TRANSACTION_moveActivityTaskToBack = 68;
        static final int TRANSACTION_getMemoryInfo = 69;
        static final int TRANSACTION_getProcessesInErrorState = 70;
        static final int TRANSACTION_clearApplicationUserData = 71;
        static final int TRANSACTION_forceStopPackage = 72;
        static final int TRANSACTION_killPids = 73;
        static final int TRANSACTION_getServices = 74;
        static final int TRANSACTION_getTaskThumbnail = 75;
        static final int TRANSACTION_getTaskDescription = 76;
        static final int TRANSACTION_getRunningAppProcesses = 77;
        static final int TRANSACTION_getDeviceConfigurationInfo = 78;
        static final int TRANSACTION_peekService = 79;
        static final int TRANSACTION_profileControl = 80;
        static final int TRANSACTION_shutdown = 81;
        static final int TRANSACTION_stopAppSwitches = 82;
        static final int TRANSACTION_resumeAppSwitches = 83;
        static final int TRANSACTION_bindBackupAgent = 84;
        static final int TRANSACTION_backupAgentCreated = 85;
        static final int TRANSACTION_unbindBackupAgent = 86;
        static final int TRANSACTION_getUidForIntentSender = 87;
        static final int TRANSACTION_handleIncomingUser = 88;
        static final int TRANSACTION_addPackageDependency = 89;
        static final int TRANSACTION_killApplication = 90;
        static final int TRANSACTION_closeSystemDialogs = 91;
        static final int TRANSACTION_getProcessMemoryInfo = 92;
        static final int TRANSACTION_killApplicationProcess = 93;
        static final int TRANSACTION_startActivityIntentSender = 94;
        static final int TRANSACTION_overridePendingTransition = 95;
        static final int TRANSACTION_handleApplicationWtf = 96;
        static final int TRANSACTION_killBackgroundProcesses = 97;
        static final int TRANSACTION_isUserAMonkey = 98;
        static final int TRANSACTION_startActivityAndWait = 99;
        static final int TRANSACTION_willActivityBeVisible = 100;
        static final int TRANSACTION_startActivityWithConfig = 101;
        static final int TRANSACTION_getRunningExternalApplications = 102;
        static final int TRANSACTION_finishHeavyWeightApp = 103;
        static final int TRANSACTION_handleApplicationStrictModeViolation = 104;
        static final int TRANSACTION_isImmersive = 105;
        static final int TRANSACTION_setImmersive = 106;
        static final int TRANSACTION_isTopActivityImmersive = 107;
        static final int TRANSACTION_crashApplication = 108;
        static final int TRANSACTION_getProviderMimeType = 109;
        static final int TRANSACTION_newUriPermissionOwner = 110;
        static final int TRANSACTION_grantUriPermissionFromOwner = 111;
        static final int TRANSACTION_revokeUriPermissionFromOwner = 112;
        static final int TRANSACTION_checkGrantUriPermission = 113;
        static final int TRANSACTION_dumpHeap = 114;
        static final int TRANSACTION_startActivities = 115;
        static final int TRANSACTION_isUserRunning = 116;
        static final int TRANSACTION_activitySlept = 117;
        static final int TRANSACTION_getFrontActivityScreenCompatMode = 118;
        static final int TRANSACTION_setFrontActivityScreenCompatMode = 119;
        static final int TRANSACTION_getPackageScreenCompatMode = 120;
        static final int TRANSACTION_setPackageScreenCompatMode = 121;
        static final int TRANSACTION_getPackageAskScreenCompat = 122;
        static final int TRANSACTION_setPackageAskScreenCompat = 123;
        static final int TRANSACTION_switchUser = 124;
        static final int TRANSACTION_setFocusedTask = 125;
        static final int TRANSACTION_removeTask = 126;
        static final int TRANSACTION_registerProcessObserver = 127;
        static final int TRANSACTION_unregisterProcessObserver = 128;
        static final int TRANSACTION_isIntentSenderTargetedToPackage = 129;
        static final int TRANSACTION_updatePersistentConfiguration = 130;
        static final int TRANSACTION_getProcessPss = 131;
        static final int TRANSACTION_showBootMessage = 132;
        static final int TRANSACTION_killAllBackgroundProcesses = 133;
        static final int TRANSACTION_getContentProviderExternal = 134;
        static final int TRANSACTION_removeContentProviderExternal = 135;
        static final int TRANSACTION_getMyMemoryState = 136;
        static final int TRANSACTION_killProcessesBelowForeground = 137;
        static final int TRANSACTION_getCurrentUser = 138;
        static final int TRANSACTION_shouldUpRecreateTask = 139;
        static final int TRANSACTION_navigateUpTo = 140;
        static final int TRANSACTION_setLockScreenShown = 141;
        static final int TRANSACTION_finishActivityAffinity = 142;
        static final int TRANSACTION_getLaunchedFromUid = 143;
        static final int TRANSACTION_unstableProviderDied = 144;
        static final int TRANSACTION_isIntentSenderAnActivity = 145;
        static final int TRANSACTION_startActivityAsUser = 146;
        static final int TRANSACTION_stopUser = 147;
        static final int TRANSACTION_registerUserSwitchObserver = 148;
        static final int TRANSACTION_unregisterUserSwitchObserver = 149;
        static final int TRANSACTION_getRunningUserIds = 150;
        static final int TRANSACTION_requestBugReport = 151;
        static final int TRANSACTION_requestTelephonyBugReport = 152;
        static final int TRANSACTION_inputDispatchingTimedOut = 153;
        static final int TRANSACTION_clearPendingBackup = 154;
        static final int TRANSACTION_getIntentForIntentSender = 155;
        static final int TRANSACTION_getAssistContextExtras = 156;
        static final int TRANSACTION_reportAssistContextExtras = 157;
        static final int TRANSACTION_getLaunchedFromPackage = 158;
        static final int TRANSACTION_killUid = 159;
        static final int TRANSACTION_setUserIsMonkey = 160;
        static final int TRANSACTION_hang = 161;
        static final int TRANSACTION_moveTaskToStack = 162;
        static final int TRANSACTION_resizeStack = 163;
        static final int TRANSACTION_getAllStackInfos = 164;
        static final int TRANSACTION_setFocusedStack = 165;
        static final int TRANSACTION_getStackInfo = 166;
        static final int TRANSACTION_convertFromTranslucent = 167;
        static final int TRANSACTION_convertToTranslucent = 168;
        static final int TRANSACTION_notifyActivityDrawn = 169;
        static final int TRANSACTION_reportActivityFullyDrawn = 170;
        static final int TRANSACTION_restart = 171;
        static final int TRANSACTION_performIdleMaintenance = 172;
        static final int TRANSACTION_takePersistableUriPermission = 173;
        static final int TRANSACTION_releasePersistableUriPermission = 174;
        static final int TRANSACTION_getPersistedUriPermissions = 175;
        static final int TRANSACTION_appNotRespondingViaProvider = 176;
        static final int TRANSACTION_getTaskBounds = 177;
        static final int TRANSACTION_getActivityDisplayId = 178;
        static final int TRANSACTION_setProcessMemoryTrimLevel = 179;
        static final int TRANSACTION_getTagForIntentSender = 180;
        static final int TRANSACTION_startUserInBackground = 181;
        static final int TRANSACTION_startLockTaskModeById = 182;
        static final int TRANSACTION_startLockTaskModeByToken = 183;
        static final int TRANSACTION_stopLockTaskMode = 184;
        static final int TRANSACTION_isInLockTaskMode = 185;
        static final int TRANSACTION_setTaskDescription = 186;
        static final int TRANSACTION_startVoiceActivity = 187;
        static final int TRANSACTION_startAssistantActivity = 188;
        static final int TRANSACTION_getActivityOptions = 189;
        static final int TRANSACTION_getAppTasks = 190;
        static final int TRANSACTION_startSystemLockTaskMode = 191;
        static final int TRANSACTION_stopSystemLockTaskMode = 192;
        static final int TRANSACTION_finishVoiceTask = 193;
        static final int TRANSACTION_isTopOfTask = 194;
        static final int TRANSACTION_notifyLaunchTaskBehindComplete = 195;
        static final int TRANSACTION_startActivityFromRecents = 196;
        static final int TRANSACTION_notifyEnterAnimationComplete = 197;
        static final int TRANSACTION_startActivityAsCaller = 198;
        static final int TRANSACTION_addAppTask = 199;
        static final int TRANSACTION_getAppTaskThumbnailSize = 200;
        static final int TRANSACTION_releaseActivityInstance = 201;
        static final int TRANSACTION_releaseSomeActivities = 202;
        static final int TRANSACTION_bootAnimationComplete = 203;
        static final int TRANSACTION_getTaskDescriptionIcon = 204;
        static final int TRANSACTION_launchAssistIntent = 205;
        static final int TRANSACTION_startInPlaceAnimationOnFrontMostApplication = 206;
        static final int TRANSACTION_checkPermissionWithToken = 207;
        static final int TRANSACTION_registerTaskStackListener = 208;
        static final int TRANSACTION_notifyCleartextNetwork = 209;
        static final int TRANSACTION_createStackOnDisplay = 210;
        static final int TRANSACTION_getFocusedStackId = 211;
        static final int TRANSACTION_setTaskResizeable = 212;
        static final int TRANSACTION_requestAssistContextExtras = 213;
        static final int TRANSACTION_resizeTask = 214;
        static final int TRANSACTION_getLockTaskModeState = 215;
        static final int TRANSACTION_setDumpHeapDebugLimit = 216;
        static final int TRANSACTION_dumpHeapFinished = 217;
        static final int TRANSACTION_setVoiceKeepAwake = 218;
        static final int TRANSACTION_updateLockTaskPackages = 219;
        static final int TRANSACTION_noteAlarmStart = 220;
        static final int TRANSACTION_noteAlarmFinish = 221;
        static final int TRANSACTION_getPackageProcessState = 222;
        static final int TRANSACTION_showLockTaskEscapeMessage = 223;
        static final int TRANSACTION_updateDeviceOwner = 224;
        static final int TRANSACTION_keyguardGoingAway = 225;
        static final int TRANSACTION_getUidProcessState = 226;
        static final int TRANSACTION_registerUidObserver = 227;
        static final int TRANSACTION_unregisterUidObserver = 228;
        static final int TRANSACTION_isAssistDataAllowedOnCurrentActivity = 229;
        static final int TRANSACTION_showAssistFromActivity = 230;
        static final int TRANSACTION_isRootVoiceInteraction = 231;
        static final int TRANSACTION_startBinderTracking = 232;
        static final int TRANSACTION_stopBinderTrackingAndDump = 233;
        static final int TRANSACTION_positionTaskInStack = 234;
        static final int TRANSACTION_getActivityStackId = 235;
        static final int TRANSACTION_exitFreeformMode = 236;
        static final int TRANSACTION_reportSizeConfigurations = 237;
        static final int TRANSACTION_moveTaskToDockedStack = 238;
        static final int TRANSACTION_suppressResizeConfigChanges = 239;
        static final int TRANSACTION_moveTasksToFullscreenStack = 240;
        static final int TRANSACTION_moveTopActivityToPinnedStack = 241;
        static final int TRANSACTION_isAppStartModeDisabled = 242;
        static final int TRANSACTION_unlockUser = 243;
        static final int TRANSACTION_isInMultiWindowMode = 244;
        static final int TRANSACTION_isInPictureInPictureMode = 245;
        static final int TRANSACTION_killPackageDependents = 246;
        static final int TRANSACTION_enterPictureInPictureMode = 247;
        static final int TRANSACTION_setPictureInPictureParams = 248;
        static final int TRANSACTION_getMaxNumPictureInPictureActions = 249;
        static final int TRANSACTION_activityRelaunched = 250;
        static final int TRANSACTION_getUriPermissionOwnerForActivity = 251;
        static final int TRANSACTION_resizeDockedStack = 252;
        static final int TRANSACTION_setVrMode = 253;
        static final int TRANSACTION_getGrantedUriPermissions = 254;
        static final int TRANSACTION_clearGrantedUriPermissions = 255;
        static final int TRANSACTION_isAppForeground = 256;
        static final int TRANSACTION_startLocalVoiceInteraction = 257;
        static final int TRANSACTION_stopLocalVoiceInteraction = 258;
        static final int TRANSACTION_supportsLocalVoiceInteraction = 259;
        static final int TRANSACTION_notifyPinnedStackAnimationStarted = 260;
        static final int TRANSACTION_notifyPinnedStackAnimationEnded = 261;
        static final int TRANSACTION_removeStack = 262;
        static final int TRANSACTION_makePackageIdle = 263;
        static final int TRANSACTION_getMemoryTrimLevel = 264;
        static final int TRANSACTION_resizePinnedStack = 265;
        static final int TRANSACTION_isVrModePackageEnabled = 266;
        static final int TRANSACTION_swapDockedAndFullscreenStack = 267;
        static final int TRANSACTION_notifyLockedProfile = 268;
        static final int TRANSACTION_startConfirmDeviceCredentialIntent = 269;
        static final int TRANSACTION_sendIdleJobTrigger = 270;
        static final int TRANSACTION_sendIntentSender = 271;
        static final int TRANSACTION_setVrThread = 272;
        static final int TRANSACTION_setRenderThread = 273;
        static final int TRANSACTION_setHasTopUi = 274;
        static final int TRANSACTION_requestActivityRelaunch = 275;
        static final int TRANSACTION_updateDisplayOverrideConfiguration = 276;
        static final int TRANSACTION_unregisterTaskStackListener = 277;
        static final int TRANSACTION_moveStackToDisplay = 278;
        static final int TRANSACTION_requestAutofillData = 279;
        static final int TRANSACTION_dismissKeyguard = 280;
        static final int TRANSACTION_restartUserInBackground = 281;
        static final int TRANSACTION_cancelTaskWindowTransition = 282;
        static final int TRANSACTION_cancelTaskThumbnailTransition = 283;
        static final int TRANSACTION_getTaskSnapshot = 284;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 285;
        static final int TRANSACTION_setPersistentVrThread = 286;
        static final int TRANSACTION_waitForNetworkStateUpdate = 287;
        static final int TRANSACTION_setDisablePreviewScreenshots = 288;
        static final int TRANSACTION_getLastResumedActivityUserId = 289;
        static final int TRANSACTION_backgroundWhitelistUid = 290;
        static final int TRANSACTION_setShowWhenLocked = 291;
        static final int TRANSACTION_setTurnScreenOn = 292;

        public Stub() {
            this.attachInterface(this, "android.app.IActivityManager");
        }

        public static IActivityManager asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            } else {
                IInterface iin = obj.queryLocalInterface("android.app.IActivityManager");
                return (IActivityManager)(iin != null && iin instanceof IActivityManager ? (IActivityManager)iin : new IActivityManager.Stub.Proxy(obj));
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder _arg0;
            boolean _result;
            int _arg3;
            boolean _result;
            String _arg6;
            int _arg8;
            Bundle _arg9;
            boolean _arg10;
            int _arg11;
            int _result;
            int _arg0;
            int _arg1;
            IBinder _arg2;
            boolean _result;
            int _arg2;
            ParceledListSlice _result;
            Intent _arg3;
            Bundle _arg1;
            String _arg4;
            Rect _arg4;
            IBinder _arg1;
            ITaskStackListener _arg0;
            Configuration _arg0;
            boolean _result;
            boolean _result;
            String _arg5;
            String _arg3;
            boolean _arg0;
            int _arg6;
            Bundle _arg5;
            Rect _arg1;
            IBinder _arg3;
            int _result;
            IIntentSender _arg0;
            int _arg7;
            Intent _arg0;
            int _arg5;
            ProfilerInfo _arg8;
            String _arg2;
            ComponentName _arg0;
            IBinder _arg4;
            int _arg10;
            Rect _arg0;
            Bundle _arg2;
            IBinder _arg5;
            String _arg0;
            PictureInPictureParams _arg1;
            Intent _arg2;
            int _arg9;
            byte[] _arg1;
            String _arg1;
            Uri _arg2;
            IResultReceiver _arg1;
            IUidObserver _arg0;
            Intent _arg1;
            IVoiceInteractionSession _arg0;
            Bundle _arg3;
            TaskDescription _arg1;
            List _result;
            IApplicationThread _arg0;
            Uri _arg0;
            List _result;
            int[] _result;
            IUserSwitchObserver _arg0;
            IProcessObserver _arg0;
            ComponentName _result;
            switch(code) {
            case 1:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                ParcelFileDescriptor _result = this.openContentUri(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 2:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                ParcelableCrashInfo _arg1;
                if (0 != data.readInt()) {
                    _arg1 = (ParcelableCrashInfo)ParcelableCrashInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.handleApplicationCrash(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 3:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                _arg4 = data.readStrongBinder();
                _arg5 = data.readString();
                _arg6 = data.readInt();
                _arg7 = data.readInt();
                if (0 != data.readInt()) {
                    _arg8 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = this.startActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
                reply.writeNoException();
                reply.writeInt(_arg10);
                return true;
            case 4:
                data.enforceInterface("android.app.IActivityManager");
                this.unhandledBack();
                reply.writeNoException();
                return true;
            case 5:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readInt();
                _result = this.finishActivity(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 6:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                IIntentReceiver _arg2 = android.content.IIntentReceiver.Stub.asInterface(data.readStrongBinder());
                IntentFilter _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (IntentFilter)IntentFilter.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _arg4 = data.readString();
                _arg5 = data.readInt();
                _arg6 = data.readInt();
                Intent _result = this.registerReceiver(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 7:
                data.enforceInterface("android.app.IActivityManager");
                IIntentReceiver _arg0 = android.content.IIntentReceiver.Stub.asInterface(data.readStrongBinder());
                this.unregisterReceiver(_arg0);
                reply.writeNoException();
                return true;
            case 8:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readString();
                IIntentReceiver _arg3 = android.content.IIntentReceiver.Stub.asInterface(data.readStrongBinder());
                _result = data.readInt();
                _arg5 = data.readString();
                Bundle _arg6;
                if (0 != data.readInt()) {
                    _arg6 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg6 = null;
                }

                String[] _arg7 = data.createStringArray();
                _arg8 = data.readInt();
                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = 0 != data.readInt();
                boolean _arg11 = 0 != data.readInt();
                _result = data.readInt();
                int _result = this.broadcastIntent(_arg0, _arg1, _arg2, _arg3, _result, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _result);
                reply.writeNoException();
                reply.writeInt(_result);
                return true;
            case 9:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readInt();
                this.unbroadcastIntent(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 10:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                _arg2 = data.readString();
                if (0 != data.readInt()) {
                    _arg3 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = 0 != data.readInt();
                _arg5 = data.readInt();
                this.finishReceiver(_arg0, _arg1, _arg2, _arg3, _result, _arg5);
                return true;
            case 11:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                this.attachApplication(_arg0);
                reply.writeNoException();
                return true;
            case 12:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                Configuration _arg1;
                if (0 != data.readInt()) {
                    _arg1 = (Configuration)Configuration.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = 0 != data.readInt();
                this.activityIdle(_arg0, _arg1, _result);
                return true;
            case 13:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.activityPaused(_arg0);
                reply.writeNoException();
                return true;
            case 14:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                PersistableBundle _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (PersistableBundle)PersistableBundle.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                CharSequence _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                this.activityStopped(_arg0, _arg1, _arg2, _arg3);
                return true;
            case 15:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getCallingPackage(_arg0);
                reply.writeNoException();
                reply.writeString(_arg1);
                return true;
            case 16:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.getCallingActivity(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 17:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _result = this.getTasks(_arg0, _arg1);
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 18:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                if (0 != data.readInt()) {
                    _arg2 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                this.moveTaskToFront(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 19:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.moveTaskBackwards(_arg0);
                reply.writeNoException();
                return true;
            case 20:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                _arg2 = this.getTaskForActivity(_arg0, _result);
                reply.writeNoException();
                reply.writeInt(_arg2);
                return true;
            case 21:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                _arg2 = data.readInt();
                _result = 0 != data.readInt();
                ContentProviderHolder _result = this.getContentProvider(_arg0, _arg1, _arg2, _result);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 22:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                List<ContentProviderHolder> _arg1 = data.createTypedArrayList(ContentProviderHolder.CREATOR);
                this.publishContentProviders(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 23:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _result = this.refContentProvider(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 24:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readString();
                _arg2 = data.readInt();
                this.finishSubActivity(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 25:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                PendingIntent _result = this.getRunningServiceControlPanel(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 26:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readString();
                _result = 0 != data.readInt();
                _arg4 = data.readString();
                _arg5 = data.readInt();
                ComponentName _result = this.startService(_arg0, _arg1, _arg2, _result, _arg4, _arg5);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 27:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readString();
                _arg3 = data.readInt();
                _result = this.stopService(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result);
                return true;
            case 28:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                IServiceConnection _arg4 = android.app.IServiceConnection.Stub.asInterface(data.readStrongBinder());
                _arg5 = data.readInt();
                _arg6 = data.readString();
                _arg7 = data.readInt();
                _arg8 = this.bindService(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                reply.writeNoException();
                reply.writeInt(_arg8);
                return true;
            case 29:
                data.enforceInterface("android.app.IActivityManager");
                IServiceConnection _arg0 = android.app.IServiceConnection.Stub.asInterface(data.readStrongBinder());
                _result = this.unbindService(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 30:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readStrongBinder();
                this.publishService(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 31:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.activityResumed(_arg0);
                reply.writeNoException();
                return true;
            case 32:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                this.setDebugApp(_arg0, _result, _result);
                reply.writeNoException();
                return true;
            case 33:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = 0 != data.readInt();
                this.setAlwaysFinish(_arg0);
                reply.writeNoException();
                return true;
            case 34:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readString();
                _arg2 = data.readInt();
                if (0 != data.readInt()) {
                    _arg3 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                IInstrumentationWatcher _arg4 = android.app.IInstrumentationWatcher.Stub.asInterface(data.readStrongBinder());
                IUiAutomationConnection _arg5 = android.app.IUiAutomationConnection.Stub.asInterface(data.readStrongBinder());
                _arg6 = data.readInt();
                String _arg7 = data.readString();
                boolean _result = this.startInstrumentation(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 35:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.addInstrumentationResults(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 36:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readInt();
                if (0 != data.readInt()) {
                    _arg2 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                this.finishInstrumentation(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 37:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getConfiguration();
                reply.writeNoException();
                if (_arg0 != null) {
                    reply.writeInt(1);
                    _arg0.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 38:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Configuration)Configuration.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _result = this.updateConfiguration(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 39:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readStrongBinder();
                _arg2 = data.readInt();
                _result = this.stopServiceToken(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 40:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.getActivityClassForToken(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 41:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getPackageForToken(_arg0);
                reply.writeNoException();
                reply.writeString(_arg1);
                return true;
            case 42:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setProcessLimit(_arg0);
                reply.writeNoException();
                return true;
            case 43:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getProcessLimit();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 44:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = this.checkPermission(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_arg3);
                return true;
            case 45:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = data.readInt();
                _result = data.readInt();
                _arg5 = data.readStrongBinder();
                _arg6 = this.checkUriPermission(_arg0, _arg1, _arg2, _arg3, _result, _arg5);
                reply.writeNoException();
                reply.writeInt(_arg6);
                return true;
            case 46:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readInt();
                _result = data.readInt();
                this.grantUriPermission(_arg0, _arg1, _arg2, _arg3, _result);
                reply.writeNoException();
                return true;
            case 47:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readInt();
                _result = data.readInt();
                this.revokeUriPermission(_arg0, _arg1, _arg2, _arg3, _result);
                reply.writeNoException();
                return true;
            case 48:
                data.enforceInterface("android.app.IActivityManager");
                IActivityController _arg0 = android.app.IActivityController.Stub.asInterface(data.readStrongBinder());
                _result = 0 != data.readInt();
                this.setActivityController(_arg0, _result);
                reply.writeNoException();
                return true;
            case 49:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _result = 0 != data.readInt();
                this.showWaitingForDebugger(_arg0, _result);
                reply.writeNoException();
                return true;
            case 50:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.signalPersistentProcesses(_arg0);
                reply.writeNoException();
                return true;
            case 51:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                ParceledListSlice _result = this.getRecentTasks(_arg0, _arg1, _arg2);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 52:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = data.readInt();
                this.serviceDoneExecuting(_arg0, _arg1, _arg2, _arg3);
                return true;
            case 53:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.activityDestroyed(_arg0);
                return true;
            case 54:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readString();
                _arg2 = data.readStrongBinder();
                _arg3 = data.readString();
                _result = data.readInt();
                Intent[] _arg5 = (Intent[])data.createTypedArray(Intent.CREATOR);
                String[] _arg6 = data.createStringArray();
                _arg7 = data.readInt();
                Bundle _arg8;
                if (0 != data.readInt()) {
                    _arg8 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                _arg9 = data.readInt();
                IIntentSender _result = this.getIntentSender(_arg0, _arg1, _arg2, _arg3, _result, _arg5, _arg6, _arg7, _arg8, _arg9);
                reply.writeNoException();
                reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
                return true;
            case 55:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                this.cancelIntentSender(_arg0);
                reply.writeNoException();
                return true;
            case 56:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = this.getPackageForIntentSender(_arg0);
                reply.writeNoException();
                reply.writeString(_arg1);
                return true;
            case 57:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = com.android.internal.os.IResultReceiver.Stub.asInterface(data.readStrongBinder());
                this.registerIntentSenderCancelListener(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 58:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = com.android.internal.os.IResultReceiver.Stub.asInterface(data.readStrongBinder());
                this.unregisterIntentSenderCancelListener(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 59:
                data.enforceInterface("android.app.IActivityManager");
                this.enterSafeMode();
                reply.writeNoException();
                return true;
            case 60:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                if (0 != data.readInt()) {
                    _arg2 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _result = this.startNextMatchingActivity(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 61:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readInt();
                _arg2 = data.readString();
                _arg3 = data.readString();
                this.noteWakeupAlarm(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 62:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.removeContentProvider(_arg0, _result);
                reply.writeNoException();
                return true;
            case 63:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                this.setRequestedOrientation(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 64:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getRequestedOrientation(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 65:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = 0 != data.readInt();
                this.unbindFinished(_arg0, _arg1, _result);
                reply.writeNoException();
                return true;
            case 66:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                _result = 0 != data.readInt();
                _arg3 = data.readString();
                this.setProcessImportant(_arg0, _arg1, _result, _arg3);
                reply.writeNoException();
                return true;
            case 67:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readStrongBinder();
                _arg2 = data.readInt();
                Notification _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (Notification)Notification.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = data.readInt();
                this.setServiceForeground(_arg0, _arg1, _arg2, _arg3, _result);
                reply.writeNoException();
                return true;
            case 68:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                _result = this.moveActivityTaskToBack(_arg0, _result);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 69:
                data.enforceInterface("android.app.IActivityManager");
                MemoryInfo _arg0 = new MemoryInfo();
                this.getMemoryInfo(_arg0);
                reply.writeNoException();
                if (_arg0 != null) {
                    reply.writeInt(1);
                    _arg0.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 70:
                data.enforceInterface("android.app.IActivityManager");
                _result = this.getProcessesInErrorState();
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 71:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                IPackageDataObserver _arg1 = android.content.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
                _arg2 = data.readInt();
                _result = this.clearApplicationUserData(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 72:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.forceStopPackage(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 73:
                data.enforceInterface("android.app.IActivityManager");
                _result = data.createIntArray();
                _arg1 = data.readString();
                _result = 0 != data.readInt();
                _result = this.killPids(_result, _arg1, _result);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 74:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _result = this.getServices(_arg0, _arg1);
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 75:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                TaskThumbnail _result = this.getTaskThumbnail(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 76:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = this.getTaskDescription(_arg0);
                reply.writeNoException();
                if (_arg1 != null) {
                    reply.writeInt(1);
                    _arg1.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 77:
                data.enforceInterface("android.app.IActivityManager");
                _result = this.getRunningAppProcesses();
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 78:
                data.enforceInterface("android.app.IActivityManager");
                ConfigurationInfo _result = this.getDeviceConfigurationInfo();
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 79:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readString();
                _arg2 = data.readString();
                _arg3 = this.peekService(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeStrongBinder(_arg3);
                return true;
            case 80:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _result = 0 != data.readInt();
                ProfilerInfo _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = data.readInt();
                _result = this.profileControl(_arg0, _arg1, _result, _arg3, _result);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 81:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = this.shutdown(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 82:
                data.enforceInterface("android.app.IActivityManager");
                this.stopAppSwitches();
                reply.writeNoException();
                return true;
            case 83:
                data.enforceInterface("android.app.IActivityManager");
                this.resumeAppSwitches();
                reply.writeNoException();
                return true;
            case 84:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _result = this.bindBackupAgent(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 85:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readStrongBinder();
                this.backupAgentCreated(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 86:
                data.enforceInterface("android.app.IActivityManager");
                ApplicationInfo _arg0;
                if (0 != data.readInt()) {
                    _arg0 = (ApplicationInfo)ApplicationInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                this.unbindBackupAgent(_arg0);
                reply.writeNoException();
                return true;
            case 87:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = this.getUidForIntentSender(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 88:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                _arg5 = data.readString();
                _arg6 = data.readString();
                _arg7 = this.handleIncomingUser(_arg0, _arg1, _arg2, _result, _result, _arg5, _arg6);
                reply.writeNoException();
                reply.writeInt(_arg7);
                return true;
            case 89:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                this.addPackageDependency(_arg0);
                reply.writeNoException();
                return true;
            case 90:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = data.readString();
                this.killApplication(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 91:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                this.closeSystemDialogs(_arg0);
                reply.writeNoException();
                return true;
            case 92:
                data.enforceInterface("android.app.IActivityManager");
                _result = data.createIntArray();
                android.os.Debug.MemoryInfo[] _result = this.getProcessMemoryInfo(_result);
                reply.writeNoException();
                reply.writeTypedArray(_result, 1);
                return true;
            case 93:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.killApplicationProcess(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 94:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                IIntentSender _arg1 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg2 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg3 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _arg4 = data.readString();
                _arg5 = data.readStrongBinder();
                _arg6 = data.readString();
                _arg7 = data.readInt();
                _arg8 = data.readInt();
                _arg9 = data.readInt();
                Bundle _arg10;
                if (0 != data.readInt()) {
                    _arg10 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg10 = null;
                }

                _arg11 = this.startActivityIntentSender(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
                reply.writeNoException();
                reply.writeInt(_arg11);
                return true;
            case 95:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readString();
                _arg2 = data.readInt();
                _arg3 = data.readInt();
                this.overridePendingTransition(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 96:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readString();
                _result = 0 != data.readInt();
                ParcelableCrashInfo _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (ParcelableCrashInfo)ParcelableCrashInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = this.handleApplicationWtf(_arg0, _arg1, _result, _arg3);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 97:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.killBackgroundProcesses(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 98:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.isUserAMonkey();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 99:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                _arg4 = data.readStrongBinder();
                _arg5 = data.readString();
                _arg6 = data.readInt();
                _arg7 = data.readInt();
                if (0 != data.readInt()) {
                    _arg8 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = data.readInt();
                WaitResult _result = this.startActivityAndWait(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 100:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.willActivityBeVisible(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 101:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                _arg4 = data.readStrongBinder();
                _arg5 = data.readString();
                _arg6 = data.readInt();
                _arg7 = data.readInt();
                Configuration _arg8;
                if (0 != data.readInt()) {
                    _arg8 = (Configuration)Configuration.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = data.readInt();
                _arg11 = this.startActivityWithConfig(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
                reply.writeNoException();
                reply.writeInt(_arg11);
                return true;
            case 102:
                data.enforceInterface("android.app.IActivityManager");
                _result = this.getRunningExternalApplications();
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 103:
                data.enforceInterface("android.app.IActivityManager");
                this.finishHeavyWeightApp();
                reply.writeNoException();
                return true;
            case 104:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                ViolationInfo _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (ViolationInfo)ViolationInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                this.handleApplicationStrictModeViolation(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 105:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.isImmersive(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 106:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.setImmersive(_arg0, _result);
                reply.writeNoException();
                return true;
            case 107:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.isTopActivityImmersive();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 108:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _arg2 = data.readString();
                _arg3 = data.readInt();
                _arg4 = data.readString();
                this.crashApplication(_arg0, _arg1, _arg2, _arg3, _arg4);
                reply.writeNoException();
                return true;
            case 109:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _arg2 = this.getProviderMimeType(_arg0, _arg1);
                reply.writeNoException();
                reply.writeString(_arg2);
                return true;
            case 110:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = this.newUriPermissionOwner(_arg0);
                reply.writeNoException();
                reply.writeStrongBinder(_arg1);
                return true;
            case 111:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readInt();
                _arg2 = data.readString();
                Uri _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = data.readInt();
                _arg5 = data.readInt();
                _arg6 = data.readInt();
                this.grantUriPermissionFromOwner(_arg0, _arg1, _arg2, _arg3, _result, _arg5, _arg6);
                reply.writeNoException();
                return true;
            case 112:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                Uri _arg1;
                if (0 != data.readInt()) {
                    _arg1 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readInt();
                _arg3 = data.readInt();
                this.revokeUriPermissionFromOwner(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 113:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readInt();
                _result = data.readInt();
                _arg5 = this.checkGrantUriPermission(_arg0, _arg1, _arg2, _arg3, _result);
                reply.writeNoException();
                reply.writeInt(_arg5);
                return true;
            case 114:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                _arg5 = data.readString();
                ParcelFileDescriptor _arg6;
                if (0 != data.readInt()) {
                    _arg6 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data);
                } else {
                    _arg6 = null;
                }

                boolean _result = this.dumpHeap(_arg0, _arg1, _result, _result, _result, _arg5, _arg6);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 115:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                Intent[] _arg2 = (Intent[])data.createTypedArray(Intent.CREATOR);
                String[] _arg3 = data.createStringArray();
                _arg4 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg5 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg5 = null;
                }

                _arg6 = data.readInt();
                _arg7 = this.startActivities(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                reply.writeNoException();
                reply.writeInt(_arg7);
                return true;
            case 116:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _result = this.isUserRunning(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 117:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.activitySlept(_arg0);
                return true;
            case 118:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getFrontActivityScreenCompatMode();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 119:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setFrontActivityScreenCompatMode(_arg0);
                reply.writeNoException();
                return true;
            case 120:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = this.getPackageScreenCompatMode(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 121:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.setPackageScreenCompatMode(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 122:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _result = this.getPackageAskScreenCompat(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 123:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _result = 0 != data.readInt();
                this.setPackageAskScreenCompat(_arg0, _result);
                reply.writeNoException();
                return true;
            case 124:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = this.switchUser(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 125:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setFocusedTask(_arg0);
                reply.writeNoException();
                return true;
            case 126:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = this.removeTask(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 127:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IProcessObserver.Stub.asInterface(data.readStrongBinder());
                this.registerProcessObserver(_arg0);
                reply.writeNoException();
                return true;
            case 128:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IProcessObserver.Stub.asInterface(data.readStrongBinder());
                this.unregisterProcessObserver(_arg0);
                reply.writeNoException();
                return true;
            case 129:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _result = this.isIntentSenderTargetedToPackage(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 130:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Configuration)Configuration.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                this.updatePersistentConfiguration(_arg0);
                reply.writeNoException();
                return true;
            case 131:
                data.enforceInterface("android.app.IActivityManager");
                _result = data.createIntArray();
                long[] _result = this.getProcessPss(_result);
                reply.writeNoException();
                reply.writeLongArray(_result);
                return true;
            case 132:
                data.enforceInterface("android.app.IActivityManager");
                CharSequence _arg0;
                if (0 != data.readInt()) {
                    _arg0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _result = 0 != data.readInt();
                this.showBootMessage(_arg0, _result);
                reply.writeNoException();
                return true;
            case 133:
                data.enforceInterface("android.app.IActivityManager");
                this.killAllBackgroundProcesses();
                reply.writeNoException();
                return true;
            case 134:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readStrongBinder();
                ContentProviderHolder _result = this.getContentProviderExternal(_arg0, _arg1, _arg2);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 135:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readStrongBinder();
                this.removeContentProviderExternal(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 136:
                data.enforceInterface("android.app.IActivityManager");
                RunningAppProcessInfo _arg0 = new RunningAppProcessInfo();
                this.getMyMemoryState(_arg0);
                reply.writeNoException();
                if (_arg0 != null) {
                    reply.writeInt(1);
                    _arg0.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 137:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _result = this.killProcessesBelowForeground(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 138:
                data.enforceInterface("android.app.IActivityManager");
                UserInfo _result = this.getCurrentUser();
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 139:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = data.readString();
                _result = this.shouldUpRecreateTask(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 140:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readInt();
                if (0 != data.readInt()) {
                    _arg3 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = this.navigateUpTo(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 141:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = 0 != data.readInt();
                _arg1 = data.readInt();
                this.setLockScreenShown(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 142:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.finishActivityAffinity(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 143:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getLaunchedFromUid(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 144:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.unstableProviderDied(_arg0);
                reply.writeNoException();
                return true;
            case 145:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _result = this.isIntentSenderAnActivity(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 146:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                _arg4 = data.readStrongBinder();
                _arg5 = data.readString();
                _arg6 = data.readInt();
                _arg7 = data.readInt();
                if (0 != data.readInt()) {
                    _arg8 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = data.readInt();
                _arg11 = this.startActivityAsUser(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
                reply.writeNoException();
                reply.writeInt(_arg11);
                return true;
            case 147:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = 0 != data.readInt();
                IStopUserCallback _arg2 = android.app.IStopUserCallback.Stub.asInterface(data.readStrongBinder());
                _arg3 = this.stopUser(_arg0, _result, _arg2);
                reply.writeNoException();
                reply.writeInt(_arg3);
                return true;
            case 148:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IUserSwitchObserver.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                this.registerUserSwitchObserver(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 149:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IUserSwitchObserver.Stub.asInterface(data.readStrongBinder());
                this.unregisterUserSwitchObserver(_arg0);
                reply.writeNoException();
                return true;
            case 150:
                data.enforceInterface("android.app.IActivityManager");
                _result = this.getRunningUserIds();
                reply.writeNoException();
                reply.writeIntArray(_result);
                return true;
            case 151:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.requestBugReport(_arg0);
                reply.writeNoException();
                return true;
            case 152:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readString();
                this.requestTelephonyBugReport(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 153:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = 0 != data.readInt();
                _arg2 = data.readString();
                long _result = this.inputDispatchingTimedOut(_arg0, _result, _arg2);
                reply.writeNoException();
                reply.writeLong(_result);
                return true;
            case 154:
                data.enforceInterface("android.app.IActivityManager");
                this.clearPendingBackup();
                reply.writeNoException();
                return true;
            case 155:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = this.getIntentForIntentSender(_arg0);
                reply.writeNoException();
                if (_arg1 != null) {
                    reply.writeInt(1);
                    _arg1.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 156:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = this.getAssistContextExtras(_arg0);
                reply.writeNoException();
                if (_arg1 != null) {
                    reply.writeInt(1);
                    _arg1.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 157:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                AssistStructure _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (AssistStructure)AssistStructure.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                AssistContent _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (AssistContent)AssistContent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                Uri _arg4;
                if (0 != data.readInt()) {
                    _arg4 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg4 = null;
                }

                this.reportAssistContextExtras(_arg0, _arg1, _arg2, _arg3, _arg4);
                reply.writeNoException();
                return true;
            case 158:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getLaunchedFromPackage(_arg0);
                reply.writeNoException();
                reply.writeString(_arg1);
                return true;
            case 159:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _arg2 = data.readString();
                this.killUid(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 160:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = 0 != data.readInt();
                this.setUserIsMonkey(_arg0);
                reply.writeNoException();
                return true;
            case 161:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.hang(_arg0, _result);
                reply.writeNoException();
                return true;
            case 162:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _result = 0 != data.readInt();
                this.moveTaskToStack(_arg0, _arg1, _result);
                reply.writeNoException();
                return true;
            case 163:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                if (0 != data.readInt()) {
                    _arg1 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                _arg5 = data.readInt();
                this.resizeStack(_arg0, _arg1, _result, _result, _result, _arg5);
                reply.writeNoException();
                return true;
            case 164:
                data.enforceInterface("android.app.IActivityManager");
                _result = this.getAllStackInfos();
                reply.writeNoException();
                reply.writeTypedList(_result);
                return true;
            case 165:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setFocusedStack(_arg0);
                reply.writeNoException();
                return true;
            case 166:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                StackInfo _result = this.getStackInfo(_arg0);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 167:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.convertFromTranslucent(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 168:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = this.convertToTranslucent(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 169:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.notifyActivityDrawn(_arg0);
                reply.writeNoException();
                return true;
            case 170:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.reportActivityFullyDrawn(_arg0, _result);
                reply.writeNoException();
                return true;
            case 171:
                data.enforceInterface("android.app.IActivityManager");
                this.restart();
                reply.writeNoException();
                return true;
            case 172:
                data.enforceInterface("android.app.IActivityManager");
                this.performIdleMaintenance();
                reply.writeNoException();
                return true;
            case 173:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _arg2 = data.readInt();
                this.takePersistableUriPermission(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 174:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Uri)Uri.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _arg2 = data.readInt();
                this.releasePersistableUriPermission(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 175:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _result = 0 != data.readInt();
                _result = this.getPersistedUriPermissions(_arg0, _result);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 176:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.appNotRespondingViaProvider(_arg0);
                reply.writeNoException();
                return true;
            case 177:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = this.getTaskBounds(_arg0);
                reply.writeNoException();
                if (_arg1 != null) {
                    reply.writeInt(1);
                    _arg1.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 178:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getActivityDisplayId(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 179:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _result = this.setProcessMemoryTrimLevel(_arg0, _arg1, _arg2);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 180:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                _arg2 = this.getTagForIntentSender(_arg0, _arg1);
                reply.writeNoException();
                reply.writeString(_arg2);
                return true;
            case 181:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = this.startUserInBackground(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 182:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.startLockTaskModeById(_arg0);
                reply.writeNoException();
                return true;
            case 183:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.startLockTaskModeByToken(_arg0);
                reply.writeNoException();
                return true;
            case 184:
                data.enforceInterface("android.app.IActivityManager");
                this.stopLockTaskMode();
                reply.writeNoException();
                return true;
            case 185:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.isInLockTaskMode();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 186:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (TaskDescription)TaskDescription.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.setTaskDescription(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 187:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                if (0 != data.readInt()) {
                    _arg3 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _arg4 = data.readString();
                IVoiceInteractionSession _arg5 = android.service.voice.IVoiceInteractionSession.Stub.asInterface(data.readStrongBinder());
                IVoiceInteractor _arg6 = com.android.internal.app.IVoiceInteractor.Stub.asInterface(data.readStrongBinder());
                _arg7 = data.readInt();
                if (0 != data.readInt()) {
                    _arg8 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = data.readInt();
                _arg11 = this.startVoiceActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
                reply.writeNoException();
                reply.writeInt(_arg11);
                return true;
            case 188:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                if (0 != data.readInt()) {
                    _arg3 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _arg4 = data.readString();
                if (0 != data.readInt()) {
                    _arg5 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg5 = null;
                }

                _arg6 = data.readInt();
                _arg7 = this.startAssistantActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                reply.writeNoException();
                reply.writeInt(_arg7);
                return true;
            case 189:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getActivityOptions(_arg0);
                reply.writeNoException();
                if (_arg1 != null) {
                    reply.writeInt(1);
                    _arg1.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 190:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                List<IBinder> _result = this.getAppTasks(_arg0);
                reply.writeNoException();
                reply.writeBinderList(_result);
                return true;
            case 191:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.startSystemLockTaskMode(_arg0);
                reply.writeNoException();
                return true;
            case 192:
                data.enforceInterface("android.app.IActivityManager");
                this.stopSystemLockTaskMode();
                reply.writeNoException();
                return true;
            case 193:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.service.voice.IVoiceInteractionSession.Stub.asInterface(data.readStrongBinder());
                this.finishVoiceTask(_arg0);
                reply.writeNoException();
                return true;
            case 194:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.isTopOfTask(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 195:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.notifyLaunchTaskBehindComplete(_arg0);
                reply.writeNoException();
                return true;
            case 196:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = this.startActivityFromRecents(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_arg2);
                return true;
            case 197:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.notifyEnterAnimationComplete(_arg0);
                reply.writeNoException();
                return true;
            case 198:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readString();
                if (0 != data.readInt()) {
                    _arg2 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readString();
                _arg4 = data.readStrongBinder();
                _arg5 = data.readString();
                _arg6 = data.readInt();
                _arg7 = data.readInt();
                if (0 != data.readInt()) {
                    _arg8 = (ProfilerInfo)ProfilerInfo.CREATOR.createFromParcel(data);
                } else {
                    _arg8 = null;
                }

                if (0 != data.readInt()) {
                    _arg9 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg9 = null;
                }

                _arg10 = 0 != data.readInt();
                _arg11 = data.readInt();
                _result = this.startActivityAsCaller(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
                reply.writeNoException();
                reply.writeInt(_result);
                return true;
            case 199:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                TaskDescription _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (TaskDescription)TaskDescription.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                Bitmap _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (Bitmap)Bitmap.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _result = this.addAppTask(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result);
                return true;
            case 200:
                data.enforceInterface("android.app.IActivityManager");
                Point _result = this.getAppTaskThumbnailSize();
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 201:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.releaseActivityInstance(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 202:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
                this.releaseSomeActivities(_arg0);
                reply.writeNoException();
                return true;
            case 203:
                data.enforceInterface("android.app.IActivityManager");
                this.bootAnimationComplete();
                reply.writeNoException();
                return true;
            case 204:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                Bitmap _result = this.getTaskDescriptionIcon(_arg0, _arg1);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 205:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _arg2 = data.readString();
                _arg3 = data.readInt();
                Bundle _arg4;
                if (0 != data.readInt()) {
                    _arg4 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg4 = null;
                }

                _result = this.launchAssistIntent(_arg0, _arg1, _arg2, _arg3, _arg4);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 206:
                data.enforceInterface("android.app.IActivityManager");
                Bundle _arg0;
                if (0 != data.readInt()) {
                    _arg0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                this.startInPlaceAnimationOnFrontMostApplication(_arg0);
                reply.writeNoException();
                return true;
            case 207:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = data.readStrongBinder();
                _result = this.checkPermissionWithToken(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result);
                return true;
            case 208:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.ITaskStackListener.Stub.asInterface(data.readStrongBinder());
                this.registerTaskStackListener(_arg0);
                reply.writeNoException();
                return true;
            case 209:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.createByteArray();
                this.notifyCleartextNetwork(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 210:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = this.createStackOnDisplay(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 211:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getFocusedStackId();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 212:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                this.setTaskResizeable(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 213:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = com.android.internal.os.IResultReceiver.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg2 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = data.readStrongBinder();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                boolean _result = this.requestAssistContextExtras(_arg0, _arg1, _arg2, _arg3, _result, _result);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 214:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                if (0 != data.readInt()) {
                    _arg1 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readInt();
                this.resizeTask(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 215:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getLockTaskModeState();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 216:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                long _arg2 = data.readLong();
                _arg4 = data.readString();
                this.setDumpHeapDebugLimit(_arg0, _arg1, _arg2, _arg4);
                reply.writeNoException();
                return true;
            case 217:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                this.dumpHeapFinished(_arg0);
                reply.writeNoException();
                return true;
            case 218:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.service.voice.IVoiceInteractionSession.Stub.asInterface(data.readStrongBinder());
                _result = 0 != data.readInt();
                this.setVoiceKeepAwake(_arg0, _result);
                reply.writeNoException();
                return true;
            case 219:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                String[] _arg1 = data.createStringArray();
                this.updateLockTaskPackages(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 220:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readInt();
                _arg2 = data.readString();
                this.noteAlarmStart(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 221:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readInt();
                _arg2 = data.readString();
                this.noteAlarmFinish(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 222:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readString();
                _arg2 = this.getPackageProcessState(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_arg2);
                return true;
            case 223:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.showLockTaskEscapeMessage(_arg0);
                return true;
            case 224:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                this.updateDeviceOwner(_arg0);
                reply.writeNoException();
                return true;
            case 225:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.keyguardGoingAway(_arg0);
                reply.writeNoException();
                return true;
            case 226:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readString();
                _arg2 = this.getUidProcessState(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_arg2);
                return true;
            case 227:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IUidObserver.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                _arg3 = data.readString();
                this.registerUidObserver(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 228:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.IUidObserver.Stub.asInterface(data.readStrongBinder());
                this.unregisterUidObserver(_arg0);
                reply.writeNoException();
                return true;
            case 229:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.isAssistDataAllowedOnCurrentActivity();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 230:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = this.showAssistFromActivity(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 231:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.isRootVoiceInteraction(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 232:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.startBinderTracking();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 233:
                data.enforceInterface("android.app.IActivityManager");
                ParcelFileDescriptor _arg0;
                if (0 != data.readInt()) {
                    _arg0 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _result = this.stopBinderTrackingAndDump(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 234:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _arg2 = data.readInt();
                this.positionTaskInStack(_arg0, _arg1, _arg2);
                reply.writeNoException();
                return true;
            case 235:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getActivityStackId(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 236:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.exitFreeformMode(_arg0);
                reply.writeNoException();
                return true;
            case 237:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                int[] _arg1 = data.createIntArray();
                int[] _arg2 = data.createIntArray();
                int[] _arg3 = data.createIntArray();
                this.reportSizeConfigurations(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                return true;
            case 238:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                _result = 0 != data.readInt();
                _result = 0 != data.readInt();
                if (0 != data.readInt()) {
                    _arg4 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg4 = null;
                }

                _result = this.moveTaskToDockedStack(_arg0, _arg1, _result, _result, _arg4);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 239:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = 0 != data.readInt();
                this.suppressResizeConfigChanges(_arg0);
                reply.writeNoException();
                return true;
            case 240:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = 0 != data.readInt();
                this.moveTasksToFullscreenStack(_arg0, _result);
                reply.writeNoException();
                return true;
            case 241:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                if (0 != data.readInt()) {
                    _arg1 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = this.moveTopActivityToPinnedStack(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 242:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readString();
                _result = this.isAppStartModeDisabled(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 243:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.createByteArray();
                byte[] _arg2 = data.createByteArray();
                IProgressListener _arg3 = android.os.IProgressListener.Stub.asInterface(data.readStrongBinder());
                _result = this.unlockUser(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 244:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.isInMultiWindowMode(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 245:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = this.isInPictureInPictureMode(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 246:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.killPackageDependents(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 247:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (PictureInPictureParams)PictureInPictureParams.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _result = this.enterPictureInPictureMode(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 248:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (PictureInPictureParams)PictureInPictureParams.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.setPictureInPictureParams(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 249:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getMaxNumPictureInPictureActions(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 250:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.activityRelaunched(_arg0);
                reply.writeNoException();
                return true;
            case 251:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _arg1 = this.getUriPermissionOwnerForActivity(_arg0);
                reply.writeNoException();
                reply.writeStrongBinder(_arg1);
                return true;
            case 252:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                if (0 != data.readInt()) {
                    _arg1 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                Rect _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                Rect _arg3;
                if (0 != data.readInt()) {
                    _arg3 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                if (0 != data.readInt()) {
                    _arg4 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg4 = null;
                }

                this.resizeDockedStack(_arg0, _arg1, _arg2, _arg3, _arg4);
                reply.writeNoException();
                return true;
            case 253:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                ComponentName _arg2;
                if (0 != data.readInt()) {
                    _arg2 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg2 = null;
                }

                _arg3 = this.setVrMode(_arg0, _result, _arg2);
                reply.writeNoException();
                reply.writeInt(_arg3);
                return true;
            case 254:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                _result = this.getGrantedUriPermissions(_arg0, _arg1);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 255:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.clearGrantedUriPermissions(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 256:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = this.isAppForeground(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 257:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.startLocalVoiceInteraction(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 258:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.stopLocalVoiceInteraction(_arg0);
                reply.writeNoException();
                return true;
            case 259:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.supportsLocalVoiceInteraction();
                reply.writeNoException();
                reply.writeInt(_arg0 ? 1 : 0);
                return true;
            case 260:
                data.enforceInterface("android.app.IActivityManager");
                this.notifyPinnedStackAnimationStarted();
                reply.writeNoException();
                return true;
            case 261:
                data.enforceInterface("android.app.IActivityManager");
                this.notifyPinnedStackAnimationEnded();
                reply.writeNoException();
                return true;
            case 262:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.removeStack(_arg0);
                reply.writeNoException();
                return true;
            case 263:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readString();
                _arg1 = data.readInt();
                this.makePackageIdle(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 264:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getMemoryTrimLevel();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 265:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                if (0 != data.readInt()) {
                    _arg1 = (Rect)Rect.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.resizePinnedStack(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 266:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (ComponentName)ComponentName.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _result = this.isVrModePackageEnabled(_arg0);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 267:
                data.enforceInterface("android.app.IActivityManager");
                this.swapDockedAndFullscreenStack();
                reply.writeNoException();
                return true;
            case 268:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.notifyLockedProfile(_arg0);
                reply.writeNoException();
                return true;
            case 269:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                this.startConfirmDeviceCredentialIntent(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 270:
                data.enforceInterface("android.app.IActivityManager");
                this.sendIdleJobTrigger();
                reply.writeNoException();
                return true;
            case 271:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
                _arg1 = data.readStrongBinder();
                _arg2 = data.readInt();
                if (0 != data.readInt()) {
                    _arg3 = (Intent)Intent.CREATOR.createFromParcel(data);
                } else {
                    _arg3 = null;
                }

                _arg4 = data.readString();
                IIntentReceiver _arg5 = android.content.IIntentReceiver.Stub.asInterface(data.readStrongBinder());
                _arg6 = data.readString();
                Bundle _arg7;
                if (0 != data.readInt()) {
                    _arg7 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg7 = null;
                }

                _arg8 = this.sendIntentSender(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                reply.writeNoException();
                reply.writeInt(_arg8);
                return true;
            case 272:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setVrThread(_arg0);
                reply.writeNoException();
                return true;
            case 273:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setRenderThread(_arg0);
                reply.writeNoException();
                return true;
            case 274:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = 0 != data.readInt();
                this.setHasTopUi(_arg0);
                reply.writeNoException();
                return true;
            case 275:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                this.requestActivityRelaunch(_arg0);
                reply.writeNoException();
                return true;
            case 276:
                data.enforceInterface("android.app.IActivityManager");
                if (0 != data.readInt()) {
                    _arg0 = (Configuration)Configuration.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }

                _arg1 = data.readInt();
                _result = this.updateDisplayOverrideConfiguration(_arg0, _arg1);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 277:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = android.app.ITaskStackListener.Stub.asInterface(data.readStrongBinder());
                this.unregisterTaskStackListener(_arg0);
                reply.writeNoException();
                return true;
            case 278:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = data.readInt();
                this.moveStackToDisplay(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 279:
                data.enforceInterface("android.app.IActivityManager");
                IResultReceiver _arg0 = com.android.internal.os.IResultReceiver.Stub.asInterface(data.readStrongBinder());
                if (0 != data.readInt()) {
                    _arg1 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                } else {
                    _arg1 = null;
                }

                _arg2 = data.readStrongBinder();
                _arg3 = data.readInt();
                _result = this.requestAutofillData(_arg0, _arg1, _arg2, _arg3);
                reply.writeNoException();
                reply.writeInt(_result ? 1 : 0);
                return true;
            case 280:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                IKeyguardDismissCallback _arg1 = com.android.internal.policy.IKeyguardDismissCallback.Stub.asInterface(data.readStrongBinder());
                this.dismissKeyguard(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 281:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _arg1 = this.restartUserInBackground(_arg0);
                reply.writeNoException();
                reply.writeInt(_arg1);
                return true;
            case 282:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.cancelTaskWindowTransition(_arg0);
                reply.writeNoException();
                return true;
            case 283:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.cancelTaskThumbnailTransition(_arg0);
                reply.writeNoException();
                return true;
            case 284:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                _result = 0 != data.readInt();
                TaskSnapshot _result = this.getTaskSnapshot(_arg0, _result);
                reply.writeNoException();
                if (_result != null) {
                    reply.writeInt(1);
                    _result.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }

                return true;
            case 285:
                data.enforceInterface("android.app.IActivityManager");
                List<String> _arg0 = data.createStringArrayList();
                _arg1 = data.readInt();
                this.scheduleApplicationInfoChanged(_arg0, _arg1);
                reply.writeNoException();
                return true;
            case 286:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.setPersistentVrThread(_arg0);
                reply.writeNoException();
                return true;
            case 287:
                data.enforceInterface("android.app.IActivityManager");
                long _arg0 = data.readLong();
                this.waitForNetworkStateUpdate(_arg0);
                reply.writeNoException();
                return true;
            case 288:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.setDisablePreviewScreenshots(_arg0, _result);
                reply.writeNoException();
                return true;
            case 289:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = this.getLastResumedActivityUserId();
                reply.writeNoException();
                reply.writeInt(_arg0);
                return true;
            case 290:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readInt();
                this.backgroundWhitelistUid(_arg0);
                reply.writeNoException();
                return true;
            case 291:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.setShowWhenLocked(_arg0, _result);
                reply.writeNoException();
                return true;
            case 292:
                data.enforceInterface("android.app.IActivityManager");
                _arg0 = data.readStrongBinder();
                _result = 0 != data.readInt();
                this.setTurnScreenOn(_arg0, _result);
                reply.writeNoException();
                return true;
            case 1598968902:
                reply.writeString("android.app.IActivityManager");
                return true;
            default:
                return super.onTransact(code, data, reply, flags);
            }
        }

        private static class Proxy implements IActivityManager {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "android.app.IActivityManager";
            }

            public ParcelFileDescriptor openContentUri(String uriString) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ParcelFileDescriptor _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(uriString);
                    this.mRemote.transact(1, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void handleApplicationCrash(IBinder app, ParcelableCrashInfo crashInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(app);
                    if (crashInfo != null) {
                        _data.writeInt(1);
                        crashInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(2, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int startActivity(IApplicationThread caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int flags, ProfilerInfo profilerInfo, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(flags);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(3, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unhandledBack() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(4, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean finishActivity(IBinder token, int code, Intent data, int finishTask) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(code);
                    if (data != null) {
                        _data.writeInt(1);
                        data.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(finishTask);
                    this.mRemote.transact(5, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public Intent registerReceiver(IApplicationThread caller, String callerPackage, IIntentReceiver receiver, IntentFilter filter, String requiredPermission, int userId, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Intent _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callerPackage);
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    if (filter != null) {
                        _data.writeInt(1);
                        filter.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(requiredPermission);
                    _data.writeInt(userId);
                    _data.writeInt(flags);
                    this.mRemote.transact(6, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Intent)Intent.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unregisterReceiver(IIntentReceiver receiver) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    this.mRemote.transact(7, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int broadcastIntent(IApplicationThread caller, Intent intent, String resolvedType, IIntentReceiver resultTo, int resultCode, String resultData, Bundle map, String[] requiredPermissions, int appOp, Bundle options, boolean serialized, boolean sticky, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo != null ? resultTo.asBinder() : null);
                    _data.writeInt(resultCode);
                    _data.writeString(resultData);
                    if (map != null) {
                        _data.writeInt(1);
                        map.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStringArray(requiredPermissions);
                    _data.writeInt(appOp);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(serialized ? 1 : 0);
                    _data.writeInt(sticky ? 1 : 0);
                    _data.writeInt(userId);
                    this.mRemote.transact(8, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unbroadcastIntent(IApplicationThread caller, Intent intent, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(9, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void finishReceiver(IBinder who, int resultCode, String resultData, Bundle map, boolean abortBroadcast, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(who);
                    _data.writeInt(resultCode);
                    _data.writeString(resultData);
                    if (map != null) {
                        _data.writeInt(1);
                        map.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(abortBroadcast ? 1 : 0);
                    _data.writeInt(flags);
                    this.mRemote.transact(10, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public void attachApplication(IApplicationThread app) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(app != null ? app.asBinder() : null);
                    this.mRemote.transact(11, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void activityIdle(IBinder token, Configuration config, boolean stopProfiling) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (config != null) {
                        _data.writeInt(1);
                        config.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(stopProfiling ? 1 : 0);
                    this.mRemote.transact(12, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public void activityPaused(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(13, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void activityStopped(IBinder token, Bundle state, PersistableBundle persistentState, CharSequence description) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (state != null) {
                        _data.writeInt(1);
                        state.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (persistentState != null) {
                        _data.writeInt(1);
                        persistentState.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (description != null) {
                        _data.writeInt(1);
                        TextUtils.writeToParcel(description, _data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(14, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public String getCallingPackage(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(15, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ComponentName getCallingActivity(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ComponentName _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(16, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ComponentName)ComponentName.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public List<RunningTaskInfo> getTasks(int maxNum, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(maxNum);
                    _data.writeInt(flags);
                    this.mRemote.transact(17, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(RunningTaskInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void moveTaskToFront(int task, int flags, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(task);
                    _data.writeInt(flags);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(18, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void moveTaskBackwards(int task) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(task);
                    this.mRemote.transact(19, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getTaskForActivity(IBinder token, boolean onlyRoot) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(onlyRoot ? 1 : 0);
                    this.mRemote.transact(20, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ContentProviderHolder getContentProvider(IApplicationThread caller, String name, int userId, boolean stable) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ContentProviderHolder _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(name);
                    _data.writeInt(userId);
                    _data.writeInt(stable ? 1 : 0);
                    this.mRemote.transact(21, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ContentProviderHolder)ContentProviderHolder.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void publishContentProviders(IApplicationThread caller, List<ContentProviderHolder> providers) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeTypedList(providers);
                    this.mRemote.transact(22, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean refContentProvider(IBinder connection, int stableDelta, int unstableDelta) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(connection);
                    _data.writeInt(stableDelta);
                    _data.writeInt(unstableDelta);
                    this.mRemote.transact(23, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void finishSubActivity(IBinder token, String resultWho, int requestCode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    this.mRemote.transact(24, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public PendingIntent getRunningServiceControlPanel(ComponentName service) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                PendingIntent _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(25, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (PendingIntent)PendingIntent.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ComponentName startService(IApplicationThread caller, Intent service, String resolvedType, boolean requireForeground, String callingPackage, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ComponentName _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeInt(requireForeground ? 1 : 0);
                    _data.writeString(callingPackage);
                    _data.writeInt(userId);
                    this.mRemote.transact(26, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ComponentName)ComponentName.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int stopService(IApplicationThread caller, Intent service, String resolvedType, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeInt(userId);
                    this.mRemote.transact(27, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int bindService(IApplicationThread caller, IBinder token, Intent service, String resolvedType, IServiceConnection connection, int flags, String callingPackage, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeStrongBinder(token);
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(connection != null ? connection.asBinder() : null);
                    _data.writeInt(flags);
                    _data.writeString(callingPackage);
                    _data.writeInt(userId);
                    this.mRemote.transact(28, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean unbindService(IServiceConnection connection) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(connection != null ? connection.asBinder() : null);
                    this.mRemote.transact(29, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void publishService(IBinder token, Intent intent, IBinder service) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(service);
                    this.mRemote.transact(30, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void activityResumed(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(31, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setDebugApp(String packageName, boolean waitForDebugger, boolean persistent) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(waitForDebugger ? 1 : 0);
                    _data.writeInt(persistent ? 1 : 0);
                    this.mRemote.transact(32, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setAlwaysFinish(boolean enabled) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(enabled ? 1 : 0);
                    this.mRemote.transact(33, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean startInstrumentation(ComponentName className, String profileFile, int flags, Bundle arguments, IInstrumentationWatcher watcher, IUiAutomationConnection connection, int userId, String abiOverride) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (className != null) {
                        _data.writeInt(1);
                        className.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(profileFile);
                    _data.writeInt(flags);
                    if (arguments != null) {
                        _data.writeInt(1);
                        arguments.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(watcher != null ? watcher.asBinder() : null);
                    _data.writeStrongBinder(connection != null ? connection.asBinder() : null);
                    _data.writeInt(userId);
                    _data.writeString(abiOverride);
                    this.mRemote.transact(34, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void addInstrumentationResults(IApplicationThread target, Bundle results) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(target != null ? target.asBinder() : null);
                    if (results != null) {
                        _data.writeInt(1);
                        results.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(35, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void finishInstrumentation(IApplicationThread target, int resultCode, Bundle results) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(target != null ? target.asBinder() : null);
                    _data.writeInt(resultCode);
                    if (results != null) {
                        _data.writeInt(1);
                        results.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(36, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public Configuration getConfiguration() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Configuration _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(37, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Configuration)Configuration.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean updateConfiguration(Configuration values) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (values != null) {
                        _data.writeInt(1);
                        values.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(38, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean stopServiceToken(ComponentName className, IBinder token, int startId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (className != null) {
                        _data.writeInt(1);
                        className.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(token);
                    _data.writeInt(startId);
                    this.mRemote.transact(39, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ComponentName getActivityClassForToken(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ComponentName _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(40, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ComponentName)ComponentName.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public String getPackageForToken(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(41, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setProcessLimit(int max) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(max);
                    this.mRemote.transact(42, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getProcessLimit() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(43, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int checkPermission(String permission, int pid, int uid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(permission);
                    _data.writeInt(pid);
                    _data.writeInt(uid);
                    this.mRemote.transact(44, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int checkUriPermission(Uri uri, int pid, int uid, int mode, int userId, IBinder callerToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(pid);
                    _data.writeInt(uid);
                    _data.writeInt(mode);
                    _data.writeInt(userId);
                    _data.writeStrongBinder(callerToken);
                    this.mRemote.transact(45, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void grantUriPermission(IApplicationThread caller, String targetPkg, Uri uri, int mode, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(targetPkg);
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(mode);
                    _data.writeInt(userId);
                    this.mRemote.transact(46, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void revokeUriPermission(IApplicationThread caller, String targetPkg, Uri uri, int mode, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(targetPkg);
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(mode);
                    _data.writeInt(userId);
                    this.mRemote.transact(47, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setActivityController(IActivityController watcher, boolean imAMonkey) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(watcher != null ? watcher.asBinder() : null);
                    _data.writeInt(imAMonkey ? 1 : 0);
                    this.mRemote.transact(48, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void showWaitingForDebugger(IApplicationThread who, boolean waiting) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(who != null ? who.asBinder() : null);
                    _data.writeInt(waiting ? 1 : 0);
                    this.mRemote.transact(49, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void signalPersistentProcesses(int signal) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(signal);
                    this.mRemote.transact(50, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public ParceledListSlice getRecentTasks(int maxNum, int flags, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ParceledListSlice _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(maxNum);
                    _data.writeInt(flags);
                    _data.writeInt(userId);
                    this.mRemote.transact(51, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ParceledListSlice)ParceledListSlice.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void serviceDoneExecuting(IBinder token, int type, int startId, int res) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(type);
                    _data.writeInt(startId);
                    _data.writeInt(res);
                    this.mRemote.transact(52, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public void activityDestroyed(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(53, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public IIntentSender getIntentSender(int type, String packageName, IBinder token, String resultWho, int requestCode, Intent[] intents, String[] resolvedTypes, int flags, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                IIntentSender _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(type);
                    _data.writeString(packageName);
                    _data.writeStrongBinder(token);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeTypedArray(intents, 0);
                    _data.writeStringArray(resolvedTypes);
                    _data.writeInt(flags);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(54, _data, _reply, 0);
                    _reply.readException();
                    _result = android.content.IIntentSender.Stub.asInterface(_reply.readStrongBinder());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void cancelIntentSender(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(55, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public String getPackageForIntentSender(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(56, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void registerIntentSenderCancelListener(IIntentSender sender, IResultReceiver receiver) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    this.mRemote.transact(57, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void unregisterIntentSenderCancelListener(IIntentSender sender, IResultReceiver receiver) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    this.mRemote.transact(58, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void enterSafeMode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(59, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean startNextMatchingActivity(IBinder callingActivity, Intent intent, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(callingActivity);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(60, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void noteWakeupAlarm(IIntentSender sender, int sourceUid, String sourcePkg, String tag) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeInt(sourceUid);
                    _data.writeString(sourcePkg);
                    _data.writeString(tag);
                    this.mRemote.transact(61, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void removeContentProvider(IBinder connection, boolean stable) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(connection);
                    _data.writeInt(stable ? 1 : 0);
                    this.mRemote.transact(62, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setRequestedOrientation(IBinder token, int requestedOrientation) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(requestedOrientation);
                    this.mRemote.transact(63, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getRequestedOrientation(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(64, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unbindFinished(IBinder token, Intent service, boolean doRebind) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(doRebind ? 1 : 0);
                    this.mRemote.transact(65, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setProcessImportant(IBinder token, int pid, boolean isForeground, String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(pid);
                    _data.writeInt(isForeground ? 1 : 0);
                    _data.writeString(reason);
                    this.mRemote.transact(66, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setServiceForeground(ComponentName className, IBinder token, int id, Notification notification, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (className != null) {
                        _data.writeInt(1);
                        className.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(token);
                    _data.writeInt(id);
                    if (notification != null) {
                        _data.writeInt(1);
                        notification.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(flags);
                    this.mRemote.transact(67, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean moveActivityTaskToBack(IBinder token, boolean nonRoot) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(nonRoot ? 1 : 0);
                    this.mRemote.transact(68, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void getMemoryInfo(MemoryInfo outInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(69, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        outInfo.readFromParcel(_reply);
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public List<ProcessErrorStateInfo> getProcessesInErrorState() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(70, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(ProcessErrorStateInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean clearApplicationUserData(String packageName, IPackageDataObserver observer, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    _data.writeInt(userId);
                    this.mRemote.transact(71, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void forceStopPackage(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(72, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean killPids(int[] pids, String reason, boolean secure) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeIntArray(pids);
                    _data.writeString(reason);
                    _data.writeInt(secure ? 1 : 0);
                    this.mRemote.transact(73, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public List<RunningServiceInfo> getServices(int maxNum, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(maxNum);
                    _data.writeInt(flags);
                    this.mRemote.transact(74, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(RunningServiceInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public TaskThumbnail getTaskThumbnail(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                TaskThumbnail _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(75, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (TaskThumbnail)TaskThumbnail.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public TaskDescription getTaskDescription(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                TaskDescription _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(76, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (TaskDescription)TaskDescription.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public List<RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(77, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(RunningAppProcessInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ConfigurationInfo getDeviceConfigurationInfo() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ConfigurationInfo _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(78, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ConfigurationInfo)ConfigurationInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public IBinder peekService(Intent service, String resolvedType, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                IBinder _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (service != null) {
                        _data.writeInt(1);
                        service.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeString(callingPackage);
                    this.mRemote.transact(79, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean profileControl(String process, int userId, boolean start, ProfilerInfo profilerInfo, int profileType) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(process);
                    _data.writeInt(userId);
                    _data.writeInt(start ? 1 : 0);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(profileType);
                    this.mRemote.transact(80, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean shutdown(int timeout) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(timeout);
                    this.mRemote.transact(81, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void stopAppSwitches() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(82, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void resumeAppSwitches() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(83, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean bindBackupAgent(String packageName, int backupRestoreMode, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(backupRestoreMode);
                    _data.writeInt(userId);
                    this.mRemote.transact(84, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void backupAgentCreated(String packageName, IBinder agent) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeStrongBinder(agent);
                    this.mRemote.transact(85, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void unbindBackupAgent(ApplicationInfo appInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (appInfo != null) {
                        _data.writeInt(1);
                        appInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(86, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getUidForIntentSender(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(87, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int handleIncomingUser(int callingPid, int callingUid, int userId, boolean allowAll, boolean requireFull, String name, String callerPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(callingPid);
                    _data.writeInt(callingUid);
                    _data.writeInt(userId);
                    _data.writeInt(allowAll ? 1 : 0);
                    _data.writeInt(requireFull ? 1 : 0);
                    _data.writeString(name);
                    _data.writeString(callerPackage);
                    this.mRemote.transact(88, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void addPackageDependency(String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    this.mRemote.transact(89, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void killApplication(String pkg, int appId, int userId, String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(pkg);
                    _data.writeInt(appId);
                    _data.writeInt(userId);
                    _data.writeString(reason);
                    this.mRemote.transact(90, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void closeSystemDialogs(String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(reason);
                    this.mRemote.transact(91, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] pids) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                android.os.Debug.MemoryInfo[] _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeIntArray(pids);
                    this.mRemote.transact(92, _data, _reply, 0);
                    _reply.readException();
                    _result = (android.os.Debug.MemoryInfo[])_reply.createTypedArray(android.os.Debug.MemoryInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void killApplicationProcess(String processName, int uid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(processName);
                    _data.writeInt(uid);
                    this.mRemote.transact(93, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int startActivityIntentSender(IApplicationThread caller, IIntentSender target, IBinder whitelistToken, Intent fillInIntent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int flagsMask, int flagsValues, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeStrongBinder(target != null ? target.asBinder() : null);
                    _data.writeStrongBinder(whitelistToken);
                    if (fillInIntent != null) {
                        _data.writeInt(1);
                        fillInIntent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(flagsMask);
                    _data.writeInt(flagsValues);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(94, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void overridePendingTransition(IBinder token, String packageName, int enterAnim, int exitAnim) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeString(packageName);
                    _data.writeInt(enterAnim);
                    _data.writeInt(exitAnim);
                    this.mRemote.transact(95, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean handleApplicationWtf(IBinder app, String tag, boolean system, ParcelableCrashInfo crashInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(app);
                    _data.writeString(tag);
                    _data.writeInt(system ? 1 : 0);
                    if (crashInfo != null) {
                        _data.writeInt(1);
                        crashInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(96, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void killBackgroundProcesses(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(97, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isUserAMonkey() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(98, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public WaitResult startActivityAndWait(IApplicationThread caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int flags, ProfilerInfo profilerInfo, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                WaitResult _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(flags);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(99, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (WaitResult)WaitResult.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean willActivityBeVisible(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(100, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int startActivityWithConfig(IApplicationThread caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int startFlags, Configuration newConfig, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(startFlags);
                    if (newConfig != null) {
                        _data.writeInt(1);
                        newConfig.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(101, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public List<ApplicationInfo> getRunningExternalApplications() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(102, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(ApplicationInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void finishHeavyWeightApp() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(103, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void handleApplicationStrictModeViolation(IBinder app, int violationMask, ViolationInfo crashInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(app);
                    _data.writeInt(violationMask);
                    if (crashInfo != null) {
                        _data.writeInt(1);
                        crashInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(104, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isImmersive(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(105, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setImmersive(IBinder token, boolean immersive) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(immersive ? 1 : 0);
                    this.mRemote.transact(106, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isTopActivityImmersive() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(107, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void crashApplication(int uid, int initialPid, String packageName, int userId, String message) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    _data.writeInt(initialPid);
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    _data.writeString(message);
                    this.mRemote.transact(108, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public String getProviderMimeType(Uri uri, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(109, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public IBinder newUriPermissionOwner(String name) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                IBinder _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(name);
                    this.mRemote.transact(110, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void grantUriPermissionFromOwner(IBinder owner, int fromUid, String targetPkg, Uri uri, int mode, int sourceUserId, int targetUserId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(owner);
                    _data.writeInt(fromUid);
                    _data.writeString(targetPkg);
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(mode);
                    _data.writeInt(sourceUserId);
                    _data.writeInt(targetUserId);
                    this.mRemote.transact(111, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void revokeUriPermissionFromOwner(IBinder owner, Uri uri, int mode, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(owner);
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(mode);
                    _data.writeInt(userId);
                    this.mRemote.transact(112, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int checkGrantUriPermission(int callingUid, String targetPkg, Uri uri, int modeFlags, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(callingUid);
                    _data.writeString(targetPkg);
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(modeFlags);
                    _data.writeInt(userId);
                    this.mRemote.transact(113, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean dumpHeap(String process, int userId, boolean managed, boolean mallocInfo, boolean runGc, String path, ParcelFileDescriptor fd) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(process);
                    _data.writeInt(userId);
                    _data.writeInt(managed ? 1 : 0);
                    _data.writeInt(mallocInfo ? 1 : 0);
                    _data.writeInt(runGc ? 1 : 0);
                    _data.writeString(path);
                    if (fd != null) {
                        _data.writeInt(1);
                        fd.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(114, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int startActivities(IApplicationThread caller, String callingPackage, Intent[] intents, String[] resolvedTypes, IBinder resultTo, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    _data.writeTypedArray(intents, 0);
                    _data.writeStringArray(resolvedTypes);
                    _data.writeStrongBinder(resultTo);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(115, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean isUserRunning(int userid, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userid);
                    _data.writeInt(flags);
                    this.mRemote.transact(116, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void activitySlept(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(117, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public int getFrontActivityScreenCompatMode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(118, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setFrontActivityScreenCompatMode(int mode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(mode);
                    this.mRemote.transact(119, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getPackageScreenCompatMode(String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    this.mRemote.transact(120, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setPackageScreenCompatMode(String packageName, int mode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(mode);
                    this.mRemote.transact(121, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean getPackageAskScreenCompat(String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    this.mRemote.transact(122, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setPackageAskScreenCompat(String packageName, boolean ask) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(ask ? 1 : 0);
                    this.mRemote.transact(123, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean switchUser(int userid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userid);
                    this.mRemote.transact(124, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setFocusedTask(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(125, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean removeTask(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(126, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void registerProcessObserver(IProcessObserver observer) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    this.mRemote.transact(127, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void unregisterProcessObserver(IProcessObserver observer) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    this.mRemote.transact(128, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isIntentSenderTargetedToPackage(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(129, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void updatePersistentConfiguration(Configuration values) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (values != null) {
                        _data.writeInt(1);
                        values.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(130, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public long[] getProcessPss(int[] pids) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                long[] _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeIntArray(pids);
                    this.mRemote.transact(131, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createLongArray();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void showBootMessage(CharSequence msg, boolean always) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (msg != null) {
                        _data.writeInt(1);
                        TextUtils.writeToParcel(msg, _data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(always ? 1 : 0);
                    this.mRemote.transact(132, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void killAllBackgroundProcesses() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(133, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public ContentProviderHolder getContentProviderExternal(String name, int userId, IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ContentProviderHolder _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(name);
                    _data.writeInt(userId);
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(134, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ContentProviderHolder)ContentProviderHolder.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void removeContentProviderExternal(String name, IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(name);
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(135, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void getMyMemoryState(RunningAppProcessInfo outInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(136, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        outInfo.readFromParcel(_reply);
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean killProcessesBelowForeground(String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(reason);
                    this.mRemote.transact(137, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public UserInfo getCurrentUser() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                UserInfo _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(138, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (UserInfo)UserInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean shouldUpRecreateTask(IBinder token, String destAffinity) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeString(destAffinity);
                    this.mRemote.transact(139, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean navigateUpTo(IBinder token, Intent target, int resultCode, Intent resultData) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (target != null) {
                        _data.writeInt(1);
                        target.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(resultCode);
                    if (resultData != null) {
                        _data.writeInt(1);
                        resultData.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(140, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setLockScreenShown(boolean showing, int secondaryDisplayShowing) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(showing ? 1 : 0);
                    _data.writeInt(secondaryDisplayShowing);
                    this.mRemote.transact(141, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean finishActivityAffinity(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(142, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int getLaunchedFromUid(IBinder activityToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(activityToken);
                    this.mRemote.transact(143, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unstableProviderDied(IBinder connection) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(connection);
                    this.mRemote.transact(144, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isIntentSenderAnActivity(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(145, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int startActivityAsUser(IApplicationThread caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int flags, ProfilerInfo profilerInfo, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(flags);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(146, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int stopUser(int userid, boolean force, IStopUserCallback callback) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userid);
                    _data.writeInt(force ? 1 : 0);
                    _data.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.mRemote.transact(147, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void registerUserSwitchObserver(IUserSwitchObserver observer, String name) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    _data.writeString(name);
                    this.mRemote.transact(148, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void unregisterUserSwitchObserver(IUserSwitchObserver observer) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    this.mRemote.transact(149, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int[] getRunningUserIds() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int[] _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(150, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createIntArray();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void requestBugReport(int bugreportType) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(bugreportType);
                    this.mRemote.transact(151, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void requestTelephonyBugReport(String shareTitle, String shareDescription) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(shareTitle);
                    _data.writeString(shareDescription);
                    this.mRemote.transact(152, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public long inputDispatchingTimedOut(int pid, boolean aboveSystem, String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                long _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(pid);
                    _data.writeInt(aboveSystem ? 1 : 0);
                    _data.writeString(reason);
                    this.mRemote.transact(153, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readLong();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void clearPendingBackup() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(154, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public Intent getIntentForIntentSender(IIntentSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Intent _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    this.mRemote.transact(155, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Intent)Intent.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public Bundle getAssistContextExtras(int requestType) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Bundle _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(requestType);
                    this.mRemote.transact(156, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Bundle)Bundle.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void reportAssistContextExtras(IBinder token, Bundle extras, AssistStructure structure, AssistContent content, Uri referrer) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (extras != null) {
                        _data.writeInt(1);
                        extras.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (structure != null) {
                        _data.writeInt(1);
                        structure.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (content != null) {
                        _data.writeInt(1);
                        content.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (referrer != null) {
                        _data.writeInt(1);
                        referrer.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(157, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public String getLaunchedFromPackage(IBinder activityToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(activityToken);
                    this.mRemote.transact(158, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void killUid(int appId, int userId, String reason) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(appId);
                    _data.writeInt(userId);
                    _data.writeString(reason);
                    this.mRemote.transact(159, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setUserIsMonkey(boolean monkey) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(monkey ? 1 : 0);
                    this.mRemote.transact(160, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void hang(IBinder who, boolean allowRestart) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(who);
                    _data.writeInt(allowRestart ? 1 : 0);
                    this.mRemote.transact(161, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void moveTaskToStack(int taskId, int stackId, boolean toTop) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    _data.writeInt(stackId);
                    _data.writeInt(toTop ? 1 : 0);
                    this.mRemote.transact(162, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void resizeStack(int stackId, Rect bounds, boolean allowResizeInDockedMode, boolean preserveWindows, boolean animate, int animationDuration) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    if (bounds != null) {
                        _data.writeInt(1);
                        bounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(allowResizeInDockedMode ? 1 : 0);
                    _data.writeInt(preserveWindows ? 1 : 0);
                    _data.writeInt(animate ? 1 : 0);
                    _data.writeInt(animationDuration);
                    this.mRemote.transact(163, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public List<StackInfo> getAllStackInfos() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(164, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(StackInfo.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setFocusedStack(int stackId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    this.mRemote.transact(165, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public StackInfo getStackInfo(int stackId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                StackInfo _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    this.mRemote.transact(166, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (StackInfo)StackInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean convertFromTranslucent(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(167, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean convertToTranslucent(IBinder token, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(168, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void notifyActivityDrawn(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(169, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void reportActivityFullyDrawn(IBinder token, boolean restoredFromBundle) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(restoredFromBundle ? 1 : 0);
                    this.mRemote.transact(170, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void restart() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(171, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void performIdleMaintenance() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(172, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void takePersistableUriPermission(Uri uri, int modeFlags, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(modeFlags);
                    _data.writeInt(userId);
                    this.mRemote.transact(173, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void releasePersistableUriPermission(Uri uri, int modeFlags, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (uri != null) {
                        _data.writeInt(1);
                        uri.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(modeFlags);
                    _data.writeInt(userId);
                    this.mRemote.transact(174, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public ParceledListSlice getPersistedUriPermissions(String packageName, boolean incoming) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ParceledListSlice _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(incoming ? 1 : 0);
                    this.mRemote.transact(175, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ParceledListSlice)ParceledListSlice.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void appNotRespondingViaProvider(IBinder connection) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(connection);
                    this.mRemote.transact(176, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public Rect getTaskBounds(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Rect _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(177, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Rect)Rect.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int getActivityDisplayId(IBinder activityToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(activityToken);
                    this.mRemote.transact(178, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean setProcessMemoryTrimLevel(String process, int uid, int level) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(process);
                    _data.writeInt(uid);
                    _data.writeInt(level);
                    this.mRemote.transact(179, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public String getTagForIntentSender(IIntentSender sender, String prefix) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                String _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeString(prefix);
                    this.mRemote.transact(180, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean startUserInBackground(int userid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userid);
                    this.mRemote.transact(181, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void startLockTaskModeById(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(182, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void startLockTaskModeByToken(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(183, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void stopLockTaskMode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(184, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isInLockTaskMode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(185, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setTaskDescription(IBinder token, TaskDescription values) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (values != null) {
                        _data.writeInt(1);
                        values.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(186, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int startVoiceActivity(String callingPackage, int callingPid, int callingUid, Intent intent, String resolvedType, IVoiceInteractionSession session, IVoiceInteractor interactor, int flags, ProfilerInfo profilerInfo, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(callingPackage);
                    _data.writeInt(callingPid);
                    _data.writeInt(callingUid);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(session != null ? session.asBinder() : null);
                    _data.writeStrongBinder(interactor != null ? interactor.asBinder() : null);
                    _data.writeInt(flags);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(187, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int startAssistantActivity(String callingPackage, int callingPid, int callingUid, Intent intent, String resolvedType, Bundle options, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(callingPackage);
                    _data.writeInt(callingPid);
                    _data.writeInt(callingUid);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(userId);
                    this.mRemote.transact(188, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public Bundle getActivityOptions(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Bundle _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(189, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Bundle)Bundle.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public List<IBinder> getAppTasks(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ArrayList _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(callingPackage);
                    this.mRemote.transact(190, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createBinderArrayList();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void startSystemLockTaskMode(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(191, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void stopSystemLockTaskMode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(192, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void finishVoiceTask(IVoiceInteractionSession session) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(session != null ? session.asBinder() : null);
                    this.mRemote.transact(193, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isTopOfTask(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(194, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void notifyLaunchTaskBehindComplete(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(195, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int startActivityFromRecents(int taskId, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(196, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void notifyEnterAnimationComplete(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(197, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int startActivityAsCaller(IApplicationThread caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int flags, ProfilerInfo profilerInfo, Bundle options, boolean ignoreTargetSecurity, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(caller != null ? caller.asBinder() : null);
                    _data.writeString(callingPackage);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(resultTo);
                    _data.writeString(resultWho);
                    _data.writeInt(requestCode);
                    _data.writeInt(flags);
                    if (profilerInfo != null) {
                        _data.writeInt(1);
                        profilerInfo.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(ignoreTargetSecurity ? 1 : 0);
                    _data.writeInt(userId);
                    this.mRemote.transact(198, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int addAppTask(IBinder activityToken, Intent intent, TaskDescription description, Bitmap thumbnail) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(activityToken);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (description != null) {
                        _data.writeInt(1);
                        description.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (thumbnail != null) {
                        _data.writeInt(1);
                        thumbnail.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(199, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public Point getAppTaskThumbnailSize() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Point _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(200, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Point)Point.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean releaseActivityInstance(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(201, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void releaseSomeActivities(IApplicationThread app) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(app != null ? app.asBinder() : null);
                    this.mRemote.transact(202, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void bootAnimationComplete() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(203, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public Bitmap getTaskDescriptionIcon(String filename, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                Bitmap _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(filename);
                    _data.writeInt(userId);
                    this.mRemote.transact(204, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (Bitmap)Bitmap.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean launchAssistIntent(Intent intent, int requestType, String hint, int userHandle, Bundle args) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(requestType);
                    _data.writeString(hint);
                    _data.writeInt(userHandle);
                    if (args != null) {
                        _data.writeInt(1);
                        args.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(205, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void startInPlaceAnimationOnFrontMostApplication(Bundle opts) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (opts != null) {
                        _data.writeInt(1);
                        opts.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(206, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int checkPermissionWithToken(String permission, int pid, int uid, IBinder callerToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(permission);
                    _data.writeInt(pid);
                    _data.writeInt(uid);
                    _data.writeStrongBinder(callerToken);
                    this.mRemote.transact(207, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void registerTaskStackListener(ITaskStackListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(208, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void notifyCleartextNetwork(int uid, byte[] firstPacket) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    _data.writeByteArray(firstPacket);
                    this.mRemote.transact(209, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int createStackOnDisplay(int displayId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(displayId);
                    this.mRemote.transact(210, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public int getFocusedStackId() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(211, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setTaskResizeable(int taskId, int resizeableMode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    _data.writeInt(resizeableMode);
                    this.mRemote.transact(212, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean requestAssistContextExtras(int requestType, IResultReceiver receiver, Bundle receiverExtras, IBinder activityToken, boolean focused, boolean newSessionId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(requestType);
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    if (receiverExtras != null) {
                        _data.writeInt(1);
                        receiverExtras.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(activityToken);
                    _data.writeInt(focused ? 1 : 0);
                    _data.writeInt(newSessionId ? 1 : 0);
                    this.mRemote.transact(213, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void resizeTask(int taskId, Rect bounds, int resizeMode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    if (bounds != null) {
                        _data.writeInt(1);
                        bounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(resizeMode);
                    this.mRemote.transact(214, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getLockTaskModeState() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(215, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setDumpHeapDebugLimit(String processName, int uid, long maxMemSize, String reportPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(processName);
                    _data.writeInt(uid);
                    _data.writeLong(maxMemSize);
                    _data.writeString(reportPackage);
                    this.mRemote.transact(216, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void dumpHeapFinished(String path) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(path);
                    this.mRemote.transact(217, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setVoiceKeepAwake(IVoiceInteractionSession session, boolean keepAwake) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(session != null ? session.asBinder() : null);
                    _data.writeInt(keepAwake ? 1 : 0);
                    this.mRemote.transact(218, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void updateLockTaskPackages(int userId, String[] packages) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userId);
                    _data.writeStringArray(packages);
                    this.mRemote.transact(219, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void noteAlarmStart(IIntentSender sender, int sourceUid, String tag) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeInt(sourceUid);
                    _data.writeString(tag);
                    this.mRemote.transact(220, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void noteAlarmFinish(IIntentSender sender, int sourceUid, String tag) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(sender != null ? sender.asBinder() : null);
                    _data.writeInt(sourceUid);
                    _data.writeString(tag);
                    this.mRemote.transact(221, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getPackageProcessState(String packageName, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeString(callingPackage);
                    this.mRemote.transact(222, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void showLockTaskEscapeMessage(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(223, _data, (Parcel)null, 1);
                } finally {
                    _data.recycle();
                }

            }

            public void updateDeviceOwner(String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    this.mRemote.transact(224, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void keyguardGoingAway(int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(flags);
                    this.mRemote.transact(225, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getUidProcessState(int uid, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    _data.writeString(callingPackage);
                    this.mRemote.transact(226, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void registerUidObserver(IUidObserver observer, int which, int cutpoint, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    _data.writeInt(which);
                    _data.writeInt(cutpoint);
                    _data.writeString(callingPackage);
                    this.mRemote.transact(227, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void unregisterUidObserver(IUidObserver observer) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(observer != null ? observer.asBinder() : null);
                    this.mRemote.transact(228, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isAssistDataAllowedOnCurrentActivity() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(229, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean showAssistFromActivity(IBinder token, Bundle args) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (args != null) {
                        _data.writeInt(1);
                        args.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(230, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean isRootVoiceInteraction(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(231, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean startBinderTracking() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(232, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean stopBinderTrackingAndDump(ParcelFileDescriptor fd) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (fd != null) {
                        _data.writeInt(1);
                        fd.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(233, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void positionTaskInStack(int taskId, int stackId, int position) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    _data.writeInt(stackId);
                    _data.writeInt(position);
                    this.mRemote.transact(234, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getActivityStackId(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(235, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void exitFreeformMode(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(236, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void reportSizeConfigurations(IBinder token, int[] horizontalSizeConfiguration, int[] verticalSizeConfigurations, int[] smallestWidthConfigurations) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeIntArray(horizontalSizeConfiguration);
                    _data.writeIntArray(verticalSizeConfigurations);
                    _data.writeIntArray(smallestWidthConfigurations);
                    this.mRemote.transact(237, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean moveTaskToDockedStack(int taskId, int createMode, boolean toTop, boolean animate, Rect initialBounds) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    _data.writeInt(createMode);
                    _data.writeInt(toTop ? 1 : 0);
                    _data.writeInt(animate ? 1 : 0);
                    if (initialBounds != null) {
                        _data.writeInt(1);
                        initialBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(238, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void suppressResizeConfigChanges(boolean suppress) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(suppress ? 1 : 0);
                    this.mRemote.transact(239, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void moveTasksToFullscreenStack(int fromStackId, boolean onTop) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(fromStackId);
                    _data.writeInt(onTop ? 1 : 0);
                    this.mRemote.transact(240, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean moveTopActivityToPinnedStack(int stackId, Rect bounds) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    if (bounds != null) {
                        _data.writeInt(1);
                        bounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(241, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean isAppStartModeDisabled(int uid, String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    _data.writeString(packageName);
                    this.mRemote.transact(242, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean unlockUser(int userid, byte[] token, byte[] secret, IProgressListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userid);
                    _data.writeByteArray(token);
                    _data.writeByteArray(secret);
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(243, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean isInMultiWindowMode(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(244, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public boolean isInPictureInPictureMode(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(245, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void killPackageDependents(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(246, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean enterPictureInPictureMode(IBinder token, PictureInPictureParams params) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (params != null) {
                        _data.writeInt(1);
                        params.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(247, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setPictureInPictureParams(IBinder token, PictureInPictureParams params) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (params != null) {
                        _data.writeInt(1);
                        params.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(248, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getMaxNumPictureInPictureActions(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(249, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void activityRelaunched(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(250, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public IBinder getUriPermissionOwnerForActivity(IBinder activityToken) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                IBinder _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(activityToken);
                    this.mRemote.transact(251, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void resizeDockedStack(Rect dockedBounds, Rect tempDockedTaskBounds, Rect tempDockedTaskInsetBounds, Rect tempOtherTaskBounds, Rect tempOtherTaskInsetBounds) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (dockedBounds != null) {
                        _data.writeInt(1);
                        dockedBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (tempDockedTaskBounds != null) {
                        _data.writeInt(1);
                        tempDockedTaskBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (tempDockedTaskInsetBounds != null) {
                        _data.writeInt(1);
                        tempDockedTaskInsetBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (tempOtherTaskBounds != null) {
                        _data.writeInt(1);
                        tempOtherTaskBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (tempOtherTaskInsetBounds != null) {
                        _data.writeInt(1);
                        tempOtherTaskInsetBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(252, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int setVrMode(IBinder token, boolean enabled, ComponentName packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(enabled ? 1 : 0);
                    if (packageName != null) {
                        _data.writeInt(1);
                        packageName.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(253, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public ParceledListSlice getGrantedUriPermissions(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                ParceledListSlice _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(254, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (ParceledListSlice)ParceledListSlice.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void clearGrantedUriPermissions(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(255, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isAppForeground(int uid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    this.mRemote.transact(256, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void startLocalVoiceInteraction(IBinder token, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(257, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void stopLocalVoiceInteraction(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(258, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean supportsLocalVoiceInteraction() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(259, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void notifyPinnedStackAnimationStarted() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(260, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void notifyPinnedStackAnimationEnded() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(261, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void removeStack(int stackId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    this.mRemote.transact(262, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void makePackageIdle(String packageName, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    this.mRemote.transact(263, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getMemoryTrimLevel() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(264, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void resizePinnedStack(Rect pinnedBounds, Rect tempPinnedTaskBounds) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (pinnedBounds != null) {
                        _data.writeInt(1);
                        pinnedBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (tempPinnedTaskBounds != null) {
                        _data.writeInt(1);
                        tempPinnedTaskBounds.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(265, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean isVrModePackageEnabled(ComponentName packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (packageName != null) {
                        _data.writeInt(1);
                        packageName.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(266, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void swapDockedAndFullscreenStack() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(267, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void notifyLockedProfile(int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userId);
                    this.mRemote.transact(268, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void startConfirmDeviceCredentialIntent(Intent intent, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(269, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void sendIdleJobTrigger() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(270, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int sendIntentSender(IIntentSender target, IBinder whitelistToken, int code, Intent intent, String resolvedType, IIntentReceiver finishedReceiver, String requiredPermission, Bundle options) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(target != null ? target.asBinder() : null);
                    _data.writeStrongBinder(whitelistToken);
                    _data.writeInt(code);
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeString(resolvedType);
                    _data.writeStrongBinder(finishedReceiver != null ? finishedReceiver.asBinder() : null);
                    _data.writeString(requiredPermission);
                    if (options != null) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    this.mRemote.transact(271, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void setVrThread(int tid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(tid);
                    this.mRemote.transact(272, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setRenderThread(int tid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(tid);
                    this.mRemote.transact(273, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setHasTopUi(boolean hasTopUi) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(hasTopUi ? 1 : 0);
                    this.mRemote.transact(274, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void requestActivityRelaunch(IBinder token) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    this.mRemote.transact(275, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean updateDisplayOverrideConfiguration(Configuration values, int displayId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    if (values != null) {
                        _data.writeInt(1);
                        values.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeInt(displayId);
                    this.mRemote.transact(276, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void unregisterTaskStackListener(ITaskStackListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(277, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void moveStackToDisplay(int stackId, int displayId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(stackId);
                    _data.writeInt(displayId);
                    this.mRemote.transact(278, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public boolean requestAutofillData(IResultReceiver receiver, Bundle receiverExtras, IBinder activityToken, int flags) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                boolean _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(receiver != null ? receiver.asBinder() : null);
                    if (receiverExtras != null) {
                        _data.writeInt(1);
                        receiverExtras.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }

                    _data.writeStrongBinder(activityToken);
                    _data.writeInt(flags);
                    this.mRemote.transact(279, _data, _reply, 0);
                    _reply.readException();
                    _result = 0 != _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void dismissKeyguard(IBinder token, IKeyguardDismissCallback callback) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.mRemote.transact(280, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int restartUserInBackground(int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(userId);
                    this.mRemote.transact(281, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void cancelTaskWindowTransition(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(282, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void cancelTaskThumbnailTransition(int taskId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    this.mRemote.transact(283, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public TaskSnapshot getTaskSnapshot(int taskId, boolean reducedResolution) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                TaskSnapshot _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(taskId);
                    _data.writeInt(reducedResolution ? 1 : 0);
                    this.mRemote.transact(284, _data, _reply, 0);
                    _reply.readException();
                    if (0 != _reply.readInt()) {
                        _result = (TaskSnapshot)TaskSnapshot.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void scheduleApplicationInfoChanged(List<String> packageNames, int userId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStringList(packageNames);
                    _data.writeInt(userId);
                    this.mRemote.transact(285, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setPersistentVrThread(int tid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(tid);
                    this.mRemote.transact(286, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void waitForNetworkStateUpdate(long procStateSeq) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeLong(procStateSeq);
                    this.mRemote.transact(287, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setDisablePreviewScreenshots(IBinder token, boolean disable) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(disable ? 1 : 0);
                    this.mRemote.transact(288, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public int getLastResumedActivityUserId() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                int _result;
                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    this.mRemote.transact(289, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

                return _result;
            }

            public void backgroundWhitelistUid(int uid) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeInt(uid);
                    this.mRemote.transact(290, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setShowWhenLocked(IBinder token, boolean showWhenLocked) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(showWhenLocked ? 1 : 0);
                    this.mRemote.transact(291, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }

            public void setTurnScreenOn(IBinder token, boolean turnScreenOn) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("android.app.IActivityManager");
                    _data.writeStrongBinder(token);
                    _data.writeInt(turnScreenOn ? 1 : 0);
                    this.mRemote.transact(292, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }
        }
    }
}
