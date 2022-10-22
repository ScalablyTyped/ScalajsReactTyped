package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distTooltipSrcTooltipTriggerMod.InnerTooltipTriggerProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.auto
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerTooltipTrigger {
  
  @JSImport("@orbit-ui/react-components", "InnerTooltipTrigger")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowFlip(value: Boolean): this.type = set("allowFlip", value.asInstanceOf[js.Any])
    
    inline def allowPreventOverflow(value: Boolean): this.type = set("allowPreventOverflow", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: HTMLElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def onOpenChange(value: (/* event */ ReactEventFrom[Element], /* isOpen */ Boolean) => Callback): this.type = set("onOpenChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* isOpen */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openNull: this.type = set("open", null)
    
    inline def position(
      value: auto | `auto-start` | `auto-end` | top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | right | `right-start` | `right-end` | left | `left-start` | `left-end`
    ): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerTooltipTrigger.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerTooltipTriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
