package typingsJapgolly.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationTasksResult extends StObject {
  
  /**
    * Lists the migration task's summary which includes: MigrationTaskName, ProgressPercent, ProgressUpdateStream, Status, and the UpdateDateTime for each task.
    */
  var MigrationTaskSummaryList: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubMod.MigrationTaskSummaryList] = js.undefined
  
  /**
    * If there are more migration tasks than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListMigrationTasksResult {
  
  inline def apply(): ListMigrationTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationTasksResult]
  }
  
  extension [Self <: ListMigrationTasksResult](x: Self) {
    
    inline def setMigrationTaskSummaryList(value: MigrationTaskSummaryList): Self = StObject.set(x, "MigrationTaskSummaryList", value.asInstanceOf[js.Any])
    
    inline def setMigrationTaskSummaryListUndefined: Self = StObject.set(x, "MigrationTaskSummaryList", js.undefined)
    
    inline def setMigrationTaskSummaryListVarargs(value: MigrationTaskSummary*): Self = StObject.set(x, "MigrationTaskSummaryList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
