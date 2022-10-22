package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppsListRequest extends StObject {
  
  /**
    * The ID of the applications list that you want to delete. You can retrieve this ID from PutAppsList, ListAppsLists, and GetAppsList.
    */
  var ListId: typingsJapgolly.awsSdk.clientsFmsMod.ListId
}
object DeleteAppsListRequest {
  
  inline def apply(ListId: ListId): DeleteAppsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppsListRequest]
  }
  
  extension [Self <: DeleteAppsListRequest](x: Self) {
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
