package typingsJapgolly.reactBroadcast.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBroadcast.mod.Subscriber.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscriber {
  
  inline def apply[T](channel: String): Builder[T] = {
    val __props = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBroadcast.mod.Subscriber[T]] {
    
    inline def children(value: T => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def quiet(value: Boolean): this.type = set("quiet", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
