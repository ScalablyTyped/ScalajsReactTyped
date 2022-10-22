package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.NativeEvent
import typingsJapgolly.antdMobileRn.anon.OnBlur
import typingsJapgolly.antdMobileRn.libSearchBarPropsTypeMod.SearchBarPropsType
import typingsJapgolly.antdMobileRn.libSearchBarPropsTypeMod.SearchBarState
import typingsJapgolly.antdMobileRn.libSearchBarStyleIndexDotnativeMod.ISearchBarStyle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextInput
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchBarIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/search-bar/index.native", JSImport.Default)
  @js.native
  open class default protected () extends SearchBar {
    def this(props: SearchBarNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", "default.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SearchBar extends Component[SearchBarNativeProps, SearchBarState, Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): Unit = js.native
    
    var inputRef: TextInput | Null = js.native
    
    def onBlur(): Unit = js.native
    
    def onCancel(): Unit = js.native
    
    def onChangeText(value: String): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onSubmit(_underscore: NativeEvent): Unit = js.native
  }
  
  trait SearchBarNativeProps
    extends StObject
       with SearchBarPropsType {
    
    var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
    
    var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    @JSName("styles")
    var styles_SearchBarNativeProps: ISearchBarStyle
  }
  object SearchBarNativeProps {
    
    inline def apply(styles: ISearchBarStyle): SearchBarNativeProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarNativeProps]
    }
    
    extension [Self <: SearchBarNativeProps](x: Self) {
      
      inline def setOnChangeText(value: /* text */ String => Callback): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
      
      inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      inline def setOnSubmitEditing(value: /* event */ NativeEvent => Callback): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1((t0: /* event */ NativeEvent) => value(t0).runNow()))
      
      inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ISearchBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
