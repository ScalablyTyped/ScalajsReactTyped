package typingsJapgolly.grommet.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.AutoClose
import typingsJapgolly.grommet.es6ComponentsAnchorMod.AnchorType
import typingsJapgolly.grommet.es6ComponentsNotificationMod.NotificationProps
import typingsJapgolly.grommet.es6ComponentsNotificationMod.StatusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notification {
  
  @JSImport("grommet/es6", "Notification")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: js.Array[AnchorType]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: AnchorType*): this.type = set("actions", js.Array(value*))
    
    inline def global(value: Boolean): this.type = set("global", value.asInstanceOf[js.Any])
    
    inline def message(value: String | Node): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClose(value: /* repeated */ Any => Any): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def status(value: StatusType): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def toast(value: Boolean | AutoClose): this.type = set("toast", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Notification.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
