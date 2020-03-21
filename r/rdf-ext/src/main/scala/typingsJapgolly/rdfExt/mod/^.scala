package typingsJapgolly.rdfExt.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
class ^ ()
  extends typingsJapgolly.rdfExt.dataFactoryMod.^

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Parsers: SinkMap[EventEmitter, Stream] = js.native
  var Serializers: SinkMap[Stream, EventEmitter] = js.native
  def asEvent(p: js.Any): EventEmitter = js.native
  def waitFor(event: js.Any): js.Promise[_] = js.native
}

