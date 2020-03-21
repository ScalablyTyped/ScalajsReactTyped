package typingsJapgolly.reactGateway.gatewayRegistryMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
@js.native
class ^ () extends GatewayRegistry {
  /* CompleteClass */
  override var _children: StringDictionary[js.UndefOr[StringDictionary[Node]]] = js.native
  /* CompleteClass */
  override var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]] = js.native
  /* CompleteClass */
  override var _currentId: Double = js.native
  /* CompleteClass */
  override def _renderContainer(name: String): Unit = js.native
  /* CompleteClass */
  override def addChild(name: String, gatewayId: String, child: Node): Unit = js.native
  /* CompleteClass */
  override def addContainer(name: String, container: Component[js.Object, js.Object]): Unit = js.native
  /* CompleteClass */
  override def clearChild(name: String, gatewayId: String): Unit = js.native
  /* CompleteClass */
  override def register(name: String, child: Node): String = js.native
  /* CompleteClass */
  override def removeContainer(name: String): Unit = js.native
  /* CompleteClass */
  override def unregister(name: String, gatewayId: String): Unit = js.native
}

