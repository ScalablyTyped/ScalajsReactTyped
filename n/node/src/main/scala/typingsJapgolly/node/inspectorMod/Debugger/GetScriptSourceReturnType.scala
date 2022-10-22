package typingsJapgolly.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptSourceReturnType extends StObject {
  
  /**
    * Script source.
    */
  var scriptSource: String
}
object GetScriptSourceReturnType {
  
  inline def apply(scriptSource: String): GetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceReturnType]
  }
  
  extension [Self <: GetScriptSourceReturnType](x: Self) {
    
    inline def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
