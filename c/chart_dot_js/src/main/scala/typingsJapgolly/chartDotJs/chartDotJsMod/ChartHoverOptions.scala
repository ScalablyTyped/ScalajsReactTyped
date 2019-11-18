package typingsJapgolly.chartDotJs.chartDotJsMod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartHoverOptions extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var intersect: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[InteractionMode] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
  ] = js.undefined
}

object ChartHoverOptions {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    intersect: js.UndefOr[Boolean] = js.undefined,
    mode: InteractionMode = null,
    onHover: js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _] = null
  ): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(intersect)) __obj.updateDynamic("intersect")(intersect.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onHover != null) __obj.updateDynamic("onHover")(onHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartHoverOptions]
  }
}

