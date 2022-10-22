package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersAxesHelperMod {
  
  @JSImport("three/src/helpers/AxesHelper", "AxesHelper")
  @js.native
  /**
    * @param [size=1]
    */
  open class AxesHelper ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double) = this()
    
    def dispose(): Unit = js.native
    
    def setColors(xAxisColor: Color, yAxisColor: Color, zAxisColor: Color): this.type = js.native
  }
}
