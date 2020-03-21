package typingsJapgolly.dropzone.mod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dropzone.mod.Dropzone
import typingsJapgolly.dropzone.mod.DropzoneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def dropzone(options: DropzoneOptions): Dropzone
}

object JQuery {
  @scala.inline
  def apply(dropzone: DropzoneOptions => CallbackTo[Dropzone]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropzone")(js.Any.fromFunction1((t0: typingsJapgolly.dropzone.mod.DropzoneOptions) => dropzone(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

