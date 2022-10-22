package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typingsJapgolly.wixStyleReact.distTypesMessageModalLayoutMod.MessageModalLayoutProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageModalLayout {
  
  @JSImport("wix-style-react", "MessageModalLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actionsSize(value: ButtonSize): this.type = set("actionsSize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: String | Node): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def footnote(value: VdomNode): this.type = set("footnote", value.rawNode.asInstanceOf[js.Any])
    
    inline def footnoteNull: this.type = set("footnote", null)
    
    inline def footnoteVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footnote", js.Array(value*))
    
    inline def footnoteVdomElement(value: VdomElement): this.type = set("footnote", value.rawElement.asInstanceOf[js.Any])
    
    inline def illustration(value: String | Node): this.type = set("illustration", value.asInstanceOf[js.Any])
    
    inline def illustrationNull: this.type = set("illustration", null)
    
    inline def illustrationVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("illustration", js.Array(value*))
    
    inline def illustrationVdomElement(value: VdomElement): this.type = set("illustration", value.rawElement.asInstanceOf[js.Any])
    
    inline def onCloseButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCloseButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onHelpButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onHelpButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def primaryButtonOnClick(value: Callback): this.type = set("primaryButtonOnClick", value.toJsFn)
    
    inline def primaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): this.type = set("primaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def primaryButtonText(value: String): this.type = set("primaryButtonText", value.asInstanceOf[js.Any])
    
    inline def secondaryButtonOnClick(value: Callback): this.type = set("secondaryButtonOnClick", value.toJsFn)
    
    inline def secondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): this.type = set("secondaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def secondaryButtonText(value: String): this.type = set("secondaryButtonText", value.asInstanceOf[js.Any])
    
    inline def sideActions(value: VdomNode): this.type = set("sideActions", value.rawNode.asInstanceOf[js.Any])
    
    inline def sideActionsNull: this.type = set("sideActions", null)
    
    inline def sideActionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideActions", js.Array(value*))
    
    inline def sideActionsVdomElement(value: VdomElement): this.type = set("sideActions", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: ModalTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String | Node): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MessageModalLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MessageModalLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
