package typingsJapgolly.mapsjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapsjs.mod.geometry.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait beginDigitizeOptions extends js.Object {
  var circleEndAction: js.UndefOr[js.Function1[/* circle */ polygon, Unit]] = js.undefined
  var envelopeEndAction: js.UndefOr[js.Function1[/* env */ envelope, Unit]] = js.undefined
  var geometryStyle: js.UndefOr[typingsJapgolly.mapsjs.mod.geometryStyle] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var leavePath: js.UndefOr[Boolean] = js.undefined
  var nodeMoveAction: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* actionType */ String, _]] = js.undefined
  var nodeTapAndHoldAction: js.UndefOr[js.Function2[/* setIdx */ Double, /* idx */ Double, Boolean]] = js.undefined
  var shapeChangeAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shapeType: String
  var styledGeometry: js.UndefOr[typingsJapgolly.mapsjs.mod.styledGeometry] = js.undefined
  var suppressNodeAdd: js.UndefOr[Boolean] = js.undefined
}

object beginDigitizeOptions {
  @scala.inline
  def apply(
    shapeType: String,
    circleEndAction: /* circle */ polygon => Callback = null,
    envelopeEndAction: /* env */ envelope => Callback = null,
    geometryStyle: geometryStyle = null,
    key: String = null,
    leavePath: js.UndefOr[Boolean] = js.undefined,
    nodeMoveAction: (/* x */ Double, /* y */ Double, /* actionType */ String) => CallbackTo[js.Any] = null,
    nodeTapAndHoldAction: (/* setIdx */ Double, /* idx */ Double) => CallbackTo[Boolean] = null,
    shapeChangeAction: js.UndefOr[Callback] = js.undefined,
    styledGeometry: styledGeometry = null,
    suppressNodeAdd: js.UndefOr[Boolean] = js.undefined
  ): beginDigitizeOptions = {
    val __obj = js.Dynamic.literal(shapeType = shapeType.asInstanceOf[js.Any])
    if (circleEndAction != null) __obj.updateDynamic("circleEndAction")(js.Any.fromFunction1((t0: /* circle */ typingsJapgolly.mapsjs.mod.geometry.polygon) => circleEndAction(t0).runNow()))
    if (envelopeEndAction != null) __obj.updateDynamic("envelopeEndAction")(js.Any.fromFunction1((t0: /* env */ typingsJapgolly.mapsjs.mod.envelope) => envelopeEndAction(t0).runNow()))
    if (geometryStyle != null) __obj.updateDynamic("geometryStyle")(geometryStyle.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(leavePath)) __obj.updateDynamic("leavePath")(leavePath.asInstanceOf[js.Any])
    if (nodeMoveAction != null) __obj.updateDynamic("nodeMoveAction")(js.Any.fromFunction3((t0: /* x */ scala.Double, t1: /* y */ scala.Double, t2: /* actionType */ java.lang.String) => nodeMoveAction(t0, t1, t2).runNow()))
    if (nodeTapAndHoldAction != null) __obj.updateDynamic("nodeTapAndHoldAction")(js.Any.fromFunction2((t0: /* setIdx */ scala.Double, t1: /* idx */ scala.Double) => nodeTapAndHoldAction(t0, t1).runNow()))
    shapeChangeAction.foreach(p => __obj.updateDynamic("shapeChangeAction")(p.toJsFn))
    if (styledGeometry != null) __obj.updateDynamic("styledGeometry")(styledGeometry.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressNodeAdd)) __obj.updateDynamic("suppressNodeAdd")(suppressNodeAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[beginDigitizeOptions]
  }
}

