package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseBooleanMod {
  
  @JSImport("@uifabric/react-hooks/lib/useBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, IUseBooleanCallbacks]]
  
  trait IUseBooleanCallbacks extends StObject {
    
    /** Set the value to false. Always has the same identity. */
    def setFalse(): Unit
    
    /** Set the value to true. Always has the same identity. */
    def setTrue(): Unit
    
    /** Toggle the value. Always has the same identity. */
    def toggle(): Unit
  }
  object IUseBooleanCallbacks {
    
    inline def apply(setFalse: Callback, setTrue: Callback, toggle: Callback): IUseBooleanCallbacks = {
      val __obj = js.Dynamic.literal(setFalse = setFalse.toJsFn, setTrue = setTrue.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[IUseBooleanCallbacks]
    }
    
    extension [Self <: IUseBooleanCallbacks](x: Self) {
      
      inline def setSetFalse(value: Callback): Self = StObject.set(x, "setFalse", value.toJsFn)
      
      inline def setSetTrue(value: Callback): Self = StObject.set(x, "setTrue", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
