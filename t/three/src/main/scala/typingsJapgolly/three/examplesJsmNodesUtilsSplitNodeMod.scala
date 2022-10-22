package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.SwizzleOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsSplitNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/SplitNode", JSImport.Default)
  @js.native
  open class default protected () extends SplitNode {
    /**
      *
      * @param node the input node
      * @param components swizzle like string, default = "x"
      */
    def this(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, components: SwizzleOption) = this()
  }
  
  @js.native
  trait SplitNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var components: String = js.native
    
    def getVectorLength(): Double = js.native
    
    var node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
