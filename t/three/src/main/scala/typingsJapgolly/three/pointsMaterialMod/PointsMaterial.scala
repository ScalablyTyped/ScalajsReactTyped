package typingsJapgolly.three.pointsMaterialMod

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.textureMod.Texture
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

