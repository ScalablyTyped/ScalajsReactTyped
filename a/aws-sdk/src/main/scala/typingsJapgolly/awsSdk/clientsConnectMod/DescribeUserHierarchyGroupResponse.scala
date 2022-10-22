package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserHierarchyGroupResponse extends StObject {
  
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.HierarchyGroup] = js.undefined
}
object DescribeUserHierarchyGroupResponse {
  
  inline def apply(): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
  
  extension [Self <: DescribeUserHierarchyGroupResponse](x: Self) {
    
    inline def setHierarchyGroup(value: HierarchyGroup): Self = StObject.set(x, "HierarchyGroup", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupUndefined: Self = StObject.set(x, "HierarchyGroup", js.undefined)
  }
}
