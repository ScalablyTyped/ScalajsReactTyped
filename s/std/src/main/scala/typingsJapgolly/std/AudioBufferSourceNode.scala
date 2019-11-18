package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network. */
@js.native
trait AudioBufferSourceNode extends AudioScheduledSourceNode {
  var buffer: org.scalajs.dom.raw.AudioBuffer | Null = js.native
  val detune: org.scalajs.dom.raw.AudioParam = js.native
  var loop: scala.Boolean = js.native
  var loopEnd: Double = js.native
  var loopStart: Double = js.native
  val playbackRate: org.scalajs.dom.raw.AudioParam = js.native
  def start(when: Double, offset: Double): Unit = js.native
  def start(when: Double, offset: Double, duration: Double): Unit = js.native
}

@JSGlobal("AudioBufferSourceNode")
@js.native
object AudioBufferSourceNode
  extends Instantiable1[/* context */ BaseAudioContext, AudioBufferSourceNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ AudioBufferSourceOptions, 
      AudioBufferSourceNode
    ]

