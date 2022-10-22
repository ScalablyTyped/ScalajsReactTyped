package typingsJapgolly.svelte

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeActionMod {
  
  type Action[Element, Parameter, Attributes /* <: Record[String, Any] */] = js.Function2[
    /* node */ Element, 
    /* parameter */ js.UndefOr[Parameter], 
    Unit | (ActionReturn[Parameter, Attributes])
  ]
  
  trait ActionReturn[Parameter, Attributes /* <: Record[String, Any] */] extends StObject {
    
    /**
      * ### DO NOT USE THIS
      * This exists solely for type-checking and has no effect at runtime.
      * Set this through the `Attributes` generic instead.
      */
    @JSName("$$_attributes")
    var DollarDollar_attributes: js.UndefOr[Attributes] = js.undefined
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var update: js.UndefOr[js.Function1[/* parameter */ Parameter, Unit]] = js.undefined
  }
  object ActionReturn {
    
    inline def apply[Parameter, Attributes /* <: Record[String, Any] */](): ActionReturn[Parameter, Attributes] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionReturn[Parameter, Attributes]]
    }
    
    extension [Self <: ActionReturn[?, ?], Parameter, Attributes /* <: Record[String, Any] */](x: Self & (ActionReturn[Parameter, Attributes])) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDollarDollar_attributes(value: Attributes): Self = StObject.set(x, "$$_attributes", value.asInstanceOf[js.Any])
      
      inline def setDollarDollar_attributesUndefined: Self = StObject.set(x, "$$_attributes", js.undefined)
      
      inline def setUpdate(value: /* parameter */ Parameter => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* parameter */ Parameter) => value(t0).runNow()))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
