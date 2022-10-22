package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a text event. */
trait TextEvent
  extends StObject
     with EventObject {
  
  /** This is a dummy field only. Please ignore. */
  var dummy1: Double
}
object TextEvent {
  
  inline def apply(Source: XInterface, dummy1: Double): TextEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], dummy1 = dummy1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEvent]
  }
  
  extension [Self <: TextEvent](x: Self) {
    
    inline def setDummy1(value: Double): Self = StObject.set(x, "dummy1", value.asInstanceOf[js.Any])
  }
}
