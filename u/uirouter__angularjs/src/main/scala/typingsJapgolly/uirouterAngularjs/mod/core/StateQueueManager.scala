package typingsJapgolly.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.stateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typingsJapgolly.uirouterCore.mod.StateQueueManager {
  def this(
    router: typingsJapgolly.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typingsJapgolly.uirouterCore.stateObjectMod.StateObject],
    builder: typingsJapgolly.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

