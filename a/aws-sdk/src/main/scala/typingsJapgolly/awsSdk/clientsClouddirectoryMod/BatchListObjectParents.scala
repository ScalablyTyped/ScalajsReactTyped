package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectParents extends StObject {
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  var ObjectReference: typingsJapgolly.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object BatchListObjectParents {
  
  inline def apply(ObjectReference: ObjectReference): BatchListObjectParents = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectParents]
  }
  
  extension [Self <: BatchListObjectParents](x: Self) {
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
