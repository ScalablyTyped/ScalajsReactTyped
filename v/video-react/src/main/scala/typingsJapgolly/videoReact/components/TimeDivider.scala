package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.videoReact.mod.PlayerProps
import typingsJapgolly.videoReact.mod.TimeDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeDivider {
  
  @JSImport("video-react", "TimeDivider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def player(value: /* props */ PlayerProps => Element): this.type = set("player", js.Any.fromFunction1(value))
    
    inline def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimeDivider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimeDividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
