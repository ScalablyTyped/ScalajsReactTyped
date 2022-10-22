package typingsJapgolly.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsRequest extends StObject {
  
  /**
    * One or more filters to limit the items returned in the response. Use the backupIds filter to return only the specified backups. Specify backups by their backup identifier (ID). Use the sourceBackupIds filter to return only the backups created from a source backup. The sourceBackupID of a source backup is returned by the CopyBackupToRegion operation. Use the clusterIds filter to return only the backups for the specified clusters. Specify clusters by their cluster identifier (ID). Use the states filter to return only backups that match the specified state. Use the neverExpires filter to return backups filtered by the value in the neverExpires parameter. True returns all backups exempt from the backup retention policy. False returns all backups with a backup retention policy defined at the cluster.
    */
  var Filters: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.Filters] = js.undefined
  
  /**
    * The maximum number of backups to return in the response. When there are more backups than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[BackupsMaxSize] = js.undefined
  
  /**
    * The NextToken value that you received in the previous response. Use this value to get more backups.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.NextToken] = js.undefined
  
  /**
    * Designates whether or not to sort the return backups by ascending chronological order of generation.
    */
  var SortAscending: js.UndefOr[Boolean] = js.undefined
}
object DescribeBackupsRequest {
  
  inline def apply(): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
  
  extension [Self <: DescribeBackupsRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: BackupsMaxSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingUndefined: Self = StObject.set(x, "SortAscending", js.undefined)
  }
}
