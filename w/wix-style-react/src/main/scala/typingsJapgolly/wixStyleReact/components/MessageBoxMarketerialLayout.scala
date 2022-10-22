package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesMessageBoxMarketerialLayoutMod.MessageBoxMarketerialLayoutProps
import typingsJapgolly.wixStyleReact.distTypesMessageBoxMarketerialLayoutMod.MessageBoxMarketerialLayoutTheme
import typingsJapgolly.wixStyleReact.distTypesMessageBoxMarketerialLayoutMod.MessageBoxMarketerialLayoutThemePrimaryButtonTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageBoxMarketerialLayout {
  
  inline def apply(onClose: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClose(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[MessageBoxMarketerialLayoutProps]))
  }
  
  @JSImport("wix-style-react", "MessageBoxMarketerialLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.MessageBoxMarketerialLayout] {
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def footerBottomChildren(value: VdomNode): this.type = set("footerBottomChildren", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerBottomChildrenNull: this.type = set("footerBottomChildren", null)
    
    inline def footerBottomChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("footerBottomChildren", js.Array(value*))
    
    inline def footerBottomChildrenVdomElement(value: VdomElement): this.type = set("footerBottomChildren", value.rawElement.asInstanceOf[js.Any])
    
    inline def imageComponent(value: VdomNode): this.type = set("imageComponent", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageComponentNull: this.type = set("imageComponent", null)
    
    inline def imageComponentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("imageComponent", js.Array(value*))
    
    inline def imageComponentVdomElement(value: VdomElement): this.type = set("imageComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def imageUrl(value: String): this.type = set("imageUrl", value.asInstanceOf[js.Any])
    
    inline def noBodyPadding(value: Boolean): this.type = set("noBodyPadding", value.asInstanceOf[js.Any])
    
    inline def onPrimaryButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onPrimaryButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSecondaryButtonClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onSecondaryButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def primaryButtonDisabled(value: Boolean): this.type = set("primaryButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def primaryButtonLabel(value: String): this.type = set("primaryButtonLabel", value.asInstanceOf[js.Any])
    
    inline def primaryButtonNode(value: VdomNode): this.type = set("primaryButtonNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def primaryButtonNodeNull: this.type = set("primaryButtonNode", null)
    
    inline def primaryButtonNodeVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("primaryButtonNode", js.Array(value*))
    
    inline def primaryButtonNodeVdomElement(value: VdomElement): this.type = set("primaryButtonNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def primaryButtonTheme(value: MessageBoxMarketerialLayoutThemePrimaryButtonTheme): this.type = set("primaryButtonTheme", value.asInstanceOf[js.Any])
    
    inline def removeButtonsPadding(value: Boolean): this.type = set("removeButtonsPadding", value.asInstanceOf[js.Any])
    
    inline def secondaryButtonLabel(value: String): this.type = set("secondaryButtonLabel", value.asInstanceOf[js.Any])
    
    inline def theme(value: MessageBoxMarketerialLayoutTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MessageBoxMarketerialLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
