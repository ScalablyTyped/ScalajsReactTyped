package typingsJapgolly.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typingsJapgolly.tensorflowTfjsConverter.distExecutorExecutionContextMod.ExecutionContext
import typingsJapgolly.tensorflowTfjsConverter.distOperationsTypesMod.GraphNode
import typingsJapgolly.tensorflowTfjsConverter.distOperationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.distOperationsTypesMod.ValueType
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsCustomOpNodeValueImplMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/node_value_impl", "NodeValueImpl")
  @js.native
  open class NodeValueImpl protected ()
    extends StObject
       with GraphNode {
    def this(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext) = this()
    
    /* CompleteClass */
    var attrs: StringDictionary[ValueType] = js.native
    
    /* private */ var context: Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getAttr: Any = js.native
    
    /**
      * Return the value of the attribute or input param.
      * @param name String: name of attribute or input param.
      */
    /* private */ var getInput: Any = js.native
    
    /* CompleteClass */
    var inputs: js.Array[Tensor[Rank]] = js.native
    
    /* private */ var node: Any = js.native
    
    /* private */ var tensorMap: Any = js.native
  }
}
