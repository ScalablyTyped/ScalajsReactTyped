package typingsJapgolly.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.libInterfaceMod.Disposable
import typingsJapgolly.uirouterCore.libRouterMod.UIRouter
import typingsJapgolly.uirouterCore.libStateInterfaceMod._StateDeclaration
import typingsJapgolly.uirouterCore.libStateStateBuilderMod.StateBuilder
import typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject
import typingsJapgolly.uirouterCore.libStateStateRegistryMod.StateRegistryListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateStateQueueManagerMod {
  
  @JSImport("@uirouter/core/lib/state/stateQueueManager", "StateQueueManager")
  @js.native
  open class StateQueueManager protected ()
    extends StObject
       with Disposable {
    def this(
      router: UIRouter,
      states: StringDictionary[StateObject],
      builder: StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
    
    def attachRoute(state: StateObject): Unit = js.native
    
    var builder: StateBuilder = js.native
    
    def flush(): StringDictionary[StateObject] = js.native
    
    var listeners: js.Array[StateRegistryListener] = js.native
    
    var queue: js.Array[StateObject] = js.native
    
    def register(stateDecl: _StateDeclaration): StateObject = js.native
    
    /* private */ var router: Any = js.native
    
    var states: StringDictionary[StateObject] = js.native
  }
}
