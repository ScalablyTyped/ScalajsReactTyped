package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: PointerEvent
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "PointerEvent")
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PointerEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
