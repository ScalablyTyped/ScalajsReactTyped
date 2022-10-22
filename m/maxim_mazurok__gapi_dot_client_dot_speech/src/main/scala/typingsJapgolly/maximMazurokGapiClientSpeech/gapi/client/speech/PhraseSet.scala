package typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhraseSet extends StObject {
  
  /**
    * Hint Boost. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance
    * of false positive recognition as well. Negative boost values would correspond to anti-biasing. Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost`
    * can accept a wide range of positive values, most use cases are best served with values between 0 (exclusive) and 20. We recommend using a binary search approach to finding the
    * optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
    */
  var boost: js.UndefOr[Double] = js.undefined
  
  /** The resource name of the phrase set. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A list of word and phrases. */
  var phrases: js.UndefOr[js.Array[Phrase]] = js.undefined
}
object PhraseSet {
  
  inline def apply(): PhraseSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhraseSet]
  }
  
  extension [Self <: PhraseSet](x: Self) {
    
    inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhrases(value: js.Array[Phrase]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: Phrase*): Self = StObject.set(x, "phrases", js.Array(value*))
  }
}
