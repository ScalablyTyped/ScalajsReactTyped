package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSection extends js.Object {
  /** The contentDetails object contains details about the channel section content, such as a list of playlists or channels featured in the section. */
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel section. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection". */
  var kind: js.UndefOr[String] = js.undefined
  /** Localizations for different languages */
  var localizations: js.UndefOr[Record[String, ChannelSectionLocalization]] = js.undefined
  /** The snippet object contains basic details about the channel section, such as its type, style and title. */
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
  /** The targeting object contains basic targeting settings about the channel section. */
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
}

object ChannelSection {
  @scala.inline
  def apply(
    contentDetails: ChannelSectionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: Record[String, ChannelSectionLocalization] = null,
    snippet: ChannelSectionSnippet = null,
    targeting: ChannelSectionTargeting = null
  ): ChannelSection = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (targeting != null) __obj.updateDynamic("targeting")(targeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSection]
  }
}

