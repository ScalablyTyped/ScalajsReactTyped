package typingsJapgolly.ckeditorCkeditor5Language

import typingsJapgolly.ckeditorCkeditor5Language.anon.TypeofTextPartLanguageEdi
import typingsJapgolly.ckeditorCkeditor5Language.anon.TypeofTextPartLanguageUI
import typingsJapgolly.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.ltr
import typingsJapgolly.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.rtl
import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguageMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguage", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Plugin
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguage", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguage = js.native
    
    @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguage", "default.requires")
    @js.native
    val requires: js.Tuple2[TypeofTextPartLanguageEdi, TypeofTextPartLanguageUI] = js.native
  }
  
  type TextPartLanguage = Plugin
  
  trait TextPartLanguageOption extends StObject {
    
    var languageCode: String
    
    var textDirection: js.UndefOr[ltr | rtl] = js.undefined
    
    var title: String
  }
  object TextPartLanguageOption {
    
    inline def apply(languageCode: String, title: String): TextPartLanguageOption = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextPartLanguageOption]
    }
    
    extension [Self <: TextPartLanguageOption](x: Self) {
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(value: ltr | rtl): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var TextPartLanguage: typingsJapgolly.ckeditorCkeditor5Language.srcTextpartlanguageMod.TextPartLanguage
    }
    object Plugins {
      
      inline def apply(TextPartLanguage: TextPartLanguage): Plugins = {
        val __obj = js.Dynamic.literal(TextPartLanguage = TextPartLanguage.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setTextPartLanguage(value: TextPartLanguage): Self = StObject.set(x, "TextPartLanguage", value.asInstanceOf[js.Any])
      }
    }
  }
}
