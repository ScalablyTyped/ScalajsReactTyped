package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a mobile broadband device service command. */
trait MobileBroadbandDeviceServiceCommandResult extends StObject {
  
  /** Gets the response data from the command execution on a mobile broadband device service. */
  var responseData: IBuffer
  
  /** Gets the status code of the command execution on a mobile broadband device service. */
  var statusCode: Double
}
object MobileBroadbandDeviceServiceCommandResult {
  
  inline def apply(responseData: IBuffer, statusCode: Double): MobileBroadbandDeviceServiceCommandResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceCommandResult]
  }
  
  extension [Self <: MobileBroadbandDeviceServiceCommandResult](x: Self) {
    
    inline def setResponseData(value: IBuffer): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
