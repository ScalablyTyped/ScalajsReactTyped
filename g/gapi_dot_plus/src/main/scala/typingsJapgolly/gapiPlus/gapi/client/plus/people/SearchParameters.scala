package typingsJapgolly.gapiPlus.gapi.client.plus.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParameters extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var query: String
}

object SearchParameters {
  @scala.inline
  def apply(query: String, language: String = null, maxResults: Int | Double = null, pageToken: String = null): SearchParameters = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameters]
  }
}

