package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.ToneMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayToneMappingNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", JSImport.Default)
  @js.native
  open class default protected () extends ToneMappingNode {
    def this(toneMapping: ToneMapping) = this()
    def this(toneMapping: ToneMapping, exposureNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(
      toneMapping: ToneMapping,
      exposureNode: Unit,
      colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
    def this(
      toneMapping: ToneMapping,
      exposureNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", "LinearToneMappingNode")
  @js.native
  val LinearToneMappingNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  
  @js.native
  trait ToneMappingNode
    extends typingsJapgolly.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var exposureNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var toneMapping: ToneMapping = js.native
  }
}
