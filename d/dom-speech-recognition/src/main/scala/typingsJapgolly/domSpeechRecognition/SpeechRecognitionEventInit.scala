package typingsJapgolly.domSpeechRecognition

import typingsJapgolly.std.EventInit
import typingsJapgolly.std.SpeechRecognitionResultList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/speech-api/#speechrecognitionevent
trait SpeechRecognitionEventInit
  extends StObject
     with EventInit {
  
  var resultIndex: js.UndefOr[Double] = js.undefined
  
  var results: SpeechRecognitionResultList
}
object SpeechRecognitionEventInit {
  
  inline def apply(results: SpeechRecognitionResultList): SpeechRecognitionEventInit = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventInit]
  }
  
  extension [Self <: SpeechRecognitionEventInit](x: Self) {
    
    inline def setResultIndex(value: Double): Self = StObject.set(x, "resultIndex", value.asInstanceOf[js.Any])
    
    inline def setResultIndexUndefined: Self = StObject.set(x, "resultIndex", js.undefined)
    
    inline def setResults(value: SpeechRecognitionResultList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
