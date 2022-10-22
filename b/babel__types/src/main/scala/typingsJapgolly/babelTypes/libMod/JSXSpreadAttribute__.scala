package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.JSXSpreadAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadAttribute__
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var argument: Expression
  
  @JSName("type")
  var type_JSXSpreadAttribute__ : JSXSpreadAttribute
}
object JSXSpreadAttribute__ {
  
  inline def apply(argument: Expression): JSXSpreadAttribute__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[JSXSpreadAttribute__]
  }
  
  extension [Self <: JSXSpreadAttribute__](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
