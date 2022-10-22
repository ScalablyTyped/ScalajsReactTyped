package typingsJapgolly.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptions extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var category: js.UndefOr[Category] = js.undefined
  
  var complete: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var information: js.UndefOr[String] = js.undefined
  
  var magnet: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var remake: js.UndefOr[Boolean] = js.undefined
  
  var token: String
  
  var torrent: js.UndefOr[String] = js.undefined
  
  var trusted: js.UndefOr[Boolean] = js.undefined
  
  var username: String
}
object UploadOptions {
  
  inline def apply(name: String, token: String, username: String): UploadOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  
  extension [Self <: UploadOptions](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    inline def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
    
    inline def setMagnetUndefined: Self = StObject.set(x, "magnet", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemake(value: Boolean): Self = StObject.set(x, "remake", value.asInstanceOf[js.Any])
    
    inline def setRemakeUndefined: Self = StObject.set(x, "remake", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    inline def setTorrentUndefined: Self = StObject.set(x, "torrent", js.undefined)
    
    inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    
    inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
