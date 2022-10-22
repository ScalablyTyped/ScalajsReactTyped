package typingsJapgolly.javascriptStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncFunction extends StObject {
    
    var AsyncFunction: String
    
    var AsyncGeneratorFunction: String
    
    var Function: String
    
    var GeneratorFunction: String
  }
  object AsyncFunction {
    
    inline def apply(AsyncFunction: String, AsyncGeneratorFunction: String, Function: String, GeneratorFunction: String): AsyncFunction = {
      val __obj = js.Dynamic.literal(AsyncFunction = AsyncFunction.asInstanceOf[js.Any], AsyncGeneratorFunction = AsyncGeneratorFunction.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GeneratorFunction = GeneratorFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncFunction]
    }
    
    extension [Self <: AsyncFunction](x: Self) {
      
      inline def setAsyncFunction(value: String): Self = StObject.set(x, "AsyncFunction", value.asInstanceOf[js.Any])
      
      inline def setAsyncGeneratorFunction(value: String): Self = StObject.set(x, "AsyncGeneratorFunction", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: String): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
      
      inline def setGeneratorFunction(value: String): Self = StObject.set(x, "GeneratorFunction", value.asInstanceOf[js.Any])
    }
  }
}
