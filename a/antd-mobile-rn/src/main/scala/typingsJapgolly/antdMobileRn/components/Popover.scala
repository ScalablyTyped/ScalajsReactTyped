package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libPopoverIndexDotnativeMod.PopoverProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("antd-mobile-rn", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Popover] {
    
    inline def contextStyle(value: StyleProp[ViewStyle]): this.type = set("contextStyle", value.asInstanceOf[js.Any])
    
    inline def contextStyleNull: this.type = set("contextStyle", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: (/* node */ Any, /* index */ js.UndefOr[Double]) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* node */ Any, t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def overlay(value: VdomNode): this.type = set("overlay", value.rawNode.asInstanceOf[js.Any])
    
    inline def overlayNull: this.type = set("overlay", null)
    
    inline def overlayStyle(value: StyleProp[ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayStyleNull: this.type = set("overlayStyle", null)
    
    inline def overlayVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("overlay", js.Array(value*))
    
    inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderOverlayComponent(value: /* values */ Any => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderOverlayComponent", js.Any.fromFunction1(value))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def triggerStyle(value: StyleProp[ViewStyle]): this.type = set("triggerStyle", value.asInstanceOf[js.Any])
    
    inline def triggerStyleNull: this.type = set("triggerStyle", null)
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
