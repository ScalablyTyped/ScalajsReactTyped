package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: ProgressEvent
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "ProgressEvent")
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: ProgressEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
