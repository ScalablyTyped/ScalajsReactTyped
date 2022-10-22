package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePageElementAltTextRequest extends StObject {
  
  /**
    * The updated alt text description of the page element. If unset the existing value will be maintained. The description is exposed to screen readers and other accessibility
    * interfaces. Only use human readable values related to the content of the page element.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /** The object ID of the page element the updates are applied to. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The updated alt text title of the page element. If unset the existing value will be maintained. The title is exposed to screen readers and other accessibility interfaces. Only use
    * human readable values related to the content of the page element.
    */
  var title: js.UndefOr[String] = js.undefined
}
object UpdatePageElementAltTextRequest {
  
  inline def apply(): UpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementAltTextRequest]
  }
  
  extension [Self <: UpdatePageElementAltTextRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
