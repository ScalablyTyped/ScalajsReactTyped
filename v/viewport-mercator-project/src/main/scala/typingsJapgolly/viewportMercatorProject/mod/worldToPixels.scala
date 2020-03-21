package typingsJapgolly.viewportMercatorProject.mod

import typingsJapgolly.glMatrix.mod.mat4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", "worldToPixels")
@js.native
object worldToPixels extends js.Object {
  def apply(coordinates: CoordinatesZ, pixelProjectionMatrix: mat4): CoordinatesZ = js.native
  def apply(coordinates: Coordinates, pixelProjectionMatrix: mat4): CoordinatesZ = js.native
}

