package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: MouseEvent
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "MouseEvent")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: MouseEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
