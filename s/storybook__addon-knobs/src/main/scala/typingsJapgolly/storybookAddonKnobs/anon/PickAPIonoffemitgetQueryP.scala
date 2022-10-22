package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.storybookApi.distTs3Dot9ModulesUrlMod.QueryParams
import typingsJapgolly.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
trait PickAPIonoffemitgetQueryP extends StObject {
  
  var emit: js.Function2[/* type */ String, /* repeated */ Any, Unit]
  
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]]
  
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit]
  
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]]
  
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit]
}
object PickAPIonoffemitgetQueryP {
  
  inline def apply(
    emit: (/* type */ String, /* repeated */ Any) => japgolly.scalajs.react.Callback,
    getQueryParam: /* key */ String => js.UndefOr[String],
    off: (/* type */ String, /* cb */ Listener) => japgolly.scalajs.react.Callback,
    on: (/* type */ String, /* cb */ Listener) => js.Function0[Unit],
    setQueryParams: /* input */ QueryParams => japgolly.scalajs.react.Callback
  ): PickAPIonoffemitgetQueryP = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: /* type */ String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), getQueryParam = js.Any.fromFunction1(getQueryParam), off = js.Any.fromFunction2((t0: /* type */ String, t1: /* cb */ Listener) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2(on), setQueryParams = js.Any.fromFunction1((t0: /* input */ QueryParams) => setQueryParams(t0).runNow()))
    __obj.asInstanceOf[PickAPIonoffemitgetQueryP]
  }
  
  extension [Self <: PickAPIonoffemitgetQueryP](x: Self) {
    
    inline def setEmit(value: (/* type */ String, /* repeated */ Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: /* type */ String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setGetQueryParam(value: /* key */ String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
    
    inline def setOff(value: (/* type */ String, /* cb */ Listener) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: /* type */ String, t1: /* cb */ Listener) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (/* type */ String, /* cb */ Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSetQueryParams(value: /* input */ QueryParams => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1((t0: /* input */ QueryParams) => value(t0).runNow()))
  }
}
