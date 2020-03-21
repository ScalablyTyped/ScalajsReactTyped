package typingsJapgolly.three.textGeometryMod

import typingsJapgolly.three.AnonBevelEnabled
import typingsJapgolly.three.extrudeGeometryMod.ExtrudeBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TextGeometry", "TextBufferGeometry")
@js.native
class TextBufferGeometry protected () extends ExtrudeBufferGeometry {
  def this(text: String) = this()
  def this(text: String, parameters: TextGeometryParameters) = this()
  var parameters: AnonBevelEnabled = js.native
}

