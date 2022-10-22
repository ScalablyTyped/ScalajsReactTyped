package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.Colon
import typingsJapgolly.chance.chanceStrings.Dot
import typingsJapgolly.chance.chanceStrings.Exclamationmark
import typingsJapgolly.chance.chanceStrings.Questionmark
import typingsJapgolly.chance.chanceStrings.Semicolon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentenceOptions extends StObject {
  
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean
  
  var words: Double
}
object SentenceOptions {
  
  inline def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean, words: Double): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceOptions]
  }
  
  extension [Self <: SentenceOptions](x: Self) {
    
    inline def setPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
