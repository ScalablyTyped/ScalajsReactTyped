package typingsJapgolly.retryAsPromised

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bluebird.mod.Thenable
import typingsJapgolly.retryAsPromised.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("retry-as-promised", JSImport.Namespace)
  @js.native
  val ^ : RetryAsPromisedStatic = js.native
  
  type MatchOption = String | js.RegExp | js.Error
  
  trait Options extends StObject {
    
    @JSName("$current")
    var $current: js.UndefOr[Double] = js.undefined
    
    var backoffBase: js.UndefOr[Double] = js.undefined
    
    var backoffExponent: js.UndefOr[Double] = js.undefined
    
    var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var report: js.UndefOr[
        js.Function3[/* message */ String, /* obj */ this.type, /* err */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def set$current(value: Double): Self = StObject.set(x, "$current", value.asInstanceOf[js.Any])
      
      inline def set$currentUndefined: Self = StObject.set(x, "$current", js.undefined)
      
      inline def setBackoffBase(value: Double): Self = StObject.set(x, "backoffBase", value.asInstanceOf[js.Any])
      
      inline def setBackoffBaseUndefined: Self = StObject.set(x, "backoffBase", js.undefined)
      
      inline def setBackoffExponent(value: Double): Self = StObject.set(x, "backoffExponent", value.asInstanceOf[js.Any])
      
      inline def setBackoffExponentUndefined: Self = StObject.set(x, "backoffExponent", js.undefined)
      
      inline def setMatch(value: js.Array[MatchOption] | MatchOption): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: MatchOption*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReport(value: (/* message */ String, Options, /* err */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "report", js.Any.fromFunction3((t0: /* message */ String, t1: Options, t2: /* err */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[Any], 
    /* options */ Options | Double, 
    typingsJapgolly.bluebird.mod.^[Any]
  ]
  
  type RetryCallback[T] = js.Function1[/* hasCurrent */ Current, Thenable[T]]
  
  type _To = RetryAsPromisedStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RetryAsPromisedStatic = ^
}
