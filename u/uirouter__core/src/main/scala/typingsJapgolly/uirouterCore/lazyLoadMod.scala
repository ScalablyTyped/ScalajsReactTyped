package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.stateInterfaceMod.LazyLoadResult
import typingsJapgolly.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/lazyLoad", JSImport.Namespace)
@js.native
object lazyLoadMod extends js.Object {
  def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
  def registerLazyLoadHook(transitionService: TransitionService): js.Function = js.native
}

