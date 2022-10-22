package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Voices. */
trait Voices extends StObject {
  
  /** A list of available voices. */
  var voices: js.Array[Voice]
}
object Voices {
  
  inline def apply(voices: js.Array[Voice]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
  
  extension [Self <: Voices](x: Self) {
    
    inline def setVoices(value: js.Array[Voice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    inline def setVoicesVarargs(value: Voice*): Self = StObject.set(x, "voices", js.Array(value*))
  }
}
