package typingsJapgolly.reactFrameComponent.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactFrameComponent.mod.FrameContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FrameContextConsumer {
  
  inline def apply(children: FrameContextProps => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[FrameContextProps]]))
  }
  
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[FrameContextProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
