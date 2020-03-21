package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
trait IUserResource extends js.Object {
  def disableUser(userId: Double): Unit
}

object IUserResource {
  @scala.inline
  def apply(disableUser: Double => Callback): IUserResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableUser")(js.Any.fromFunction1((t0: scala.Double) => disableUser(t0).runNow()))
    __obj.asInstanceOf[IUserResource]
  }
}

