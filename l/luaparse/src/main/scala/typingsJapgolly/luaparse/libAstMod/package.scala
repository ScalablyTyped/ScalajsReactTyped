package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BreakStatement = Base[typingsJapgolly.luaparse.luaparseStrings.BreakStatement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.luaparse.libAstMod.Statement
  - typingsJapgolly.luaparse.libAstMod.Expression
  - typingsJapgolly.luaparse.libAstMod.IfClause
  - typingsJapgolly.luaparse.libAstMod.ElseifClause
  - typingsJapgolly.luaparse.libAstMod.ElseClause
  - typingsJapgolly.luaparse.libAstMod.Chunk
  - typingsJapgolly.luaparse.libAstMod.TableKey
  - typingsJapgolly.luaparse.libAstMod.TableKeyString
  - typingsJapgolly.luaparse.libAstMod.TableValue
  - typingsJapgolly.luaparse.libAstMod.Comment
*/
type Node = _Node | BreakStatement

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.luaparse.libAstMod.LabelStatement
  - typingsJapgolly.luaparse.libAstMod.BreakStatement
  - typingsJapgolly.luaparse.libAstMod.GotoStatement
  - typingsJapgolly.luaparse.libAstMod.ReturnStatement
  - typingsJapgolly.luaparse.libAstMod.IfStatement
  - typingsJapgolly.luaparse.libAstMod.WhileStatement
  - typingsJapgolly.luaparse.libAstMod.DoStatement
  - typingsJapgolly.luaparse.libAstMod.RepeatStatement
  - typingsJapgolly.luaparse.libAstMod.LocalStatement
  - typingsJapgolly.luaparse.libAstMod.AssignmentStatement
  - typingsJapgolly.luaparse.libAstMod.CallStatement
  - typingsJapgolly.luaparse.libAstMod.FunctionDeclaration
  - typingsJapgolly.luaparse.libAstMod.ForNumericStatement
  - typingsJapgolly.luaparse.libAstMod.ForGenericStatement
*/
type Statement = _Statement | BreakStatement
