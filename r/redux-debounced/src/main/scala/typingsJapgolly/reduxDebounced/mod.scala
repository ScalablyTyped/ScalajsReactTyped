package typingsJapgolly.reduxDebounced

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-debounced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
}
