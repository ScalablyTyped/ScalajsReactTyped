package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersBox3HelperMod {
  
  @JSImport("three/src/helpers/Box3Helper", "Box3Helper")
  @js.native
  open class Box3Helper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    /**
      * @param box
      * @param [color=0xffff00]
      */
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    
    var box: Box3 = js.native
  }
}
