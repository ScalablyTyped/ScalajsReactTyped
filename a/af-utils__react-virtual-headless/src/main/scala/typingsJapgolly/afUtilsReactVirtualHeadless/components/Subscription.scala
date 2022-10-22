package typingsJapgolly.afUtilsReactVirtualHeadless.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.afUtilsReactVirtualHeadless.mod.EventType
import typingsJapgolly.afUtilsReactVirtualHeadless.mod.Model
import typingsJapgolly.afUtilsReactVirtualHeadless.mod.SubscriptionProps
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscription {
  
  inline def apply(model: Model): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[SubscriptionProps]]))
  }
  
  @JSImport("@af-utils/react-virtual-headless", "Subscription")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def events(value: js.Array[EventType]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(value: EventType*): this.type = set("events", js.Array(value*))
  }
  
  def withProps(p: PropsWithChildren[SubscriptionProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
