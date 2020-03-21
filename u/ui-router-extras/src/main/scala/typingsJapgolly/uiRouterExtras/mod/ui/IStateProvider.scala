package typingsJapgolly.uiRouterExtras.mod.ui

import typingsJapgolly.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateProvider extends IServiceProvider {
  def state(config: IStickyState): IStateProvider = js.native
  def state(name: String, config: IStickyState): IStateProvider = js.native
}

