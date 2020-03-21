package typingsJapgolly.angularAgility.aa

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidIconStrategy extends js.Object {
  var invalidIcon: String
  var validIcon: String
  def getContainer(element: IAugmentedJQueryStatic): Unit
}

object IValidIconStrategy {
  @scala.inline
  def apply(getContainer: IAugmentedJQueryStatic => Callback, invalidIcon: String, validIcon: String): IValidIconStrategy = {
    val __obj = js.Dynamic.literal(invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("getContainer")(js.Any.fromFunction1((t0: typingsJapgolly.angular.mod.IAugmentedJQueryStatic) => getContainer(t0).runNow()))
    __obj.asInstanceOf[IValidIconStrategy]
  }
}

