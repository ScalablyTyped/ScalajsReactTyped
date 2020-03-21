package typingsJapgolly.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeRegionControl extends js.Object {
  /**
    * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-" followed by 12 lowercase letters and numbers.
    */
  var ControlId: js.UndefOr[typingsJapgolly.awsSdk.migrationhubconfigMod.ControlId] = js.native
  /**
    * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
    */
  var HomeRegion: js.UndefOr[typingsJapgolly.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  /**
    * A timestamp representing the time when the customer called CreateHomeregionControl and set the home region for the account.
    */
  var RequestedTime: js.UndefOr[js.Date] = js.native
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always an ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typingsJapgolly.awsSdk.migrationhubconfigMod.Target] = js.native
}

object HomeRegionControl {
  @scala.inline
  def apply(
    ControlId: ControlId = null,
    HomeRegion: HomeRegion = null,
    RequestedTime: js.Date = null,
    Target: Target = null
  ): HomeRegionControl = {
    val __obj = js.Dynamic.literal()
    if (ControlId != null) __obj.updateDynamic("ControlId")(ControlId.asInstanceOf[js.Any])
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion.asInstanceOf[js.Any])
    if (RequestedTime != null) __obj.updateDynamic("RequestedTime")(RequestedTime.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeRegionControl]
  }
}

