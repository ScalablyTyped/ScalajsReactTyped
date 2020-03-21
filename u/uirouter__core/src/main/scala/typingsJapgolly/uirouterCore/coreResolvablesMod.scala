package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/coreResolvables", JSImport.Namespace)
@js.native
object coreResolvablesMod extends js.Object {
  def registerAddCoreResolvables(transitionService: TransitionService): js.Function = js.native
  def treeChangesCleanup(trans: Transition): Unit = js.native
}

