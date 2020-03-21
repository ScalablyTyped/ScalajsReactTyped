package typingsJapgolly.three.mod

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
  extends typingsJapgolly.three.pointsMod.Points {
  def this(geometry: typingsJapgolly.three.bufferGeometryMod.BufferGeometry) = this()
  def this(geometry: typingsJapgolly.three.geometryMod.Geometry) = this()
  def this(
    geometry: typingsJapgolly.three.bufferGeometryMod.BufferGeometry,
    material: js.Array[typingsJapgolly.three.materialMod.Material]
  ) = this()
  def this(
    geometry: typingsJapgolly.three.bufferGeometryMod.BufferGeometry,
    material: typingsJapgolly.three.materialMod.Material
  ) = this()
  def this(
    geometry: typingsJapgolly.three.geometryMod.Geometry,
    material: js.Array[typingsJapgolly.three.materialMod.Material]
  ) = this()
  def this(
    geometry: typingsJapgolly.three.geometryMod.Geometry,
    material: typingsJapgolly.three.materialMod.Material
  ) = this()
}

