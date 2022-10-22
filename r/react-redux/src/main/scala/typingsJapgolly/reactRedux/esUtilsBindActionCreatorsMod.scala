package typingsJapgolly.reactRedux

import typingsJapgolly.redux.mod.ActionCreatorsMapObject
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsBindActionCreatorsMod {
  
  @JSImport("react-redux/es/utils/bindActionCreators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(actionCreators: ActionCreatorsMapObject[Any], dispatch: Dispatch[AnyAction]): ActionCreatorsMapObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actionCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[ActionCreatorsMapObject[Any]]
}
