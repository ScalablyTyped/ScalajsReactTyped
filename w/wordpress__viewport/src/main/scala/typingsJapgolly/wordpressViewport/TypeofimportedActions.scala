package typingsJapgolly.wordpressViewport

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedActions extends js.Object {
  def setIsMatching(values: Record[String, Boolean]): Unit
}

object TypeofimportedActions {
  @scala.inline
  def apply(setIsMatching: Record[String, Boolean] => Callback): TypeofimportedActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setIsMatching")(js.Any.fromFunction1((t0: typingsJapgolly.std.Record[java.lang.String, scala.Boolean]) => setIsMatching(t0).runNow()))
    __obj.asInstanceOf[TypeofimportedActions]
  }
}

