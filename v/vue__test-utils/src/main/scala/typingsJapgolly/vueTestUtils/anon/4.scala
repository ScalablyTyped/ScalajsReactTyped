package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.CompositionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: CompositionEvent
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "CompositionEvent")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: CompositionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
