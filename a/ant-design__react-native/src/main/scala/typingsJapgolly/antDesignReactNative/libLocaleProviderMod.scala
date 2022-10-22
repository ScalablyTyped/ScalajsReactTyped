package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignReactNative.anon.BackspaceLabel
import typingsJapgolly.antDesignReactNative.anon.ButtonText
import typingsJapgolly.antDesignReactNative.anon.CancelText
import typingsJapgolly.antDesignReactNative.anon.Day
import typingsJapgolly.antDesignReactNative.anon.DismissText
import typingsJapgolly.antDesignReactNative.anon.Done
import typingsJapgolly.antDesignReactNative.anon.Extra
import typingsJapgolly.antDesignReactNative.anon.NextText
import typingsJapgolly.antDesignReactNative.anon.PartialLocale
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ LocaleProviderProps, Element]] = js.native
  
  @JSImport("@ant-design/react-native/lib/locale-provider", "LocaleContext")
  @js.native
  val LocaleContext: Context[js.Object] = js.native
  
  trait Locale extends StObject {
    
    var DatePicker: DismissText
    
    var DatePickerView: Day
    
    var InputItem: BackspaceLabel
    
    var ListView: Done
    
    var Modal: ButtonText
    
    var Pagination: NextText
    
    var Picker: Extra
    
    var SearchBar: CancelText
    
    /** zh_CN */
    var locale: String
  }
  object Locale {
    
    inline def apply(
      DatePicker: DismissText,
      DatePickerView: Day,
      InputItem: BackspaceLabel,
      ListView: Done,
      Modal: ButtonText,
      Pagination: NextText,
      Picker: Extra,
      SearchBar: CancelText,
      locale: String
    ): Locale = {
      val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], DatePickerView = DatePickerView.asInstanceOf[js.Any], InputItem = InputItem.asInstanceOf[js.Any], ListView = ListView.asInstanceOf[js.Any], Modal = Modal.asInstanceOf[js.Any], Pagination = Pagination.asInstanceOf[js.Any], Picker = Picker.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setDatePicker(value: DismissText): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      inline def setDatePickerView(value: Day): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
      
      inline def setInputItem(value: BackspaceLabel): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
      
      inline def setListView(value: Done): Self = StObject.set(x, "ListView", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setModal(value: ButtonText): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: NextText): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: Extra): Self = StObject.set(x, "Picker", value.asInstanceOf[js.Any])
      
      inline def setSearchBar(value: CancelText): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var locale: js.UndefOr[PartialLocale] = js.undefined
  }
  object LocaleProviderProps {
    
    inline def apply(): LocaleProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ LocaleProviderProps, Element]]
  
  /* This means you don't have to write `default`, but can instead just say `libLocaleProviderMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ LocaleProviderProps, Element]] = default
}
