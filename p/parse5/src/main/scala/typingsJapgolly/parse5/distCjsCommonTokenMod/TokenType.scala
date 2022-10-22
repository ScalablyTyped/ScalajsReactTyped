package typingsJapgolly.parse5.distCjsCommonTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("parse5/dist/cjs/common/token", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  @js.native
  sealed trait CHARACTER
    extends StObject
       with TokenType
  /* 0 */ val CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.CHARACTER & Double = js.native
  
  @js.native
  sealed trait COMMENT
    extends StObject
       with TokenType
  /* 5 */ val COMMENT: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.COMMENT & Double = js.native
  
  @js.native
  sealed trait DOCTYPE
    extends StObject
       with TokenType
  /* 6 */ val DOCTYPE: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.DOCTYPE & Double = js.native
  
  @js.native
  sealed trait END_TAG
    extends StObject
       with TokenType
  /* 4 */ val END_TAG: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.END_TAG & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* 7 */ val EOF: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.EOF & Double = js.native
  
  @js.native
  sealed trait HIBERNATION
    extends StObject
       with TokenType
  /* 8 */ val HIBERNATION: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.HIBERNATION & Double = js.native
  
  @js.native
  sealed trait NULL_CHARACTER
    extends StObject
       with TokenType
  /* 1 */ val NULL_CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.NULL_CHARACTER & Double = js.native
  
  @js.native
  sealed trait START_TAG
    extends StObject
       with TokenType
  /* 3 */ val START_TAG: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.START_TAG & Double = js.native
  
  @js.native
  sealed trait WHITESPACE_CHARACTER
    extends StObject
       with TokenType
  /* 2 */ val WHITESPACE_CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.WHITESPACE_CHARACTER & Double = js.native
}
