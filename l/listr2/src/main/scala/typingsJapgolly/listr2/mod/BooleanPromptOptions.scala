package typingsJapgolly.listr2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanPromptOptions
  extends StObject
     with BasePromptOptions {
  
  @JSName("initial")
  var initial_BooleanPromptOptions: js.UndefOr[Boolean | (js.Function0[js.Promise[String] | String])] = js.undefined
}
object BooleanPromptOptions {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String])): BooleanPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanPromptOptions]
  }
  
  extension [Self <: BooleanPromptOptions](x: Self) {
    
    inline def setInitial(value: Boolean | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialCallbackTo(value: CallbackTo[js.Promise[String] | String]): Self = StObject.set(x, "initial", value.toJsFn)
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
  }
}
