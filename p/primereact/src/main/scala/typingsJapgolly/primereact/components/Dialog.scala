package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.dialogDialogMod.DialogAppendToType
import typingsJapgolly.primereact.dialogDialogMod.DialogBreakpoints
import typingsJapgolly.primereact.dialogDialogMod.DialogMaximizeParams
import typingsJapgolly.primereact.dialogDialogMod.DialogPositionType
import typingsJapgolly.primereact.dialogDialogMod.DialogProps
import typingsJapgolly.primereact.dialogDialogMod.DialogTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  inline def apply(onHide: Callback): Builder = {
    val __props = js.Dynamic.literal(onHide = onHide.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
  
  @JSImport("primereact", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.Dialog] {
    
    inline def appendTo(value: DialogAppendToType): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToNull: this.type = set("appendTo", null)
    
    inline def ariaCloseIconLabel(value: String): this.type = set("ariaCloseIconLabel", value.asInstanceOf[js.Any])
    
    inline def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    inline def blockScroll(value: Boolean): this.type = set("blockScroll", value.asInstanceOf[js.Any])
    
    inline def breakpoints(value: DialogBreakpoints): this.type = set("breakpoints", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def dismissableMask(value: Boolean): this.type = set("dismissableMask", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def focusOnShow(value: Boolean): this.type = set("focusOnShow", value.asInstanceOf[js.Any])
    
    inline def footer(value: DialogTemplateType): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* props */ DialogProps => Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def header(value: DialogTemplateType): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* props */ DialogProps => Node): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def icons(value: DialogTemplateType): this.type = set("icons", value.asInstanceOf[js.Any])
    
    inline def iconsFunction1(value: /* props */ DialogProps => Node): this.type = set("icons", js.Any.fromFunction1(value))
    
    inline def iconsNull: this.type = set("icons", null)
    
    inline def iconsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icons", js.Array(value*))
    
    inline def iconsVdomElement(value: VdomElement): this.type = set("icons", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def keepInViewport(value: Boolean): this.type = set("keepInViewport", value.asInstanceOf[js.Any])
    
    inline def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: js.Object): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def maximizable(value: Boolean): this.type = set("maximizable", value.asInstanceOf[js.Any])
    
    inline def maximized(value: Boolean): this.type = set("maximized", value.asInstanceOf[js.Any])
    
    inline def minX(value: Double): this.type = set("minX", value.asInstanceOf[js.Any])
    
    inline def minY(value: Double): this.type = set("minY", value.asInstanceOf[js.Any])
    
    inline def modal(value: Boolean): this.type = set("modal", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onDrag(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onDragEnd(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onDragStart(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onMaskClick(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onMaskClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onMaximize(value: /* e */ DialogMaximizeParams => Callback): this.type = set("onMaximize", js.Any.fromFunction1((t0: /* e */ DialogMaximizeParams) => value(t0).runNow()))
    
    inline def onResize(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onResizeEnd(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onResizeEnd", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onResizeStart(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onResizeStart", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def position(value: DialogPositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def resizable(value: Boolean): this.type = set("resizable", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transitionOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
    ): this.type = set("transitionOptions", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
