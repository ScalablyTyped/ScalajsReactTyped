package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTileOptions extends js.Object {
  var imgonerror: js.UndefOr[js.Function0[_]] = js.undefined
  var imgonload: js.UndefOr[js.Function0[_]] = js.undefined
  var offset: js.UndefOr[Point] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[HTMLElement] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var transition: js.UndefOr[Boolean] = js.undefined
  var urls: js.Array[String]
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ImageTileOptions {
  @scala.inline
  def apply(
    urls: js.Array[String],
    imgonerror: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    imgonload: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    offset: Point = null,
    opacity: Int | Double = null,
    pane: HTMLElement = null,
    size: Size = null,
    transition: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    imgonerror.foreach(p => __obj.updateDynamic("imgonerror")(p.toJsFn))
    imgonload.foreach(p => __obj.updateDynamic("imgonload")(p.toJsFn))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
}

