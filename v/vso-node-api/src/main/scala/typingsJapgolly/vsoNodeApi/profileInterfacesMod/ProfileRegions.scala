package typingsJapgolly.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileRegions extends js.Object {
  /**
    * List of country/region code with contact consent requirement type of notice
    */
  var noticeContactConsentRequirementRegions: js.Array[String]
  /**
    * List of country/region code with contact consent requirement type of opt-out
    */
  var optOutContactConsentRequirementRegions: js.Array[String]
  /**
    * List of country/regions
    */
  var regions: js.Array[ProfileRegion]
}

object ProfileRegions {
  @scala.inline
  def apply(
    noticeContactConsentRequirementRegions: js.Array[String],
    optOutContactConsentRequirementRegions: js.Array[String],
    regions: js.Array[ProfileRegion]
  ): ProfileRegions = {
    val __obj = js.Dynamic.literal(noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions.asInstanceOf[js.Any], optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileRegions]
  }
}

