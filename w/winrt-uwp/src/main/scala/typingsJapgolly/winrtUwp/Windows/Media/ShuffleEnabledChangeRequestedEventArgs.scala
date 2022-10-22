package typingsJapgolly.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ShuffleEnabledChangeRequested event. */
trait ShuffleEnabledChangeRequestedEventArgs extends StObject {
  
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  var requestedShuffleEnabled: Boolean
}
object ShuffleEnabledChangeRequestedEventArgs {
  
  inline def apply(requestedShuffleEnabled: Boolean): ShuffleEnabledChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedShuffleEnabled = requestedShuffleEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleEnabledChangeRequestedEventArgs]
  }
  
  extension [Self <: ShuffleEnabledChangeRequestedEventArgs](x: Self) {
    
    inline def setRequestedShuffleEnabled(value: Boolean): Self = StObject.set(x, "requestedShuffleEnabled", value.asInstanceOf[js.Any])
  }
}
