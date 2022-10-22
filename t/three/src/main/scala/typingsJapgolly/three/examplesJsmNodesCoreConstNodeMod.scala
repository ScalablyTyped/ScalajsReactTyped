package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreConstNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ConstNode", JSImport.Default)
  @js.native
  open class default protected () extends ConstNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait ConstNode
    extends typingsJapgolly.three.examplesJsmNodesCoreInputNodeMod.default {
    
    def generateConst(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    
    var isConstNode: `true` = js.native
  }
}
