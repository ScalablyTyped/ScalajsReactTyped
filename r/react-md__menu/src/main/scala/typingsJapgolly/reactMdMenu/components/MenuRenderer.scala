package typingsJapgolly.reactMdMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdMenu.anon.ReadonlyOmitMenuWidgetPro
import typingsJapgolly.reactMdMenu.anon.ReadonlyPropsWithRefOmitL
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.children
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.id
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.onRequestClose
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.visible
import typingsJapgolly.reactMdMenu.typesMenuRendererMod.MenuRendererProps
import typingsJapgolly.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetProps
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuRenderer {
  
  inline def apply(
    id: String,
    onClick: ReactMouseEventFrom[HTMLDivElement & Element] => Callback,
    onEnter: /* appearing */ Boolean => Callback,
    onEntered: /* appearing */ Boolean => Callback,
    onEntering: /* appearing */ Boolean => Callback,
    onExited: Callback,
    onKeyDown: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback,
    onRequestClose: Callback,
    style: CSSProperties,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => onClick(t0).runNow()), onEnter = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEnter(t0).runNow()), onEntered = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntered(t0).runNow()), onEntering = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntering(t0).runNow()), onExited = onExited.toJsFn, onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => onKeyDown(t0).runNow()), onRequestClose = onRequestClose.toJsFn, style = style.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuRendererProps]))
  }
  
  @JSImport("@react-md/menu", "MenuRenderer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
    
    inline def listProps(value: ReadonlyPropsWithRefOmitL): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
    
    inline def menuProps(value: ReadonlyOmitMenuWidgetPro): this.type = set("menuProps", value.asInstanceOf[js.Any])
    
    inline def menuRef(value: Ref[HTMLDivElement]): this.type = set("menuRef", value.asInstanceOf[js.Any])
    
    inline def menuRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("menuRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def menuRefNull: this.type = set("menuRef", null)
    
    inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
    
    inline def onExiting(value: Callback): this.type = set("onExiting", value.toJsFn)
    
    inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    
    inline def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    
    inline def portalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("portalInto", value.toJsFn)
    
    inline def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
    
    inline def portalIntoNull: this.type = set("portalInto", null)
    
    inline def renderAsSheet(value: RenderMenuAsSheet): this.type = set("renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def sheetClassName(value: String): this.type = set("sheetClassName", value.asInstanceOf[js.Any])
    
    inline def sheetFooter(value: VdomNode): this.type = set("sheetFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def sheetFooterNull: this.type = set("sheetFooter", null)
    
    inline def sheetFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("sheetFooter", js.Array(value*))
    
    inline def sheetFooterVdomElement(value: VdomElement): this.type = set("sheetFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def sheetHeader(value: VdomNode): this.type = set("sheetHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def sheetHeaderNull: this.type = set("sheetHeader", null)
    
    inline def sheetHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("sheetHeader", js.Array(value*))
    
    inline def sheetHeaderVdomElement(value: VdomElement): this.type = set("sheetHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def sheetMenuProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("sheetMenuProps", value.asInstanceOf[js.Any])
    
    inline def sheetPosition(value: SheetPosition): this.type = set("sheetPosition", value.asInstanceOf[js.Any])
    
    inline def sheetProps(value: Omit[SheetProps, id | visible | onRequestClose | children]): this.type = set("sheetProps", value.asInstanceOf[js.Any])
    
    inline def sheetStyle(value: CSSProperties): this.type = set("sheetStyle", value.asInstanceOf[js.Any])
    
    inline def sheetVerticalSize(value: SheetVerticalSize): this.type = set("sheetVerticalSize", value.asInstanceOf[js.Any])
    
    inline def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
    
    inline def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuRendererProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
