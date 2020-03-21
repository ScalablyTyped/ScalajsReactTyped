package typingsJapgolly.pulumiAws.worklinkFleetMod

import typingsJapgolly.pulumiAws.inputMod.worklink.FleetIdentityProvider
import typingsJapgolly.pulumiAws.inputMod.worklink.FleetNetwork
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetState extends js.Object {
  /**
    * The ARN of the created WorkLink Fleet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  val companyCode: js.UndefOr[Input[String]] = js.native
  /**
    * The time that the fleet was created.
    */
  val createdTime: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the fleet.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: js.UndefOr[Input[FleetIdentityProvider]] = js.native
  /**
    * The time that the fleet was last updated.
    */
  val lastUpdatedTime: js.UndefOr[Input[String]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: js.UndefOr[Input[FleetNetwork]] = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: js.UndefOr[Input[Boolean]] = js.native
}

object FleetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    auditStreamArn: Input[String] = null,
    companyCode: Input[String] = null,
    createdTime: Input[String] = null,
    deviceCaCertificate: Input[String] = null,
    displayName: Input[String] = null,
    identityProvider: Input[FleetIdentityProvider] = null,
    lastUpdatedTime: Input[String] = null,
    name: Input[String] = null,
    network: Input[FleetNetwork] = null,
    optimizeForEndUserLocation: Input[Boolean] = null
  ): FleetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (auditStreamArn != null) __obj.updateDynamic("auditStreamArn")(auditStreamArn.asInstanceOf[js.Any])
    if (companyCode != null) __obj.updateDynamic("companyCode")(companyCode.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (deviceCaCertificate != null) __obj.updateDynamic("deviceCaCertificate")(deviceCaCertificate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (identityProvider != null) __obj.updateDynamic("identityProvider")(identityProvider.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (optimizeForEndUserLocation != null) __obj.updateDynamic("optimizeForEndUserLocation")(optimizeForEndUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetState]
  }
}

