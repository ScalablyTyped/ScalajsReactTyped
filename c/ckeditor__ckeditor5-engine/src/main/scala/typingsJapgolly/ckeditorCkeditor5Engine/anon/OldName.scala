package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rename
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldName extends StObject {
  
  var baseVersion: Double | Null
  
  var newName: String
  
  var oldName: String
  
  var position: ReturnType[js.Function0[Path]]
  
  var `type`: rename
}
object OldName {
  
  inline def apply(newName: String, oldName: String, position: ReturnType[js.Function0[Path]]): OldName = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], baseVersion = null)
    __obj.updateDynamic("type")("rename")
    __obj.asInstanceOf[OldName]
  }
  
  extension [Self <: OldName](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setType(value: rename): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
