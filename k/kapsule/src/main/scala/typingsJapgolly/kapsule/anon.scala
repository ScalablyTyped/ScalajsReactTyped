package typingsJapgolly.kapsule

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<kapsule.kapsule.State> */
  trait PartialState extends StObject {
    
    var _rerender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var initialised: js.UndefOr[Boolean] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    extension [Self <: PartialState](x: Self) {
      
      inline def setInitialised(value: Boolean): Self = StObject.set(x, "initialised", value.asInstanceOf[js.Any])
      
      inline def setInitialisedUndefined: Self = StObject.set(x, "initialised", js.undefined)
      
      inline def set_rerender(value: Callback): Self = StObject.set(x, "_rerender", value.toJsFn)
      
      inline def set_rerenderUndefined: Self = StObject.set(x, "_rerender", js.undefined)
    }
  }
}
