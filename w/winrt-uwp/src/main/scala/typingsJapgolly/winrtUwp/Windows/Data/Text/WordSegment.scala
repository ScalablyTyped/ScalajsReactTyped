package typingsJapgolly.winrtUwp.Windows.Data.Text

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a word from your provided text. */
trait WordSegment extends StObject {
  
  /** Gets the alternate forms (if any) associated with the current word. */
  var alternateForms: IVectorView[AlternateWordForm]
  
  /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
  var sourceTextSegment: TextSegment
  
  /** Gets the text of the word identified by this WordSegment object. */
  var text: String
}
object WordSegment {
  
  inline def apply(alternateForms: IVectorView[AlternateWordForm], sourceTextSegment: TextSegment, text: String): WordSegment = {
    val __obj = js.Dynamic.literal(alternateForms = alternateForms.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordSegment]
  }
  
  extension [Self <: WordSegment](x: Self) {
    
    inline def setAlternateForms(value: IVectorView[AlternateWordForm]): Self = StObject.set(x, "alternateForms", value.asInstanceOf[js.Any])
    
    inline def setSourceTextSegment(value: TextSegment): Self = StObject.set(x, "sourceTextSegment", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
