package typingsJapgolly.regexpToAst.mod

import typingsJapgolly.regexpToAst.anon.Begin
import typingsJapgolly.regexpToAst.regexpToAstStrings.EndAnchor
import typingsJapgolly.regexpToAst.regexpToAstStrings.Lookahead
import typingsJapgolly.regexpToAst.regexpToAstStrings.NegativeLookahead
import typingsJapgolly.regexpToAst.regexpToAstStrings.NonWordBoundary
import typingsJapgolly.regexpToAst.regexpToAstStrings.StartAnchor
import typingsJapgolly.regexpToAst.regexpToAstStrings.WordBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assertion
  extends StObject
     with IRegExpAST
     with Term {
  
  @JSName("type")
  var type_Assertion: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead
  
  var value: js.UndefOr[Disjunction] = js.undefined
}
object Assertion {
  
  inline def apply(
    loc: Begin,
    `type`: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead
  ): Assertion = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
  
  extension [Self <: Assertion](x: Self) {
    
    inline def setType(value: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Disjunction): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
