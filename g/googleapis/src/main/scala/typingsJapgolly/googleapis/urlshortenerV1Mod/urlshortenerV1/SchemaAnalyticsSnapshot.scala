package typingsJapgolly.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnalyticsSnapshot extends js.Object {
  /**
    * Top browsers, e.g. &quot;Chrome&quot;; sorted by (descending) click
    * counts. Only present if this data is available.
    */
  var browsers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Top countries (expressed as country codes), e.g. &quot;US&quot; or
    * &quot;DE&quot;; sorted by (descending) click counts. Only present if this
    * data is available.
    */
  var countries: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: js.UndefOr[String] = js.native
  /**
    * Top platforms or OSes, e.g. &quot;Windows&quot;; sorted by (descending)
    * click counts. Only present if this data is available.
    */
  var platforms: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Top referring hosts, e.g. &quot;www.google.com&quot;; sorted by
    * (descending) click counts. Only present if this data is available.
    */
  var referrers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: js.UndefOr[String] = js.native
}

object SchemaAnalyticsSnapshot {
  @scala.inline
  def apply(
    browsers: js.Array[SchemaStringCount] = null,
    countries: js.Array[SchemaStringCount] = null,
    longUrlClicks: String = null,
    platforms: js.Array[SchemaStringCount] = null,
    referrers: js.Array[SchemaStringCount] = null,
    shortUrlClicks: String = null
  ): SchemaAnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (longUrlClicks != null) __obj.updateDynamic("longUrlClicks")(longUrlClicks.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (referrers != null) __obj.updateDynamic("referrers")(referrers.asInstanceOf[js.Any])
    if (shortUrlClicks != null) __obj.updateDynamic("shortUrlClicks")(shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyticsSnapshot]
  }
}

