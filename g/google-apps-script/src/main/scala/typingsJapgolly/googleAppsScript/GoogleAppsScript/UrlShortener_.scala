package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.UrlShortener.Collection.UrlCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.UrlShortener.Schema.AnalyticsSnapshot
import typingsJapgolly.googleAppsScript.GoogleAppsScript.UrlShortener.Schema.AnalyticsSummary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.UrlShortener.Schema.StringCount
import typingsJapgolly.googleAppsScript.GoogleAppsScript.UrlShortener.Schema.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlShortener_ extends js.Object {
  var Url: js.UndefOr[UrlCollection] = js.undefined
  // Create a new instance of AnalyticsSnapshot
  def newAnalyticsSnapshot(): AnalyticsSnapshot
  // Create a new instance of AnalyticsSummary
  def newAnalyticsSummary(): AnalyticsSummary
  // Create a new instance of StringCount
  def newStringCount(): StringCount
  // Create a new instance of Url
  def newUrl(): Url
}

object UrlShortener_ {
  @scala.inline
  def apply(
    newAnalyticsSnapshot: CallbackTo[AnalyticsSnapshot],
    newAnalyticsSummary: CallbackTo[AnalyticsSummary],
    newStringCount: CallbackTo[StringCount],
    newUrl: CallbackTo[Url],
    Url: UrlCollection = null
  ): UrlShortener_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAnalyticsSnapshot")(newAnalyticsSnapshot.toJsFn)
    __obj.updateDynamic("newAnalyticsSummary")(newAnalyticsSummary.toJsFn)
    __obj.updateDynamic("newStringCount")(newStringCount.toJsFn)
    __obj.updateDynamic("newUrl")(newUrl.toJsFn)
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlShortener_]
  }
}

