package typingsJapgolly.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  var arguments: js.Array[Arg | js.Array[Arg]]
  
  var name: String
}
object Annotation {
  
  inline def apply(arguments: js.Array[Arg | js.Array[Arg]], name: String): Annotation = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setArguments(value: js.Array[Arg | js.Array[Arg]]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (Arg | js.Array[Arg])*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
