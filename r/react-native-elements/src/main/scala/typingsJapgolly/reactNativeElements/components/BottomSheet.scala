package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distBottomSheetBottomSheetMod.BottomSheetProps
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomSheet {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[BottomSheetProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[BottomSheetProps & Partial[ThemeProps[BottomSheetProps]]]))
  }
  
  @JSImport("react-native-elements/dist/bottomSheet/BottomSheet", "BottomSheet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    inline def modalProps(value: ModalProps): this.type = set("modalProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomSheetProps & Partial[ThemeProps[BottomSheetProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
