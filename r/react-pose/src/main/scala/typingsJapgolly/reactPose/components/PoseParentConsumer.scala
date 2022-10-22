package typingsJapgolly.reactPose.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PoseParentConsumer {
  
  inline def apply(children: js.Object => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[js.Object]]))
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseParentConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[js.Object]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
