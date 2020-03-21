package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateListener2 extends js.Object {
  def complete(entry: TrackEntry): Unit
  def dispose(entry: TrackEntry): Unit
  def end(entry: TrackEntry): Unit
  def event(entry: TrackEntry, event: Event): Unit
  def interrupt(entry: TrackEntry): Unit
  def start(entry: TrackEntry): Unit
}

object AnimationStateListener2 {
  @scala.inline
  def apply(
    complete: TrackEntry => Callback,
    dispose: TrackEntry => Callback,
    end: TrackEntry => Callback,
    event: (TrackEntry, Event) => Callback,
    interrupt: TrackEntry => Callback,
    start: TrackEntry => Callback
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.spine.TrackEntry) => complete(t0).runNow()))
    __obj.updateDynamic("dispose")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.spine.TrackEntry) => dispose(t0).runNow()))
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.spine.TrackEntry) => end(t0).runNow()))
    __obj.updateDynamic("event")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.spine.TrackEntry, t1: typingsJapgolly.phaser.spine.Event) => event(t0, t1).runNow()))
    __obj.updateDynamic("interrupt")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.spine.TrackEntry) => interrupt(t0).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.spine.TrackEntry) => start(t0).runNow()))
    __obj.asInstanceOf[AnimationStateListener2]
  }
}

