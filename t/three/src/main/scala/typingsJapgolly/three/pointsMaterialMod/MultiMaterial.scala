package typingsJapgolly.three.pointsMaterialMod

import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/PointsMaterial", "MultiMaterial")
@js.native
class MultiMaterial () extends Material {
  def this(materials: js.Array[Material]) = this()
  var isMultiMaterial: `true` = js.native
  var materials: js.Array[Material] = js.native
}

