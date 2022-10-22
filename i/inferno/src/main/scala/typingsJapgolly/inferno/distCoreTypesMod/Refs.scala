package typingsJapgolly.inferno.distCoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refs[P] extends StObject {
  
  var onComponentDidMount: js.UndefOr[js.Function2[/* domNode */ Element | Null, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentDidUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentShouldUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Boolean]] = js.undefined
  
  var onComponentWillMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onComponentWillUnmount: js.UndefOr[js.Function2[/* domNode */ Element, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentWillUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Unit]] = js.undefined
}
object Refs {
  
  inline def apply[P](): Refs[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refs[P]]
  }
  
  extension [Self <: Refs[?], P](x: Self & Refs[P]) {
    
    inline def setOnComponentDidMount(value: (/* domNode */ Element | Null, /* nextProps */ P) => Callback): Self = StObject.set(x, "onComponentDidMount", js.Any.fromFunction2((t0: /* domNode */ Element | Null, t1: /* nextProps */ P) => (value(t0, t1)).runNow()))
    
    inline def setOnComponentDidMountUndefined: Self = StObject.set(x, "onComponentDidMount", js.undefined)
    
    inline def setOnComponentDidUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Callback): Self = StObject.set(x, "onComponentDidUpdate", js.Any.fromFunction2((t0: /* lastProps */ P, t1: /* nextProps */ P) => (value(t0, t1)).runNow()))
    
    inline def setOnComponentDidUpdateUndefined: Self = StObject.set(x, "onComponentDidUpdate", js.undefined)
    
    inline def setOnComponentShouldUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Boolean): Self = StObject.set(x, "onComponentShouldUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentShouldUpdateUndefined: Self = StObject.set(x, "onComponentShouldUpdate", js.undefined)
    
    inline def setOnComponentWillMount(value: Callback): Self = StObject.set(x, "onComponentWillMount", value.toJsFn)
    
    inline def setOnComponentWillMountUndefined: Self = StObject.set(x, "onComponentWillMount", js.undefined)
    
    inline def setOnComponentWillUnmount(value: (/* domNode */ Element, /* nextProps */ P) => Callback): Self = StObject.set(x, "onComponentWillUnmount", js.Any.fromFunction2((t0: /* domNode */ Element, t1: /* nextProps */ P) => (value(t0, t1)).runNow()))
    
    inline def setOnComponentWillUnmountUndefined: Self = StObject.set(x, "onComponentWillUnmount", js.undefined)
    
    inline def setOnComponentWillUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Callback): Self = StObject.set(x, "onComponentWillUpdate", js.Any.fromFunction2((t0: /* lastProps */ P, t1: /* nextProps */ P) => (value(t0, t1)).runNow()))
    
    inline def setOnComponentWillUpdateUndefined: Self = StObject.set(x, "onComponentWillUpdate", js.undefined)
  }
}
