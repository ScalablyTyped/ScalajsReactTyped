package typingsJapgolly.gapiDrive.gapi.client.drive

import typingsJapgolly.gapiDrive.gapiDriveStrings.drive$property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesResource extends StObject {
  
  var etag: String
  
  var key: String
  
  var kind: drive$property
  
  var selfLink: String
  
  var value: String
  
  var visibility: String
}
object PropertiesResource {
  
  inline def apply(etag: String, key: String, selfLink: String, value: String, visibility: String): PropertiesResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "drive$property", selfLink = selfLink.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesResource]
  }
  
  extension [Self <: PropertiesResource](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: drive$property): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
