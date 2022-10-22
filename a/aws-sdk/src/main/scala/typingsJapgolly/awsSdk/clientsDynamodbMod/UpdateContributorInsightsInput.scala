package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContributorInsightsInput extends StObject {
  
  /**
    * Represents the contributor insights action.
    */
  var ContributorInsightsAction: typingsJapgolly.awsSdk.clientsDynamodbMod.ContributorInsightsAction
  
  /**
    * The global secondary index name, if applicable.
    */
  var IndexName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: typingsJapgolly.awsSdk.clientsDynamodbMod.TableName
}
object UpdateContributorInsightsInput {
  
  inline def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
  
  extension [Self <: UpdateContributorInsightsInput](x: Self) {
    
    inline def setContributorInsightsAction(value: ContributorInsightsAction): Self = StObject.set(x, "ContributorInsightsAction", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
