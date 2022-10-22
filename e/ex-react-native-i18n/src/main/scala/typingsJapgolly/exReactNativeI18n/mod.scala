package typingsJapgolly.exReactNativeI18n

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ex-react-native-i18n", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with i18n
  /* static members */
  object default {
    
    @JSImport("ex-react-native-i18n", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def currentLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLocale")().asInstanceOf[String]
    
    @JSImport("ex-react-native-i18n", "default.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("ex-react-native-i18n", "default.fallbacks")
    @js.native
    def fallbacks: Boolean = js.native
    inline def fallbacks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
    
    inline def getFallbackLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFallbackLocale")().asInstanceOf[String]
    
    inline def localShort(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localShort")().asInstanceOf[String]
    
    @JSImport("ex-react-native-i18n", "default.locale")
    @js.native
    def locale: String = js.native
    inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    inline def missingTranslation(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("missingTranslation")().asInstanceOf[String]
    
    inline def t(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def t(text: String, interpolation: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(text.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("ex-react-native-i18n", "default.translations")
    @js.native
    def translations: StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ Any
      ] = js.native
    inline def translations_=(
      x: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translations")(x.asInstanceOf[js.Any])
  }
  
  trait i18n extends StObject
}
