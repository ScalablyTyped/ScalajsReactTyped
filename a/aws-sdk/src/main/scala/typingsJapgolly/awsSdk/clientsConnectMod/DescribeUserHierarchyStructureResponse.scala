package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserHierarchyStructureResponse extends StObject {
  
  /**
    * Information about the hierarchy structure.
    */
  var HierarchyStructure: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.HierarchyStructure] = js.undefined
}
object DescribeUserHierarchyStructureResponse {
  
  inline def apply(): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
  
  extension [Self <: DescribeUserHierarchyStructureResponse](x: Self) {
    
    inline def setHierarchyStructure(value: HierarchyStructure): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    inline def setHierarchyStructureUndefined: Self = StObject.set(x, "HierarchyStructure", js.undefined)
  }
}
