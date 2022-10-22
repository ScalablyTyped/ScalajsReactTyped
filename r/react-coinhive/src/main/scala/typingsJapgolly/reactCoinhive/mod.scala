package typingsJapgolly.reactCoinhive

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactCoinhive.anon.Authedmine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  open class default () extends CoinHive
  /* static members */
  object default {
    
    @JSImport("react-coinhive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getMinerData(miner: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinerData")(miner.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("react-coinhive", "default.src")
    @js.native
    def src: Authedmine = js.native
    inline def src_=(x: Authedmine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("src")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CoinHive extends Component[CoinHiveProps, Any, Any] {
    
    def onInit(miner: Any): Any = js.native
    
    def onStart(miner: Any): Any = js.native
    
    def onStop(miner: Any): Any = js.native
  }
  
  trait CoinHiveProps extends StObject {
    
    var autoThreads: js.UndefOr[Boolean] = js.undefined
    
    var onInit: js.UndefOr[js.Function1[/* callback */ Any, Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* callback */ Any, Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function1[/* callback */ Any, Unit]] = js.undefined
    
    var run: js.UndefOr[Boolean] = js.undefined
    
    var siteKey: String
    
    var src: js.UndefOr[String] = js.undefined
    
    var threads: js.UndefOr[Double] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var userName: js.UndefOr[String] = js.undefined
  }
  object CoinHiveProps {
    
    inline def apply(siteKey: String): CoinHiveProps = {
      val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoinHiveProps]
    }
    
    extension [Self <: CoinHiveProps](x: Self) {
      
      inline def setAutoThreads(value: Boolean): Self = StObject.set(x, "autoThreads", value.asInstanceOf[js.Any])
      
      inline def setAutoThreadsUndefined: Self = StObject.set(x, "autoThreads", js.undefined)
      
      inline def setOnInit(value: /* callback */ Any => Callback): Self = StObject.set(x, "onInit", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnStart(value: /* callback */ Any => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnStop(value: /* callback */ Any => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setRun(value: Boolean): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
