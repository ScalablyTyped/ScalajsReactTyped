package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.OfflineAudioCompletionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: OfflineAudioCompletionEvent
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "OfflineAudioCompletionEvent")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: OfflineAudioCompletionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
