package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.SVGZoomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: SVGZoomEvent
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "SVGZoomEvent")
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: SVGZoomEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
