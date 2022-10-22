package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libCheckboxCheckboxItemDotnativeMod.ICheckboxItemNativeProps
import typingsJapgolly.antdMobileRn.libCheckboxCheckboxItemDotnativeMod.default
import typingsJapgolly.antdMobileRn.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antdMobileRn.libCheckboxStyleIndexDotnativeMod.ICheckboxStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/checkbox/CheckboxItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def checkboxStyle(value: StyleProp[ImageStyle]): this.type = set("checkboxStyle", value.asInstanceOf[js.Any])
    
    inline def checkboxStyleNull: this.type = set("checkboxStyle", null)
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* params */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* params */ OnChangeParams) => value(t0).runNow()))
    
    inline def onClick(value: /* e */ js.UndefOr[Any] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: ICheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CheckboxItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICheckboxItemNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
