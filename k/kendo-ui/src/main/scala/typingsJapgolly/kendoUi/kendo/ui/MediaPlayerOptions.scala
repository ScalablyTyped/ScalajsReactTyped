package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerOptions extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoRepeat: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
  var forwardSeek: js.UndefOr[Boolean] = js.undefined
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  var media: js.UndefOr[MediaPlayerMedia] = js.undefined
  var messages: js.UndefOr[MediaPlayerMessages] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var pause: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
  var play: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
  var ready: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
  var timeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var volumeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.undefined
}

object MediaPlayerOptions {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoRepeat: js.UndefOr[Boolean] = js.undefined,
    end: /* e */ MediaPlayerEvent => Callback = null,
    forwardSeek: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    media: MediaPlayerMedia = null,
    messages: MediaPlayerMessages = null,
    mute: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    pause: /* e */ MediaPlayerEvent => Callback = null,
    play: /* e */ MediaPlayerEvent => Callback = null,
    ready: /* e */ MediaPlayerEvent => Callback = null,
    timeChange: /* e */ MediaPlayerEvent => Callback = null,
    volume: Int | Double = null,
    volumeChange: /* e */ MediaPlayerEvent => Callback = null
  ): MediaPlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRepeat)) __obj.updateDynamic("autoRepeat")(autoRepeat.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => end(t0).runNow()))
    if (!js.isUndefined(forwardSeek)) __obj.updateDynamic("forwardSeek")(forwardSeek.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => pause(t0).runNow()))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => play(t0).runNow()))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => ready(t0).runNow()))
    if (timeChange != null) __obj.updateDynamic("timeChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => timeChange(t0).runNow()))
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (volumeChange != null) __obj.updateDynamic("volumeChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MediaPlayerEvent) => volumeChange(t0).runNow()))
    __obj.asInstanceOf[MediaPlayerOptions]
  }
}

