package typingsJapgolly.crocks.mod

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object State {
  
  @JSImport("crocks", "State.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.stateMod.default
  object default {
    
    inline def apply(`val`: js.Function1[/* state */ scala.Any, typingsJapgolly.crocks.pairMod.default]): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
    
    @JSImport("crocks", "State.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def get(): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
    inline def get(fn: UnaryFunction): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
    
    /* static member */
    inline def modify(fn: UnaryFunction): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
    
    /* static member */
    inline def of(`val`: scala.Any): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
    
    /* static member */
    inline def put(`val`: scala.Any): typingsJapgolly.crocks.stateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.stateStateMod.State]
  }
}
