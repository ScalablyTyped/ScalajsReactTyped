package typingsJapgolly.reduxDashDevtoolsDashExtension.reduxDashDevtoolsDashExtensionMod

import typingsJapgolly.redux.reduxMod.StoreEnhancer
import typingsJapgolly.reduxDashDevtoolsDashExtension.Fn_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension", "composeWithDevTools")
@js.native
object composeWithDevTools extends js.Object {
  def apply(options: EnhancerOptions): Fn_A = js.native
  def apply[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
}

