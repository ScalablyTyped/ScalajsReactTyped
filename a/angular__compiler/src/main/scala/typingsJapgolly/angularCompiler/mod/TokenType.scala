package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("@angular/compiler", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  @js.native
  sealed trait Character
    extends StObject
       with TokenType
  /* 0 */ val Character: typingsJapgolly.angularCompiler.mod.TokenType.Character & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with TokenType
  /* 7 */ val Error: typingsJapgolly.angularCompiler.mod.TokenType.Error & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenType
  /* 1 */ val Identifier: typingsJapgolly.angularCompiler.mod.TokenType.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenType
  /* 3 */ val Keyword: typingsJapgolly.angularCompiler.mod.TokenType.Keyword & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with TokenType
  /* 6 */ val Number: typingsJapgolly.angularCompiler.mod.TokenType.Number & Double = js.native
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenType
  /* 5 */ val Operator: typingsJapgolly.angularCompiler.mod.TokenType.Operator & Double = js.native
  
  @js.native
  sealed trait PrivateIdentifier
    extends StObject
       with TokenType
  /* 2 */ val PrivateIdentifier: typingsJapgolly.angularCompiler.mod.TokenType.PrivateIdentifier & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with TokenType
  /* 4 */ val String: typingsJapgolly.angularCompiler.mod.TokenType.String & Double = js.native
}
