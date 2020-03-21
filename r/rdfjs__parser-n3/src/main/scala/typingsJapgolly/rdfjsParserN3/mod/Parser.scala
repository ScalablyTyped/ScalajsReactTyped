package typingsJapgolly.rdfjsParserN3.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.Sink
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[Q /* <: BaseQuad */] extends Sink[EventEmitter, Stream[Q]] {
  def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
}

