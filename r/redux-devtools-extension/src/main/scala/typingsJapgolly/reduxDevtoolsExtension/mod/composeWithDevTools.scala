package typingsJapgolly.reduxDevtoolsExtension.mod

import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.reduxDevtoolsExtension.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension", "composeWithDevTools")
@js.native
object composeWithDevTools extends js.Object {
  def apply(options: EnhancerOptions): FnCall = js.native
  def apply[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
}

