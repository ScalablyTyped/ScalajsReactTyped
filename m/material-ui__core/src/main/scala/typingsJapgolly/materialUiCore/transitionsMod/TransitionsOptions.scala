package typingsJapgolly.materialUiCore.transitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialUiCore.PartialDuration
import typingsJapgolly.materialUiCore.PartialEasing
import typingsJapgolly.materialUiCore.Partialdurationnumberstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ String | js.Array[String], 
      /* options */ js.UndefOr[Partialdurationnumberstri], 
      String
    ]
  ] = js.native
  var duration: js.UndefOr[PartialDuration] = js.native
  var easing: js.UndefOr[PartialEasing] = js.native
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.native
}

object TransitionsOptions {
  @scala.inline
  def apply(
    create: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstri]) => CallbackTo[String] = null,
    duration: PartialDuration = null,
    easing: PartialEasing = null,
    getAutoHeightDuration: /* height */ Double => CallbackTo[Double] = null
  ): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* props */ java.lang.String | js.Array[java.lang.String], t1: /* options */ js.UndefOr[typingsJapgolly.materialUiCore.Partialdurationnumberstri]) => create(t0, t1).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (getAutoHeightDuration != null) __obj.updateDynamic("getAutoHeightDuration")(js.Any.fromFunction1((t0: /* height */ scala.Double) => getAutoHeightDuration(t0).runNow()))
    __obj.asInstanceOf[TransitionsOptions]
  }
}

