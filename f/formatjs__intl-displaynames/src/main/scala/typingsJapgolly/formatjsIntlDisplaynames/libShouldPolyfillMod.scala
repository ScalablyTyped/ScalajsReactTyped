package typingsJapgolly.formatjsIntlDisplaynames

import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShouldPolyfillMod {
  
  @JSImport("@formatjs/intl-displaynames/lib/should-polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldPolyfill(): js.UndefOr[String | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldPolyfill")().asInstanceOf[js.UndefOr[String | `true`]]
  inline def shouldPolyfill(locale: String): js.UndefOr[String | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldPolyfill")(locale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | `true`]]
  
  inline def shouldPolyfillWithoutLocale(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_shouldPolyfillWithoutLocale")().asInstanceOf[Boolean]
}
