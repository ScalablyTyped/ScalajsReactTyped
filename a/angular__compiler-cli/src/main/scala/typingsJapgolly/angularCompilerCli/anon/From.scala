package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.typescript.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: String | Null
  
  var node: Declaration
}
object From {
  
  inline def apply(node: Declaration): From = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], from = null)
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setNode(value: Declaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
