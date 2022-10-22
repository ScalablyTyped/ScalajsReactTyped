package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsListData extends StObject {
  
  /**
    * An array of applications in the Firewall Manager applications list.
    */
  var AppsList: typingsJapgolly.awsSdk.clientsFmsMod.AppsList
  
  /**
    * The time that the Firewall Manager applications list was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the Firewall Manager applications list was last updated.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the Firewall Manager applications list.
    */
  var ListId: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.ListId] = js.undefined
  
  /**
    * The name of the Firewall Manager applications list.
    */
  var ListName: ResourceName
  
  /**
    * A unique identifier for each update to the list. When you update the list, the update token must match the token of the current version of the application list. You can retrieve the update token by getting the list. 
    */
  var ListUpdateToken: js.UndefOr[UpdateToken] = js.undefined
  
  /**
    * A map of previous version numbers to their corresponding App object arrays.
    */
  var PreviousAppsList: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.PreviousAppsList] = js.undefined
}
object AppsListData {
  
  inline def apply(AppsList: AppsList, ListName: ResourceName): AppsListData = {
    val __obj = js.Dynamic.literal(AppsList = AppsList.asInstanceOf[js.Any], ListName = ListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListData]
  }
  
  extension [Self <: AppsListData](x: Self) {
    
    inline def setAppsList(value: AppsList): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    inline def setAppsListVarargs(value: App*): Self = StObject.set(x, "AppsList", js.Array(value*))
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    inline def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    inline def setListUpdateToken(value: UpdateToken): Self = StObject.set(x, "ListUpdateToken", value.asInstanceOf[js.Any])
    
    inline def setListUpdateTokenUndefined: Self = StObject.set(x, "ListUpdateToken", js.undefined)
    
    inline def setPreviousAppsList(value: PreviousAppsList): Self = StObject.set(x, "PreviousAppsList", value.asInstanceOf[js.Any])
    
    inline def setPreviousAppsListUndefined: Self = StObject.set(x, "PreviousAppsList", js.undefined)
  }
}
