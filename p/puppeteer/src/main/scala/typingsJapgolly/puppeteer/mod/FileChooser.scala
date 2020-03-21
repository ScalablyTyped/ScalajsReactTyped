package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChooser extends js.Object {
  /**
    * Accept the file chooser request with given paths.
    * If some of the filePaths are relative paths, then they are resolved relative to the current working directory.
    */
  def accept(filePaths: js.Array[String]): js.Promise[Unit]
  /** Closes the file chooser without selecting any files. */
  def cancel(): js.Promise[Unit]
  /** Whether file chooser allow for multiple file selection. */
  def isMultiple(): Boolean
}

object FileChooser {
  @scala.inline
  def apply(
    accept: js.Array[String] => CallbackTo[js.Promise[Unit]],
    cancel: CallbackTo[js.Promise[Unit]],
    isMultiple: CallbackTo[Boolean]
  ): FileChooser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => accept(t0).runNow()))
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("isMultiple")(isMultiple.toJsFn)
    __obj.asInstanceOf[FileChooser]
  }
}

