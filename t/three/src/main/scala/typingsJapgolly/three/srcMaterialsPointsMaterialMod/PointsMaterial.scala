package typingsJapgolly.three.srcMaterialsPointsMaterialMod

import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/PointsMaterial", "PointsMaterial")
@js.native
class PointsMaterial () extends Material {
  def this(parameters: PointsMaterialParameters) = this()
  var color: Color = js.native
  var map: Texture | Null = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  def setValues(parameters: PointsMaterialParameters): Unit = js.native
}

