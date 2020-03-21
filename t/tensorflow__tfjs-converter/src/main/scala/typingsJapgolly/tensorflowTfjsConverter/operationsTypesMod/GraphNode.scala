package typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends js.Object {
  var attrs: StringDictionary[ValueType]
  var inputs: js.Array[Tensor_[Rank]]
}

object GraphNode {
  @scala.inline
  def apply(attrs: StringDictionary[ValueType], inputs: js.Array[Tensor_[Rank]]): GraphNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphNode]
  }
}

