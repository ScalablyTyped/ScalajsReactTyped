package typingsJapgolly.angularLocalize

import typingsJapgolly.angularLocalize.angularLocalizeStrings.css
import typingsJapgolly.angularLocalize.angularLocalizeStrings.image
import typingsJapgolly.angularLocalize.angularLocalizeStrings.text
import typingsJapgolly.angularLocalize.anon.Column
import typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.TranslationParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersArbTranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/arb_translation_parser", "ArbTranslationParser")
  @js.native
  open class ArbTranslationParser ()
    extends StObject
       with TranslationParser[ArbJsonObject] {
    
    /* private */ var tryParseArbFormat: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @angular/localize.@angular/localize.MessageId ]: @angular/localize.@angular/localize.ɵSourceMessage | @angular/localize.@angular/localize/tools/src/translate/translation_files/translation_parsers/arb_translation_parser.ArbMetadata} */ trait ArbJsonObject extends StObject {
    
    var `@@locale`: String
  }
  object ArbJsonObject {
    
    inline def apply(`@@locale`: String): ArbJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@locale")(`@@locale`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArbJsonObject]
    }
    
    extension [Self <: ArbJsonObject](x: Self) {
      
      inline def `set@@locale`(value: String): Self = StObject.set(x, "@@locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArbLocation extends StObject {
    
    var end: Column
    
    var file: String
    
    var start: Column
  }
  object ArbLocation {
    
    inline def apply(end: Column, file: String, start: Column): ArbLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArbLocation]
    }
    
    extension [Self <: ArbLocation](x: Self) {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArbMetadata extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[text | image | css] = js.undefined
    
    var `x-locations`: js.UndefOr[js.Array[ArbLocation]] = js.undefined
  }
  object ArbMetadata {
    
    inline def apply(): ArbMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArbMetadata]
    }
    
    extension [Self <: ArbMetadata](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setType(value: text | image | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def `setX-locations`(value: js.Array[ArbLocation]): Self = StObject.set(x, "x-locations", value.asInstanceOf[js.Any])
      
      inline def `setX-locationsUndefined`: Self = StObject.set(x, "x-locations", js.undefined)
      
      inline def `setX-locationsVarargs`(value: ArbLocation*): Self = StObject.set(x, "x-locations", js.Array(value*))
    }
  }
}
