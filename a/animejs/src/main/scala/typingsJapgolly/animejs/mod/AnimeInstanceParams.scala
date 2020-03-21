package typingsJapgolly.animejs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeInstanceParams extends AnimeCallBack {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[DirectionOptions | String] = js.undefined
  var loop: js.UndefOr[Double | Boolean] = js.undefined
}

object AnimeInstanceParams {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    begin: /* anim */ AnimeInstance => Callback = null,
    change: /* anim */ AnimeInstance => Callback = null,
    changeBegin: /* anim */ AnimeInstance => Callback = null,
    changeComplete: /* anim */ AnimeInstance => Callback = null,
    complete: /* anim */ AnimeInstance => Callback = null,
    direction: DirectionOptions | String = null,
    loop: Double | Boolean = null,
    loopBegin: /* anim */ AnimeInstance => Callback = null,
    loopComplete: /* anim */ AnimeInstance => Callback = null,
    update: /* anim */ AnimeInstance => Callback = null
  ): AnimeInstanceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => begin(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => change(t0).runNow()))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => changeBegin(t0).runNow()))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => changeComplete(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => complete(t0).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => loopBegin(t0).runNow()))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => loopComplete(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* anim */ typingsJapgolly.animejs.mod.AnimeInstance) => update(t0).runNow()))
    __obj.asInstanceOf[AnimeInstanceParams]
  }
}

