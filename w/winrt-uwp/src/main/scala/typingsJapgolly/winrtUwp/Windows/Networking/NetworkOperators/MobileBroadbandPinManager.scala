package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
trait MobileBroadbandPinManager extends StObject {
  
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  def getPin(pinType: MobileBroadbandPinType): MobileBroadbandPin
  
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  var supportedPins: IVectorView[MobileBroadbandPinType]
}
object MobileBroadbandPinManager {
  
  inline def apply(
    getPin: MobileBroadbandPinType => MobileBroadbandPin,
    supportedPins: IVectorView[MobileBroadbandPinType]
  ): MobileBroadbandPinManager = {
    val __obj = js.Dynamic.literal(getPin = js.Any.fromFunction1(getPin), supportedPins = supportedPins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinManager]
  }
  
  extension [Self <: MobileBroadbandPinManager](x: Self) {
    
    inline def setGetPin(value: MobileBroadbandPinType => MobileBroadbandPin): Self = StObject.set(x, "getPin", js.Any.fromFunction1(value))
    
    inline def setSupportedPins(value: IVectorView[MobileBroadbandPinType]): Self = StObject.set(x, "supportedPins", value.asInstanceOf[js.Any])
  }
}
