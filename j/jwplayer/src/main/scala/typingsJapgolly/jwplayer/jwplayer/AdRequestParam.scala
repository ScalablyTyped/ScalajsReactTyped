package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.googima
import typingsJapgolly.jwplayer.jwplayerStrings.mid
import typingsJapgolly.jwplayer.jwplayerStrings.post
import typingsJapgolly.jwplayer.jwplayerStrings.pre
import typingsJapgolly.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdRequestParam extends StObject {
  
  var adposition: pre | mid | post
  
  var client: vast | googima
  
  var offset: pre | mid | post
  
  var tag: String
}
object AdRequestParam {
  
  inline def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdRequestParam]
  }
  
  extension [Self <: AdRequestParam](x: Self) {
    
    inline def setAdposition(value: pre | mid | post): Self = StObject.set(x, "adposition", value.asInstanceOf[js.Any])
    
    inline def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: pre | mid | post): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
