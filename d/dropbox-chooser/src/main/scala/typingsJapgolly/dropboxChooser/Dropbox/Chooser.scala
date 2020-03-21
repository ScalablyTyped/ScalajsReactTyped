package typingsJapgolly.dropboxChooser.Dropbox

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chooser extends js.Object {
  def choose(options: ChooserOptions): Unit
}

object Chooser {
  @scala.inline
  def apply(choose: ChooserOptions => Callback): Chooser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("choose")(js.Any.fromFunction1((t0: typingsJapgolly.dropboxChooser.Dropbox.ChooserOptions) => choose(t0).runNow()))
    __obj.asInstanceOf[Chooser]
  }
}

