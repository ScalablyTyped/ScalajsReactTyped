package typingsJapgolly.reactRelay.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRelay.AnonCacheConfig
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "QueryRenderer")
@js.native
class QueryRenderer[TOperation /* <: OperationType */] ()
  extends Component[AnonCacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]

