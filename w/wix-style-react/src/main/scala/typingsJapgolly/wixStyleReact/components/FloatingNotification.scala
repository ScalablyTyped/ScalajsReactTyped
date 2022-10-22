package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFloatingNotificationMod.FloatingNotificationButtonProps
import typingsJapgolly.wixStyleReact.distTypesFloatingNotificationMod.FloatingNotificationProps
import typingsJapgolly.wixStyleReact.distTypesFloatingNotificationMod.FloatingNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatingNotification {
  
  @JSImport("wix-style-react", "FloatingNotification")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FloatingNotification] {
    
    inline def buttonProps(value: FloatingNotificationButtonProps): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def onClose(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def prefixIcon(value: VdomElement): this.type = set("prefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textButtonProps(value: FloatingNotificationButtonProps): this.type = set("textButtonProps", value.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: FloatingNotificationType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FloatingNotification.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FloatingNotificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
