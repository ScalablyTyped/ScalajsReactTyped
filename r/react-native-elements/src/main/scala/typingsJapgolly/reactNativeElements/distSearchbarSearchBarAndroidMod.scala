package typingsJapgolly.reactNativeElements

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.TextInput
import typingsJapgolly.reactNativeElements.anon.CancelIcon
import typingsJapgolly.reactNativeElements.anon.OnBlur
import typingsJapgolly.reactNativeElements.anon.PartialThemePropsSearchBa
import typingsJapgolly.reactNativeElements.distInputInputMod.InputProps
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarMod.SearchBarBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchbarSearchBarAndroidMod {
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar-android", JSImport.Default)
  @js.native
  open class default protected () extends SearchBar {
    def this(props: SearchBarAndroidProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-android", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onBlur(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Any]
      
      inline def onCancel(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onCancel")().asInstanceOf[Any]
      
      inline def onChangeText(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeText")().asInstanceOf[Any]
      
      inline def onClear(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Any]
      
      inline def onFocus(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Any]
    }
  }
  
  @js.native
  trait SearchBar extends Component[SearchBarAndroidProps & PartialThemePropsSearchBa, SearchBarState, Any] {
    
    def _keyboardDidHide(): Unit = js.native
    
    def blur(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def clear(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSearchBar(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var input: TextInput = js.native
    
    var onBlur: /* import warning: importer.ImportType#apply Failed type conversion: react-native-elements.react-native-elements/dist/input/Input.InputProps['onBlur'] */ js.Any = js.native
    
    def onChangeText(text: String): Unit = js.native
    
    var onFocus: /* import warning: importer.ImportType#apply Failed type conversion: react-native-elements.react-native-elements/dist/input/Input.InputProps['onFocus'] */ js.Any = js.native
  }
  
  type SearchBarAndroidProps = InputProps & SearchBarBaseProps & OnBlur & CancelIcon
  
  trait SearchBarState extends StObject {
    
    var hasFocus: Boolean
    
    var isEmpty: Boolean
  }
  object SearchBarState {
    
    inline def apply(hasFocus: Boolean, isEmpty: Boolean): SearchBarState = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarState]
    }
    
    extension [Self <: SearchBarState](x: Self) {
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    }
  }
}
