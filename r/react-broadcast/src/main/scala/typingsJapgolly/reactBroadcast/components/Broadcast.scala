package typingsJapgolly.reactBroadcast.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBroadcast.mod.Broadcast.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Broadcast {
  
  inline def apply[T](channel: String, value: T): Builder[T] = {
    val __props = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBroadcast.mod.Broadcast[T]] {
    
    inline def compareValues(value: (T, T) => Boolean): this.type = set("compareValues", js.Any.fromFunction2(value))
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
