package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shared {
  
  trait ITokenAccess extends StObject {
    
    def Contains(token: SyntaxKind): Boolean
    
    def GetTokens(): js.Array[SyntaxKind]
  }
  object ITokenAccess {
    
    inline def apply(Contains: SyntaxKind => Boolean, GetTokens: CallbackTo[js.Array[SyntaxKind]]): ITokenAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn)
      __obj.asInstanceOf[ITokenAccess]
    }
    
    extension [Self <: ITokenAccess](x: Self) {
      
      inline def setContains(value: SyntaxKind => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
      
      inline def setGetTokens(value: CallbackTo[js.Array[SyntaxKind]]): Self = StObject.set(x, "GetTokens", value.toJsFn)
    }
  }
  
  trait TokenAllAccess
    extends StObject
       with ITokenAccess
  object TokenAllAccess {
    
    inline def apply(Contains: SyntaxKind => Boolean, GetTokens: CallbackTo[js.Array[SyntaxKind]]): TokenAllAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn)
      __obj.asInstanceOf[TokenAllAccess]
    }
  }
  
  trait TokenRange extends StObject {
    
    def Contains(token: SyntaxKind): Boolean
    
    def GetTokens(): js.Array[SyntaxKind]
    
    var tokenAccess: ITokenAccess
  }
  object TokenRange {
    
    inline def apply(
      Contains: SyntaxKind => Boolean,
      GetTokens: CallbackTo[js.Array[SyntaxKind]],
      tokenAccess: ITokenAccess
    ): TokenRange = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn, tokenAccess = tokenAccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRange]
    }
    
    extension [Self <: TokenRange](x: Self) {
      
      inline def setContains(value: SyntaxKind => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
      
      inline def setGetTokens(value: CallbackTo[js.Array[SyntaxKind]]): Self = StObject.set(x, "GetTokens", value.toJsFn)
      
      inline def setTokenAccess(value: ITokenAccess): Self = StObject.set(x, "tokenAccess", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenRangeAccess
    extends StObject
       with ITokenAccess {
    
    /* private */ var tokens: Any
  }
  object TokenRangeAccess {
    
    inline def apply(Contains: SyntaxKind => Boolean, GetTokens: CallbackTo[js.Array[SyntaxKind]], tokens: Any): TokenRangeAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn, tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRangeAccess]
    }
    
    extension [Self <: TokenRangeAccess](x: Self) {
      
      inline def setTokens(value: Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenSingleValueAccess
    extends StObject
       with ITokenAccess {
    
    var token: SyntaxKind
  }
  object TokenSingleValueAccess {
    
    inline def apply(Contains: SyntaxKind => Boolean, GetTokens: CallbackTo[js.Array[SyntaxKind]], token: SyntaxKind): TokenSingleValueAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn, token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenSingleValueAccess]
    }
    
    extension [Self <: TokenSingleValueAccess](x: Self) {
      
      inline def setToken(value: SyntaxKind): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenValuesAccess
    extends StObject
       with ITokenAccess {
    
    /* private */ var tokens: Any
  }
  object TokenValuesAccess {
    
    inline def apply(Contains: SyntaxKind => Boolean, GetTokens: CallbackTo[js.Array[SyntaxKind]], tokens: Any): TokenValuesAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = GetTokens.toJsFn, tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenValuesAccess]
    }
    
    extension [Self <: TokenValuesAccess](x: Self) {
      
      inline def setTokens(value: Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
