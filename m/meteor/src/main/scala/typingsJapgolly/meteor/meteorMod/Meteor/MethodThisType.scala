package typingsJapgolly.meteor.meteorMod.Meteor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error **/
/** Method **/
trait MethodThisType extends js.Object {
  var connection: Connection | Null
  var isSimulation: Boolean
  var userId: String | Null
  def setUserId(userId: String): Unit
  def unblock(): Unit
}

object MethodThisType {
  @scala.inline
  def apply(
    isSimulation: Boolean,
    setUserId: String => Callback,
    unblock: Callback,
    connection: Connection = null,
    userId: String = null
  ): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation.asInstanceOf[js.Any])
    __obj.updateDynamic("setUserId")(js.Any.fromFunction1((t0: java.lang.String) => setUserId(t0).runNow()))
    __obj.updateDynamic("unblock")(unblock.toJsFn)
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodThisType]
  }
}

