package typingsJapgolly.antdMobileRn.mod

import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.Locale
import typingsJapgolly.antdMobileRn.libLocaleProviderIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "LocaleProvider")
@js.native
open class LocaleProvider () extends default
/* static members */
object LocaleProvider {
  
  @JSImport("antd-mobile-rn", "LocaleProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "LocaleProvider.childContextTypes")
  @js.native
  def childContextTypes: AntLocale = js.native
  inline def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "LocaleProvider.propTypes")
  @js.native
  def propTypes: Locale = js.native
  inline def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
