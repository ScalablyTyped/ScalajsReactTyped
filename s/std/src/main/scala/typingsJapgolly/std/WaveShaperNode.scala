package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A WaveShaperNode always has exactly one input and one output. */
@js.native
trait WaveShaperNode extends AudioNode {
  var curve: scala.scalajs.js.typedarray.Float32Array | Null = js.native
  var oversample: OverSampleType = js.native
}

@JSGlobal("WaveShaperNode")
@js.native
object WaveShaperNode
  extends Instantiable1[/* context */ BaseAudioContext, WaveShaperNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ WaveShaperOptions, WaveShaperNode]

