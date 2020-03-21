package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the watch that generates program using the root files and compiler options
  */
trait WatchOfFilesAndCompilerOptions[T] extends Watch[T] {
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[java.lang.String]): Unit
}

object WatchOfFilesAndCompilerOptions {
  @scala.inline
  def apply[T](
    close: Callback,
    getProgram: CallbackTo[T],
    updateRootFileNames: js.Array[java.lang.String] => Callback
  ): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getProgram")(getProgram.toJsFn)
    __obj.updateDynamic("updateRootFileNames")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => updateRootFileNames(t0).runNow()))
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
}

