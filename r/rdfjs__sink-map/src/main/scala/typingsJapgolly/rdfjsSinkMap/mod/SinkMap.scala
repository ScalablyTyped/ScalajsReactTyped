package typingsJapgolly.rdfjsSinkMap.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.Sink
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends Map[String, Sink[InputStream, OutputStream]] {
  def `import`(mediaType: String, input: InputStream): OutputStream | Null = js.native
  def `import`(mediaType: String, input: InputStream, options: js.Any): OutputStream | Null = js.native
}

