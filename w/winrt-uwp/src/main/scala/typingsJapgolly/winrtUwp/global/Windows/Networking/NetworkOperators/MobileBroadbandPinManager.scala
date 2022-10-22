package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinManager")
@js.native
open class MobileBroadbandPinManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinManager {
  
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  /* CompleteClass */
  override def getPin(pinType: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPin = js.native
  
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  /* CompleteClass */
  var supportedPins: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType
  ] = js.native
}
