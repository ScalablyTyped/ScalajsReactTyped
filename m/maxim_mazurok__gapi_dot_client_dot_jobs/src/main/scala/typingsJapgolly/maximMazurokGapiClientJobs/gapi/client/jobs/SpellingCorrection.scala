package typingsJapgolly.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellingCorrection extends StObject {
  
  /** Indicates if the query was corrected by the spell checker. */
  var corrected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Corrected output with html tags to highlight the corrected words. Corrected words are called out with the "*...*" html tags. For example, the user input query is "software
    * enginear", where the second word, "enginear," is incorrect. It should be "engineer". When spelling correction is enabled, this value is "software *engineer*".
    */
  var correctedHtml: js.UndefOr[String] = js.undefined
  
  /** Correction output consisting of the corrected keyword string. */
  var correctedText: js.UndefOr[String] = js.undefined
}
object SpellingCorrection {
  
  inline def apply(): SpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellingCorrection]
  }
  
  extension [Self <: SpellingCorrection](x: Self) {
    
    inline def setCorrected(value: Boolean): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    inline def setCorrectedHtml(value: String): Self = StObject.set(x, "correctedHtml", value.asInstanceOf[js.Any])
    
    inline def setCorrectedHtmlUndefined: Self = StObject.set(x, "correctedHtml", js.undefined)
    
    inline def setCorrectedText(value: String): Self = StObject.set(x, "correctedText", value.asInstanceOf[js.Any])
    
    inline def setCorrectedTextUndefined: Self = StObject.set(x, "correctedText", js.undefined)
    
    inline def setCorrectedUndefined: Self = StObject.set(x, "corrected", js.undefined)
  }
}
