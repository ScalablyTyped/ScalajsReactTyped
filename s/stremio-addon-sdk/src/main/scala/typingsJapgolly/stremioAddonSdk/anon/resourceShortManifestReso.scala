package typingsJapgolly.stremioAddonSdk.anon

import typingsJapgolly.stremioAddonSdk.mod.ContentType
import typingsJapgolly.stremioAddonSdk.mod.ShortManifestResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  resource :stremio-addon-sdk.stremio-addon-sdk.ShortManifestResource} & stremio-addon-sdk.stremio-addon-sdk.Args */
trait resourceShortManifestReso extends StObject {
  
  var extra: Genre
  
  var id: String
  
  var resource: ShortManifestResource
  
  var `type`: ContentType
}
object resourceShortManifestReso {
  
  inline def apply(extra: Genre, id: String, resource: ShortManifestResource, `type`: ContentType): resourceShortManifestReso = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[resourceShortManifestReso]
  }
  
  extension [Self <: resourceShortManifestReso](x: Self) {
    
    inline def setExtra(value: Genre): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ShortManifestResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
