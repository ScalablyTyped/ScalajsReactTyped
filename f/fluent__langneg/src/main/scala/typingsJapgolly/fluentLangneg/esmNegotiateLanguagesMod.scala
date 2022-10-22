package typingsJapgolly.fluentLangneg

import typingsJapgolly.fluentLangneg.anon.ReadonlyArraystring
import typingsJapgolly.fluentLangneg.fluentLangnegStrings.filtering
import typingsJapgolly.fluentLangneg.fluentLangnegStrings.lookup
import typingsJapgolly.fluentLangneg.fluentLangnegStrings.matching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmNegotiateLanguagesMod {
  
  @JSImport("@fluent/langneg/esm/negotiate_languages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def negotiateLanguages(requestedLocales: ReadonlyArraystring, availableLocales: ReadonlyArraystring): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def negotiateLanguages(
    requestedLocales: ReadonlyArraystring,
    availableLocales: ReadonlyArraystring,
    hasStrategyDefaultLocale: NegotiateLanguagesOptions
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], hasStrategyDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait NegotiateLanguagesOptions extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var strategy: js.UndefOr[filtering | matching | lookup] = js.undefined
  }
  object NegotiateLanguagesOptions {
    
    inline def apply(): NegotiateLanguagesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NegotiateLanguagesOptions]
    }
    
    extension [Self <: NegotiateLanguagesOptions](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setStrategy(value: filtering | matching | lookup): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
