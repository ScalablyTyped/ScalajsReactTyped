package typingsJapgolly.reduxDevtoolsExtension

import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.reduxDevtoolsExtension.anon.FnCall
import typingsJapgolly.reduxDevtoolsExtension.mod.EnhancerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentOnlyMod {
  
  @JSImport("redux-devtools-extension/developmentOnly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeWithDevTools(options: EnhancerOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StoreEnhancer[StoreExt, js.Object]]
  
  inline def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("devToolsEnhancer")(options.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[Any, js.Object]]
}
