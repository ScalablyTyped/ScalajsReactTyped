package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathPlaneMod.Plane
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersPlaneHelperMod {
  
  @JSImport("three/src/helpers/PlaneHelper", "PlaneHelper")
  @js.native
  open class PlaneHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    /**
      * @param plane
      * @param [size=1]
      * @param [hex=0xffff00]
      */
    def this(plane: Plane) = this()
    def this(plane: Plane, size: Double) = this()
    def this(plane: Plane, size: Double, hex: Double) = this()
    def this(plane: Plane, size: Unit, hex: Double) = this()
    
    var plane: Plane = js.native
    
    /**
      * @default 1
      */
    var size: Double = js.native
  }
}
