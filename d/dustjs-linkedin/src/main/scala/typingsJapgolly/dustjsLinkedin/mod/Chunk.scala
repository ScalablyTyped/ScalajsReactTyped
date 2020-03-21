package typingsJapgolly.dustjsLinkedin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  /**
    * Writes data to this chunk's buffer and marks it as flushable. This method must be called on any chunks created via chunk.map. Do not call this method on a handler's main chunk -- dust.render and dust.stream take care of this for you.
    */
  def end(data: String): Chunk
  /**
    * Creates a new chunk and passes it to callback. Use map to wrap asynchronous functions and to partition the template for streaming.
    */
  def map(callback: js.Function1[/* chunk */ this.type, _]): Chunk
  /**
    * Renders a template block, such as a default block or an else block.
    */
  def render(body: js.Any, context: Context): Chunk
  /**
    * Sets an error on this chunk and immediately flushes the output.
    */
  def setError(err: js.Any): Chunk
  /**
    * Convenience method to apply filters to a stream.
    */
  def tap(callback: js.Function1[/* value */ js.Any, _]): Chunk
  /**
    * Removes the head tap function from the list.
    */
  def untap(): Chunk
  /**
    * Writes data to this chunk's buffer. 
    */
  def write(data: String): Chunk
}

object Chunk {
  @scala.inline
  def apply(
    end: String => CallbackTo[Chunk],
    map: js.Function1[Chunk, js.Any] => CallbackTo[Chunk],
    render: (js.Any, Context) => CallbackTo[Chunk],
    setError: js.Any => CallbackTo[Chunk],
    tap: js.Function1[/* value */ js.Any, js.Any] => CallbackTo[Chunk],
    untap: CallbackTo[Chunk],
    write: String => CallbackTo[Chunk]
  ): Chunk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: java.lang.String) => end(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.dustjsLinkedin.mod.Chunk, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.dustjsLinkedin.mod.Context) => render(t0, t1).runNow()))
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: js.Any) => setError(t0).runNow()))
    __obj.updateDynamic("tap")(js.Any.fromFunction1((t0: js.Function1[/* value */ js.Any, js.Any]) => tap(t0).runNow()))
    __obj.updateDynamic("untap")(untap.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[Chunk]
  }
}

