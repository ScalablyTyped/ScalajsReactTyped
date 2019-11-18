package typingsJapgolly.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Points")
@js.native
/**
	 * @param geometry An instance of Geometry or BufferGeometry.
	 * @param material An instance of Material (optional).
	 */
class Points ()
  extends typingsJapgolly.three.srcObjectsPointsMod.Points {
  def this(geometry: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: typingsJapgolly.three.srcCoreGeometryMod.Geometry) = this()
  def this(
    geometry: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry,
    material: js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
  ) = this()
  def this(
    geometry: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry,
    material: typingsJapgolly.three.srcMaterialsMaterialMod.Material
  ) = this()
  def this(
    geometry: typingsJapgolly.three.srcCoreGeometryMod.Geometry,
    material: js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
  ) = this()
  def this(
    geometry: typingsJapgolly.three.srcCoreGeometryMod.Geometry,
    material: typingsJapgolly.three.srcMaterialsMaterialMod.Material
  ) = this()
}

