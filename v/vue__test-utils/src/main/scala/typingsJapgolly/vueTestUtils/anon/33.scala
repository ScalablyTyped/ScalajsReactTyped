package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: PointerEvent
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "PointerEvent")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PointerEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
