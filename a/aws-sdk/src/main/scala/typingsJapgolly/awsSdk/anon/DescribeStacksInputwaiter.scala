package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsCloudformationMod.NextToken
import typingsJapgolly.awsSdk.clientsCloudformationMod.StackName
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeStacksInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeStacksInputwaiter extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * The name or the unique stack ID that's associated with the stack, which aren't always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackName] = js.undefined
}
object DescribeStacksInputwaiter {
  
  inline def apply(): DescribeStacksInputwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksInputwaiter]
  }
  
  extension [Self <: DescribeStacksInputwaiter](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
