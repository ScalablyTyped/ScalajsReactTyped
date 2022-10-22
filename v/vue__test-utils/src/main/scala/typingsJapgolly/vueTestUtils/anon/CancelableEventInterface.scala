package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.TimeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelableEventInterface extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: TimeEvent
}
object CancelableEventInterface {
  
  inline def apply(): CancelableEventInterface = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "TimeEvent")
    __obj.asInstanceOf[CancelableEventInterface]
  }
  
  extension [Self <: CancelableEventInterface](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: TimeEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
