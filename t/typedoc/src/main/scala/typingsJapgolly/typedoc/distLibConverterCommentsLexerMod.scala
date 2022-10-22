package typingsJapgolly.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsLexerMod {
  
  @js.native
  sealed trait TokenSyntaxKind extends StObject
  @JSImport("typedoc/dist/lib/converter/comments/lexer", "TokenSyntaxKind")
  @js.native
  object TokenSyntaxKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TokenSyntaxKind & String] = js.native
    
    @js.native
    sealed trait CloseBrace
      extends StObject
         with TokenSyntaxKind
    /* "close_brace" */ val CloseBrace: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.CloseBrace & String = js.native
    
    @js.native
    sealed trait Code
      extends StObject
         with TokenSyntaxKind
    /* "code" */ val Code: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.Code & String = js.native
    
    @js.native
    sealed trait NewLine
      extends StObject
         with TokenSyntaxKind
    /* "new_line" */ val NewLine: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.NewLine & String = js.native
    
    @js.native
    sealed trait OpenBrace
      extends StObject
         with TokenSyntaxKind
    /* "open_brace" */ val OpenBrace: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.OpenBrace & String = js.native
    
    @js.native
    sealed trait Tag
      extends StObject
         with TokenSyntaxKind
    /* "tag" */ val Tag: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.Tag & String = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with TokenSyntaxKind
    /* "text" */ val Text: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.Text & String = js.native
    
    @js.native
    sealed trait TypeAnnotation
      extends StObject
         with TokenSyntaxKind
    /* "type" */ val TypeAnnotation: typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.TokenSyntaxKind.TypeAnnotation & String = js.native
  }
  
  trait Token extends StObject {
    
    var kind: TokenSyntaxKind
    
    var pos: Double
    
    var text: String
  }
  object Token {
    
    inline def apply(kind: TokenSyntaxKind, pos: Double, text: String): Token = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setKind(value: TokenSyntaxKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
