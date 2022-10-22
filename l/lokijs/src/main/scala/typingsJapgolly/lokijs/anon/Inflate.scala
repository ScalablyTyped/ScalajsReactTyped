package typingsJapgolly.lokijs.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inflate extends StObject {
  
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.undefined
  
  var proto: js.UndefOr[Any] = js.undefined
}
object Inflate {
  
  inline def apply(): Inflate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inflate]
  }
  
  extension [Self <: Inflate](x: Self) {
    
    inline def setInflate(value: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Callback): Self = StObject.set(x, "inflate", js.Any.fromFunction2((t0: /* src */ js.Object, t1: /* dest */ js.UndefOr[js.Object]) => (value(t0, t1)).runNow()))
    
    inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    inline def setProto(value: Any): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
  }
}
