package typingsJapgolly.three.srcMaterialsMeshDepthMaterialMod

import typingsJapgolly.three.srcConstantsMod.DepthPackingStrategies
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDepthMaterial", "MeshDepthMaterial")
@js.native
class MeshDepthMaterial () extends Material {
  def this(parameters: MeshDepthMaterialParameters) = this()
  var depthPacking: DepthPackingStrategies = js.native
  var displacementBias: Double = js.native
  var displacementMap: Texture | Null = js.native
  var displacementScale: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
}

