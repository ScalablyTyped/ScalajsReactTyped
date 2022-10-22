package typingsJapgolly.remarkable.libMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserInline extends StObject {
  
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  
  def skipToken(state: StateInline): Unit
  
  def tokenize(state: StateInline): Unit
  
  def validateLink(url: String): Boolean
}
object ParserInline {
  
  inline def apply(
    parse: (String, Options, Env, js.Array[Token]) => Callback,
    skipToken: StateInline => Callback,
    tokenize: StateInline => Callback,
    validateLink: String => Boolean
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4((t0: String, t1: Options, t2: Env, t3: js.Array[Token]) => (parse(t0, t1, t2, t3)).runNow()), skipToken = js.Any.fromFunction1((t0: StateInline) => skipToken(t0).runNow()), tokenize = js.Any.fromFunction1((t0: StateInline) => tokenize(t0).runNow()), validateLink = js.Any.fromFunction1(validateLink))
    __obj.asInstanceOf[ParserInline]
  }
  
  extension [Self <: ParserInline](x: Self) {
    
    inline def setParse(value: (String, Options, Env, js.Array[Token]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction4((t0: String, t1: Options, t2: Env, t3: js.Array[Token]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSkipToken(value: StateInline => Callback): Self = StObject.set(x, "skipToken", js.Any.fromFunction1((t0: StateInline) => value(t0).runNow()))
    
    inline def setTokenize(value: StateInline => Callback): Self = StObject.set(x, "tokenize", js.Any.fromFunction1((t0: StateInline) => value(t0).runNow()))
    
    inline def setValidateLink(value: String => Boolean): Self = StObject.set(x, "validateLink", js.Any.fromFunction1(value))
  }
}
