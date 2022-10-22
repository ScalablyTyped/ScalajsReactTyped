package typingsJapgolly.reactAuthKit.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactAuthKit.distTypesMod.AuthContextInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthContextConsumer {
  
  inline def apply(children: AuthContextInterface | Null => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[AuthContextInterface | Null]]))
  }
  
  @JSImport("react-auth-kit/dist/AuthContext", "AuthContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[AuthContextInterface | Null]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
