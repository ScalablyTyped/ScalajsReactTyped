package typingsJapgolly.web3Bzz.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pick extends js.Object {
  def data(): js.Promise[_]
  def directory(): js.Promise[_]
  def file(): js.Promise[_]
}

object Pick {
  @scala.inline
  def apply(
    data: CallbackTo[js.Promise[js.Any]],
    directory: CallbackTo[js.Promise[js.Any]],
    file: CallbackTo[js.Promise[js.Any]]
  ): Pick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.toJsFn)
    __obj.updateDynamic("directory")(directory.toJsFn)
    __obj.updateDynamic("file")(file.toJsFn)
    __obj.asInstanceOf[Pick]
  }
}

