package typingsJapgolly.cesium.mod

import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileDiscardPolicy")
@js.native
class TileDiscardPolicy () extends js.Object {
  def isReady(): Boolean = js.native
  def shouldDiscardImage(image: js.Promise[HTMLImageElement]): js.Promise[Boolean] = js.native
  def shouldDiscardImage(image: HTMLImageElement): js.Promise[Boolean] = js.native
}

