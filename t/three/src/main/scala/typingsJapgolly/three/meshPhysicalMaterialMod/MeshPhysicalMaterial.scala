package typingsJapgolly.three.meshPhysicalMaterialMod

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.meshStandardMaterialMod.MeshStandardMaterial
import typingsJapgolly.three.textureMod.Texture
import typingsJapgolly.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearcoat: Double = js.native
  var clearcoatNormalMap: Texture | Null = js.native
  var clearcoatNormalScale: Vector2 = js.native
  var clearcoatRoughness: Double = js.native
  var reflectivity: Double = js.native
  var sheen: Color | Null = js.native
}

