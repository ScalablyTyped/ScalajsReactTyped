package typingsJapgolly.formatjsIntlLocalematcher

import typingsJapgolly.formatjsIntlLocalematcher.libAbstractTypesMod.LookupMatcherResult
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractLookupMatcherMod {
  
  @JSImport("@formatjs/intl-localematcher/lib/abstract/LookupMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LookupMatcher(
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    getDefaultLocale: js.Function0[String]
  ): LookupMatcherResult = (^.asInstanceOf[js.Dynamic].applyDynamic("LookupMatcher")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[LookupMatcherResult]
}
