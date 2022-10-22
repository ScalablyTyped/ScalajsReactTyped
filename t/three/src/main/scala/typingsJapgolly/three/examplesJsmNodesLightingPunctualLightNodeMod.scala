package typingsJapgolly.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingPunctualLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/PunctualLightNode", JSImport.Default)
  @js.native
  open class default () extends PunctualLightNode {
    def this(light: PunctualLight) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.three.srcThreeMod.PointLight
    - typingsJapgolly.three.srcThreeMod.SpotLight
  */
  trait PunctualLight extends StObject
  
  @js.native
  trait PunctualLightNode
    extends typingsJapgolly.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[PunctualLight] {
    
    var cutoffDistanceNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var decayExponentNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
