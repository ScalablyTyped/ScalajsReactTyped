package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/locale-provider/index.native", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.antdMobileRn.libLocaleProviderLocaleProviderMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/locale-provider/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/locale-provider/index.native", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    inline def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/locale-provider/index.native", "default.propTypes")
    @js.native
    def propTypes: Locale = js.native
    inline def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
