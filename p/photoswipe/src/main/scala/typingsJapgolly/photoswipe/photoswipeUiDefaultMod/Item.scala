package typingsJapgolly.photoswipe.photoswipeUiDefaultMod

import typingsJapgolly.photoswipe.AnonTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item
  extends typingsJapgolly.photoswipe.mod.Item {
  /**
    * The caption for this item.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    fitRatio: Int | Double = null,
    h: Int | Double = null,
    html: String = null,
    initialPosition: js.Any = null,
    initialZoomLevel: Int | Double = null,
    loadError: js.UndefOr[Boolean] = js.undefined,
    msrc: String = null,
    src: String = null,
    title: String = null,
    vGap: AnonTop = null,
    w: Int | Double = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (fitRatio != null) __obj.updateDynamic("fitRatio")(fitRatio.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition.asInstanceOf[js.Any])
    if (initialZoomLevel != null) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError.asInstanceOf[js.Any])
    if (msrc != null) __obj.updateDynamic("msrc")(msrc.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (vGap != null) __obj.updateDynamic("vGap")(vGap.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

