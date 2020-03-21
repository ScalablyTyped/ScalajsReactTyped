package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimateOptionRen extends ElementAnimateOptionsBase {
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: js.UndefOr[Position] = js.undefined
}

object ElementAnimateOptionRen {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    easing: TransitionTimingFunction = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    renderedPosition: Position = null,
    step: js.UndefOr[Callback] = js.undefined,
    style: StringDictionary[js.Any] = null
  ): ElementAnimateOptionRen = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition.asInstanceOf[js.Any])
    step.foreach(p => __obj.updateDynamic("step")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimateOptionRen]
  }
}

