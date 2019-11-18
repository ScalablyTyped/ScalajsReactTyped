package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.error
import typingsJapgolly.electron.electronStrings.indeterminate
import typingsJapgolly.electron.electronStrings.none
import typingsJapgolly.electron.electronStrings.normal
import typingsJapgolly.electron.electronStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  /**
    * Mode for the progress bar. Can be none, normal, indeterminate, error or paused.
    */
  var mode: none | normal | indeterminate | error | paused
}

object ProgressBarOptions {
  @scala.inline
  def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

