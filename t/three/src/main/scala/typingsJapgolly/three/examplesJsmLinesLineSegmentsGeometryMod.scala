package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.EdgesGeometry
import typingsJapgolly.three.srcThreeMod.InstancedBufferGeometry
import typingsJapgolly.three.srcThreeMod.LineSegments
import typingsJapgolly.three.srcThreeMod.Matrix4
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.WireframeGeometry
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLineSegmentsGeometryMod {
  
  @JSImport("three/examples/jsm/lines/LineSegmentsGeometry", "LineSegmentsGeometry")
  @js.native
  open class LineSegmentsGeometry () extends InstancedBufferGeometry {
    
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    def fromEdgesGeometry(geometry: EdgesGeometry[BufferGeometry]): this.type = js.native
    
    def fromLineSegments(lineSegments: LineSegments[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    def fromMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    def fromWireframeGeometry(geometry: WireframeGeometry[BufferGeometry]): this.type = js.native
    
    val isLineSegmentsGeometry: `true` = js.native
    
    def setColors(array: js.Array[Double]): this.type = js.native
    def setColors(array: js.typedarray.Float32Array): this.type = js.native
    
    def setPositions(array: js.Array[Double]): this.type = js.native
    def setPositions(array: js.typedarray.Float32Array): this.type = js.native
  }
}
