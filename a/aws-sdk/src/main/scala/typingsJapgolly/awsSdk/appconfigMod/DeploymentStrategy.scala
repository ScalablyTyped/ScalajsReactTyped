package typingsJapgolly.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentStrategy extends js.Object {
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The description of the deployment strategy.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Description] = js.native
  /**
    * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets that received a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.GrowthType] = js.native
  /**
    * The deployment strategy ID.
    */
  var Id: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Id] = js.native
  /**
    * The name of the deployment strategy.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Name] = js.native
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.ReplicateTo] = js.native
}

object DeploymentStrategy {
  @scala.inline
  def apply(
    DeploymentDurationInMinutes: Int | Double = null,
    Description: Description = null,
    FinalBakeTimeInMinutes: Int | Double = null,
    GrowthFactor: Int | Double = null,
    GrowthType: GrowthType = null,
    Id: Id = null,
    Name: Name = null,
    ReplicateTo: ReplicateTo = null
  ): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    if (DeploymentDurationInMinutes != null) __obj.updateDynamic("DeploymentDurationInMinutes")(DeploymentDurationInMinutes.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FinalBakeTimeInMinutes != null) __obj.updateDynamic("FinalBakeTimeInMinutes")(FinalBakeTimeInMinutes.asInstanceOf[js.Any])
    if (GrowthFactor != null) __obj.updateDynamic("GrowthFactor")(GrowthFactor.asInstanceOf[js.Any])
    if (GrowthType != null) __obj.updateDynamic("GrowthType")(GrowthType.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ReplicateTo != null) __obj.updateDynamic("ReplicateTo")(ReplicateTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStrategy]
  }
}

