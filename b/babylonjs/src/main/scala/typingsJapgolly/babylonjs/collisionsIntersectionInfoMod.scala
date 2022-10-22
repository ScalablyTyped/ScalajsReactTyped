package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsIntersectionInfoMod {
  
  @JSImport("babylonjs/Collisions/intersectionInfo", "IntersectionInfo")
  @js.native
  open class IntersectionInfo protected () extends StObject {
    def this(bu: Nullable[Double], bv: Nullable[Double], distance: Double) = this()
    
    var bu: Nullable[Double] = js.native
    
    var bv: Nullable[Double] = js.native
    
    var distance: Double = js.native
    
    var faceId: Double = js.native
    
    var subMeshId: Double = js.native
  }
}
