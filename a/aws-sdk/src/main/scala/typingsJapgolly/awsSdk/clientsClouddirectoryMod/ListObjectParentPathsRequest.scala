package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectParentPathsRequest extends StObject {
  
  /**
    * The ARN of the directory to which the parent path applies.
    */
  var DirectoryArn: Arn
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The reference that identifies the object whose parent paths are listed.
    */
  var ObjectReference: typingsJapgolly.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object ListObjectParentPathsRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListObjectParentPathsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectParentPathsRequest]
  }
  
  extension [Self <: ListObjectParentPathsRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
