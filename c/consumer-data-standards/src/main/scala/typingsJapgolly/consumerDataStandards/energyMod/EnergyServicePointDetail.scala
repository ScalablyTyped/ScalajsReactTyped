package typingsJapgolly.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.AddressUType
import typingsJapgolly.consumerDataStandards.anon.Classification
import typingsJapgolly.consumerDataStandards.anon.LossValue
import typingsJapgolly.consumerDataStandards.anon.MeterId
import typingsJapgolly.consumerDataStandards.anon.Party
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ACT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ALL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DE_ENERGISED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DISTRIBUTION_WHOLESALE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXTERNAL_PROFILE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXTINCT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GENERATOR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GREENFIELD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.LARGE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NEM
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NON_CONTEST_UNMETERED_LOAD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NON_REGISTERED_EMBEDDED_GENERATOR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NSW
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OFF_MARKET
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.QLD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SA
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SMALL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TAS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.VIC
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.WHOLESALE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyServicePointDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var consumerProfile: js.UndefOr[Classification | Null] = js.undefined
  
  var distributionLossFactor: LossValue
  
  /**
    * This flag determines whether the energy at this connection point is to be treated as consumer load or as a generating unit(this may include generator auxiliary loads). If absent defaults to false. <br>**Note:** Only applicable for scheduled or semischeduled generators, does not indicate on site generation by consumer
    */
  var isGenerator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Jurisdiction code to which the service point belongs.This code defines the jurisdictional rules which apply to the service point. Note the details of enumeration values below:<ul><li>**ALL** - All Jurisdictions</li><li>**ACT** - Australian Capital Territory</li><li>**NEM** - National Electricity Market</li><li>**NSW** - New South Wales</li><li>**QLD** - Queensland</li><li>**SA** - South Australia</li><li>**TAS** - Tasmania</li><li>**VIC** - Victoria</li></ul>
    */
  var jurisdictionCode: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC
  
  /**
    * The date and time that the information for this service point was modified
    */
  var lastUpdateDateTime: String
  
  /**
    * Location of the servicepoint
    */
  var location: AddressUType
  
  /**
    * The meters associated with the service point. This may be empty where there are no meters physically installed at the service point
    */
  var meters: js.UndefOr[js.Array[MeterId] | Null] = js.undefined
  
  /**
    * The independent ID of the service point, known in the industry as the NMI
    */
  var nationalMeteringId: String
  
  var relatedParticipants: js.Array[Party]
  
  /**
    * The classification of the service point as defined in MSATS procedures
    */
  var servicePointClassification: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE
  
  /**
    * The tokenised ID of the service point for use in the CDR APIs.  Created according to the CDR rules for ID permanence
    */
  var servicePointId: String
  
  /**
    * Code used to indicate the status of the service point. Note the details for the enumeration values below:<ul><li>**ACTIVE** - An active, energised, service point</li><li>**DE_ENERGISED** - The service point exists but is deenergised</li><li>**EXTINCT** - The service point has been permanently decommissioned</li><li>**GREENFIELD** - Applies to a service point that has never been energised</li><li>**OFF_MARKET** - Applies when the service point is no longer settled in the NEM</li></ul>
    */
  var servicePointStatus: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET
  
  /**
    * The start date from which this service point first became valid
    */
  var validFromDate: String
}
object EnergyServicePointDetail {
  
  inline def apply(
    distributionLossFactor: LossValue,
    jurisdictionCode: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC,
    lastUpdateDateTime: String,
    location: AddressUType,
    nationalMeteringId: String,
    relatedParticipants: js.Array[Party],
    servicePointClassification: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE,
    servicePointId: String,
    servicePointStatus: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET,
    validFromDate: String
  ): EnergyServicePointDetail = {
    val __obj = js.Dynamic.literal(distributionLossFactor = distributionLossFactor.asInstanceOf[js.Any], jurisdictionCode = jurisdictionCode.asInstanceOf[js.Any], lastUpdateDateTime = lastUpdateDateTime.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], nationalMeteringId = nationalMeteringId.asInstanceOf[js.Any], relatedParticipants = relatedParticipants.asInstanceOf[js.Any], servicePointClassification = servicePointClassification.asInstanceOf[js.Any], servicePointId = servicePointId.asInstanceOf[js.Any], servicePointStatus = servicePointStatus.asInstanceOf[js.Any], validFromDate = validFromDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyServicePointDetail]
  }
  
  extension [Self <: EnergyServicePointDetail](x: Self) {
    
    inline def setConsumerProfile(value: Classification): Self = StObject.set(x, "consumerProfile", value.asInstanceOf[js.Any])
    
    inline def setConsumerProfileNull: Self = StObject.set(x, "consumerProfile", null)
    
    inline def setConsumerProfileUndefined: Self = StObject.set(x, "consumerProfile", js.undefined)
    
    inline def setDistributionLossFactor(value: LossValue): Self = StObject.set(x, "distributionLossFactor", value.asInstanceOf[js.Any])
    
    inline def setIsGenerator(value: Boolean): Self = StObject.set(x, "isGenerator", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratorNull: Self = StObject.set(x, "isGenerator", null)
    
    inline def setIsGeneratorUndefined: Self = StObject.set(x, "isGenerator", js.undefined)
    
    inline def setJurisdictionCode(value: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC): Self = StObject.set(x, "jurisdictionCode", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTime(value: String): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: AddressUType): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMeters(value: js.Array[MeterId]): Self = StObject.set(x, "meters", value.asInstanceOf[js.Any])
    
    inline def setMetersNull: Self = StObject.set(x, "meters", null)
    
    inline def setMetersUndefined: Self = StObject.set(x, "meters", js.undefined)
    
    inline def setMetersVarargs(value: MeterId*): Self = StObject.set(x, "meters", js.Array(value*))
    
    inline def setNationalMeteringId(value: String): Self = StObject.set(x, "nationalMeteringId", value.asInstanceOf[js.Any])
    
    inline def setRelatedParticipants(value: js.Array[Party]): Self = StObject.set(x, "relatedParticipants", value.asInstanceOf[js.Any])
    
    inline def setRelatedParticipantsVarargs(value: Party*): Self = StObject.set(x, "relatedParticipants", js.Array(value*))
    
    inline def setServicePointClassification(
      value: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE
    ): Self = StObject.set(x, "servicePointClassification", value.asInstanceOf[js.Any])
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setServicePointStatus(value: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET): Self = StObject.set(x, "servicePointStatus", value.asInstanceOf[js.Any])
    
    inline def setValidFromDate(value: String): Self = StObject.set(x, "validFromDate", value.asInstanceOf[js.Any])
  }
}
