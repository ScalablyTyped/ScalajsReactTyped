package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmLinesLineGeometryMod.LineGeometry
import typingsJapgolly.three.examplesJsmLinesLineMaterialMod.LineMaterial
import typingsJapgolly.three.examplesJsmLinesLineSegments2Mod.LineSegments2
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLine2Mod {
  
  @JSImport("three/examples/jsm/lines/Line2", "Line2")
  @js.native
  open class Line2 () extends LineSegments2 {
    def this(geometry: LineGeometry) = this()
    def this(geometry: Unit, material: LineMaterial) = this()
    def this(geometry: LineGeometry, material: LineMaterial) = this()
    
    @JSName("geometry")
    var geometry_Line2: LineGeometry = js.native
    
    val isLine2: `true` = js.native
  }
}
