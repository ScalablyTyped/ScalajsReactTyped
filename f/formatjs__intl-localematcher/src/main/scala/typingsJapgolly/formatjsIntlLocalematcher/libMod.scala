package typingsJapgolly.formatjsIntlLocalematcher

import typingsJapgolly.formatjsIntlLocalematcher.anon.Dictk
import typingsJapgolly.formatjsIntlLocalematcher.formatjsIntlLocalematcherStrings.`best fit`
import typingsJapgolly.formatjsIntlLocalematcher.formatjsIntlLocalematcherStrings.lookup
import typingsJapgolly.formatjsIntlLocalematcher.libAbstractResolveLocaleMod.ResolveLocaleResult
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/intl-localematcher/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LookupSupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("LookupSupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def ResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in K ]: any} */ js.Any */](
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    options: Dictk,
    relevantExtensionKeys: js.Array[K],
    localeData: Record[String, js.UndefOr[D]],
    getDefaultLocale: js.Function0[String]
  ): ResolveLocaleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolveLocale")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any], relevantExtensionKeys.asInstanceOf[js.Any], localeData.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[ResolveLocaleResult]
  
  inline def `match`(requestedLocales: js.Array[String], availableLocales: js.Array[String], defaultLocale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def `match`(
    requestedLocales: js.Array[String],
    availableLocales: js.Array[String],
    defaultLocale: String,
    opts: Opts
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Opts extends StObject {
    
    var algorithm: lookup | (`best fit`)
  }
  object Opts {
    
    inline def apply(algorithm: lookup | (`best fit`)): Opts = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setAlgorithm(value: lookup | (`best fit`)): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    }
  }
}
