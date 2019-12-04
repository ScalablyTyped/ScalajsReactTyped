package typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CssTokenType extends js.Object

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssTokenType")
@js.native
object CssTokenType extends js.Object {
  @js.native
  sealed trait AtKeyword extends CssTokenType
  
  @js.native
  sealed trait Character extends CssTokenType
  
  @js.native
  sealed trait Comment extends CssTokenType
  
  @js.native
  sealed trait EOF extends CssTokenType
  
  @js.native
  sealed trait Identifier extends CssTokenType
  
  @js.native
  sealed trait IdentifierOrNumber extends CssTokenType
  
  @js.native
  sealed trait Invalid extends CssTokenType
  
  @js.native
  sealed trait Number extends CssTokenType
  
  @js.native
  sealed trait String extends CssTokenType
  
  @js.native
  sealed trait Whitespace extends CssTokenType
  
  /* 6 */ val AtKeyword: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.AtKeyword with Double = js.native
  /* 7 */ val Character: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Character with Double = js.native
  /* 2 */ val Comment: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Comment with Double = js.native
  /* 0 */ val EOF: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.EOF with Double = js.native
  /* 3 */ val Identifier: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Identifier with Double = js.native
  /* 5 */ val IdentifierOrNumber: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.IdentifierOrNumber with Double = js.native
  /* 9 */ val Invalid: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Invalid with Double = js.native
  /* 4 */ val Number: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Number with Double = js.native
  /* 1 */ val String: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.String with Double = js.native
  /* 8 */ val Whitespace: typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Whitespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssTokenType with Double] = js.native
}

