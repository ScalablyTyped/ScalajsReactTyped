package typingsJapgolly.formatjsIntlLocalematcher

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formatjsIntlLocalematcher.anon.Dictk
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractResolveLocaleMod {
  
  @JSImport("@formatjs/intl-localematcher/abstract/ResolveLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in K ]: any} */ js.Any */](
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    options: Dictk,
    relevantExtensionKeys: js.Array[K],
    localeData: Record[String, js.UndefOr[D]],
    getDefaultLocale: js.Function0[String]
  ): ResolveLocaleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolveLocale")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any], relevantExtensionKeys.asInstanceOf[js.Any], localeData.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[ResolveLocaleResult]
  
  trait ResolveLocaleResult
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var dataLocale: String
    
    var locale: String
  }
  object ResolveLocaleResult {
    
    inline def apply(dataLocale: String, locale: String): ResolveLocaleResult = {
      val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveLocaleResult]
    }
    
    extension [Self <: ResolveLocaleResult](x: Self) {
      
      inline def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
