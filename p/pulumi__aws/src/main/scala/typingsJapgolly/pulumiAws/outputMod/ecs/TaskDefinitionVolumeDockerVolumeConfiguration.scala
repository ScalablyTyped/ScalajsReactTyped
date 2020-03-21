package typingsJapgolly.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolumeDockerVolumeConfiguration extends js.Object {
  /**
    * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
    */
  var autoprovision: js.UndefOr[Boolean] = js.native
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
    */
  var driver: js.UndefOr[String] = js.native
  /**
    * A map of Docker driver specific options.
    */
  var driverOpts: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A map of custom metadata to add to your Docker volume.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are `scoped` as shared persist after the task stops.
    */
  var scope: String = js.native
}

object TaskDefinitionVolumeDockerVolumeConfiguration {
  @scala.inline
  def apply(
    scope: String,
    autoprovision: js.UndefOr[Boolean] = js.undefined,
    driver: String = null,
    driverOpts: StringDictionary[String] = null,
    labels: StringDictionary[String] = null
  ): TaskDefinitionVolumeDockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (!js.isUndefined(autoprovision)) __obj.updateDynamic("autoprovision")(autoprovision.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (driverOpts != null) __obj.updateDynamic("driverOpts")(driverOpts.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeDockerVolumeConfiguration]
  }
}

