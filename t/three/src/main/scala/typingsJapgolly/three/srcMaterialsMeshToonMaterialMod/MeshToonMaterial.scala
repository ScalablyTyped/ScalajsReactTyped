package typingsJapgolly.three.srcMaterialsMeshToonMaterialMod

import typingsJapgolly.three.srcMaterialsMeshPhongMaterialMod.MeshPhongMaterial
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshToonMaterial", "MeshToonMaterial")
@js.native
class MeshToonMaterial () extends MeshPhongMaterial {
  def this(parameters: MeshToonMaterialParameters) = this()
  var gradientMap: Texture | Null = js.native
  def setValues(parameters: MeshToonMaterialParameters): Unit = js.native
}

