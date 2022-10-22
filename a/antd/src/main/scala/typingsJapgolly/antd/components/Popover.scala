package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libPopoverMod.PopoverProps
import typingsJapgolly.antd.libTooltipMod.TooltipPlacement
import typingsJapgolly.antd.libUtilColorsMod.PresetColorType
import typingsJapgolly.antd.libUtilGetRenderPropValueMod.RenderFunction
import typingsJapgolly.antd.libUtilPlacementsMod.AdjustOverflow
import typingsJapgolly.antd.libUtilTypeMod.LiteralUnion
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcTooltip.anon.KeepParent
import typingsJapgolly.rcTrigger.esInterfaceMod.ActionType
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.rcTrigger.esInterfaceMod.AnimationType
import typingsJapgolly.rcTrigger.esInterfaceMod.BuildInPlacements
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("antd", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterOpenChange(value: /* visible */ Boolean => Callback): this.type = set("afterOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def afterVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("afterVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def arrowContent(value: VdomNode): this.type = set("arrowContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def arrowContentNull: this.type = set("arrowContent", null)
    
    inline def arrowContentVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("arrowContent", js.Array(value*))
    
    inline def arrowContentVdomElement(value: VdomElement): this.type = set("arrowContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    
    inline def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    
    inline def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: japgolly.scalajs.react.facade.React.Node | RenderFunction): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentCallbackTo(value: CallbackTo[japgolly.scalajs.react.facade.React.Node]): this.type = set("content", value.toJsFn)
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
    
    inline def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def getTooltipContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getTooltipContainer", js.Any.fromFunction1(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def motion(value: CSSMotionProps): this.type = set("motion", value.asInstanceOf[js.Any])
    
    inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: /* visible */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Callback): this.type = set("onPopupAlign", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* align */ AlignType) => (value(t0, t1)).runNow()))
    
    inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
    
    inline def overlay(
      value: js.Function0[japgolly.scalajs.react.facade.React.Node] | japgolly.scalajs.react.facade.React.Node
    ): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    inline def overlayCallbackTo(value: CallbackTo[japgolly.scalajs.react.facade.React.Node]): this.type = set("overlay", value.toJsFn)
    
    inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    inline def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    inline def overlayNull: this.type = set("overlay", null)
    
    inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("overlay", js.Array(value*))
    
    inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
    
    inline def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: japgolly.scalajs.react.facade.React.Node | RenderFunction): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleCallbackTo(value: CallbackTo[japgolly.scalajs.react.facade.React.Node]): this.type = set("title", value.toJsFn)
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    inline def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value*))
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
