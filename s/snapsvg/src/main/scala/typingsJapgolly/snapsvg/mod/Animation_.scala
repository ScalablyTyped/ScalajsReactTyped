package typingsJapgolly.snapsvg.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation_ extends js.Object {
  var attr: StringDictionary[String | Double | Boolean | js.Any]
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: Double
  var easing: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
}

object Animation_ {
  @scala.inline
  def apply(
    attr: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    callback: js.UndefOr[Callback] = js.undefined,
    easing: /* num */ Double => CallbackTo[Double] = null
  ): Animation_ = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* num */ scala.Double) => easing(t0).runNow()))
    __obj.asInstanceOf[Animation_]
  }
}

