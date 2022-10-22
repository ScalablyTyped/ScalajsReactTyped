package typingsJapgolly.regexpToAst.mod

import typingsJapgolly.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegExpAST extends StObject {
  
  var loc: Begin
  
  var `type`: String
}
object IRegExpAST {
  
  inline def apply(loc: Begin, `type`: String): IRegExpAST = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegExpAST]
  }
  
  extension [Self <: IRegExpAST](x: Self) {
    
    inline def setLoc(value: Begin): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
