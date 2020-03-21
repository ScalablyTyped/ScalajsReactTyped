package typingsJapgolly.firebaseAdmin.admin.instanceId

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets the {@link admin.instanceId.InstanceId `InstanceId`} service for the
  * current app.
  *
  * @example
  * ```javascript
  * var instanceId = app.instanceId();
  * // The above is shorthand for:
  * // var instanceId = admin.instanceId(app);
  * ```
  *
  * @return The `InstanceId` service for the
  *   current app.
  */
trait InstanceId extends js.Object {
  var app: App
  /**
    * Deletes the specified instance ID and the associated data from Firebase.
    *
    * Note that Google Analytics for Firebase uses its own form of Instance ID to
    * keep track of analytics data. Therefore deleting a Firebase Instance ID does
    * not delete Analytics data. See
    * [Delete an Instance ID](/support/privacy/manage-iids#delete_an_instance_id)
    * for more information.
    *
    * @param instanceId The instance ID to be deleted.
    *
    * @return A promise fulfilled when the instance ID is deleted.
    */
  def deleteInstanceId(instanceId: String): js.Promise[Unit]
}

object InstanceId {
  @scala.inline
  def apply(app: App, deleteInstanceId: String => CallbackTo[js.Promise[Unit]]): InstanceId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.updateDynamic("deleteInstanceId")(js.Any.fromFunction1((t0: java.lang.String) => deleteInstanceId(t0).runNow()))
    __obj.asInstanceOf[InstanceId]
  }
}

