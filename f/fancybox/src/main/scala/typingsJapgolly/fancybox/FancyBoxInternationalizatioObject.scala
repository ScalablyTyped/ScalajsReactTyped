package typingsJapgolly.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxInternationalizatioObject extends js.Object {
  var CLOSE: js.UndefOr[String] = js.undefined
  var DOWNLOAD: js.UndefOr[String] = js.undefined
  var ERROR: js.UndefOr[String] = js.undefined
  var FULL_SCREEN: js.UndefOr[String] = js.undefined
  var NEXT: js.UndefOr[String] = js.undefined
  var PLAY_START: js.UndefOr[String] = js.undefined
  var PLAY_STOP: js.UndefOr[String] = js.undefined
  var PREV: js.UndefOr[String] = js.undefined
  var SHARE: js.UndefOr[String] = js.undefined
  var THUMBS: js.UndefOr[String] = js.undefined
  var ZOOM: js.UndefOr[String] = js.undefined
}

object FancyBoxInternationalizatioObject {
  @scala.inline
  def apply(
    CLOSE: String = null,
    DOWNLOAD: String = null,
    ERROR: String = null,
    FULL_SCREEN: String = null,
    NEXT: String = null,
    PLAY_START: String = null,
    PLAY_STOP: String = null,
    PREV: String = null,
    SHARE: String = null,
    THUMBS: String = null,
    ZOOM: String = null
  ): FancyBoxInternationalizatioObject = {
    val __obj = js.Dynamic.literal()
    if (CLOSE != null) __obj.updateDynamic("CLOSE")(CLOSE.asInstanceOf[js.Any])
    if (DOWNLOAD != null) __obj.updateDynamic("DOWNLOAD")(DOWNLOAD.asInstanceOf[js.Any])
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR.asInstanceOf[js.Any])
    if (FULL_SCREEN != null) __obj.updateDynamic("FULL_SCREEN")(FULL_SCREEN.asInstanceOf[js.Any])
    if (NEXT != null) __obj.updateDynamic("NEXT")(NEXT.asInstanceOf[js.Any])
    if (PLAY_START != null) __obj.updateDynamic("PLAY_START")(PLAY_START.asInstanceOf[js.Any])
    if (PLAY_STOP != null) __obj.updateDynamic("PLAY_STOP")(PLAY_STOP.asInstanceOf[js.Any])
    if (PREV != null) __obj.updateDynamic("PREV")(PREV.asInstanceOf[js.Any])
    if (SHARE != null) __obj.updateDynamic("SHARE")(SHARE.asInstanceOf[js.Any])
    if (THUMBS != null) __obj.updateDynamic("THUMBS")(THUMBS.asInstanceOf[js.Any])
    if (ZOOM != null) __obj.updateDynamic("ZOOM")(ZOOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxInternationalizatioObject]
  }
}

