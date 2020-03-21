package typingsJapgolly.aframe

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.System<any>> */
trait PartialSystemany extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  var schema: js.UndefOr[Schema_[_]] = js.undefined
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
}

object PartialSystemany {
  @scala.inline
  def apply(
    data: js.Any = null,
    init: js.UndefOr[Callback] = js.undefined,
    pause: js.UndefOr[Callback] = js.undefined,
    play: js.UndefOr[Callback] = js.undefined,
    schema: Schema_[_] = null,
    tick: (/* t */ Double, /* dt */ Double) => Callback = null
  ): PartialSystemany = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    pause.foreach(p => __obj.updateDynamic("pause")(p.toJsFn))
    play.foreach(p => __obj.updateDynamic("play")(p.toJsFn))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2((t0: /* t */ scala.Double, t1: /* dt */ scala.Double) => tick(t0, t1).runNow()))
    __obj.asInstanceOf[PartialSystemany]
  }
}

