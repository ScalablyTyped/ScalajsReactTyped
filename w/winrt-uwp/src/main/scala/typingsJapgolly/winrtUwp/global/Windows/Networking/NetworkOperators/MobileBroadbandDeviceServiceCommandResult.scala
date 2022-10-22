package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a mobile broadband device service command. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult")
@js.native
open class MobileBroadbandDeviceServiceCommandResult ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult {
  
  /** Gets the response data from the command execution on a mobile broadband device service. */
  /* CompleteClass */
  var responseData: IBuffer = js.native
  
  /** Gets the status code of the command execution on a mobile broadband device service. */
  /* CompleteClass */
  var statusCode: Double = js.native
}
