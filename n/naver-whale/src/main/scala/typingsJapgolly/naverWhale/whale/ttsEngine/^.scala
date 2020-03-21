package typingsJapgolly.naverWhale.whale.ttsEngine

import typingsJapgolly.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.ttsEngine")
@js.native
object ^ extends js.Object {
  var onPause: Event[js.Function0[Unit]] = js.native
  var onResume: Event[js.Function0[Unit]] = js.native
  var onSpeak: typingsJapgolly.chrome.chrome.ttsEngine.TtsEngineSpeakEvent = js.native
  var onStop: Event[js.Function0[Unit]] = js.native
}

