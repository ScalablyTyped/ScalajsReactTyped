package typingsJapgolly.reactFileReaderInput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * what format the `FileReader` should read the file as
    * (i.e., `'buffer'`, `'binary'`, `'url'`, `'text'`).
    *
    * Defaults to `'url'`.
    */
  var as: js.UndefOr[Format] = js.undefined
  /**
    * Callback function called when the files are choosen by the user.
    *
    * Results will be an array of arrays, the size of which depending
    * on how many files were selected.
    *
    * Each result will be an array of two items:
    *
    * `progressEvent`: `result[0]` is a `ProgressEvent` object.
    * You can retrieve the raw results at `progressEvent.target.result`
    * among other things.
    *
    * `file`: `result[1]` is a `File` object. You can retrieve the file name
    * at file.name among other things.
    *
    * @param event The event that triggered file changes
    * @param results The array of files
    */
  def onChange(event: ReactEventFrom[Element], results: js.Array[Result]): Unit
}

object Props {
  @scala.inline
  def apply(onChange: (ReactEventFrom[Element], js.Array[Result]) => Callback, as: Format = null): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: js.Array[typingsJapgolly.reactFileReaderInput.mod.Result]) => onChange(t0, t1).runNow()))
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

