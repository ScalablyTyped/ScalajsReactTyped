package typingsJapgolly.hark.mod

import typingsJapgolly.hark.harkStrings.speaking
import typingsJapgolly.hark.harkStrings.state_change
import typingsJapgolly.hark.harkStrings.stopped_speaking
import typingsJapgolly.hark.harkStrings.volume_change
import typingsJapgolly.std.AudioContextState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Harker extends js.Object {
  var speaking: Boolean = js.native
  var speakingHistory: js.Array[Double] = js.native
  val state: AudioContextState = js.native
  @JSName("on")
  def on_speaking(event: speaking, listener: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_statechange(event: state_change, listener: js.Function1[/* state */ AudioContextState, Unit]): Unit = js.native
  @JSName("on")
  def on_stoppedspeaking(event: stopped_speaking, listener: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_volumechange(
    event: volume_change,
    listener: js.Function2[/* currentVolume */ Double, /* threshold */ Double, Unit]
  ): Unit = js.native
  def resume(): js.Promise[Unit] = js.native
  def setInterval(i: Double): Unit = js.native
  def setThreshold(t: Double): Unit = js.native
  def stop(): Unit = js.native
  def suspend(): js.Promise[Unit] = js.native
}

