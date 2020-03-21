package typingsJapgolly.rdfjsSerializerJsonld.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.Sink
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
  def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
}

