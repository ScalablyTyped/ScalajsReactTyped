package typingsJapgolly.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.GraphNode
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/custom_op/node_value_impl", JSImport.Namespace)
@js.native
object nodeValueImplMod extends js.Object {
  @js.native
  class NodeValueImpl protected () extends GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    /* CompleteClass */
    override var attrs: StringDictionary[ValueType] = js.native
    var context: js.Any = js.native
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    var getAttr: js.Any = js.native
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    var getInput: js.Any = js.native
    /* CompleteClass */
    override var inputs: js.Array[Tensor_[Rank]] = js.native
    var node: js.Any = js.native
    var tensorMap: js.Any = js.native
  }
  
}

