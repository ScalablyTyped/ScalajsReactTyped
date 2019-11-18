package typingsJapgolly.atMaterialDashUiCore.stylesTransitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atMaterialDashUiCore.PartialDuration
import typingsJapgolly.atMaterialDashUiCore.PartialEasing
import typingsJapgolly.atMaterialDashUiCore.Partialdurationnumberstringeasingstringdelaynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ String | js.Array[String], 
      /* options */ js.UndefOr[Partialdurationnumberstringeasingstringdelaynumber], 
      String
    ]
  ] = js.undefined
  var duration: js.UndefOr[PartialDuration] = js.undefined
  var easing: js.UndefOr[PartialEasing] = js.undefined
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.undefined
}

object TransitionsOptions {
  @scala.inline
  def apply(
    create: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstringeasingstringdelaynumber]) => CallbackTo[String] = null,
    duration: PartialDuration = null,
    easing: PartialEasing = null,
    getAutoHeightDuration: /* height */ Double => CallbackTo[Double] = null
  ): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* props */ java.lang.String | js.Array[java.lang.String], t1: /* options */ js.UndefOr[
  typingsJapgolly.atMaterialDashUiCore.Partialdurationnumberstringeasingstringdelaynumber]) => create(t0, t1).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (getAutoHeightDuration != null) __obj.updateDynamic("getAutoHeightDuration")(js.Any.fromFunction1((t0: /* height */ scala.Double) => getAutoHeightDuration(t0).runNow()))
    __obj.asInstanceOf[TransitionsOptions]
  }
}

