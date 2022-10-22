package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetByteMatchSetResponse extends StObject {
  
  /**
    * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var ByteMatchSet: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.ByteMatchSet] = js.undefined
}
object GetByteMatchSetResponse {
  
  inline def apply(): GetByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetByteMatchSetResponse]
  }
  
  extension [Self <: GetByteMatchSetResponse](x: Self) {
    
    inline def setByteMatchSet(value: ByteMatchSet): Self = StObject.set(x, "ByteMatchSet", value.asInstanceOf[js.Any])
    
    inline def setByteMatchSetUndefined: Self = StObject.set(x, "ByteMatchSet", js.undefined)
  }
}
