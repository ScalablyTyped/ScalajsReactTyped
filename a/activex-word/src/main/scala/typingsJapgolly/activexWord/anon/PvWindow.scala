package typingsJapgolly.activexWord.anon

import typingsJapgolly.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PvWindow extends StObject {
  
  val PvWindow: ProtectedViewWindow
}
object PvWindow {
  
  inline def apply(PvWindow: ProtectedViewWindow): PvWindow = {
    val __obj = js.Dynamic.literal(PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PvWindow]
  }
  
  extension [Self <: PvWindow](x: Self) {
    
    inline def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
