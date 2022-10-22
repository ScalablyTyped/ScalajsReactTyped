package typingsJapgolly.angularPdfjsViewer

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IServiceProvider
import typingsJapgolly.angularPdfjsViewer.angularPdfjsViewerStrings.errors
import typingsJapgolly.angularPdfjsViewer.angularPdfjsViewerStrings.infos
import typingsJapgolly.angularPdfjsViewer.angularPdfjsViewerStrings.warnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object pdfjsViewer {
    
    trait ConfigProvider
      extends StObject
         with IServiceProvider {
      
      def disableWorker(): Unit
      
      def setCmapDir(dir: String): Unit
      
      def setImageDir(dir: String): Unit
      
      def setVerbosity(verbosity: errors | warnings | infos): Unit
      
      def setWorkerSrc(src: String): Unit
    }
    object ConfigProvider {
      
      inline def apply(
        $get: Any,
        disableWorker: Callback,
        setCmapDir: String => Callback,
        setImageDir: String => Callback,
        setVerbosity: errors | warnings | infos => Callback,
        setWorkerSrc: String => Callback
      ): ConfigProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableWorker = disableWorker.toJsFn, setCmapDir = js.Any.fromFunction1((t0: String) => setCmapDir(t0).runNow()), setImageDir = js.Any.fromFunction1((t0: String) => setImageDir(t0).runNow()), setVerbosity = js.Any.fromFunction1((t0: errors | warnings | infos) => setVerbosity(t0).runNow()), setWorkerSrc = js.Any.fromFunction1((t0: String) => setWorkerSrc(t0).runNow()))
        __obj.asInstanceOf[ConfigProvider]
      }
      
      extension [Self <: ConfigProvider](x: Self) {
        
        inline def setDisableWorker(value: Callback): Self = StObject.set(x, "disableWorker", value.toJsFn)
        
        inline def setSetCmapDir(value: String => Callback): Self = StObject.set(x, "setCmapDir", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetImageDir(value: String => Callback): Self = StObject.set(x, "setImageDir", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetVerbosity(value: errors | warnings | infos => Callback): Self = StObject.set(x, "setVerbosity", js.Any.fromFunction1((t0: errors | warnings | infos) => value(t0).runNow()))
        
        inline def setSetWorkerSrc(value: String => Callback): Self = StObject.set(x, "setWorkerSrc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
  }
}
