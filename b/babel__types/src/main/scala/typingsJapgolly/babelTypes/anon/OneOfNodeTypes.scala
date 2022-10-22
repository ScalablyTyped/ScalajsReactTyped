package typingsJapgolly.babelTypes.anon

import typingsJapgolly.babelTypes.libMod.NodeTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOfNodeTypes extends StObject {
  
  var oneOfNodeTypes: js.Array[NodeTypes]
}
object OneOfNodeTypes {
  
  inline def apply(oneOfNodeTypes: js.Array[NodeTypes]): OneOfNodeTypes = {
    val __obj = js.Dynamic.literal(oneOfNodeTypes = oneOfNodeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOfNodeTypes]
  }
  
  extension [Self <: OneOfNodeTypes](x: Self) {
    
    inline def setOneOfNodeTypes(value: js.Array[NodeTypes]): Self = StObject.set(x, "oneOfNodeTypes", value.asInstanceOf[js.Any])
    
    inline def setOneOfNodeTypesVarargs(value: NodeTypes*): Self = StObject.set(x, "oneOfNodeTypes", js.Array(value*))
  }
}
