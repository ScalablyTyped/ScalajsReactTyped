package typingsJapgolly.formatjsIntlDisplaynames

import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractCanonicalCodeForDisplayNamesMod {
  
  @JSImport("@formatjs/intl-displaynames/abstract/CanonicalCodeForDisplayNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CanonicalCodeForDisplayNames(`type`: language | region | script | currency, code: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalCodeForDisplayNames")(`type`.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[String]
}
