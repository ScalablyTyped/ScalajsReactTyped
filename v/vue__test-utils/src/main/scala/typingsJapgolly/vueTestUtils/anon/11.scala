package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: UIEvent
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "UIEvent")
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: UIEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
