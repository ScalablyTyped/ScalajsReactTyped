package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.HemisphereLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingHemisphereLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/HemisphereLightNode", JSImport.Default)
  @js.native
  open class default () extends HemisphereLightNode {
    def this(light: HemisphereLight) = this()
  }
  
  @js.native
  trait HemisphereLightNode
    extends typingsJapgolly.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[HemisphereLight] {
    
    var groundColorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var lightDirectionNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var lightPositionNode: typingsJapgolly.three.examplesJsmNodesAccessorsObject3DNodeMod.default = js.native
  }
}
