package typingsJapgolly.reduxDashDevtoolsDashExtension

import typingsJapgolly.redux.reduxMod.StoreEnhancer
import typingsJapgolly.reduxDashDevtoolsDashExtension.reduxDashDevtoolsDashExtensionMod.EnhancerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension/logOnlyInProduction", JSImport.Namespace)
@js.native
object logOnlyInProductionMod extends js.Object {
  def composeWithDevTools(options: EnhancerOptions): Fn_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}

