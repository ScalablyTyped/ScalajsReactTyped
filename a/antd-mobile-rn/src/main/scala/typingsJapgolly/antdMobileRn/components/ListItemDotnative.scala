package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.Arrow
import typingsJapgolly.antdMobileRn.antdMobileRnStrings._empty
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.android
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bottom
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.down
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.empty
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.horizontal
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.ios
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.middle
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.top
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.up
import typingsJapgolly.antdMobileRn.libListListItemDotnativeMod.ListItemProps
import typingsJapgolly.antdMobileRn.libListListItemDotnativeMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeStyle(value: StyleProp[ViewStyle]): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    inline def activeStyleNull: this.type = set("activeStyle", null)
    
    inline def align(value: top | middle | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def arrow(value: horizontal | down | up | empty | _empty): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def multipleLine(value: Boolean): this.type = set("multipleLine", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def onPressIn(value: Callback): this.type = set("onPressIn", value.toJsFn)
    
    inline def onPressOut(value: Callback): this.type = set("onPressOut", value.toJsFn)
    
    inline def platform(value: android | ios): this.type = set("platform", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Arrow): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def thumb(value: VdomNode): this.type = set("thumb", value.rawNode.asInstanceOf[js.Any])
    
    inline def thumbNull: this.type = set("thumb", null)
    
    inline def thumbVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumb", js.Array(value*))
    
    inline def thumbVdomElement(value: VdomElement): this.type = set("thumb", value.rawElement.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
