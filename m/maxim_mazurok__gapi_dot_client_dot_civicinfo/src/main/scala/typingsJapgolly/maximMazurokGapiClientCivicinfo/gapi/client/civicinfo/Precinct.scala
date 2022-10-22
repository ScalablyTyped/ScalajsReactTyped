package typingsJapgolly.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precinct extends StObject {
  
  /** ID of the AdministrationRegion message for this precinct. Corresponds to LocalityId xml tag. */
  var administrationRegionId: js.UndefOr[String] = js.undefined
  
  /** ID(s) of the Contest message(s) for this precinct. */
  var contestId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Dataset ID. What datasets our Precincts come from. */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /** ID(s) of the PollingLocation message(s) for this precinct. */
  var earlyVoteSiteId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID(s) of the ElectoralDistrict message(s) for this precinct. */
  var electoralDistrictId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. A unique identifier for this precinct. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Specifies if the precinct runs mail-only elections. */
  var mailOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The name of the precinct. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The number of the precinct. */
  var number: js.UndefOr[String] = js.undefined
  
  /** Encouraged. The OCD ID of the precinct */
  var ocdId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID(s) of the PollingLocation message(s) for this precinct. */
  var pollingLocationId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID(s) of the SpatialBoundary message(s) for this precinct. Used to specify a geometrical boundary of the precinct. */
  var spatialBoundaryId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If present, this proto corresponds to one portion of split precinct. Other portions of this precinct are guaranteed to have the same `name`. If not present, this proto represents a
    * full precicnt.
    */
  var splitName: js.UndefOr[String] = js.undefined
  
  /** Specifies the ward the precinct is contained within. */
  var ward: js.UndefOr[String] = js.undefined
}
object Precinct {
  
  inline def apply(): Precinct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precinct]
  }
  
  extension [Self <: Precinct](x: Self) {
    
    inline def setAdministrationRegionId(value: String): Self = StObject.set(x, "administrationRegionId", value.asInstanceOf[js.Any])
    
    inline def setAdministrationRegionIdUndefined: Self = StObject.set(x, "administrationRegionId", js.undefined)
    
    inline def setContestId(value: js.Array[String]): Self = StObject.set(x, "contestId", value.asInstanceOf[js.Any])
    
    inline def setContestIdUndefined: Self = StObject.set(x, "contestId", js.undefined)
    
    inline def setContestIdVarargs(value: String*): Self = StObject.set(x, "contestId", js.Array(value*))
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setEarlyVoteSiteId(value: js.Array[String]): Self = StObject.set(x, "earlyVoteSiteId", value.asInstanceOf[js.Any])
    
    inline def setEarlyVoteSiteIdUndefined: Self = StObject.set(x, "earlyVoteSiteId", js.undefined)
    
    inline def setEarlyVoteSiteIdVarargs(value: String*): Self = StObject.set(x, "earlyVoteSiteId", js.Array(value*))
    
    inline def setElectoralDistrictId(value: js.Array[String]): Self = StObject.set(x, "electoralDistrictId", value.asInstanceOf[js.Any])
    
    inline def setElectoralDistrictIdUndefined: Self = StObject.set(x, "electoralDistrictId", js.undefined)
    
    inline def setElectoralDistrictIdVarargs(value: String*): Self = StObject.set(x, "electoralDistrictId", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMailOnly(value: Boolean): Self = StObject.set(x, "mailOnly", value.asInstanceOf[js.Any])
    
    inline def setMailOnlyUndefined: Self = StObject.set(x, "mailOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOcdId(value: js.Array[String]): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    inline def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
    
    inline def setOcdIdVarargs(value: String*): Self = StObject.set(x, "ocdId", js.Array(value*))
    
    inline def setPollingLocationId(value: js.Array[String]): Self = StObject.set(x, "pollingLocationId", value.asInstanceOf[js.Any])
    
    inline def setPollingLocationIdUndefined: Self = StObject.set(x, "pollingLocationId", js.undefined)
    
    inline def setPollingLocationIdVarargs(value: String*): Self = StObject.set(x, "pollingLocationId", js.Array(value*))
    
    inline def setSpatialBoundaryId(value: js.Array[String]): Self = StObject.set(x, "spatialBoundaryId", value.asInstanceOf[js.Any])
    
    inline def setSpatialBoundaryIdUndefined: Self = StObject.set(x, "spatialBoundaryId", js.undefined)
    
    inline def setSpatialBoundaryIdVarargs(value: String*): Self = StObject.set(x, "spatialBoundaryId", js.Array(value*))
    
    inline def setSplitName(value: String): Self = StObject.set(x, "splitName", value.asInstanceOf[js.Any])
    
    inline def setSplitNameUndefined: Self = StObject.set(x, "splitName", js.undefined)
    
    inline def setWard(value: String): Self = StObject.set(x, "ward", value.asInstanceOf[js.Any])
    
    inline def setWardUndefined: Self = StObject.set(x, "ward", js.undefined)
  }
}
