package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.DeviceLightEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: DeviceLightEvent
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "DeviceLightEvent")
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: DeviceLightEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
