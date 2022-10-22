package typingsJapgolly.diff

import typingsJapgolly.diff.mod.Callback
import typingsJapgolly.diff.mod.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
  trait ArrayOptionsanyanyPartial extends StObject {
    
    var callback: js.UndefOr[Callback] = js.undefined
    
    /**
      * Comparator for custom equality checks.
      */
    var comparator: js.UndefOr[js.Function2[/* left */ Any, /* right */ Any, Boolean]] = js.undefined
    
    /**
      * `true` to ignore casing difference.
      * @default false
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
  }
  object ArrayOptionsanyanyPartial {
    
    inline def apply(): ArrayOptionsanyanyPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayOptionsanyanyPartial]
    }
    
    extension [Self <: ArrayOptionsanyanyPartial](x: Self) {
      
      inline def setCallback(
        value: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* err */ Unit, t1: /* value */ js.UndefOr[js.Array[Change]]) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setComparator(value: (/* left */ Any, /* right */ Any) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    }
  }
  
  trait Strict extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Strict {
    
    inline def apply(): Strict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Strict]
    }
    
    extension [Self <: Strict](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
