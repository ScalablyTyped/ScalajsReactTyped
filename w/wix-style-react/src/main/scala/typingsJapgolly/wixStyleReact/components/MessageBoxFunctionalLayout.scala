package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesMessageBoxFunctionalLayoutMod.MessageBoxFunctionalLayoutProps
import typingsJapgolly.wixStyleReact.distTypesMessageBoxFunctionalLayoutMod.MessageBoxFunctionalLayoutTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageBoxFunctionalLayout {
  
  @JSImport("wix-style-react", "MessageBoxFunctionalLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonsHeight(value: ButtonSize): this.type = set("buttonsHeight", value.asInstanceOf[js.Any])
    
    inline def cancelPrefixIcon(value: VdomElement): this.type = set("cancelPrefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def cancelSuffixIcon(value: VdomElement): this.type = set("cancelSuffixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def cancelText(value: VdomNode): this.type = set("cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelTextNull: this.type = set("cancelText", null)
    
    inline def cancelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelText", js.Array(value*))
    
    inline def cancelTextVdomElement(value: VdomElement): this.type = set("cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeButton(value: Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    inline def confirmPrefixIcon(value: VdomElement): this.type = set("confirmPrefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def confirmSuffixIcon(value: VdomElement): this.type = set("confirmSuffixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def confirmText(value: VdomNode): this.type = set("confirmText", value.rawNode.asInstanceOf[js.Any])
    
    inline def confirmTextNull: this.type = set("confirmText", null)
    
    inline def confirmTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("confirmText", js.Array(value*))
    
    inline def confirmTextVdomElement(value: VdomElement): this.type = set("confirmText", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disableCancel(value: Boolean): this.type = set("disableCancel", value.asInstanceOf[js.Any])
    
    inline def disableConfirmation(value: Boolean): this.type = set("disableConfirmation", value.asInstanceOf[js.Any])
    
    inline def footerBottomChildren(value: VdomNode): this.type = set("footerBottomChildren", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerBottomChildrenNull: this.type = set("footerBottomChildren", null)
    
    inline def footerBottomChildrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footerBottomChildren", js.Array(value*))
    
    inline def footerBottomChildrenVdomElement(value: VdomElement): this.type = set("footerBottomChildren", value.rawElement.asInstanceOf[js.Any])
    
    inline def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def hideFooter(value: Boolean): this.type = set("hideFooter", value.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def margin(value: String): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String | Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def noBodyPadding(value: Boolean): this.type = set("noBodyPadding", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onOk(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def sideActions(value: VdomNode): this.type = set("sideActions", value.rawNode.asInstanceOf[js.Any])
    
    inline def sideActionsNull: this.type = set("sideActions", null)
    
    inline def sideActionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideActions", js.Array(value*))
    
    inline def sideActionsVdomElement(value: VdomElement): this.type = set("sideActions", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: MessageBoxFunctionalLayoutTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def withEmptyState(value: Boolean): this.type = set("withEmptyState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MessageBoxFunctionalLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MessageBoxFunctionalLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
