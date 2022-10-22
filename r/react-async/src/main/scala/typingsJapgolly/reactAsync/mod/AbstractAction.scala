package typingsJapgolly.reactAsync.mod

import typingsJapgolly.reactAsync.anon.Dictmeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractAction extends StObject {
  
  var meta: Dictmeta
  
  var `type`: String
}
object AbstractAction {
  
  inline def apply(meta: Dictmeta, `type`: String): AbstractAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAction]
  }
  
  extension [Self <: AbstractAction](x: Self) {
    
    inline def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
