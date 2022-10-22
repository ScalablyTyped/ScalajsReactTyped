package typingsJapgolly.resourceLoader

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy.OnCompleteSignal
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy.OnErrorSignal
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy.OnProgressSignal
import typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType
import typingsJapgolly.typeSignals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadStrategiesAbstractLoadStrategyMod {
  
  /* note: abstract class */ @JSImport("resource-loader/dist/load_strategies/AbstractLoadStrategy", "AbstractLoadStrategy")
  @js.native
  open class AbstractLoadStrategy[C /* <: ILoadConfig */] protected () extends StObject {
    def this(config: C) = this()
    
    def abort(): Unit = js.native
    
    val config: C = js.native
    
    def load(): Unit = js.native
    
    val onComplete: Signal[OnCompleteSignal] = js.native
    
    val onError: Signal[OnErrorSignal] = js.native
    
    val onProgress: Signal[OnProgressSignal] = js.native
  }
  object AbstractLoadStrategy {
    
    type OnCompleteSignal = js.Function2[/* type */ ResourceType, /* data */ Any, Unit]
    
    type OnErrorSignal = js.Function1[/* errMessage */ String, Unit]
    
    type OnProgressSignal = js.Function1[/* percent */ Double, Unit]
  }
  
  type AbstractLoadStrategyCtor[C /* <: ILoadConfig */] = Instantiable1[/* config */ C, AbstractLoadStrategy[C]]
  
  trait ILoadConfig extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object ILoadConfig {
    
    inline def apply(url: String): ILoadConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadConfig]
    }
    
    extension [Self <: ILoadConfig](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
