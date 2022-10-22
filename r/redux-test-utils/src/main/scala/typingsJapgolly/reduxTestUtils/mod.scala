package typingsJapgolly.reduxTestUtils

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.reduxTestUtils.distUtilsDispatchMockMod.MockDispatch
import typingsJapgolly.reduxTestUtils.distUtilsStoreMockMod.MockStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockDispatch[T /* <: AnyAction */](): MockDispatch[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockDispatch")().asInstanceOf[MockDispatch[T]]
  
  inline def createMockStore[S, T /* <: AnyAction */](state: S): MockStore[S, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockStore")(state.asInstanceOf[js.Any]).asInstanceOf[MockStore[S, T]]
}
