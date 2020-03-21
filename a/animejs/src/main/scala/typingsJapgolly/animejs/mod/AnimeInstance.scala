package typingsJapgolly.animejs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeInstance extends AnimeCallBack {
  var animatables: js.Array[js.Object]
  var animations: js.Array[js.Object]
  var autoplay: Boolean
  var began: Boolean
  var completed: Boolean
  var currentTime: Double
  var delay: Double
  var direction: String
  var duration: Double
  var finished: js.Promise[Unit]
  var loop: Double | Boolean
  var paused: Boolean
  var progress: Double
  var remaining: Double
  var reversed: Boolean
  var timelineOffset: Double
  def pause(): Unit
  def play(): Unit
  def restart(): Unit
  def reverse(): Unit
  def seek(time: Double): Unit
}

object AnimeInstance {
  @scala.inline
  def apply(
    animatables: js.Array[js.Object],
    animations: js.Array[js.Object],
    autoplay: Boolean,
    began: Boolean,
    completed: Boolean,
    currentTime: Double,
    delay: Double,
    direction: String,
    duration: Double,
    finished: js.Promise[Unit],
    loop: Double | Boolean,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    progress: Double,
    remaining: Double,
    restart: Callback,
    reverse: Callback,
    reversed: Boolean,
    seek: Double => Callback,
    timelineOffset: Double,
    begin: /* anim */ AnimeInstance => Callback = null,
    change: /* anim */ AnimeInstance => Callback = null,
    changeBegin: /* anim */ AnimeInstance => Callback = null,
    changeComplete: /* anim */ AnimeInstance => Callback = null,
    complete: /* anim */ AnimeInstance => Callback = null,
    loopBegin: /* anim */ AnimeInstance => Callback = null,
    loopComplete: /* anim */ AnimeInstance => Callback = null,
    update: /* anim */ AnimeInstance => Callback = null
  ): AnimeInstance = {
    val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], began = began.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], timelineOffset = timelineOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => begin(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => change(t0).runNow()))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => changeBegin(t0).runNow()))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => changeComplete(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => complete(t0).runNow()))
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => loopBegin(t0).runNow()))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => loopComplete(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => update(t0).runNow()))
    __obj.asInstanceOf[AnimeInstance]
  }
}

