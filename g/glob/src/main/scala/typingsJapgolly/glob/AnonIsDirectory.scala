package typingsJapgolly.glob

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsDirectory extends js.Object {
  def isDirectory(): Boolean
}

object AnonIsDirectory {
  @scala.inline
  def apply(isDirectory: CallbackTo[Boolean]): AnonIsDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.asInstanceOf[AnonIsDirectory]
  }
}

