package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityProfileResponse extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.native
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.native
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.native
  /**
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.native
  /**
    * A description of the security profile (associated with the security profile when it was created or updated).
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  /**
    * The name of the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The version of the security profile. A new version is generated whenever the security profile is updated.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeSecurityProfileResponse {
  @scala.inline
  def apply(
    additionalMetricsToRetain: AdditionalMetricsToRetainList = null,
    alertTargets: AlertTargets = null,
    behaviors: Behaviors = null,
    creationDate: js.Date = null,
    lastModifiedDate: js.Date = null,
    securityProfileArn: SecurityProfileArn = null,
    securityProfileDescription: SecurityProfileDescription = null,
    securityProfileName: SecurityProfileName = null,
    version: Int | Double = null
  ): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (additionalMetricsToRetain != null) __obj.updateDynamic("additionalMetricsToRetain")(additionalMetricsToRetain.asInstanceOf[js.Any])
    if (alertTargets != null) __obj.updateDynamic("alertTargets")(alertTargets.asInstanceOf[js.Any])
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (securityProfileArn != null) __obj.updateDynamic("securityProfileArn")(securityProfileArn.asInstanceOf[js.Any])
    if (securityProfileDescription != null) __obj.updateDynamic("securityProfileDescription")(securityProfileDescription.asInstanceOf[js.Any])
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
}

