package typingsJapgolly.sqlFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcParserGrammarMod extends Shortcut {
  
  @JSImport("sql-formatter/lib/src/parser/grammar", JSImport.Default)
  @js.native
  val default: Grammar = js.native
  
  trait Grammar extends StObject {
    
    var Lexer: js.UndefOr[NearleyLexer] = js.undefined
    
    var ParserRules: js.Array[NearleyRule]
    
    var ParserStart: String
  }
  object Grammar {
    
    inline def apply(ParserRules: js.Array[NearleyRule], ParserStart: String): Grammar = {
      val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grammar]
    }
    
    extension [Self <: Grammar](x: Self) {
      
      inline def setLexer(value: NearleyLexer): Self = StObject.set(x, "Lexer", value.asInstanceOf[js.Any])
      
      inline def setLexerUndefined: Self = StObject.set(x, "Lexer", js.undefined)
      
      inline def setParserRules(value: js.Array[NearleyRule]): Self = StObject.set(x, "ParserRules", value.asInstanceOf[js.Any])
      
      inline def setParserRulesVarargs(value: NearleyRule*): Self = StObject.set(x, "ParserRules", js.Array(value*))
      
      inline def setParserStart(value: String): Self = StObject.set(x, "ParserStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait NearleyLexer extends StObject {
    
    def formatError(token: scala.Nothing): String
    
    def has(tokenType: String): Boolean
    
    def next(): js.UndefOr[NearleyToken]
    
    def reset(chunk: String, info: Any): Unit
    
    def save(): Any
  }
  object NearleyLexer {
    
    inline def apply(
      has: String => Boolean,
      next: CallbackTo[js.UndefOr[NearleyToken]],
      reset: (String, Any) => Callback,
      save: CallbackTo[Any]
    ): NearleyLexer = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), next = next.toJsFn, reset = js.Any.fromFunction2((t0: String, t1: Any) => (reset(t0, t1)).runNow()), save = save.toJsFn)
      __obj.asInstanceOf[NearleyLexer]
    }
    
    extension [Self <: NearleyLexer](x: Self) {
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setNext(value: CallbackTo[js.UndefOr[NearleyToken]]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReset(value: (String, Any) => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSave(value: CallbackTo[Any]): Self = StObject.set(x, "save", value.toJsFn)
    }
  }
  
  trait NearleyRule extends StObject {
    
    var name: String
    
    var postprocess: js.UndefOr[
        js.Function3[
          /* d */ js.Array[Any], 
          /* loc */ js.UndefOr[Double], 
          /* reject */ js.UndefOr[js.Object], 
          Any
        ]
      ] = js.undefined
    
    var symbols: js.Array[NearleySymbol]
  }
  object NearleyRule {
    
    inline def apply(name: String, symbols: js.Array[NearleySymbol]): NearleyRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[NearleyRule]
    }
    
    extension [Self <: NearleyRule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPostprocess(
        value: (/* d */ js.Array[Any], /* loc */ js.UndefOr[Double], /* reject */ js.UndefOr[js.Object]) => Any
      ): Self = StObject.set(x, "postprocess", js.Any.fromFunction3(value))
      
      inline def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      inline def setSymbols(value: js.Array[NearleySymbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsVarargs(value: NearleySymbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.sqlFormatter.anon.Literal
    - typingsJapgolly.sqlFormatter.anon.Test
  */
  type NearleySymbol = _NearleySymbol | String
  
  trait NearleyToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var value: Any
  }
  object NearleyToken {
    
    inline def apply(value: Any): NearleyToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NearleyToken]
    }
    
    extension [Self <: NearleyToken](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _NearleySymbol extends StObject
  object _NearleySymbol {
    
    inline def Literal(literal: Any): typingsJapgolly.sqlFormatter.anon.Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sqlFormatter.anon.Literal]
    }
    
    inline def Test(test: Any => Boolean): typingsJapgolly.sqlFormatter.anon.Test = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typingsJapgolly.sqlFormatter.anon.Test]
    }
  }
  
  type _To = Grammar
  
  /* This means you don't have to write `default`, but can instead just say `libSrcParserGrammarMod.foo` */
  override def _to: Grammar = default
}
