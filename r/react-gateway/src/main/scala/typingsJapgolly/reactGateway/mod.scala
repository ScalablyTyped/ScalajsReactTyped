package typingsJapgolly.reactGateway

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactGateway.gatewayDestMod.GatewayDestProps
import typingsJapgolly.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Gateway ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  @js.native
  class GatewayDest ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  class GatewayProvider ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class GatewayRegistry ()
    extends typingsJapgolly.reactGateway.gatewayRegistryMod.GatewayRegistry {
    /* CompleteClass */
    override var _children: StringDictionary[js.UndefOr[StringDictionary[Node]]] = js.native
    /* CompleteClass */
    override var _containers: StringDictionary[
        js.UndefOr[(japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]) | Null]
      ] = js.native
    /* CompleteClass */
    override var _currentId: Double = js.native
    /* CompleteClass */
    override def _renderContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def addChild(name: String, gatewayId: String, child: Node): Unit = js.native
    /* CompleteClass */
    override def addContainer(name: String, container: japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]): Unit = js.native
    /* CompleteClass */
    override def clearChild(name: String, gatewayId: String): Unit = js.native
    /* CompleteClass */
    override def register(name: String, child: Node): String = js.native
    /* CompleteClass */
    override def removeContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def unregister(name: String, gatewayId: String): Unit = js.native
  }
  
}

