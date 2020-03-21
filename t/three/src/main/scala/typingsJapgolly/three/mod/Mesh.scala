package typingsJapgolly.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Mesh")
@js.native
class Mesh ()
  extends typingsJapgolly.three.meshMod.Mesh {
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

