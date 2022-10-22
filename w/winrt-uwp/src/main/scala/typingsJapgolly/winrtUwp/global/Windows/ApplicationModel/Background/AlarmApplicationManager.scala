package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Requests permission from the user to set alarms, and retrieves the status of user permission for the app to set alarms. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.AlarmApplicationManager")
@js.native
open class AlarmApplicationManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmApplicationManager
object AlarmApplicationManager {
  
  @JSGlobal("Windows.ApplicationModel.Background.AlarmApplicationManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves the status of user permission for the app to set alarms.
    * @return Indicates whether the user has granted permission to set alarms.
    */
  /* static member */
  inline def getAccessStatus(): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessStatus")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus]
  
  /**
    * Requests permission from the user to set alarms.
    * @return This method returns an AlarmAccessStatus value when it completes.
    */
  /* static member */
  inline def requestAccessAsync(): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus]]
}
