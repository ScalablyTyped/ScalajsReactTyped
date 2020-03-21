package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityMediaPlayer extends js.Object {
  def getPlaybackstate(response: js.Function): js.Any
  def onNext(onNextCallback: js.Function): js.Any
  def onPlayPause(onPlayPauseCallback: js.Function): js.Any
  def onPrevious(onPreviousCallback: js.Function): js.Any
  def setCanGoNext(cangonext: Boolean): js.Any
  def setCanGoPrev(cangoprev: Boolean): js.Any
  def setCanPause(canpause: Boolean): js.Any
  def setCanPlay(canplay: Boolean): js.Any
  def setPlaybackstate(state: UnityPlaybackState): js.Any
  def setTrack(trackMetadata: UnityTrackMetadata): js.Any
}

object UnityMediaPlayer {
  @scala.inline
  def apply(
    getPlaybackstate: js.Function => CallbackTo[js.Any],
    onNext: js.Function => CallbackTo[js.Any],
    onPlayPause: js.Function => CallbackTo[js.Any],
    onPrevious: js.Function => CallbackTo[js.Any],
    setCanGoNext: Boolean => CallbackTo[js.Any],
    setCanGoPrev: Boolean => CallbackTo[js.Any],
    setCanPause: Boolean => CallbackTo[js.Any],
    setCanPlay: Boolean => CallbackTo[js.Any],
    setPlaybackstate: UnityPlaybackState => CallbackTo[js.Any],
    setTrack: UnityTrackMetadata => CallbackTo[js.Any]
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPlaybackstate")(js.Any.fromFunction1((t0: js.Function) => getPlaybackstate(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: js.Function) => onNext(t0).runNow()))
    __obj.updateDynamic("onPlayPause")(js.Any.fromFunction1((t0: js.Function) => onPlayPause(t0).runNow()))
    __obj.updateDynamic("onPrevious")(js.Any.fromFunction1((t0: js.Function) => onPrevious(t0).runNow()))
    __obj.updateDynamic("setCanGoNext")(js.Any.fromFunction1((t0: scala.Boolean) => setCanGoNext(t0).runNow()))
    __obj.updateDynamic("setCanGoPrev")(js.Any.fromFunction1((t0: scala.Boolean) => setCanGoPrev(t0).runNow()))
    __obj.updateDynamic("setCanPause")(js.Any.fromFunction1((t0: scala.Boolean) => setCanPause(t0).runNow()))
    __obj.updateDynamic("setCanPlay")(js.Any.fromFunction1((t0: scala.Boolean) => setCanPlay(t0).runNow()))
    __obj.updateDynamic("setPlaybackstate")(js.Any.fromFunction1((t0: typingsJapgolly.unityWebapi.UnityPlaybackState) => setPlaybackstate(t0).runNow()))
    __obj.updateDynamic("setTrack")(js.Any.fromFunction1((t0: typingsJapgolly.unityWebapi.UnityTrackMetadata) => setTrack(t0).runNow()))
    __obj.asInstanceOf[UnityMediaPlayer]
  }
}

