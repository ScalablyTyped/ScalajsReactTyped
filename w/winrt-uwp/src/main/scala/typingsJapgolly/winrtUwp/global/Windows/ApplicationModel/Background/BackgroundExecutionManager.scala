package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that let an app ask to be added to the lock screen's apps list or query its current access to background activity and badge updates on the lock screen. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
@js.native
open class BackgroundExecutionManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundExecutionManager
object BackgroundExecutionManager {
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundExecutionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the ability of the calling lock screen app to perform background activity and update its badge.
    * @return One of the enumeration values that specify the app's capabilities on the lock screen.
    */
  /* static member */
  inline def getAccessStatus(): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessStatus")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus]
  /**
    * Gets the ability of a specific lock screen app to perform background activity and update its badge.
    * @param applicationId The Package Relative Application ID (PRAID) of the app whose capabilities are being retrieved. The specified app must be in the same package as the calling app.
    * @return One of the enumeration values that specify the app's capabilities on the lock screen.
    */
  /* static member */
  inline def getAccessStatus(applicationId: String): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessStatus")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus]
  
  /** Removes the calling app from the lock screen's apps list. */
  /* static member */
  inline def removeAccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccess")().asInstanceOf[Unit]
  /**
    * Removes a specific app from the lock screen's apps list.
    * @param applicationId The Package Relative Application ID (PRAID) of the app to be removed from the lock screen. The specified app must be in the same package as the calling app.
    */
  /* static member */
  inline def removeAccess(applicationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccess")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Requests access for an app to run background tasks.
    * @return The object, bound to the calling app, that is used to request that the app be added to the lock screen's apps list. When the operation completes, it returns a member of the BackgroundAccessStatus enumeration that specifies the outcome.
    */
  /* static member */
  inline def requestAccessAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus
  ]]
  /**
    * Requests access for an app to run background tasks.
    * @param applicationId The Package Relative Application ID (PRAID) of the app to be added to the lock screen. The specified app must be in the same package as the calling app.
    * @return The object, bound to the app specified by applicationId, that is used to request that the app be added to the lock screen's apps list. When the operation completes, it returns a member of the BackgroundAccessStatus enumeration that specifies the outcome.
    */
  /* static member */
  inline def requestAccessAsync(applicationId: String): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")(applicationId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus
  ]]
}
