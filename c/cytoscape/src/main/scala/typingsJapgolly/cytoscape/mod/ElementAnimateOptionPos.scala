package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimateOptionPos extends ElementAnimateOptionsBase {
  /** A position to which the elements will be animated. */
  var position: js.UndefOr[Position] = js.undefined
}

object ElementAnimateOptionPos {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    easing: TransitionTimingFunction = null,
    position: Position = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Callback] = js.undefined,
    style: StringDictionary[js.Any] = null
  ): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    step.foreach(p => __obj.updateDynamic("step")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
}

