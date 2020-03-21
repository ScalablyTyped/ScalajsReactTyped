package typingsJapgolly.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.DistrictSearch")
@js.native
class DistrictSearch protected () extends js.Object {
  def this(opts: DistrictSearchOptions) = this()
  def search(keywords: String): Unit = js.native
  def search(
    keywords: String,
    callback: js.Function2[/* status */ String, /* result */ String | DistrictSearchResult, Unit]
  ): Unit = js.native
  def search(
    keywords: String,
    callback: js.Function2[/* status */ String, /* result */ String | DistrictSearchResult, Unit],
    opts: DistrictSearchOptions
  ): Unit = js.native
  def setLevel(level: String): Unit = js.native
  def setSubdistrict(district: Double): Unit = js.native
}

