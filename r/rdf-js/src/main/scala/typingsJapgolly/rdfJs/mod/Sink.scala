package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends js.Object {
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def `import`(stream: InputStream): OutputStream
}

object Sink {
  @scala.inline
  def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](`import`: InputStream => CallbackTo[OutputStream]): Sink[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: InputStream) => `import`(t0).runNow()))
    __obj.asInstanceOf[Sink[InputStream, OutputStream]]
  }
}

