package typingsJapgolly.reactStarRatingComponent.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingComponentProps extends js.Object {
  /** is component available for editing, default `true` */
  var editing: js.UndefOr[Boolean] = js.undefined
  /** color of non-selected icons */
  var emptyStarColor: js.UndefOr[String] = js.undefined
  /** name of the radio input */
  var name: String
  var onStarClick: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.undefined
  var onStarHover: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.undefined
  var onStarHoverOut: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.undefined
  /** render method for the full-star icon */
  var renderStarIcon: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Node | String]
  ] = js.undefined
  /** render method for the half-star icon */
  var renderStarIconHalf: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Node | String]
  ] = js.undefined
  /** color of selected icons */
  var starColor: js.UndefOr[String] = js.undefined
  /** number of icons in rating, default `5` */
  var starCount: js.UndefOr[Double] = js.undefined
  /** the value of the star rating to display. i.e. the number of filled stars */
  var value: Double
}

object StarRatingComponentProps {
  @scala.inline
  def apply(
    name: String,
    value: Double,
    editing: js.UndefOr[Boolean] = js.undefined,
    emptyStarColor: String = null,
    onStarClick: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    onStarHover: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    onStarHoverOut: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    renderStarIcon: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => CallbackTo[Node | String] = null,
    renderStarIconHalf: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => CallbackTo[Node | String] = null,
    starColor: String = null,
    starCount: Int | Double = null
  ): StarRatingComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (onStarClick != null) __obj.updateDynamic("onStarClick")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarClick(t0, t1, t2).runNow()))
    if (onStarHover != null) __obj.updateDynamic("onStarHover")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarHover(t0, t1, t2).runNow()))
    if (onStarHoverOut != null) __obj.updateDynamic("onStarHoverOut")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarHoverOut(t0, t1, t2).runNow()))
    if (renderStarIcon != null) __obj.updateDynamic("renderStarIcon")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => renderStarIcon(t0, t1, t2).runNow()))
    if (renderStarIconHalf != null) __obj.updateDynamic("renderStarIconHalf")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => renderStarIconHalf(t0, t1, t2).runNow()))
    if (starColor != null) __obj.updateDynamic("starColor")(starColor.asInstanceOf[js.Any])
    if (starCount != null) __obj.updateDynamic("starCount")(starCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingComponentProps]
  }
}

