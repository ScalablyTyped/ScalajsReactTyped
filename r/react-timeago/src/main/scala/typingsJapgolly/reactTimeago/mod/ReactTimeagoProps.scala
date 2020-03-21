package typingsJapgolly.reactTimeago.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTimeagoProps[T /* <: ComponentType[js.Object] */] extends js.Object {
  val component: js.UndefOr[String | T] = js.undefined
  val date: String | Double | js.Date
  val formatter: js.UndefOr[Formatter] = js.undefined
  val live: js.UndefOr[Boolean] = js.undefined
  val maxPeriod: js.UndefOr[Double] = js.undefined
  val minPeriod: js.UndefOr[Double] = js.undefined
  val now: js.UndefOr[js.Function0[Double]] = js.undefined
  val title: js.UndefOr[String] = js.undefined
}

object ReactTimeagoProps {
  @scala.inline
  def apply[T /* <: ComponentType[js.Object] */](
    date: String | Double | js.Date,
    component: String | T = null,
    formatter: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ]) => CallbackTo[Node] = null,
    live: js.UndefOr[Boolean] = js.undefined,
    maxPeriod: Int | Double = null,
    minPeriod: Int | Double = null,
    now: js.UndefOr[CallbackTo[Double]] = js.undefined,
    title: String = null
  ): ReactTimeagoProps[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction5((t0: /* value */ scala.Double, t1: /* unit */ typingsJapgolly.reactTimeago.mod.Unit, t2: /* suffix */ typingsJapgolly.reactTimeago.mod.Suffix, t3: /* epochMiliseconds */ scala.Double, t4: /* nextFormatter */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object]) => formatter(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (maxPeriod != null) __obj.updateDynamic("maxPeriod")(maxPeriod.asInstanceOf[js.Any])
    if (minPeriod != null) __obj.updateDynamic("minPeriod")(minPeriod.asInstanceOf[js.Any])
    now.foreach(p => __obj.updateDynamic("now")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTimeagoProps[T]]
  }
}

