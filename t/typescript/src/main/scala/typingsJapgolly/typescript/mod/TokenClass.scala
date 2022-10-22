package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass & Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with TokenClass
  /* 7 */ val BigIntLiteral: typingsJapgolly.typescript.mod.TokenClass.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenClass
  /* 3 */ val Comment: typingsJapgolly.typescript.mod.TokenClass.Comment & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenClass
  /* 5 */ val Identifier: typingsJapgolly.typescript.mod.TokenClass.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenClass
  /* 1 */ val Keyword: typingsJapgolly.typescript.mod.TokenClass.Keyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with TokenClass
  /* 6 */ val NumberLiteral: typingsJapgolly.typescript.mod.TokenClass.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenClass
  /* 2 */ val Operator: typingsJapgolly.typescript.mod.TokenClass.Operator & Double = js.native
  
  @js.native
  sealed trait Punctuation
    extends StObject
       with TokenClass
  /* 0 */ val Punctuation: typingsJapgolly.typescript.mod.TokenClass.Punctuation & Double = js.native
  
  @js.native
  sealed trait RegExpLiteral
    extends StObject
       with TokenClass
  /* 9 */ val RegExpLiteral: typingsJapgolly.typescript.mod.TokenClass.RegExpLiteral & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with TokenClass
  /* 8 */ val StringLiteral: typingsJapgolly.typescript.mod.TokenClass.StringLiteral & Double = js.native
  
  @js.native
  sealed trait Whitespace
    extends StObject
       with TokenClass
  /* 4 */ val Whitespace: typingsJapgolly.typescript.mod.TokenClass.Whitespace & Double = js.native
}
