package typingsJapgolly.gdal.mod

import typingsJapgolly.gdal.gdalStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "open")
@js.native
object open_w extends js.Object {
  def apply(
    path: String,
    mode: js.UndefOr[w],
    drivers: js.UndefOr[js.Array[String] | String],
    x_size: js.UndefOr[Double],
    y_size: js.UndefOr[Double],
    band_count: js.UndefOr[Double],
    data_type: js.UndefOr[Double],
    creation_options: js.UndefOr[js.Array[String] | js.Object]
  ): Dataset = js.native
  def apply(path: String, mode: w): Dataset = js.native
  def apply(path: String, mode: w, drivers: String): Dataset = js.native
  def apply(path: String, mode: w, drivers: js.Array[String]): Dataset = js.native
}

