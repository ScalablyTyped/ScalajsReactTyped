package typingsJapgolly.jqueryCountto

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryCountto.jqueryCounttoStrings.start
    - typingsJapgolly.jqueryCountto.jqueryCounttoStrings.stop
    - typingsJapgolly.jqueryCountto.jqueryCounttoStrings.toggle
    - typingsJapgolly.jqueryCountto.jqueryCounttoStrings.restart
  */
  trait Method extends StObject
  object Method {
    
    inline def restart: typingsJapgolly.jqueryCountto.jqueryCounttoStrings.restart = "restart".asInstanceOf[typingsJapgolly.jqueryCountto.jqueryCounttoStrings.restart]
    
    inline def start: typingsJapgolly.jqueryCountto.jqueryCounttoStrings.start = "start".asInstanceOf[typingsJapgolly.jqueryCountto.jqueryCounttoStrings.start]
    
    inline def stop: typingsJapgolly.jqueryCountto.jqueryCounttoStrings.stop = "stop".asInstanceOf[typingsJapgolly.jqueryCountto.jqueryCounttoStrings.stop]
    
    inline def toggle: typingsJapgolly.jqueryCountto.jqueryCounttoStrings.toggle = "toggle".asInstanceOf[typingsJapgolly.jqueryCountto.jqueryCounttoStrings.toggle]
  }
  
  /* Inlined std.Partial<{  from :number,   to :number,   speed :number,   refreshInterval :number,   decimals :number, formatter (value : number, options : jquery-countto.jquery-countto.Options): string, onUpdate (value : number): void, onComplete (value : number): void}> */
  trait Options extends StObject {
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var formatter: js.UndefOr[js.Function2[/* value */ Double, /* options */ this.type, String]] = js.undefined
    
    var from: js.UndefOr[Double] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var refreshInterval: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setFormatter(value: (/* value */ Double, Options) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setOnComplete(value: /* value */ Double => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnUpdate(value: /* value */ Double => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def countTo(): JQuery = js.native
      def countTo(methodOrOptions: Method): JQuery = js.native
      def countTo(methodOrOptions: Options): JQuery = js.native
    }
  }
}
