package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmLinesLineMaterialMod.LineMaterial
import typingsJapgolly.three.examplesJsmLinesLineSegmentsGeometryMod.LineSegmentsGeometry
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesWireframeMod {
  
  @JSImport("three/examples/jsm/lines/Wireframe", "Wireframe")
  @js.native
  open class Wireframe ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: LineSegmentsGeometry) = this()
    def this(geometry: Unit, material: LineMaterial) = this()
    def this(geometry: LineSegmentsGeometry, material: LineMaterial) = this()
    
    def computeLineDistances(): this.type = js.native
    
    val isWireframe: `true` = js.native
  }
}
