package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when the connection status of a device changes. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
open class DeviceConnectionChangeTrigger ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger {
  
  /** Gets whether the system can maintain a connection to the specified device. */
  /* CompleteClass */
  var canMaintainConnection: Boolean = js.native
  
  /** Gets the device Id associated with the device. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  /* CompleteClass */
  var maintainConnection: Boolean = js.native
}
object DeviceConnectionChangeTrigger {
  
  @JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Begins an asynchronous operation to get the DeviceConnectionChangeTrigger associated with the specified Id.
    * @param deviceId The device Id with which to find the associated trigger.
    * @return The DeviceConnectionChangeTrigger object associated with the specified device Id.
    */
  /* static member */
  inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
  ]]
}
