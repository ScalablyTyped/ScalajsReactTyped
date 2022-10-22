package typingsJapgolly.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WantListItem extends StObject {
  
  @JSName("/")
  var Slash: String
}
object WantListItem {
  
  inline def apply(Slash: String): WantListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[WantListItem]
  }
  
  extension [Self <: WantListItem](x: Self) {
    
    inline def setSlash(value: String): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
  }
}
