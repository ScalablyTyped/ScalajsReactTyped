package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.NormalMapTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayNormalMapNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/NormalMapNode", JSImport.Default)
  @js.native
  open class default protected () extends NormalMapNode {
    def this(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      scaleNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait NormalMapNode
    extends typingsJapgolly.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var normalMapType: NormalMapTypes = js.native
    
    var scaleNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
