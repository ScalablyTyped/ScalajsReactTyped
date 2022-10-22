package typingsJapgolly.ionicons

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ael extends StObject {
    
    var ael: js.UndefOr[
        js.Function4[/* el */ Any, /* eventName */ String, /* listener */ Any, /* options */ Any, Unit]
      ] = js.undefined
    
    var ce: js.UndefOr[js.Function2[/* eventName */ String, /* opts */ js.UndefOr[Any], Any]] = js.undefined
    
    var jmp: js.UndefOr[js.Function1[/* c */ Any, Any]] = js.undefined
    
    var raf: js.UndefOr[js.Function1[/* c */ Any, Double]] = js.undefined
    
    var rel: js.UndefOr[
        js.Function4[/* el */ Any, /* eventName */ String, /* listener */ Any, /* options */ Any, Unit]
      ] = js.undefined
  }
  object Ael {
    
    inline def apply(): Ael = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ael]
    }
    
    extension [Self <: Ael](x: Self) {
      
      inline def setAel(value: (/* el */ Any, /* eventName */ String, /* listener */ Any, /* options */ Any) => Callback): Self = StObject.set(x, "ael", js.Any.fromFunction4((t0: /* el */ Any, t1: /* eventName */ String, t2: /* listener */ Any, t3: /* options */ Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAelUndefined: Self = StObject.set(x, "ael", js.undefined)
      
      inline def setCe(value: (/* eventName */ String, /* opts */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "ce", js.Any.fromFunction2(value))
      
      inline def setCeUndefined: Self = StObject.set(x, "ce", js.undefined)
      
      inline def setJmp(value: /* c */ Any => Any): Self = StObject.set(x, "jmp", js.Any.fromFunction1(value))
      
      inline def setJmpUndefined: Self = StObject.set(x, "jmp", js.undefined)
      
      inline def setRaf(value: /* c */ Any => Double): Self = StObject.set(x, "raf", js.Any.fromFunction1(value))
      
      inline def setRafUndefined: Self = StObject.set(x, "raf", js.undefined)
      
      inline def setRel(value: (/* el */ Any, /* eventName */ String, /* listener */ Any, /* options */ Any) => Callback): Self = StObject.set(x, "rel", js.Any.fromFunction4((t0: /* el */ Any, t1: /* eventName */ String, t2: /* listener */ Any, t3: /* options */ Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    }
  }
}
