package typingsJapgolly.kahootJsUpdated.mod

import typingsJapgolly.kahootJsUpdated.anon.IsRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameAccept extends StObject {
  
  var activeTheme: IsRTL
  
  var playerName: String
}
object NameAccept {
  
  inline def apply(activeTheme: IsRTL, playerName: String): NameAccept = {
    val __obj = js.Dynamic.literal(activeTheme = activeTheme.asInstanceOf[js.Any], playerName = playerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameAccept]
  }
  
  extension [Self <: NameAccept](x: Self) {
    
    inline def setActiveTheme(value: IsRTL): Self = StObject.set(x, "activeTheme", value.asInstanceOf[js.Any])
    
    inline def setPlayerName(value: String): Self = StObject.set(x, "playerName", value.asInstanceOf[js.Any])
  }
}
