package typingsJapgolly.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scheduler settings for standard environment.
  */
@js.native
trait SchemaStandardSchedulerSettings extends js.Object {
  /**
    * Maximum number of instances to run for this version. Set to zero to
    * disable max_instances configuration.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Minimum number of instances to run for this version. Set to zero to
    * disable min_instances configuration.
    */
  var minInstances: js.UndefOr[Double] = js.native
  /**
    * Target CPU utilization ratio to maintain when scaling.
    */
  var targetCpuUtilization: js.UndefOr[Double] = js.native
  /**
    * Target throughput utilization ratio to maintain when scaling
    */
  var targetThroughputUtilization: js.UndefOr[Double] = js.native
}

object SchemaStandardSchedulerSettings {
  @scala.inline
  def apply(
    maxInstances: Int | Double = null,
    minInstances: Int | Double = null,
    targetCpuUtilization: Int | Double = null,
    targetThroughputUtilization: Int | Double = null
  ): SchemaStandardSchedulerSettings = {
    val __obj = js.Dynamic.literal()
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (minInstances != null) __obj.updateDynamic("minInstances")(minInstances.asInstanceOf[js.Any])
    if (targetCpuUtilization != null) __obj.updateDynamic("targetCpuUtilization")(targetCpuUtilization.asInstanceOf[js.Any])
    if (targetThroughputUtilization != null) __obj.updateDynamic("targetThroughputUtilization")(targetThroughputUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStandardSchedulerSettings]
  }
}

