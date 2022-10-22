package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distSelectSrcSelectMod.InnerSelectProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcSelectMod.OverlayProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("@orbit-ui/react-components", "Select")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def align(value: start | end): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allowFlip(value: Boolean): this.type = set("allowFlip", value.asInstanceOf[js.Any])
    
    inline def allowPreventOverflow(value: Boolean): this.type = set("allowPreventOverflow", value.asInstanceOf[js.Any])
    
    inline def allowResponsiveMenuWidth(value: Boolean): this.type = set("allowResponsiveMenuWidth", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedKey(value: String): this.type = set("defaultSelectedKey", value.asInstanceOf[js.Any])
    
    inline def direction(value: bottom | top): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: (/* event */ ReactEventFrom[Element], /* isOpen */ Boolean) => Callback): this.type = set("onOpenChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* isOpen */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onSelectionChange(value: (/* event */ ReactEventFrom[Element], /* selectedKey */ String) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* selectedKey */ String) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openNull: this.type = set("open", null)
    
    inline def overlayProps(value: Partial[OverlayProps]): this.type = set("overlayProps", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def selectedKeyNull: this.type = set("selectedKey", null)
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    inline def variant(value: outline | ghost): this.type = set("variant", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Select.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerSelectProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
