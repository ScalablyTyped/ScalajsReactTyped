package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingAnalyticLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/AnalyticLightNode", JSImport.Default)
  @js.native
  open class default[T /* <: Light */] () extends AnalyticLightNode[T] {
    def this(light: T) = this()
  }
  
  @js.native
  trait AnalyticLightNode[T /* <: Light */]
    extends typingsJapgolly.three.examplesJsmNodesLightingLightingNodeMod.default {
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var light: T | Null = js.native
  }
}
