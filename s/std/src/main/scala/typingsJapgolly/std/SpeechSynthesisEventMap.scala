package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechSynthesisEventMap extends StObject {
  
  /* standard dom */
  var voiceschanged: org.scalajs.dom.Event
}
object SpeechSynthesisEventMap {
  
  inline def apply(voiceschanged: org.scalajs.dom.Event): SpeechSynthesisEventMap = {
    val __obj = js.Dynamic.literal(voiceschanged = voiceschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventMap]
  }
  
  extension [Self <: SpeechSynthesisEventMap](x: Self) {
    
    inline def setVoiceschanged(value: org.scalajs.dom.Event): Self = StObject.set(x, "voiceschanged", value.asInstanceOf[js.Any])
  }
}
