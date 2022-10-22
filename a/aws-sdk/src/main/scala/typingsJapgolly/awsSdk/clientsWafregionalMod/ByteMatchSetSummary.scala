package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSetSummary extends StObject {
  
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet, update a ByteMatchSet, remove a ByteMatchSet from a Rule, and delete a ByteMatchSet from AWS WAF.  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
  
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: ResourceName
}
object ByteMatchSetSummary {
  
  inline def apply(ByteMatchSetId: ResourceId, Name: ResourceName): ByteMatchSetSummary = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetSummary]
  }
  
  extension [Self <: ByteMatchSetSummary](x: Self) {
    
    inline def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
