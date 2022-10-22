package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutomationExecutionsResult extends StObject {
  
  /**
    * The list of details about each automation execution which has occurred which matches the filter specification, if any.
    */
  var AutomationExecutionMetadataList: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AutomationExecutionMetadataList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeAutomationExecutionsResult {
  
  inline def apply(): DescribeAutomationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationExecutionsResult]
  }
  
  extension [Self <: DescribeAutomationExecutionsResult](x: Self) {
    
    inline def setAutomationExecutionMetadataList(value: AutomationExecutionMetadataList): Self = StObject.set(x, "AutomationExecutionMetadataList", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionMetadataListUndefined: Self = StObject.set(x, "AutomationExecutionMetadataList", js.undefined)
    
    inline def setAutomationExecutionMetadataListVarargs(value: AutomationExecutionMetadata*): Self = StObject.set(x, "AutomationExecutionMetadataList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
