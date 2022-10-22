package typingsJapgolly.reactNativeMaterialDesignSearchbar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ReturnKeyType
import typingsJapgolly.reactNative.mod.ReturnKeyTypeAndroid
import typingsJapgolly.reactNative.mod.ReturnKeyTypeIOS
import typingsJapgolly.reactNative.mod.TextInputProps
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.SearchBarProps
import typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMaterialDesignSearchbar {
  
  inline def apply(height: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchBarProps]))
  }
  
  @JSImport("react-native-material-design-searchbar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def alwaysShowBackButton(value: Boolean): this.type = set("alwaysShowBackButton", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: Boolean): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def iconBackName(value: String): this.type = set("iconBackName", value.asInstanceOf[js.Any])
    
    inline def iconCloseName(value: String): this.type = set("iconCloseName", value.asInstanceOf[js.Any])
    
    inline def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    inline def iconPadding(value: Double): this.type = set("iconPadding", value.asInstanceOf[js.Any])
    
    inline def iconSearchName(value: String): this.type = set("iconSearchName", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: TextInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: TextStyle): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def onBackPress(value: Callback): this.type = set("onBackPress", value.toJsFn)
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onEndEditing(value: Callback): this.type = set("onEndEditing", value.toJsFn)
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onSearchChange(value: /* text */ String => Callback): this.type = set("onSearchChange", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onSubmitEditing(value: Callback): this.type = set("onSubmitEditing", value.toJsFn)
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderColor(value: String): this.type = set("placeholderColor", value.asInstanceOf[js.Any])
    
    inline def returnKeyType(value: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
