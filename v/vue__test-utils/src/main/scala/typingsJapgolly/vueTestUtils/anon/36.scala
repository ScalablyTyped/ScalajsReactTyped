package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`true`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.Performance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: Performance
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "Performance")
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: Performance): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
