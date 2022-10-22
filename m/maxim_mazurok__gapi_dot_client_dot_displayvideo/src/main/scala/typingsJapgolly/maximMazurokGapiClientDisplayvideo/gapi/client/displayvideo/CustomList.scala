package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomList extends StObject {
  
  /** Output only. The unique ID of the custom list. Assigned by the system. */
  var customListId: js.UndefOr[String] = js.undefined
  
  /** Output only. The display name of the custom list. . */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the custom list. */
  var name: js.UndefOr[String] = js.undefined
}
object CustomList {
  
  inline def apply(): CustomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomList]
  }
  
  extension [Self <: CustomList](x: Self) {
    
    inline def setCustomListId(value: String): Self = StObject.set(x, "customListId", value.asInstanceOf[js.Any])
    
    inline def setCustomListIdUndefined: Self = StObject.set(x, "customListId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
