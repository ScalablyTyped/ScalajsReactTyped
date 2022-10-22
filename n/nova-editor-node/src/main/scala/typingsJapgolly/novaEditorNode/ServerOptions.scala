package typingsJapgolly.novaEditorNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.pipe
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.socket
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var path: String
  
  var `type`: js.UndefOr[stdio | socket | pipe] = js.undefined
}
object ServerOptions {
  
  inline def apply(path: String): ServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: stdio | socket | pipe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
