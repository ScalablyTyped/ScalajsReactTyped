package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distCheckboxCheckBoxIconMod.CheckBoxIconProps
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconType
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckBoxIcon {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[CheckBoxIconProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxIconProps & Partial[ThemeProps[CheckBoxIconProps]]]))
  }
  
  @JSImport("react-native-elements/dist/checkbox/CheckBoxIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedColor(value: String): this.type = set("checkedColor", value.asInstanceOf[js.Any])
    
    inline def checkedIcon(value: String | Element): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
    
    inline def checkedIconVdomElement(value: VdomElement): this.type = set("checkedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconType(value: IconType): this.type = set("iconType", value.asInstanceOf[js.Any])
    
    inline def onIconPress(value: Callback): this.type = set("onIconPress", value.toJsFn)
    
    inline def onLongIconPress(value: Callback): this.type = set("onLongIconPress", value.toJsFn)
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def uncheckedColor(value: String): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def uncheckedIcon(value: String | Element): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
    
    inline def uncheckedIconVdomElement(value: VdomElement): this.type = set("uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckBoxIconProps & Partial[ThemeProps[CheckBoxIconProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
