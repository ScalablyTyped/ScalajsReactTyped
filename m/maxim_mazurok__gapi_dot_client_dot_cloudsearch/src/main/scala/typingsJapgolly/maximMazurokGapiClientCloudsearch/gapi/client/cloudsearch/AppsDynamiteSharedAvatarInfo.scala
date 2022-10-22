package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAvatarInfo extends StObject {
  
  var emoji: js.UndefOr[AppsDynamiteSharedEmoji] = js.undefined
}
object AppsDynamiteSharedAvatarInfo {
  
  inline def apply(): AppsDynamiteSharedAvatarInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAvatarInfo]
  }
  
  extension [Self <: AppsDynamiteSharedAvatarInfo](x: Self) {
    
    inline def setEmoji(value: AppsDynamiteSharedEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
