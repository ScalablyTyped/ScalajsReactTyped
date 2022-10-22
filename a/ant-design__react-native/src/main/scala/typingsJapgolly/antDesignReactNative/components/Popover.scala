package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsJapgolly.antDesignReactNative.libPopoverMod.PopoverProps
import typingsJapgolly.antDesignReactNative.libPopoverStyleMod.PopoverStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Placement
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("@ant-design/react-native", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Popover] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): this.type = set("easing", js.Any.fromFunction1(value))
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onSelect(value: (/* node */ Any, /* index */ js.UndefOr[Double]) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* node */ Any, t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def overlay(value: VdomNode): this.type = set("overlay", value.rawNode.asInstanceOf[js.Any])
    
    inline def overlayNull: this.type = set("overlay", null)
    
    inline def overlayVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("overlay", js.Array(value*))
    
    inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
    
    inline def placement(value: Placement | auto): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def renderOverlayComponent(value: (/* node */ Node, /* closePopover */ js.Function0[Unit]) => Node): this.type = set("renderOverlayComponent", js.Any.fromFunction2(value))
    
    inline def styles(value: Partial[PopoverStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def triggerStyle(value: StyleProp[ViewStyle]): this.type = set("triggerStyle", value.asInstanceOf[js.Any])
    
    inline def triggerStyleNull: this.type = set("triggerStyle", null)
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
