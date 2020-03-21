package typingsJapgolly.rdfjsFormatsCommon

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.Stream
import typingsJapgolly.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/formats-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
}

