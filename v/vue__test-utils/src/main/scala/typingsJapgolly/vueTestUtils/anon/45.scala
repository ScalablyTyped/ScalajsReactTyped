package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.UserProximityEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: UserProximityEvent
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "UserProximityEvent")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: UserProximityEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
