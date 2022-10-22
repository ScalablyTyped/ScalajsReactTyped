package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmMathOctreeMod.Octree
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.LineSegments
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersOctreeHelperMod {
  
  @JSImport("three/examples/jsm/helpers/OctreeHelper", "OctreeHelper")
  @js.native
  open class OctreeHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(octree: Octree, color: ColorRepresentation) = this()
    
    var color: ColorRepresentation = js.native
    
    var octree: Octree = js.native
    
    /**
      * @default 'OctreeHelper'
      */
    @JSName("type")
    var type_OctreeHelper: typingsJapgolly.three.threeStrings.OctreeHelper | String = js.native
  }
}
