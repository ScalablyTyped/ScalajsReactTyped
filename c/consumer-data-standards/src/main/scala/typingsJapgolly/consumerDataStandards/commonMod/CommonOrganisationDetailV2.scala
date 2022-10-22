package typingsJapgolly.consumerDataStandards.commonMod

import typingsJapgolly.consumerDataStandards.anon.Paf
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.COMPANY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GOVERNMENT_ENTITY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PARTNERSHIP
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SOLE_TRADER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TRUST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOrganisationDetailV2
  extends StObject
     with CommonOrganisation {
  
  /**
    * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
    */
  var physicalAddresses: js.Array[Paf]
}
object CommonOrganisationDetailV2 {
  
  inline def apply(
    agentLastName: String,
    agentRole: String,
    businessName: String,
    organisationType: COMPANY | GOVERNMENT_ENTITY | OTHER | PARTNERSHIP | SOLE_TRADER | TRUST,
    physicalAddresses: js.Array[Paf]
  ): CommonOrganisationDetailV2 = {
    val __obj = js.Dynamic.literal(agentLastName = agentLastName.asInstanceOf[js.Any], agentRole = agentRole.asInstanceOf[js.Any], businessName = businessName.asInstanceOf[js.Any], organisationType = organisationType.asInstanceOf[js.Any], physicalAddresses = physicalAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOrganisationDetailV2]
  }
  
  extension [Self <: CommonOrganisationDetailV2](x: Self) {
    
    inline def setPhysicalAddresses(value: js.Array[Paf]): Self = StObject.set(x, "physicalAddresses", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddressesVarargs(value: Paf*): Self = StObject.set(x, "physicalAddresses", js.Array(value*))
  }
}
