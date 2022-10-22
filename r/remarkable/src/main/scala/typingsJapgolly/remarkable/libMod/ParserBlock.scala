package typingsJapgolly.remarkable.libMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserBlock extends StObject {
  
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  
  def tokenize(state: StateBlock, startLine: Double, endLine: Double): Unit
}
object ParserBlock {
  
  inline def apply(
    parse: (String, Options, Env, js.Array[Token]) => Callback,
    tokenize: (StateBlock, Double, Double) => Callback
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4((t0: String, t1: Options, t2: Env, t3: js.Array[Token]) => (parse(t0, t1, t2, t3)).runNow()), tokenize = js.Any.fromFunction3((t0: StateBlock, t1: Double, t2: Double) => (tokenize(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ParserBlock]
  }
  
  extension [Self <: ParserBlock](x: Self) {
    
    inline def setParse(value: (String, Options, Env, js.Array[Token]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction4((t0: String, t1: Options, t2: Env, t3: js.Array[Token]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setTokenize(value: (StateBlock, Double, Double) => Callback): Self = StObject.set(x, "tokenize", js.Any.fromFunction3((t0: StateBlock, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
