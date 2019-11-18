package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDomTokenList extends js.Object {
  def add(token: String): Unit
  def remove(token: String): Unit
}

object RDomTokenList {
  @scala.inline
  def apply(add: String => Callback, remove: String => Callback): RDomTokenList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: java.lang.String) => add(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[RDomTokenList]
  }
}

