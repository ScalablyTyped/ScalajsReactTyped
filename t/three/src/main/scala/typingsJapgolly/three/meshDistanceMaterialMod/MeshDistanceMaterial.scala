package typingsJapgolly.three.meshDistanceMaterialMod

import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.textureMod.Texture
import typingsJapgolly.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
@js.native
class MeshDistanceMaterial () extends Material {
  def this(parameters: MeshDistanceMaterialParameters) = this()
  var displacementBias: Double = js.native
  var displacementMap: Texture | Null = js.native
  var displacementScale: Double = js.native
  var farDistance: Double = js.native
  var nearDistance: Double = js.native
  var referencePosition: Vector3 = js.native
  def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
}

