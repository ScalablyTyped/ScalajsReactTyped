package typingsJapgolly.rdfExt.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
  def find(mediaType: String): Sink[InputStream, OutputStream]
  def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any
  def list(): js.Array[String]
}

object SinkMap {
  @scala.inline
  def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](
    find: String => CallbackTo[Sink[InputStream, OutputStream]],
    `import`: (String, js.Any, js.Any) => CallbackTo[js.Any],
    list: CallbackTo[js.Array[String]],
    StringDictionary: /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] = null
  ): SinkMap[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Any) => `import`(t0, t1, t2).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
  }
}

