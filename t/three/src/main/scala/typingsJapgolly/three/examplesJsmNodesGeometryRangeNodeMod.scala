package typingsJapgolly.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesGeometryRangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/geometry/RangeNode", JSImport.Default)
  @js.native
  open class default protected () extends RangeNode {
    def this(min: RangeModeBound, max: RangeModeBound) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.three.srcThreeMod.Color
    - typingsJapgolly.three.srcThreeMod.Vector2
    - typingsJapgolly.three.srcThreeMod.Vector3
    - typingsJapgolly.three.srcThreeMod.Vector4
  */
  type RangeModeBound = _RangeModeBound | Double
  
  @js.native
  trait RangeNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    def getVectorLength(): Double = js.native
    
    var max: RangeModeBound = js.native
    
    var min: RangeModeBound = js.native
  }
  
  trait _RangeModeBound extends StObject
}
