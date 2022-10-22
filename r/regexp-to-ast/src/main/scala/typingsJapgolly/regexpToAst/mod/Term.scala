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

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpToAst.mod.Atom
  - typingsJapgolly.regexpToAst.mod.Assertion
*/
trait Term extends StObject
object Term {
  
  inline def Assertion(
    loc: Begin,
    `type`: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead
  ): typingsJapgolly.regexpToAst.mod.Assertion = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.regexpToAst.mod.Assertion]
  }
  
  inline def Character(loc: Begin, value: Double): typingsJapgolly.regexpToAst.mod.Character = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[typingsJapgolly.regexpToAst.mod.Character]
  }
  
  inline def Group(capturing: Boolean, loc: Begin, value: Disjunction): typingsJapgolly.regexpToAst.mod.Group = {
    val __obj = js.Dynamic.literal(capturing = capturing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.regexpToAst.mod.Group]
  }
  
  inline def GroupBackReference(loc: Begin, value: Double): typingsJapgolly.regexpToAst.mod.GroupBackReference = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GroupBackReference")
    __obj.asInstanceOf[typingsJapgolly.regexpToAst.mod.GroupBackReference]
  }
  
  inline def Set(complement: Boolean, loc: Begin, value: js.Array[Double | Range]): typingsJapgolly.regexpToAst.mod.Set = {
    val __obj = js.Dynamic.literal(complement = complement.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Set")
    __obj.asInstanceOf[typingsJapgolly.regexpToAst.mod.Set]
  }
}
