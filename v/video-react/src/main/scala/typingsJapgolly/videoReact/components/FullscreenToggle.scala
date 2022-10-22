package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.videoReact.mod.FullScreenToggleProps
import typingsJapgolly.videoReact.mod.PlayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FullscreenToggle {
  
  inline def apply(actions: Any): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FullScreenToggleProps]))
  }
  
  @JSImport("video-react", "FullscreenToggle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def player(value: /* props */ PlayerProps => Element): this.type = set("player", js.Any.fromFunction1(value))
  }
  
  def withProps(p: FullScreenToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
