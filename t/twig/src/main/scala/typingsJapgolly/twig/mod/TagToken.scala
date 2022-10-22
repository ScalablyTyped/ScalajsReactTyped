package typingsJapgolly.twig.mod

import typingsJapgolly.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagToken extends StObject {
  
  var `match`: RegExpExecArray
  
  var stack: js.UndefOr[js.Array[CompiledToken]] = js.undefined
  
  var `type`: String
}
object TagToken {
  
  inline def apply(`match`: RegExpExecArray, `type`: String): TagToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagToken]
  }
  
  extension [Self <: TagToken](x: Self) {
    
    inline def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setStack(value: js.Array[CompiledToken]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackVarargs(value: CompiledToken*): Self = StObject.set(x, "stack", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
