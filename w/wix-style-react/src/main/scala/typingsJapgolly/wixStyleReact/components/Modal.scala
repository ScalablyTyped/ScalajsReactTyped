package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesModalMod.ModalHorizontalPostion
import typingsJapgolly.wixStyleReact.distTypesModalMod.ModalOverlayPosition
import typingsJapgolly.wixStyleReact.distTypesModalMod.ModalProps
import typingsJapgolly.wixStyleReact.distTypesModalMod.ModalScreen
import typingsJapgolly.wixStyleReact.distTypesModalMod.ModalVerticalPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("wix-style-react", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Modal] {
    
    inline def appElement(value: String): this.type = set("appElement", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def closeTimeoutMS(value: Double): this.type = set("closeTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def contentLabel(value: String): this.type = set("contentLabel", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def horizontalPosition(value: ModalHorizontalPostion): this.type = set("horizontalPosition", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def navigationNextLabel(value: String): this.type = set("navigationNextLabel", value.asInstanceOf[js.Any])
    
    inline def navigationPreviousLabel(value: String): this.type = set("navigationPreviousLabel", value.asInstanceOf[js.Any])
    
    inline def onAfterClose(value: Callback): this.type = set("onAfterClose", value.toJsFn)
    
    inline def onAfterOpen(value: Callback): this.type = set("onAfterOpen", value.toJsFn)
    
    inline def onNavigationClickNext(value: Callback): this.type = set("onNavigationClickNext", value.toJsFn)
    
    inline def onNavigationClickPrevious(value: Callback): this.type = set("onNavigationClickPrevious", value.toJsFn)
    
    inline def onOk(value: Callback): this.type = set("onOk", value.toJsFn)
    
    inline def onRequestClose(
      value: /* event */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]] => Callback
    ): this.type = set("onRequestClose", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]]) => value(t0).runNow()))
    
    inline def overlayPosition(value: ModalOverlayPosition): this.type = set("overlayPosition", value.asInstanceOf[js.Any])
    
    inline def parentSelector(value: CallbackTo[HTMLElement]): this.type = set("parentSelector", value.toJsFn)
    
    inline def screen(value: ModalScreen): this.type = set("screen", value.asInstanceOf[js.Any])
    
    inline def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    inline def scrollableContent(value: Boolean): this.type = set("scrollableContent", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnOverlayClick(value: Boolean): this.type = set("shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    
    inline def shouldDisplayCloseButton(value: Boolean): this.type = set("shouldDisplayCloseButton", value.asInstanceOf[js.Any])
    
    inline def showNavigationNextButton(value: Boolean): this.type = set("showNavigationNextButton", value.asInstanceOf[js.Any])
    
    inline def showNavigationPreviousButton(value: Boolean): this.type = set("showNavigationPreviousButton", value.asInstanceOf[js.Any])
    
    inline def verticalPosition(value: ModalVerticalPosition): this.type = set("verticalPosition", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
