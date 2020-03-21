package typingsJapgolly.pixiSpine.PIXI.spine.core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateListener extends js.Object {
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, Unit]] = js.undefined
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
}

object AnimationStateListener {
  @scala.inline
  def apply(
    complete: /* entry */ TrackEntry => Callback = null,
    dispose: /* entry */ TrackEntry => Callback = null,
    end: /* entry */ TrackEntry => Callback = null,
    event: (/* entry */ TrackEntry, /* event */ Event) => Callback = null,
    interrupt: /* entry */ TrackEntry => Callback = null,
    start: /* entry */ TrackEntry => Callback = null
  ): AnimationStateListener = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry) => complete(t0).runNow()))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry) => dispose(t0).runNow()))
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry) => end(t0).runNow()))
    if (event != null) __obj.updateDynamic("event")(js.Any.fromFunction2((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry, t1: /* event */ typingsJapgolly.pixiSpine.PIXI.spine.core.Event) => event(t0, t1).runNow()))
    if (interrupt != null) __obj.updateDynamic("interrupt")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry) => interrupt(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.pixiSpine.PIXI.spine.core.TrackEntry) => start(t0).runNow()))
    __obj.asInstanceOf[AnimationStateListener]
  }
}

