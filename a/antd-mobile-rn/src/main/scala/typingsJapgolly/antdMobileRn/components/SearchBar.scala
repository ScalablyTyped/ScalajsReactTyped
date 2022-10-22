package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.NativeEvent
import typingsJapgolly.antdMobileRn.libSearchBarIndexDotnativeMod.SearchBarNativeProps
import typingsJapgolly.antdMobileRn.libSearchBarStyleIndexDotnativeMod.ISearchBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBar {
  
  inline def apply(styles: ISearchBarStyle): Builder = {
    val __props = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchBarNativeProps]))
  }
  
  @JSImport("antd-mobile-rn", "SearchBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.SearchBar] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onCancel(value: /* value */ String => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onChangeText(value: /* text */ String => Callback): this.type = set("onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onClear(value: /* value */ String => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onSubmit(value: /* value */ String => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onSubmitEditing(value: /* event */ NativeEvent => Callback): this.type = set("onSubmitEditing", js.Any.fromFunction1((t0: /* event */ NativeEvent) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def showCancelButton(value: Boolean): this.type = set("showCancelButton", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBarNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
