package typingsJapgolly.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ToneInput. */
trait ToneInput extends StObject {
  
  /** The input content that the service is to analyze. */
  var text: String
}
object ToneInput {
  
  inline def apply(text: String): ToneInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneInput]
  }
  
  extension [Self <: ToneInput](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
