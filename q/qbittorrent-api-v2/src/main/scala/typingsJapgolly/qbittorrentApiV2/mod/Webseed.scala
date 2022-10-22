package typingsJapgolly.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webseed extends StObject {
  
  var url: String
}
object Webseed {
  
  inline def apply(url: String): Webseed = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webseed]
  }
  
  extension [Self <: Webseed](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
