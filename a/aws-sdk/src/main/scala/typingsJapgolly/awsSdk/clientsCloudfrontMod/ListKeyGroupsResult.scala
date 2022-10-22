package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyGroupsResult extends StObject {
  
  /**
    * A list of key groups.
    */
  var KeyGroupList: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.KeyGroupList] = js.undefined
}
object ListKeyGroupsResult {
  
  inline def apply(): ListKeyGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyGroupsResult]
  }
  
  extension [Self <: ListKeyGroupsResult](x: Self) {
    
    inline def setKeyGroupList(value: KeyGroupList): Self = StObject.set(x, "KeyGroupList", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupListUndefined: Self = StObject.set(x, "KeyGroupList", js.undefined)
  }
}
