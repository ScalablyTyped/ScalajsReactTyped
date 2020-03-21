package typingsJapgolly.three.textGeometryMod

import typingsJapgolly.three.AnonBevelEnabled
import typingsJapgolly.three.extrudeGeometryMod.ExtrudeGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TextGeometry", "TextGeometry")
@js.native
class TextGeometry protected () extends ExtrudeGeometry {
  def this(text: String) = this()
  def this(text: String, parameters: TextGeometryParameters) = this()
  var parameters: AnonBevelEnabled = js.native
}

