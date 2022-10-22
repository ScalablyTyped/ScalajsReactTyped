package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a radio state change notification. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails")
@js.native
open class MobileBroadbandRadioStateChangeTriggerDetails ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails {
  
  /** Gets the collection of radio state change details associated with a notification. */
  /* CompleteClass */
  var radioStateChanges: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange
  ] = js.native
}
