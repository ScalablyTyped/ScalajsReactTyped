package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupPlanTemplatesInput extends StObject {
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupPlanTemplatesInput {
  
  inline def apply(): ListBackupPlanTemplatesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlanTemplatesInput]
  }
  
  extension [Self <: ListBackupPlanTemplatesInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
