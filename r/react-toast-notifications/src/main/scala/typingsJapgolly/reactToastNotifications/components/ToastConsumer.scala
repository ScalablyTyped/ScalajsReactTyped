package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactToastNotifications.mod.ToastConsumerContext
import typingsJapgolly.reactToastNotifications.mod.ToastConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastConsumer {
  
  inline def apply(children: ToastConsumerContext => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ToastConsumerProps]))
  }
  
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToastConsumerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
