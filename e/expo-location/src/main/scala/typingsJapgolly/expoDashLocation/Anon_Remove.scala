package typingsJapgolly.expoDashLocation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remove extends js.Object {
  def remove(): Unit
}

object Anon_Remove {
  @scala.inline
  def apply(remove: Callback): Anon_Remove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[Anon_Remove]
  }
}

