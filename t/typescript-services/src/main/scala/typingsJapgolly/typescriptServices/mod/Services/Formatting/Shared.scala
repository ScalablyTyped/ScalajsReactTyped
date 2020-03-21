package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Shared")
@js.native
object Shared extends js.Object {
  @js.native
  class TokenAllAccess ()
    extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
  
  @js.native
  class TokenRange protected ()
    extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
    def this(tokenAccess: ITokenAccess) = this()
  }
  
  @js.native
  class TokenRangeAccess protected ()
    extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
    def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
  }
  
  @js.native
  class TokenSingleValueAccess protected ()
    extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
    def this(token: SyntaxKind) = this()
  }
  
  @js.native
  class TokenValuesAccess protected ()
    extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
    def this(tks: js.Array[SyntaxKind]) = this()
  }
  
  /* static members */
  @js.native
  object TokenRange extends js.Object {
    var Any: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var AnyIncludingMultilineComments: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryKeywordOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Comments: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Keywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Operators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var ReservedKeywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var TypeNames: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostdecrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostincrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPredecrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPreincrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def AllTokens(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromToken(token: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromTokens(tokens: js.Array[SyntaxKind]): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
  }
  
}

