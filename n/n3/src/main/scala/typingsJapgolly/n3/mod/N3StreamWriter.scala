package typingsJapgolly.n3.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.Sink
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typingsJapgolly.rdfJs.mod.BaseQuad */]
  extends ReadableStream
     with WritableStream
     with Sink[Stream[Q], EventEmitter]

