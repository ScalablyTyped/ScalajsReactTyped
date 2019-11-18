package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends js.Object {
  @js.native
  sealed trait BigIntLiteral extends TokenClass
  
  @js.native
  sealed trait Comment extends TokenClass
  
  @js.native
  sealed trait Identifier extends TokenClass
  
  @js.native
  sealed trait Keyword extends TokenClass
  
  @js.native
  sealed trait NumberLiteral extends TokenClass
  
  @js.native
  sealed trait Operator extends TokenClass
  
  @js.native
  sealed trait Punctuation extends TokenClass
  
  @js.native
  sealed trait RegExpLiteral extends TokenClass
  
  @js.native
  sealed trait StringLiteral extends TokenClass
  
  @js.native
  sealed trait Whitespace extends TokenClass
  
  /* 7 */ val BigIntLiteral: typingsJapgolly.typescript.typescriptMod.TokenClass.BigIntLiteral with Double = js.native
  /* 3 */ val Comment: typingsJapgolly.typescript.typescriptMod.TokenClass.Comment with Double = js.native
  /* 5 */ val Identifier: typingsJapgolly.typescript.typescriptMod.TokenClass.Identifier with Double = js.native
  /* 1 */ val Keyword: typingsJapgolly.typescript.typescriptMod.TokenClass.Keyword with Double = js.native
  /* 6 */ val NumberLiteral: typingsJapgolly.typescript.typescriptMod.TokenClass.NumberLiteral with Double = js.native
  /* 2 */ val Operator: typingsJapgolly.typescript.typescriptMod.TokenClass.Operator with Double = js.native
  /* 0 */ val Punctuation: typingsJapgolly.typescript.typescriptMod.TokenClass.Punctuation with Double = js.native
  /* 9 */ val RegExpLiteral: typingsJapgolly.typescript.typescriptMod.TokenClass.RegExpLiteral with Double = js.native
  /* 8 */ val StringLiteral: typingsJapgolly.typescript.typescriptMod.TokenClass.StringLiteral with Double = js.native
  /* 4 */ val Whitespace: typingsJapgolly.typescript.typescriptMod.TokenClass.Whitespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass with Double] = js.native
}

