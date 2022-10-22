package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the LayoutRequested event. */
trait CoreTextLayoutRequestedEventArgs extends StObject {
  
  /** Gets information about a LayoutRequested event. */
  var request: CoreTextLayoutRequest
}
object CoreTextLayoutRequestedEventArgs {
  
  inline def apply(request: CoreTextLayoutRequest): CoreTextLayoutRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequestedEventArgs]
  }
  
  extension [Self <: CoreTextLayoutRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: CoreTextLayoutRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
