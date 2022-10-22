package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.AntLocaleDatePickerView
import typingsJapgolly.antdMobileRn.anon.DatePicker
import typingsJapgolly.antdMobileRn.anon.Locale
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderLocaleProviderMod {
  
  @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", JSImport.Default)
  @js.native
  open class default () extends LocaleProvider
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    inline def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", "default.propTypes")
    @js.native
    def propTypes: Locale = js.native
    inline def propTypes_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LocaleProvider extends Component[LocaleProviderProps, Any, Any] {
    
    def getChildContext(): AntLocaleDatePickerView = js.native
  }
  
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[Element] = js.undefined
    
    var locale: DatePicker
  }
  object LocaleProviderProps {
    
    inline def apply(locale: DatePicker): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocale(value: DatePicker): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
