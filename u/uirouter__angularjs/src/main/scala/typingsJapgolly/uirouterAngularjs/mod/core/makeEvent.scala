package typingsJapgolly.uirouterAngularjs.mod.core

import typingsJapgolly.uirouterCore.transitionInterfaceMod.IHookRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.makeEvent")
@js.native
object makeEvent extends js.Object {
  def apply(
    registry: IHookRegistry,
    transitionService: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
}

