package typingsJapgolly.slate.mod

import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.slate.slateStrings.split_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SplitNodeOperation")
@js.native
class SplitNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var path: List[Double] = js.native
  var position: Double = js.native
  var properties: NodeProperties = js.native
  var target: Double = js.native
  @JSName("type")
  var type_SplitNodeOperation: split_node = js.native
}

