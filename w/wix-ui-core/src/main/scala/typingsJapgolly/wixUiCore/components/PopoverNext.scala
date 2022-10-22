package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.popperJs.mod.Boundary
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.wixUiCore.anon.Enter
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverNextPopoverNextMod.PopoverNextProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetAppendToElementMod.Predicate
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import typingsJapgolly.wixUiCore.distEsSrcUtilsMod.ElementProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverNext {
  
  inline def apply(placement: Placement, shown: Boolean): Builder = {
    val __props = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverNextProps]))
  }
  
  object Content {
    
    inline def apply(children: Any): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ElementProps]))
    }
    
    @JSImport("wix-ui-core/dist/es/src", "PopoverNext.Content")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ElementProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Element {
    
    inline def apply(children: Any): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ElementProps]))
    }
    
    @JSImport("wix-ui-core/dist/es/src", "PopoverNext.Element")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ElementProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "PopoverNext")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.PopoverNext] {
    
    inline def appendTo(value: Boundary | parent | Element | Predicate): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def customArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => Node): this.type = set("customArrow", js.Any.fromFunction2(value))
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def excludeClass(value: String): this.type = set("excludeClass", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def hideDelay(value: Double): this.type = set("hideDelay", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def moveArrowTo(value: Double): this.type = set("moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onClickOutside(value: js.Function): this.type = set("onClickOutside", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def showDelay(value: Double): this.type = set("showDelay", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double | Enter): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverNextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
