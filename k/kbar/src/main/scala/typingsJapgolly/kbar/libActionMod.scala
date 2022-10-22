package typingsJapgolly.kbar

import typingsJapgolly.kbar.libActionActionImplMod.ActionImplOptions
import typingsJapgolly.kbar.libActionActionInterfaceMod.ActionInterfaceOptions
import typingsJapgolly.kbar.libTypesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionMod {
  
  @JSImport("kbar/lib/action", "ActionImpl")
  @js.native
  open class ActionImpl protected ()
    extends typingsJapgolly.kbar.libActionActionImplMod.ActionImpl {
    def this(action: Action, options: ActionImplOptions) = this()
  }
  /* static members */
  object ActionImpl {
    
    @JSImport("kbar/lib/action", "ActionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(action: Action, options: ActionImplOptions): typingsJapgolly.kbar.libActionActionImplMod.ActionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kbar.libActionActionImplMod.ActionImpl]
  }
  
  @JSImport("kbar/lib/action", "ActionInterface")
  @js.native
  open class ActionInterface ()
    extends typingsJapgolly.kbar.libActionActionInterfaceMod.ActionInterface {
    def this(actions: js.Array[Action]) = this()
    def this(actions: js.Array[Action], options: ActionInterfaceOptions) = this()
    def this(actions: Unit, options: ActionInterfaceOptions) = this()
  }
}
