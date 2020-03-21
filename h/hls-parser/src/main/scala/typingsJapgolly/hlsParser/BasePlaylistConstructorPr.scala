package typingsJapgolly.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  isMasterPlaylist  :boolean} */
trait BasePlaylistConstructorPr extends js.Object {
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  var isMasterPlaylist: Boolean
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[AnonOffset] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object BasePlaylistConstructorPr {
  @scala.inline
  def apply(
    isMasterPlaylist: Boolean,
    independentSegments: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    start: AnonOffset = null,
    uri: String = null,
    version: Int | Double = null
  ): BasePlaylistConstructorPr = {
    val __obj = js.Dynamic.literal(isMasterPlaylist = isMasterPlaylist.asInstanceOf[js.Any])
    if (!js.isUndefined(independentSegments)) __obj.updateDynamic("independentSegments")(independentSegments.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPr]
  }
}

