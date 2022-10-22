package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRestoreJobsOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain detailed information about jobs to restore saved resources.
    */
  var RestoreJobs: js.UndefOr[RestoreJobsList] = js.undefined
}
object ListRestoreJobsOutput {
  
  inline def apply(): ListRestoreJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsOutput]
  }
  
  extension [Self <: ListRestoreJobsOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRestoreJobs(value: RestoreJobsList): Self = StObject.set(x, "RestoreJobs", value.asInstanceOf[js.Any])
    
    inline def setRestoreJobsUndefined: Self = StObject.set(x, "RestoreJobs", js.undefined)
    
    inline def setRestoreJobsVarargs(value: RestoreJobsListMember*): Self = StObject.set(x, "RestoreJobs", js.Array(value*))
  }
}
