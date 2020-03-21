package typingsJapgolly.luaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astMod {
  type BreakStatement = typingsJapgolly.luaparse.astMod.Base[typingsJapgolly.luaparse.luaparseStrings.BreakStatement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luaparse.astMod.Statement
    - typingsJapgolly.luaparse.astMod.Expression
    - typingsJapgolly.luaparse.astMod.IfClause
    - typingsJapgolly.luaparse.astMod.ElseifClause
    - typingsJapgolly.luaparse.astMod.ElseClause
    - typingsJapgolly.luaparse.astMod.Chunk
    - typingsJapgolly.luaparse.astMod.TableKey
    - typingsJapgolly.luaparse.astMod.TableKeyString
    - typingsJapgolly.luaparse.astMod.TableValue
    - typingsJapgolly.luaparse.astMod.Comment
  */
  type Node = typingsJapgolly.luaparse.astMod._Node | typingsJapgolly.luaparse.astMod.BreakStatement
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luaparse.astMod.LabelStatement
    - typingsJapgolly.luaparse.astMod.BreakStatement
    - typingsJapgolly.luaparse.astMod.GotoStatement
    - typingsJapgolly.luaparse.astMod.ReturnStatement
    - typingsJapgolly.luaparse.astMod.IfStatement
    - typingsJapgolly.luaparse.astMod.WhileStatement
    - typingsJapgolly.luaparse.astMod.DoStatement
    - typingsJapgolly.luaparse.astMod.RepeatStatement
    - typingsJapgolly.luaparse.astMod.LocalStatement
    - typingsJapgolly.luaparse.astMod.AssignmentStatement
    - typingsJapgolly.luaparse.astMod.CallStatement
    - typingsJapgolly.luaparse.astMod.FunctionDeclaration
    - typingsJapgolly.luaparse.astMod.ForNumericStatement
    - typingsJapgolly.luaparse.astMod.ForGenericStatement
  */
  type Statement = typingsJapgolly.luaparse.astMod._Statement | typingsJapgolly.luaparse.astMod.BreakStatement
}
