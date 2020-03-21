package typingsJapgolly.chromeApps.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.getVoices")
@js.native
object getVoices extends js.Object {
  /** Gets an array of all available voices. */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = js.native
}

