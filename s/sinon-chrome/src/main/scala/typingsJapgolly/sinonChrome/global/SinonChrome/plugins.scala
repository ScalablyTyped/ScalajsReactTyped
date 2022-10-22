package typingsJapgolly.sinonChrome.global.SinonChrome

import typingsJapgolly.chrome.chrome.cookies.Cookie
import typingsJapgolly.sinonChrome.mod.plugins.Translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSGlobal("SinonChrome.plugins.CookiePlugin")
  @js.native
  open class CookiePlugin ()
    extends typingsJapgolly.sinonChrome.mod.plugins.CookiePlugin {
    def this(state: js.Array[Cookie]) = this()
  }
  
  @JSGlobal("SinonChrome.plugins.I18nPlugin")
  @js.native
  open class I18nPlugin ()
    extends typingsJapgolly.sinonChrome.mod.plugins.I18nPlugin {
    def this(translations: Translations) = this()
  }
}
