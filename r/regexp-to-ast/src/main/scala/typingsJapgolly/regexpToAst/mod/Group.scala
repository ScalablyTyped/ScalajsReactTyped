package typingsJapgolly.regexpToAst.mod

import typingsJapgolly.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with IRegExpAST
     with Atom {
  
  var capturing: Boolean
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var quantifier: js.UndefOr[Quantifier] = js.undefined
  
  @JSName("type")
  var type_Group: typingsJapgolly.regexpToAst.regexpToAstStrings.Group
  
  var value: Disjunction
}
object Group {
  
  inline def apply(capturing: Boolean, loc: Begin, value: Disjunction): Group = {
    val __obj = js.Dynamic.literal(capturing = capturing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setCapturing(value: Boolean): Self = StObject.set(x, "capturing", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setQuantifierUndefined: Self = StObject.set(x, "quantifier", js.undefined)
    
    inline def setType(value: typingsJapgolly.regexpToAst.regexpToAstStrings.Group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Disjunction): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
