package typingsJapgolly.pulumiKubernetes.inputMod.apps.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spec to control the desired behavior of daemon set rolling update.
  */
trait RollingUpdateDaemonSet extends js.Object {
  /**
    * The maximum number of DaemonSet pods that can be unavailable during the update. Value can
    * be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the
    * start of the update (ex: 10%). Absolute number is calculated from percentage by rounding
    * up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
    * the total number of nodes that should be running the daemon pod (i.e.
    * status.desiredNumberScheduled) can have their pods stopped for an update at any given time.
    * The update starts by stopping at most 30% of those DaemonSet pods and then brings up new
    * DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other
    * DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are
    * available at all times during the update.
    */
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
}

object RollingUpdateDaemonSet {
  @scala.inline
  def apply(maxUnavailable: Input[Double | String] = null): RollingUpdateDaemonSet = {
    val __obj = js.Dynamic.literal()
    if (maxUnavailable != null) __obj.updateDynamic("maxUnavailable")(maxUnavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateDaemonSet]
  }
}

