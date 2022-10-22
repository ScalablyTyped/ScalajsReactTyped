package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalFolderProperties extends StObject {
  
  /**
    * The date the folder was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The unique id of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The portal associated with the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * The title of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PortalFolderProperties {
  
  inline def apply(): PortalFolderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalFolderProperties]
  }
  
  extension [Self <: PortalFolderProperties](x: Self) {
    
    inline def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
