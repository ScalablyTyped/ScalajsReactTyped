package typingsJapgolly.three.global.THREE

import typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.ExtrudeGeometry")
@js.native
open class ExtrudeGeometry ()
  extends typingsJapgolly.three.mod.ExtrudeGeometry {
  def this(shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(
    shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape],
    options: ExtrudeGeometryOptions
  ) = this()
  def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}
/* static members */
object ExtrudeGeometry {
  
  @JSGlobal("THREE.ExtrudeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry]
}
