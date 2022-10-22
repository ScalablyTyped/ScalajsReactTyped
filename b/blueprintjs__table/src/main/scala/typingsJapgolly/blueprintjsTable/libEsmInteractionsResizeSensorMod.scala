package typingsJapgolly.blueprintjsTable

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsResizeSensorMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", "ResizeSensor")
  @js.native
  open class ResizeSensor () extends StObject
  /* static members */
  object ResizeSensor {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", "ResizeSensor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", "ResizeSensor.RESIZE_SENSOR_HTML")
    @js.native
    def RESIZE_SENSOR_HTML: Any = js.native
    inline def RESIZE_SENSOR_HTML_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_SENSOR_HTML")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", "ResizeSensor.RESIZE_SENSOR_STYLE")
    @js.native
    def RESIZE_SENSOR_STYLE: Any = js.native
    inline def RESIZE_SENSOR_STYLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_SENSOR_STYLE")(x.asInstanceOf[js.Any])
    
    inline def attach(element: HTMLElement, callback: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", "ResizeSensor.debounce")
    @js.native
    def debounce: Any = js.native
    inline def debounce_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debounce")(x.asInstanceOf[js.Any])
  }
}
