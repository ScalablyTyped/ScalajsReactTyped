package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "StreamSink")
@js.native
class StreamSink[A] ()
  extends typingsJapgolly.sodiumjs.streamSinkMod.StreamSink[A] {
  def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
  def this(f: Lambda2_[A, A, A]) = this()
}

