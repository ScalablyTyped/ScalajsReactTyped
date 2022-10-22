package typingsJapgolly.listr2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePromptOptionsWithName
  extends StObject
     with BasePromptOptions {
  
  var name: String | js.Function0[String]
}
object BasePromptOptionsWithName {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): BasePromptOptionsWithName = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePromptOptionsWithName]
  }
  
  extension [Self <: BasePromptOptionsWithName](x: Self) {
    
    inline def setName(value: String | js.Function0[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
  }
}
