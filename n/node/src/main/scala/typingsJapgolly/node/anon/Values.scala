package typingsJapgolly.node.anon

import typingsJapgolly.node.utilMod.ParseArgsConfig
import typingsJapgolly.node.utilMod.ParsedPositionals
import typingsJapgolly.node.utilMod.ParsedValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values[T /* <: ParseArgsConfig */] extends StObject {
  
  var positionals: ParsedPositionals[T]
  
  var values: ParsedValues[T]
}
object Values {
  
  inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], values: ParsedValues[T]): Values[T] = {
    val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
  
  extension [Self <: Values[?], T /* <: ParseArgsConfig */](x: Self & Values[T]) {
    
    inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
    
    inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
