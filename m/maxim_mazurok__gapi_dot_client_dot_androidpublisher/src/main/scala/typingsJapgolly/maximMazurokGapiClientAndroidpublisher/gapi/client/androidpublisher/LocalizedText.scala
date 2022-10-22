package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedText extends StObject {
  
  /** Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.undefined
  
  /** The text in the given language. */
  var text: js.UndefOr[String] = js.undefined
}
object LocalizedText {
  
  inline def apply(): LocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedText]
  }
  
  extension [Self <: LocalizedText](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
