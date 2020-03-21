package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegion extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the i18n region. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#i18nRegion". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the i18n region, such as region code and human-readable name. */
  var snippet: js.UndefOr[I18nRegionSnippet] = js.undefined
}

object I18nRegion {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: I18nRegionSnippet = null): I18nRegion = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nRegion]
  }
}

