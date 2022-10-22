package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.anon.Enter
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsTooltipTooltipMod.Point
import typingsJapgolly.wixUiCore.distEsSrcComponentsTooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("wix-ui-core/dist/es/src", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Tooltip] {
    
    inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def customArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => Node): this.type = set("customArrow", js.Any.fromFunction2(value))
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disableClickOutsideWhenClosed(value: Boolean): this.type = set("disableClickOutsideWhenClosed", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def hideDelay(value: Double): this.type = set("hideDelay", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def moveArrowTo(value: Double): this.type = set("moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: Point): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onClickOutside(value: js.Function): this.type = set("onClickOutside", value.asInstanceOf[js.Any])
    
    inline def onHide(value: js.Function): this.type = set("onHide", value.asInstanceOf[js.Any])
    
    inline def onShow(value: js.Function): this.type = set("onShow", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnClickOutside(value: Boolean): this.type = set("shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def showDelay(value: Double): this.type = set("showDelay", value.asInstanceOf[js.Any])
    
    inline def shown(value: Boolean): this.type = set("shown", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double | Enter): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
