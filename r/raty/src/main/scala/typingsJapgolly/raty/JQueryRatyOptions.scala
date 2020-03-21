package typingsJapgolly.raty

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRatyOptions extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var cancelClass: js.UndefOr[String] = js.undefined
  var cancelHint: js.UndefOr[String] = js.undefined
  var cancelOff: js.UndefOr[String] = js.undefined
  var cancelOn: js.UndefOr[String] = js.undefined
  var cancelPlace: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  var half: js.UndefOr[Boolean] = js.undefined
  var halfShow: js.UndefOr[Boolean] = js.undefined
  var hints: js.UndefOr[js.Array[String]] = js.undefined
  var iconRange: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  var mouseout: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  var mouseover: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  var noRatedMsg: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var numberMax: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[JQueryRatyRoundingOptions] = js.undefined
  var score: js.UndefOr[Double] = js.undefined
  var scoreName: js.UndefOr[String] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var space: js.UndefOr[Boolean] = js.undefined
  var starHalf: js.UndefOr[String] = js.undefined
  var starOff: js.UndefOr[String] = js.undefined
  var starOn: js.UndefOr[String] = js.undefined
  var starType: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var targetFormat: js.UndefOr[String] = js.undefined
  var targetKeep: js.UndefOr[Boolean] = js.undefined
  var targetScore: js.UndefOr[String] = js.undefined
  var targetText: js.UndefOr[String] = js.undefined
  var targetType: js.UndefOr[String] = js.undefined
}

object JQueryRatyOptions {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cancelClass: String = null,
    cancelHint: String = null,
    cancelOff: String = null,
    cancelOn: String = null,
    cancelPlace: String = null,
    click: (/* score */ Double, /* event */ JQueryEventObject) => Callback = null,
    half: js.UndefOr[Boolean] = js.undefined,
    halfShow: js.UndefOr[Boolean] = js.undefined,
    hints: js.Array[String] = null,
    iconRange: js.Array[js.Array[_]] = null,
    mouseout: (/* score */ Double, /* event */ JQueryEventObject) => Callback = null,
    mouseover: (/* score */ Double, /* event */ JQueryEventObject) => Callback = null,
    noRatedMsg: String = null,
    number: Int | Double = null,
    numberMax: Int | Double = null,
    path: String = null,
    precision: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    round: JQueryRatyRoundingOptions = null,
    score: Int | Double = null,
    scoreName: String = null,
    single: js.UndefOr[Boolean] = js.undefined,
    space: js.UndefOr[Boolean] = js.undefined,
    starHalf: String = null,
    starOff: String = null,
    starOn: String = null,
    starType: String = null,
    target: String = null,
    targetFormat: String = null,
    targetKeep: js.UndefOr[Boolean] = js.undefined,
    targetScore: String = null,
    targetText: String = null,
    targetType: String = null
  ): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cancelClass != null) __obj.updateDynamic("cancelClass")(cancelClass.asInstanceOf[js.Any])
    if (cancelHint != null) __obj.updateDynamic("cancelHint")(cancelHint.asInstanceOf[js.Any])
    if (cancelOff != null) __obj.updateDynamic("cancelOff")(cancelOff.asInstanceOf[js.Any])
    if (cancelOn != null) __obj.updateDynamic("cancelOn")(cancelOn.asInstanceOf[js.Any])
    if (cancelPlace != null) __obj.updateDynamic("cancelPlace")(cancelPlace.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2((t0: /* score */ scala.Double, t1: /* event */ typingsJapgolly.jquery.JQueryEventObject) => click(t0, t1).runNow()))
    if (!js.isUndefined(half)) __obj.updateDynamic("half")(half.asInstanceOf[js.Any])
    if (!js.isUndefined(halfShow)) __obj.updateDynamic("halfShow")(halfShow.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (iconRange != null) __obj.updateDynamic("iconRange")(iconRange.asInstanceOf[js.Any])
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction2((t0: /* score */ scala.Double, t1: /* event */ typingsJapgolly.jquery.JQueryEventObject) => mouseout(t0, t1).runNow()))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction2((t0: /* score */ scala.Double, t1: /* event */ typingsJapgolly.jquery.JQueryEventObject) => mouseover(t0, t1).runNow()))
    if (noRatedMsg != null) __obj.updateDynamic("noRatedMsg")(noRatedMsg.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (numberMax != null) __obj.updateDynamic("numberMax")(numberMax.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (scoreName != null) __obj.updateDynamic("scoreName")(scoreName.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (starHalf != null) __obj.updateDynamic("starHalf")(starHalf.asInstanceOf[js.Any])
    if (starOff != null) __obj.updateDynamic("starOff")(starOff.asInstanceOf[js.Any])
    if (starOn != null) __obj.updateDynamic("starOn")(starOn.asInstanceOf[js.Any])
    if (starType != null) __obj.updateDynamic("starType")(starType.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetFormat != null) __obj.updateDynamic("targetFormat")(targetFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(targetKeep)) __obj.updateDynamic("targetKeep")(targetKeep.asInstanceOf[js.Any])
    if (targetScore != null) __obj.updateDynamic("targetScore")(targetScore.asInstanceOf[js.Any])
    if (targetText != null) __obj.updateDynamic("targetText")(targetText.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRatyOptions]
  }
}

