package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband device service. */
trait MobileBroadbandDeviceService extends StObject {
  
  /** Gets the unique device service identity for the mobile broadband device service. */
  var deviceServiceId: String
  
  /**
    * Opens a new MobileBroadbandDeviceServiceCommandSession for the mobile broadband device service.
    * @return A new command session for the mobile broadband device service.
    */
  def openCommandSession(): MobileBroadbandDeviceServiceCommandSession
  
  /**
    * Opens a new MobileBroadbandDeviceServiceDataSession for the mobile broadband device service.
    * @return A new data session for the Mobile Broadband device service.
    */
  def openDataSession(): MobileBroadbandDeviceServiceDataSession
  
  /** Gets a list of supported device service commands for the mobile broadband device service. */
  var supportedCommands: IVectorView[Double]
}
object MobileBroadbandDeviceService {
  
  inline def apply(
    deviceServiceId: String,
    openCommandSession: CallbackTo[MobileBroadbandDeviceServiceCommandSession],
    openDataSession: CallbackTo[MobileBroadbandDeviceServiceDataSession],
    supportedCommands: IVectorView[Double]
  ): MobileBroadbandDeviceService = {
    val __obj = js.Dynamic.literal(deviceServiceId = deviceServiceId.asInstanceOf[js.Any], openCommandSession = openCommandSession.toJsFn, openDataSession = openDataSession.toJsFn, supportedCommands = supportedCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceService]
  }
  
  extension [Self <: MobileBroadbandDeviceService](x: Self) {
    
    inline def setDeviceServiceId(value: String): Self = StObject.set(x, "deviceServiceId", value.asInstanceOf[js.Any])
    
    inline def setOpenCommandSession(value: CallbackTo[MobileBroadbandDeviceServiceCommandSession]): Self = StObject.set(x, "openCommandSession", value.toJsFn)
    
    inline def setOpenDataSession(value: CallbackTo[MobileBroadbandDeviceServiceDataSession]): Self = StObject.set(x, "openDataSession", value.toJsFn)
    
    inline def setSupportedCommands(value: IVectorView[Double]): Self = StObject.set(x, "supportedCommands", value.asInstanceOf[js.Any])
  }
}
