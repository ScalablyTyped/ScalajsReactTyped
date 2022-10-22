package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicableIndividualAssessmentsResponse extends StObject {
  
  /**
    * List of names for the individual assessments supported by the premigration assessment run that you start based on the specified request parameters. For more information on the available individual assessments, including compatibility with different migration task configurations, see Working with premigration assessment runs in the Database Migration Service User Guide. 
    */
  var IndividualAssessmentNames: js.UndefOr[IndividualAssessmentNameList] = js.undefined
  
  /**
    * Pagination token returned for you to pass to a subsequent request. If you pass this token as the Marker value in a subsequent request, the response includes only records beyond the marker, up to the value specified in the request by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeApplicableIndividualAssessmentsResponse {
  
  inline def apply(): DescribeApplicableIndividualAssessmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsResponse]
  }
  
  extension [Self <: DescribeApplicableIndividualAssessmentsResponse](x: Self) {
    
    inline def setIndividualAssessmentNames(value: IndividualAssessmentNameList): Self = StObject.set(x, "IndividualAssessmentNames", value.asInstanceOf[js.Any])
    
    inline def setIndividualAssessmentNamesUndefined: Self = StObject.set(x, "IndividualAssessmentNames", js.undefined)
    
    inline def setIndividualAssessmentNamesVarargs(value: String*): Self = StObject.set(x, "IndividualAssessmentNames", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
