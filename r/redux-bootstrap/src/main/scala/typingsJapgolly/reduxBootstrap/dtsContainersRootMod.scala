package typingsJapgolly.reduxBootstrap

import typingsJapgolly.history.mod.History
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxBootstrap.dtsInterfacesInterfacesMod.interfaces.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsContainersRootMod {
  
  @JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(store: Store[Any, AnyAction], history: History, routes: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], history.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def default(store: Store[Any, AnyAction], history: History, routes: Element, routerProps: RouterProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], history.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], routerProps.asInstanceOf[js.Any])).asInstanceOf[Element]
}
