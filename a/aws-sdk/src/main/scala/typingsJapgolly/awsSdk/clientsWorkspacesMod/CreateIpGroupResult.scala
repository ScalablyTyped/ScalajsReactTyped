package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpGroupResult extends StObject {
  
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[IpGroupId] = js.undefined
}
object CreateIpGroupResult {
  
  inline def apply(): CreateIpGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpGroupResult]
  }
  
  extension [Self <: CreateIpGroupResult](x: Self) {
    
    inline def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
  }
}
