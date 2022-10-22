package typingsJapgolly.swr

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.swr.anon.RecordkeyofStateanyanyboo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsStateMod {
  
  @JSImport("swr/dist/utils/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStateWithDeps[Data, Error_1, S](state: S, unmountedRef: MutableRefObject[Boolean]): js.Tuple3[MutableRefObject[S], RecordkeyofStateanyanyboo, js.Function1[/* payload */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStateWithDeps")(state.asInstanceOf[js.Any], unmountedRef.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[MutableRefObject[S], RecordkeyofStateanyanyboo, js.Function1[/* payload */ S, Unit]]]
  
  /* keyof swr.swr/dist/types.State<any, any> */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.swr.swrStrings.data
    - typingsJapgolly.swr.swrStrings.error
    - typingsJapgolly.swr.swrStrings.isValidating
  */
  trait StateKeys extends StObject
}
