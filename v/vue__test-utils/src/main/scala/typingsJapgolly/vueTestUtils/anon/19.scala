package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: FocusEvent
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "FocusEvent")
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: FocusEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
