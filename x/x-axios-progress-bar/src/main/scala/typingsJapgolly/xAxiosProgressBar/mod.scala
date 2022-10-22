package typingsJapgolly.xAxiosProgressBar

import typingsJapgolly.axios.mod.AxiosInstance
import typingsJapgolly.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("x-axios-progress-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadProgressBar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")().asInstanceOf[Unit]
  inline def loadProgressBar(config: Unit, instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadProgressBar(config: AxiosRequestConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadProgressBar(config: AxiosRequestConfig[Any], instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var progress: js.UndefOr[Boolean] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): typingsJapgolly.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig]
      }
      
      extension [Self <: typingsJapgolly.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig](x: Self) {
        
        inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      }
    }
  }
}
