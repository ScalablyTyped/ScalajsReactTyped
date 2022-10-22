package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageImportJobsResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * A list of package import jobs.
    */
  var PackageImportJobs: PackageImportJobList
}
object ListPackageImportJobsResponse {
  
  inline def apply(PackageImportJobs: PackageImportJobList): ListPackageImportJobsResponse = {
    val __obj = js.Dynamic.literal(PackageImportJobs = PackageImportJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackageImportJobsResponse]
  }
  
  extension [Self <: ListPackageImportJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageImportJobs(value: PackageImportJobList): Self = StObject.set(x, "PackageImportJobs", value.asInstanceOf[js.Any])
    
    inline def setPackageImportJobsVarargs(value: PackageImportJob*): Self = StObject.set(x, "PackageImportJobs", js.Array(value*))
  }
}
