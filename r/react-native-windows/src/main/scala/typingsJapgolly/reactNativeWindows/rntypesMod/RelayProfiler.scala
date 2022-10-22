package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayProfiler extends StObject {
  
  def attachAggregateHandler(name: String, handler: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]): Unit
  
  def attachProfileHandler(
    name: String,
    handler: js.Function2[/* name */ String, /* state */ js.UndefOr[Any], js.Function0[Unit]]
  ): Unit
}
object RelayProfiler {
  
  inline def apply(
    attachAggregateHandler: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Callback,
    attachProfileHandler: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[Any], js.Function0[Unit]]) => Callback
  ): RelayProfiler = {
    val __obj = js.Dynamic.literal(attachAggregateHandler = js.Any.fromFunction2((t0: String, t1: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => (attachAggregateHandler(t0, t1)).runNow()), attachProfileHandler = js.Any.fromFunction2((t0: String, t1: js.Function2[/* name */ String, /* state */ js.UndefOr[Any], js.Function0[Unit]]) => (attachProfileHandler(t0, t1)).runNow()))
    __obj.asInstanceOf[RelayProfiler]
  }
  
  extension [Self <: RelayProfiler](x: Self) {
    
    inline def setAttachAggregateHandler(
      value: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Callback
    ): Self = StObject.set(x, "attachAggregateHandler", js.Any.fromFunction2((t0: String, t1: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setAttachProfileHandler(
      value: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[Any], js.Function0[Unit]]) => Callback
    ): Self = StObject.set(x, "attachProfileHandler", js.Any.fromFunction2((t0: String, t1: js.Function2[/* name */ String, /* state */ js.UndefOr[Any], js.Function0[Unit]]) => (value(t0, t1)).runNow()))
  }
}
