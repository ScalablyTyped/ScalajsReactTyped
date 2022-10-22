package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundCondition
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
  @js.native
  object BackgroundAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus & Double
      ] = js.native
    
    /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity & Double = js.native
    
    /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity & Double = js.native
    
    /* 3 */ val denied: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied & Double = js.native
    
    /* 0 */ val unspecified: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
  @js.native
  open class BackgroundExecutionManager ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundExecutionManager
  /* static members */
  object BackgroundExecutionManager {
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAccessStatus(): BackgroundAccessStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessStatus")().asInstanceOf[BackgroundAccessStatus]
    inline def getAccessStatus(applicationId: String): BackgroundAccessStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessStatus")(applicationId.asInstanceOf[js.Any]).asInstanceOf[BackgroundAccessStatus]
    
    inline def removeAccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccess")().asInstanceOf[Unit]
    inline def removeAccess(applicationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccess")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IAsyncOperation[BackgroundAccessStatus]]
    inline def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")(applicationId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[BackgroundAccessStatus]]
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
  @js.native
  open class BackgroundTaskBuilder ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskBuilder {
    
    /* CompleteClass */
    override def addCondition(condition: IBackgroundCondition): Unit = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def register(): typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration = js.native
    
    /* CompleteClass */
    override def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
    
    /* CompleteClass */
    var taskEntryPoint: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
  @js.native
  object BackgroundTaskCancellationReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason & Double
      ] = js.native
    
    /* 0 */ val abort: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort & Double = js.native
    
    /* 2 */ val loggingOff: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff & Double = js.native
    
    /* 3 */ val servicingUpdate: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate & Double = js.native
    
    /* 1 */ val terminating: typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs")
  @js.native
  open class BackgroundTaskCompletedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs {
    
    /* CompleteClass */
    override def checkResult(): Unit = js.native
    
    /* CompleteClass */
    var instanceId: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskDeferral")
  @js.native
  open class BackgroundTaskDeferral ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs")
  @js.native
  open class BackgroundTaskProgressEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs {
    
    /* CompleteClass */
    var instanceId: String = js.native
    
    /* CompleteClass */
    var progress: Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
  @js.native
  open class BackgroundTaskRegistration ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var oncompleted: Any = js.native
    
    /* CompleteClass */
    var onprogress: Any = js.native
    
    /* CompleteClass */
    var taskId: String = js.native
    
    /* CompleteClass */
    override def unregister(cancelTask: Boolean): Unit = js.native
  }
  /* static members */
  object BackgroundTaskRegistration {
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration.allTasks")
    @js.native
    def allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
    inline def allTasks_=(x: IMapView[String, IBackgroundTaskRegistration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allTasks")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.MaintenanceTrigger")
  @js.native
  open class MaintenanceTrigger protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.MaintenanceTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
    
    /* CompleteClass */
    var freshnessTime: Double = js.native
    
    /* CompleteClass */
    var oneShot: Boolean = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger")
  @js.native
  open class NetworkOperatorHotspotAuthenticationTrigger ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger
  
  @JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger")
  @js.native
  open class NetworkOperatorNotificationTrigger protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger {
    def this(networkAccountId: String) = this()
    
    /* CompleteClass */
    var networkAccountId: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.PushNotificationTrigger")
  @js.native
  open class PushNotificationTrigger ()
    extends StObject
       with IBackgroundTrigger {
    def this(applicationId: String) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemCondition")
  @js.native
  open class SystemCondition protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemCondition {
    def this(conditionType: SystemConditionType) = this()
    
    /* CompleteClass */
    var conditionType: SystemConditionType = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
  @js.native
  object SystemConditionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType & Double
      ] = js.native
    
    /* 3 */ val internetAvailable: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable & Double = js.native
    
    /* 4 */ val internetNotAvailable: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable & Double = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.invalid & Double = js.native
    
    /* 5 */ val sessionConnected: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected & Double = js.native
    
    /* 6 */ val sessionDisconnected: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected & Double = js.native
    
    /* 2 */ val userNotPresent: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent & Double = js.native
    
    /* 1 */ val userPresent: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType.userPresent & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemTrigger")
  @js.native
  open class SystemTrigger protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTrigger {
    def this(triggerType: SystemTriggerType, oneShot: Boolean) = this()
    
    /* CompleteClass */
    var oneShot: Boolean = js.native
    
    /* CompleteClass */
    var triggerType: SystemTriggerType = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
  @js.native
  object SystemTriggerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType & Double
      ] = js.native
    
    /* 5 */ val controlChannelReset: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.controlChannelReset & Double = js.native
    
    /* 6 */ val internetAvailable: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.internetAvailable & Double = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.invalid & Double = js.native
    
    /* 9 */ val lockScreenApplicationAdded: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationAdded & Double = js.native
    
    /* 10 */ val lockScreenApplicationRemoved: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationRemoved & Double = js.native
    
    /* 4 */ val networkStateChange: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.networkStateChange & Double = js.native
    
    /* 12 */ val onlineIdConnectedStateChange: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.onlineIdConnectedStateChange & Double = js.native
    
    /* 8 */ val servicingComplete: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.servicingComplete & Double = js.native
    
    /* 7 */ val sessionConnected: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.sessionConnected & Double = js.native
    
    /* 1 */ val smsReceived: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.smsReceived & Double = js.native
    
    /* 11 */ val timeZoneChange: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.timeZoneChange & Double = js.native
    
    /* 3 */ val userAway: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userAway & Double = js.native
    
    /* 2 */ val userPresent: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userPresent & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Background.TimeTrigger")
  @js.native
  open class TimeTrigger protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Background.TimeTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
    
    /* CompleteClass */
    var freshnessTime: Double = js.native
    
    /* CompleteClass */
    var oneShot: Boolean = js.native
  }
}
