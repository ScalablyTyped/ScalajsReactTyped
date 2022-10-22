package typingsJapgolly.angularUiRouter.mod.core

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.libStateStateRegistryMod.StateRegistryListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.StateQueueManager")
@js.native
open class StateQueueManager protected ()
  extends typingsJapgolly.uirouterCore.mod.StateQueueManager {
  def this(
    router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter,
    states: StringDictionary[typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject],
    builder: typingsJapgolly.uirouterCore.libStateStateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}
