package typingsJapgolly.mathjs.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available options for parse */
trait ParseOptions extends StObject {
  
  /** a set of custom nodes */
  var nodes: js.UndefOr[Record[String, MathNode]] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  extension [Self <: ParseOptions](x: Self) {
    
    inline def setNodes(value: Record[String, MathNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
