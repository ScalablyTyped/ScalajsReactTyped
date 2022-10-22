package typingsJapgolly.reactQuery.typesCoreQueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactQuery.typesCoreQueryMod.ContinueAction
  - typingsJapgolly.reactQuery.typesCoreQueryMod.ErrorAction[TError]
  - typingsJapgolly.reactQuery.typesCoreQueryMod.FailedAction
  - typingsJapgolly.reactQuery.typesCoreQueryMod.FetchAction
  - typingsJapgolly.reactQuery.typesCoreQueryMod.InvalidateAction
  - typingsJapgolly.reactQuery.typesCoreQueryMod.PauseAction
  - typingsJapgolly.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError]
  - typingsJapgolly.reactQuery.typesCoreQueryMod.SuccessAction[TData]
*/
trait Action[TData, TError] extends StObject
object Action {
  
  inline def ContinueAction(): typingsJapgolly.reactQuery.typesCoreQueryMod.ContinueAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("continue")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.ContinueAction]
  }
  
  inline def ErrorAction[TError](error: TError): typingsJapgolly.reactQuery.typesCoreQueryMod.ErrorAction[TError] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.ErrorAction[TError]]
  }
  
  inline def FailedAction(): typingsJapgolly.reactQuery.typesCoreQueryMod.FailedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("failed")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.FailedAction]
  }
  
  inline def FetchAction(): typingsJapgolly.reactQuery.typesCoreQueryMod.FetchAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fetch")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.FetchAction]
  }
  
  inline def InvalidateAction(): typingsJapgolly.reactQuery.typesCoreQueryMod.InvalidateAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("invalidate")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.InvalidateAction]
  }
  
  inline def PauseAction(): typingsJapgolly.reactQuery.typesCoreQueryMod.PauseAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.PauseAction]
  }
  
  inline def SetStateAction[TData, TError](state: QueryState[TData, TError]): typingsJapgolly.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setState")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError]]
  }
  
  inline def SuccessAction[TData](): typingsJapgolly.reactQuery.typesCoreQueryMod.SuccessAction[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryMod.SuccessAction[TData]]
  }
}
