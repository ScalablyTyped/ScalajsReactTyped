package typingsJapgolly.regexpToAst.mod

import typingsJapgolly.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative
  extends StObject
     with IRegExpAST {
  
  @JSName("type")
  var type_Alternative: typingsJapgolly.regexpToAst.regexpToAstStrings.Alternative
  
  var value: js.Array[Term]
}
object Alternative {
  
  inline def apply(loc: Begin, value: js.Array[Term]): Alternative = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[Alternative]
  }
  
  extension [Self <: Alternative](x: Self) {
    
    inline def setType(value: typingsJapgolly.regexpToAst.regexpToAstStrings.Alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Term]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Term*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
