package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmLinesLineSegmentsGeometryMod.LineSegmentsGeometry
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Line
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLineGeometryMod {
  
  @JSImport("three/examples/jsm/lines/LineGeometry", "LineGeometry")
  @js.native
  open class LineGeometry () extends LineSegmentsGeometry {
    
    def fromLine(line: Line[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    val isLineGeometry: `true` = js.native
  }
}
