package typingsJapgolly.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSGlobal("TypeScript.Services.TokenClass")
@js.native
object TokenClass extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass with Double] = js.native
  /* 3 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  /* 5 */ @js.native
  object Identifier extends TopLevel[Identifier with Double]
  
  /* 1 */ @js.native
  object Keyword extends TopLevel[Keyword with Double]
  
  /* 6 */ @js.native
  object NumberLiteral extends TopLevel[NumberLiteral with Double]
  
  /* 2 */ @js.native
  object Operator extends TopLevel[Operator with Double]
  
  /* 0 */ @js.native
  object Punctuation extends TopLevel[Punctuation with Double]
  
  /* 8 */ @js.native
  object RegExpLiteral extends TopLevel[RegExpLiteral with Double]
  
  /* 7 */ @js.native
  object StringLiteral extends TopLevel[StringLiteral with Double]
  
  /* 4 */ @js.native
  object Whitespace extends TopLevel[Whitespace with Double]
  
}

