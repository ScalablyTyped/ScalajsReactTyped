package typingsJapgolly.sqlFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sqlFormatter.libSrcLexerTokenMod.Token
import typingsJapgolly.sqlFormatter.libSrcLexerTokenMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcParserLexerAdapterMod {
  
  @JSImport("sql-formatter/lib/src/parser/LexerAdapter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LexerAdapter {
    def this(tokenize: js.Function1[/* chunk */ String, js.Array[Token]]) = this()
    
    /* CompleteClass */
    override def formatError(token: NearleyToken): String = js.native
    
    /* CompleteClass */
    override def has(name: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var input: Any = js.native
    
    /* CompleteClass */
    override def next(): js.UndefOr[NearleyToken] = js.native
    
    /* CompleteClass */
    override def reset(chunk: String, _info: Any): Unit = js.native
    
    /* CompleteClass */
    override def save(): Any = js.native
    
    /* private */ /* CompleteClass */
    var tokenize: Any = js.native
    
    /* private */ /* CompleteClass */
    var tokens: Any = js.native
  }
  
  trait LexerAdapter extends StObject {
    
    def formatError(token: NearleyToken): String
    
    def has(name: String): Boolean
    
    /* private */ var index: Any
    
    /* private */ var input: Any
    
    def next(): js.UndefOr[NearleyToken]
    
    def reset(chunk: String, _info: Any): Unit
    
    def save(): Any
    
    /* private */ var tokenize: Any
    
    /* private */ var tokens: Any
  }
  object LexerAdapter {
    
    inline def apply(
      formatError: NearleyToken => String,
      has: String => Boolean,
      index: Any,
      input: Any,
      next: CallbackTo[js.UndefOr[NearleyToken]],
      reset: (String, Any) => Callback,
      save: CallbackTo[Any],
      tokenize: Any,
      tokens: Any
    ): LexerAdapter = {
      val __obj = js.Dynamic.literal(formatError = js.Any.fromFunction1(formatError), has = js.Any.fromFunction1(has), index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], next = next.toJsFn, reset = js.Any.fromFunction2((t0: String, t1: Any) => (reset(t0, t1)).runNow()), save = save.toJsFn, tokenize = tokenize.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerAdapter]
    }
    
    extension [Self <: LexerAdapter](x: Self) {
      
      inline def setFormatError(value: NearleyToken => String): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setNext(value: CallbackTo[js.UndefOr[NearleyToken]]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReset(value: (String, Any) => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSave(value: CallbackTo[Any]): Self = StObject.set(x, "save", value.toJsFn)
      
      inline def setTokenize(value: Any): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait NearleyToken
    extends StObject
       with Token {
    
    var value: String
  }
  object NearleyToken {
    
    inline def apply(raw: String, start: Double, text: String, `type`: TokenType, value: String): NearleyToken = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NearleyToken]
    }
    
    extension [Self <: NearleyToken](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
