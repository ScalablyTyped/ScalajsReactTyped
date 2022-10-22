package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.anon.ClearIcon
import typingsJapgolly.reactNativeElements.anon.PartialThemePropsSearchBaUpdateTheme
import typingsJapgolly.reactNativeElements.anon.Pickplatformiosandroiddef
import typingsJapgolly.reactNativeElements.anon.TypeofTextInput
import typingsJapgolly.reactNativeElements.anon.platformiosandroiddefault
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarAndroidMod.SearchBarAndroidProps
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarDefaultMod.SearchBarDefaultProps
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarIosMod.SearchBarIosProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchbarSearchBarMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar", JSImport.Default)
  @js.native
  val default: FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault] = js.native
  
  @js.native
  trait SearchBar
    extends Component[SearchBarProps & PartialThemePropsSearchBaUpdateTheme, js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var searchbar: typingsJapgolly.reactNativeElements.distSearchbarSearchBarIosMod.default = js.native
  }
  
  type SearchBarBaseProps = ComponentPropsWithRef[TypeofTextInput] & ClearIcon
  
  type SearchBarProps = SearchBarBaseProps & SearchBarDefaultProps & SearchBarAndroidProps & SearchBarIosProps
  
  type _To = FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault]
  
  /* This means you don't have to write `default`, but can instead just say `distSearchbarSearchBarMod.foo` */
  override def _to: FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault] = default
}
