package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteCompletionsCache extends StObject {
  
  def clear(): Unit
  
  def get(): js.UndefOr[CompletionInfo]
  
  def set(response: CompletionInfo): Unit
}
object IncompleteCompletionsCache {
  
  inline def apply(clear: Callback, get: CallbackTo[js.UndefOr[CompletionInfo]], set: CompletionInfo => Callback): IncompleteCompletionsCache = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = get.toJsFn, set = js.Any.fromFunction1((t0: CompletionInfo) => set(t0).runNow()))
    __obj.asInstanceOf[IncompleteCompletionsCache]
  }
  
  extension [Self <: IncompleteCompletionsCache](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGet(value: CallbackTo[js.UndefOr[CompletionInfo]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: CompletionInfo => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: CompletionInfo) => value(t0).runNow()))
  }
}
