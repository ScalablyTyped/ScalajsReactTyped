package typingsJapgolly.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformDescription extends js.Object {
  /**
    * The custom AMIs supported by the platform.
    */
  var CustomAmiList: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.CustomAmiList] = js.native
  /**
    * The date when the platform was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The date when the platform was last updated.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The description of the platform.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The frameworks supported by the platform.
    */
  var Frameworks: js.UndefOr[PlatformFrameworks] = js.native
  /**
    * Information about the maintainer of the platform.
    */
  var Maintainer: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.Maintainer] = js.native
  /**
    * The operating system used by the platform.
    */
  var OperatingSystemName: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.OperatingSystemName] = js.native
  /**
    * The version of the operating system used by the platform.
    */
  var OperatingSystemVersion: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.OperatingSystemVersion] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The category of the platform.
    */
  var PlatformCategory: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.native
  /**
    * The name of the platform.
    */
  var PlatformName: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformName] = js.native
  /**
    * The AWS account ID of the person who created the platform.
    */
  var PlatformOwner: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.native
  /**
    * The status of the platform.
    */
  var PlatformStatus: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.native
  /**
    * The version of the platform.
    */
  var PlatformVersion: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformVersion] = js.native
  /**
    * The programming languages supported by the platform.
    */
  var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.native
  /**
    * The name of the solution stack used by the platform.
    */
  var SolutionStackName: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * The additions supported by the platform.
    */
  var SupportedAddonList: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.native
  /**
    * The tiers supported by the platform.
    */
  var SupportedTierList: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformDescription {
  @scala.inline
  def apply(
    CustomAmiList: CustomAmiList = null,
    DateCreated: js.Date = null,
    DateUpdated: js.Date = null,
    Description: Description = null,
    Frameworks: PlatformFrameworks = null,
    Maintainer: Maintainer = null,
    OperatingSystemName: OperatingSystemName = null,
    OperatingSystemVersion: OperatingSystemVersion = null,
    PlatformArn: PlatformArn = null,
    PlatformCategory: PlatformCategory = null,
    PlatformName: PlatformName = null,
    PlatformOwner: PlatformOwner = null,
    PlatformStatus: PlatformStatus = null,
    PlatformVersion: PlatformVersion = null,
    ProgrammingLanguages: PlatformProgrammingLanguages = null,
    SolutionStackName: SolutionStackName = null,
    SupportedAddonList: SupportedAddonList = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    if (CustomAmiList != null) __obj.updateDynamic("CustomAmiList")(CustomAmiList.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Frameworks != null) __obj.updateDynamic("Frameworks")(Frameworks.asInstanceOf[js.Any])
    if (Maintainer != null) __obj.updateDynamic("Maintainer")(Maintainer.asInstanceOf[js.Any])
    if (OperatingSystemName != null) __obj.updateDynamic("OperatingSystemName")(OperatingSystemName.asInstanceOf[js.Any])
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (PlatformCategory != null) __obj.updateDynamic("PlatformCategory")(PlatformCategory.asInstanceOf[js.Any])
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName.asInstanceOf[js.Any])
    if (PlatformOwner != null) __obj.updateDynamic("PlatformOwner")(PlatformOwner.asInstanceOf[js.Any])
    if (PlatformStatus != null) __obj.updateDynamic("PlatformStatus")(PlatformStatus.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (ProgrammingLanguages != null) __obj.updateDynamic("ProgrammingLanguages")(ProgrammingLanguages.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (SupportedAddonList != null) __obj.updateDynamic("SupportedAddonList")(SupportedAddonList.asInstanceOf[js.Any])
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDescription]
  }
}

