package typingsJapgolly.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
trait AlternateWordForm extends StObject {
  
  /** Gets the text of the alternate word form identified by this AlternateWordForm object. */
  var alternateText: String
  
  /** Gets the normalization format for this current AlternateWordForm object. */
  var normalizationFormat: AlternateNormalizationFormat
  
  /** Gets the TextSegment that identifies the source text's sub-string for which this AlternateWordForm object is an alternate. */
  var sourceTextSegment: TextSegment
}
object AlternateWordForm {
  
  inline def apply(
    alternateText: String,
    normalizationFormat: AlternateNormalizationFormat,
    sourceTextSegment: TextSegment
  ): AlternateWordForm = {
    val __obj = js.Dynamic.literal(alternateText = alternateText.asInstanceOf[js.Any], normalizationFormat = normalizationFormat.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateWordForm]
  }
  
  extension [Self <: AlternateWordForm](x: Self) {
    
    inline def setAlternateText(value: String): Self = StObject.set(x, "alternateText", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFormat(value: AlternateNormalizationFormat): Self = StObject.set(x, "normalizationFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceTextSegment(value: TextSegment): Self = StObject.set(x, "sourceTextSegment", value.asInstanceOf[js.Any])
  }
}
