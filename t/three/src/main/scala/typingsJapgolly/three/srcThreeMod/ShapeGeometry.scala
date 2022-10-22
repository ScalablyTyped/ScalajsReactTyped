package typingsJapgolly.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "ShapeGeometry")
@js.native
open class ShapeGeometry ()
  extends typingsJapgolly.three.srcGeometriesGeometriesMod.ShapeGeometry {
  def this(shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape], curveSegments: Double) = this()
  def this(shapes: Unit, curveSegments: Double) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape, curveSegments: Double) = this()
}
/* static members */
object ShapeGeometry {
  
  @JSImport("three/src/Three", "ShapeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typingsJapgolly.three.srcGeometriesShapeGeometryMod.ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcGeometriesShapeGeometryMod.ShapeGeometry]
}
