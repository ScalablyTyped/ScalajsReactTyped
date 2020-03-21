package typingsJapgolly.domToImage.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var cachebust: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imagePlaceholder: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bgcolor: String = null,
    cachebust: js.UndefOr[Boolean] = js.undefined,
    filter: /* node */ Node => CallbackTo[Boolean] = null,
    height: Int | Double = null,
    imagePlaceholder: String = null,
    quality: Int | Double = null,
    style: js.Object = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(cachebust)) __obj.updateDynamic("cachebust")(cachebust.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => filter(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imagePlaceholder != null) __obj.updateDynamic("imagePlaceholder")(imagePlaceholder.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

