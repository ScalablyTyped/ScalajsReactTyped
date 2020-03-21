package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/loadingstrategy", JSImport.Namespace)
@js.native
object loadingstrategyMod extends js.Object {
  def all(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  def bbox(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  def tile(tileGrid: default): js.Function2[/* p0 */ Extent, /* p1 */ Double, js.Array[Extent]] = js.native
}

