package typingsJapgolly.achingbrainSsdp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.achingbrainSsdp.distSrcAdvertiseMod.Advert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/adverts", "adverts")
  @js.native
  val adverts: Adverts_ = js.native
  
  trait Adverts_ extends StObject {
    
    def add(advert: CachedAdvert): Unit
    
    /* private */ var adverts: Any
    
    def clear(): Unit
    
    def forEach(fn: js.Function1[/* advert */ Advert, Unit]): Unit
    
    def remove(advert: CachedAdvert): Unit
    
    def stopAll(): js.Promise[Unit]
  }
  object Adverts_ {
    
    inline def apply(
      add: CachedAdvert => Callback,
      adverts: Any,
      clear: Callback,
      forEach: js.Function1[/* advert */ Advert, Unit] => Callback,
      remove: CachedAdvert => Callback,
      stopAll: CallbackTo[js.Promise[Unit]]
    ): Adverts_ = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: CachedAdvert) => add(t0).runNow()), adverts = adverts.asInstanceOf[js.Any], clear = clear.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function1[/* advert */ Advert, Unit]) => forEach(t0).runNow()), remove = js.Any.fromFunction1((t0: CachedAdvert) => remove(t0).runNow()), stopAll = stopAll.toJsFn)
      __obj.asInstanceOf[Adverts_]
    }
    
    extension [Self <: Adverts_](x: Self) {
      
      inline def setAdd(value: CachedAdvert => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: CachedAdvert) => value(t0).runNow()))
      
      inline def setAdverts(value: Any): Self = StObject.set(x, "adverts", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setForEach(value: js.Function1[/* advert */ Advert, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* advert */ Advert, Unit]) => value(t0).runNow()))
      
      inline def setRemove(value: CachedAdvert => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: CachedAdvert) => value(t0).runNow()))
      
      inline def setStopAll(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stopAll", value.toJsFn)
    }
  }
  
  trait CachedAdvert extends StObject {
    
    var service: Advert
    
    def stop(): js.Promise[Unit]
  }
  object CachedAdvert {
    
    inline def apply(service: Advert, stop: CallbackTo[js.Promise[Unit]]): CachedAdvert = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], stop = stop.toJsFn)
      __obj.asInstanceOf[CachedAdvert]
    }
    
    extension [Self <: CachedAdvert](x: Self) {
      
      inline def setService(value: Advert): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
