package typingsJapgolly.router5

import typingsJapgolly.router5.baseMod.DoneFn
import typingsJapgolly.router5.baseMod.NavigationOptions
import typingsJapgolly.router5.baseMod.State
import typingsJapgolly.router5.routerMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5/types/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  def default(router: Router, toState: State, fromState: Null, opts: NavigationOptions, callback: DoneFn): js.Function0[Unit] = js.native
  def default(router: Router, toState: State, fromState: State, opts: NavigationOptions, callback: DoneFn): js.Function0[Unit] = js.native
}

