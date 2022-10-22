package typingsJapgolly.moo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moo.mooBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(rules: Rules): Lexer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(rules.asInstanceOf[js.Any]).asInstanceOf[Lexer]
  
  @JSImport("moo", "error")
  @js.native
  val error: ErrorRule = js.native
  
  @JSImport("moo", "fallback")
  @js.native
  val fallback: FallbackRule = js.native
  
  inline def keywords(kws: StringDictionary[String | js.Array[String]]): TypeMapper = ^.asInstanceOf[js.Dynamic].applyDynamic("keywords")(kws.asInstanceOf[js.Any]).asInstanceOf[TypeMapper]
  
  inline def states(states: StringDictionary[Rules]): Lexer = ^.asInstanceOf[js.Dynamic].applyDynamic("states")(states.asInstanceOf[js.Any]).asInstanceOf[Lexer]
  inline def states(states: StringDictionary[Rules], start: String): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("states")(states.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  
  trait ErrorRule extends StObject {
    
    var error: `true`
  }
  object ErrorRule {
    
    inline def apply(): ErrorRule = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.asInstanceOf[ErrorRule]
    }
    
    extension [Self <: ErrorRule](x: Self) {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait FallbackRule extends StObject {
    
    var fallback: `true`
  }
  object FallbackRule {
    
    inline def apply(): FallbackRule = {
      val __obj = js.Dynamic.literal(fallback = true)
      __obj.asInstanceOf[FallbackRule]
    }
    
    extension [Self <: FallbackRule](x: Self) {
      
      inline def setFallback(value: `true`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lexer extends StObject {
    
    /**
      * Returns a string with a pretty error message.
      */
    def formatError(token: Token): String = js.native
    def formatError(token: Token, message: String): String = js.native
    
    /**
      * @deprecated since 0.5.0. Now just returns true
      */
    def has(tokenType: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[Token]] = js.native
    
    /**
      * When you reach the end of Moo's internal buffer, next() will return undefined.
      * You can always reset() it and feed it more data when that happens.
      */
    def next(): js.UndefOr[Token] = js.native
    
    /**
      * Returns back to the previous state in the stack.
      */
    def popState(): Unit = js.native
    
    /**
      * Transitions to the provided state and pushes the state onto the state
      * stack.
      */
    def pushState(state: String): Unit = js.native
    
    /**
      * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
      */
    def reset(): this.type = js.native
    def reset(chunk: String): this.type = js.native
    def reset(chunk: String, state: LexerState): this.type = js.native
    def reset(chunk: Unit, state: LexerState): this.type = js.native
    
    /**
      * Returns current state, which you can later pass it as the second argument
      * to reset() to explicitly control the internal state of the lexer.
      */
    def save(): LexerState = js.native
    
    /**
      * Transitiosn to the provided state. Does not push onto the state stack.
      */
    def setState(state: String): Unit = js.native
  }
  
  trait LexerState extends StObject {
    
    var col: Double
    
    var line: Double
    
    var state: String
  }
  object LexerState {
    
    inline def apply(col: Double, line: Double, state: String): LexerState = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerState]
    }
    
    extension [Self <: LexerState](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rule extends StObject {
    
    /**
      * You can have a token type that both matches tokens and contains error values.
      */
    var error: js.UndefOr[`true`] = js.undefined
    
    /**
      * Moo tracks detailed information about the input for you.
      * It will track line numbers, as long as you apply the `lineBreaks: true`
      * option to any tokens which might contain newlines. Moo will try to warn you if you forget to do this.
      */
    var lineBreaks: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[js.RegExp | String | js.Array[String]] = js.undefined
    
    /**
      * Moves to a new state, but does not affect the stack.
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * Returns to a previous state, by removing one or more states from the stack.
      */
    var pop: js.UndefOr[Double] = js.undefined
    
    /**
      * Moves the lexer to a new state, and pushes the old state onto the stack.
      */
    var push: js.UndefOr[String] = js.undefined
    
    /**
      * Used for mapping one set of types to another.
      * See https://github.com/no-context/moo#keywords for an example
      */
    var `type`: js.UndefOr[TypeMapper] = js.undefined
    
    /**
      * Moo doesn't allow capturing groups, but you can supply a transform function, value(),
      * which will be called on the value before storing it in the Token object.
      */
    var value: js.UndefOr[js.Function1[/* x */ String, String]] = js.undefined
  }
  object Rule {
    
    inline def apply(): Rule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLineBreaks(value: Boolean): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLineBreaksUndefined: Self = StObject.set(x, "lineBreaks", js.undefined)
      
      inline def setMatch(value: js.RegExp | String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPop(value: Double): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setType(value: /* x */ String => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: /* x */ String => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Rules = StringDictionary[js.RegExp | String | (js.Array[Rule | String]) | Rule | ErrorRule | FallbackRule]
  
  trait Token extends StObject {
    
    /**
      * The column where the match begins, starting from 1.
      */
    var col: Double
    
    /**
      * The line number of the beginning of the match, starting from 1.
      */
    var line: Double
    
    /**
      * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
      */
    var lineBreaks: Double
    
    /**
      * The number of bytes from the start of the buffer where the match starts.
      */
    var offset: Double
    
    /**
      * The complete match.
      */
    var text: String
    
    /**
      * The name of the group, as passed to compile.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * The match contents.
      */
    var value: String
  }
  object Token {
    
    inline def apply(col: Double, line: Double, lineBreaks: Double, offset: Double, text: String, value: String): Token = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineBreaks = lineBreaks.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineBreaks(value: Double): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeMapper = js.Function1[/* x */ String, String]
}
