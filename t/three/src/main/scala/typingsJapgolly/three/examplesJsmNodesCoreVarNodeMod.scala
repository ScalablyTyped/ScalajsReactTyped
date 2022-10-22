package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesMathOperatorNodeMod.OperatorNodeOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreVarNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/VarNode", JSImport.Default)
  @js.native
  open class default protected () extends VarNode {
    def this(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, name: String) = this()
  }
  
  @js.native
  trait VarNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    def add(params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def assign(params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def div(params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def mul(params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    var name: String | Null = js.native
    
    var node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def op(op: OperatorNodeOp, params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
    
    def sub(params: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): this.type = js.native
  }
}
