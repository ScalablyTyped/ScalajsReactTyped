package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackEventsInput extends StObject {
  
  /**
    * A string that identifies the next page of events that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * The name or the unique stack ID that's associated with the stack, which aren't always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackName] = js.undefined
}
object DescribeStackEventsInput {
  
  inline def apply(): DescribeStackEventsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackEventsInput]
  }
  
  extension [Self <: DescribeStackEventsInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
