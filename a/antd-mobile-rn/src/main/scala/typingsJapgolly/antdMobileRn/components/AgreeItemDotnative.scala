package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libCheckboxAgreeItemDotnativeMod.AgreeItemNativeProps
import typingsJapgolly.antdMobileRn.libCheckboxAgreeItemDotnativeMod.default
import typingsJapgolly.antdMobileRn.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antdMobileRn.libCheckboxStyleIndexDotnativeMod.ICheckboxStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AgreeItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/checkbox/AgreeItem.native", JSImport.Default)
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
    
    inline def onChange(value: /* params */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* params */ OnChangeParams) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: ICheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AgreeItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AgreeItemNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
