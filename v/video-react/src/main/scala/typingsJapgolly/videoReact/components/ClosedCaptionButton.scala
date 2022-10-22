package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.videoReact.mod.ClosedCaptionButtonProps
import typingsJapgolly.videoReact.mod.PlayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClosedCaptionButton {
  
  @JSImport("video-react", "ClosedCaptionButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: Any): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def kinds(value: js.Array[String]): this.type = set("kinds", value.asInstanceOf[js.Any])
    
    inline def kindsVarargs(value: String*): this.type = set("kinds", js.Array(value*))
    
    inline def offMenuText(value: String): this.type = set("offMenuText", value.asInstanceOf[js.Any])
    
    inline def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def player(value: /* props */ PlayerProps => Element): this.type = set("player", js.Any.fromFunction1(value))
    
    inline def showOffMenu(value: Boolean): this.type = set("showOffMenu", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ClosedCaptionButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClosedCaptionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
