package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdUtils.anon.ReadonlyActiveDescendantC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementActiveDescendantContextMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/activeDescendantContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/keyboardMovement/activeDescendantContext", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  trait ActiveDescendantContext extends StObject {
    
    var activeId: String
    
    var setActiveId: Dispatch[SetStateAction[String]]
  }
  object ActiveDescendantContext {
    
    inline def apply(activeId: String, setActiveId: SetStateAction[String] => Callback): ActiveDescendantContext = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1((t0: SetStateAction[String]) => setActiveId(t0).runNow()))
      __obj.asInstanceOf[ActiveDescendantContext]
    }
    
    extension [Self <: ActiveDescendantContext](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setSetActiveId(value: SetStateAction[String] => Callback): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1((t0: SetStateAction[String]) => value(t0).runNow()))
    }
  }
}
