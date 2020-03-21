package typingsJapgolly.slate.mod

import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.slate.slateStrings.remove_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "RemoveNodeOperation")
@js.native
class RemoveNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var node: Node = js.native
  var path: List[Double] = js.native
  @JSName("type")
  var type_RemoveNodeOperation: remove_node = js.native
}

