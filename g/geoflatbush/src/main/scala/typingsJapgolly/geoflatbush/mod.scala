package typingsJapgolly.geoflatbush

import typingsJapgolly.flatbush.mod.Flatbush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geoflatbush", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def around(index: Flatbush, longitude: Double, latitude: Double): js.Array[Double] = js.native
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double): js.Array[Double] = js.native
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = js.native
}

