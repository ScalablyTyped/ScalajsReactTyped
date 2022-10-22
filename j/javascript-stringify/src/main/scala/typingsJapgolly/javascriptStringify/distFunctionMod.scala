package typingsJapgolly.javascriptStringify

import typingsJapgolly.javascriptStringify.distTypesMod.Next
import typingsJapgolly.javascriptStringify.distTypesMod.ToString
import typingsJapgolly.javascriptStringify.javascriptStringifyStrings.AsyncFunction
import typingsJapgolly.javascriptStringify.javascriptStringifyStrings.AsyncGeneratorFunction
import typingsJapgolly.javascriptStringify.javascriptStringifyStrings.Function
import typingsJapgolly.javascriptStringify.javascriptStringifyStrings.GeneratorFunction
import typingsJapgolly.javascriptStringify.javascriptStringifyStrings.Graveaccent
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.RegExpExecArray
import typingsJapgolly.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionMod {
  
  @JSImport("javascript-stringify/dist/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("javascript-stringify/dist/function", "FunctionParser")
  @js.native
  open class FunctionParser protected () extends StObject {
    def this(fn: js.Function1[/* repeated */ Any, Any], indent: String, next: Next) = this()
    def this(fn: js.Function1[/* repeated */ Any, Any], indent: String, next: Next, key: String) = this()
    
    def consumeMatch(re: js.RegExp): RegExpExecArray | Null = js.native
    
    /**
      * Advance the parser past an arbitrary regular expression. Return `token`,
      * or the match object of the regexp.
      */
    def consumeRegExp(re: js.RegExp, token: String): js.UndefOr[String] = js.native
    
    /**
      * Advance the parser past one element of JavaScript syntax. This could be a
      * matched pair of delimiters, like braces or parentheses, or an atomic unit
      * like a keyword, variable, or operator. Return a normalized string
      * representation of the element parsed--for example, returns '{}' for a
      * matched pair of braces. Comments and whitespace are skipped.
      *
      * (This isn't a full parser, so the token scanning logic used here is as
      * simple as it can be. As a consequence, some things that are one token in
      * JavaScript, like decimal number literals or most multi-character operators
      * like '&&', are split into more than one token here. However, awareness of
      * some multi-character sequences like '=>' is necessary, so we match the few
      * of them that we care about.)
      */
    def consumeSyntax(): js.UndefOr[String] = js.native
    def consumeSyntax(wordLikeToken: String): js.UndefOr[String] = js.native
    
    def consumeSyntaxUntil(startToken: String, endToken: String): js.UndefOr[String] = js.native
    
    /**
      * Advance the parser past a template string.
      */
    def consumeTemplate(): js.UndefOr[Graveaccent] = js.native
    
    /**
      * Advance the parser past any whitespace or comments.
      */
    def consumeWhitespace(): Unit = js.native
    
    def fn(args: Any*): Any = js.native
    
    var fnString: String = js.native
    
    var fnType: /* keyof javascript-stringify.anon.AsyncFunction */ Function | GeneratorFunction | AsyncFunction | AsyncGeneratorFunction = js.native
    
    def getPrefix(): String = js.native
    
    var hadKeyword: Boolean = js.native
    
    var indent: String = js.native
    
    var isMethodCandidate: Boolean = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyPrefix: String = js.native
    
    var keyQuote: js.UndefOr[String] = js.native
    
    def next(value: Any): js.UndefOr[String] = js.native
    def next(value: Any, key: PropertyKey): js.UndefOr[String] = js.native
    @JSName("next")
    var next_Original: Next = js.native
    
    var pos: Double = js.native
    
    def stringify(): String = js.native
    
    def tryParse(): js.UndefOr[String] = js.native
    
    /**
      * Attempt to advance the parser past the keywords expected to be at the
      * start of this function's definition. This method sets `this.hadKeyword`
      * based on whether or not a `function` keyword is consumed.
      */
    def tryParsePrefixTokens(): Boolean = js.native
    
    /**
      * Attempt to parse the function from the current position by first stripping
      * the function's name from the front. This is not a fool-proof method on all
      * JavaScript engines, but yields good results on Node.js 4 (and slightly
      * less good results on Node.js 6 and 8).
      */
    def tryStrippingName(): js.UndefOr[String] = js.native
  }
  
  @JSImport("javascript-stringify/dist/function", "USED_METHOD_KEY")
  @js.native
  val USED_METHOD_KEY: WeakSet[js.Function1[/* repeated */ Any, Any]] = js.native
  
  inline def dedentFunction(fnString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dedentFunction")(fnString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("javascript-stringify/dist/function", "functionToString")
  @js.native
  val functionToString: ToString = js.native
}
