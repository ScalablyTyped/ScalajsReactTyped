package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CONTINGENT_PLAN
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_BASIC_METER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_BATTERY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_CUST
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_POOL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_SMART_METER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXISTING_SOLAR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GROUP_BUY_MEMBER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.LOYALTY_MEMBER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MINIMUM_USAGE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NEW_CUSTOMER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NO_SOLAR_FIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ONLINE_ONLY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ORG_MEMBER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.REQ_EQUIP_SUPPLIER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SENIOR_CARD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SMALL_BUSINESS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SPECIFIC_LOCATION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SPORT_CLUB_MEMBER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.THIRD_PARTY_ONLY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Information
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A description of the eligibility restriction
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Information of the eligibility restriction specific to the type of the restriction
    */
  var information: String
  
  /**
    * The type of the eligibility restriction.<br/>The CONTINGENT_PLAN value indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up)
    */
  var `type`: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
}
object Information {
  
  inline def apply(
    information: String,
    `type`: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
  ): Information = {
    val __obj = js.Dynamic.literal(information = information.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Information]
  }
  
  extension [Self <: Information](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
