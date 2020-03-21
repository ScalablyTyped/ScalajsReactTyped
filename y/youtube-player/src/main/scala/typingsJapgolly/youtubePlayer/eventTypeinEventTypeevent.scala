package typingsJapgolly.youtubePlayer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
trait eventTypeinEventTypeevent extends js.Object {
  var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
}

object eventTypeinEventTypeevent {
  @scala.inline
  def apply(
    apiChange: /* event */ CustomEvent => Callback = null,
    error: /* event */ CustomEvent => Callback = null,
    playbackQualityChange: /* event */ CustomEvent => Callback = null,
    playbackRateChange: /* event */ CustomEvent => Callback = null,
    ready: /* event */ CustomEvent => Callback = null,
    stateChange: /* event */ CustomEvent => Callback = null,
    volumeChange: /* event */ CustomEvent => Callback = null
  ): eventTypeinEventTypeevent = {
    val __obj = js.Dynamic.literal()
    if (apiChange != null) __obj.updateDynamic("apiChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => apiChange(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => error(t0).runNow()))
    if (playbackQualityChange != null) __obj.updateDynamic("playbackQualityChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => playbackQualityChange(t0).runNow()))
    if (playbackRateChange != null) __obj.updateDynamic("playbackRateChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => playbackRateChange(t0).runNow()))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => ready(t0).runNow()))
    if (stateChange != null) __obj.updateDynamic("stateChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => stateChange(t0).runNow()))
    if (volumeChange != null) __obj.updateDynamic("volumeChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => volumeChange(t0).runNow()))
    __obj.asInstanceOf[eventTypeinEventTypeevent]
  }
}

