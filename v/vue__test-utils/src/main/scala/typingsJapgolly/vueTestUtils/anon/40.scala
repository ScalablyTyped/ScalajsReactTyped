package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.SVGEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: SVGEvent
}
object `40` {
  
  inline def apply(): `40` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "SVGEvent")
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: SVGEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
