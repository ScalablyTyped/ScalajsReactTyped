package typingsJapgolly.node.anon

import typingsJapgolly.node.utilMod.ParseArgsConfig
import typingsJapgolly.node.utilMod.ParsedOptionToken
import typingsJapgolly.node.utilMod.ParsedPositionalToken
import typingsJapgolly.node.utilMod.ParsedPositionals
import typingsJapgolly.node.utilMod.ParsedTokens
import typingsJapgolly.node.utilMod.ParsedValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positionals[T /* <: ParseArgsConfig */] extends StObject {
  
  var positionals: ParsedPositionals[T]
  
  var tokens: ParsedTokens[T]
  
  var values: ParsedValues[T]
}
object Positionals {
  
  inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], tokens: ParsedTokens[T], values: ParsedValues[T]): Positionals[T] = {
    val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positionals[T]]
  }
  
  extension [Self <: Positionals[?], T /* <: ParseArgsConfig */](x: Self & Positionals[T]) {
    
    inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: ParsedTokens[T]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: (ParsedOptionToken[T] | ParsedPositionalToken[T] | IndexKind)*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
