package typingsJapgolly.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshotAttribute extends StObject {
  
  /**
    * The name of the manual cluster snapshot attribute. The attribute named restore refers to the list of Amazon Web Services accounts that have permission to copy or restore the manual cluster snapshot.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The values for the manual cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the Amazon Web Services accounts that are authorized to copy or restore the manual cluster snapshot. If a value of all is in the list, then the manual cluster snapshot is public and available for any Amazon Web Services account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
}
object DBClusterSnapshotAttribute {
  
  inline def apply(): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
  
  extension [Self <: DBClusterSnapshotAttribute](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeValues(value: AttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
    
    inline def setAttributeValuesVarargs(value: String*): Self = StObject.set(x, "AttributeValues", js.Array(value*))
  }
}
