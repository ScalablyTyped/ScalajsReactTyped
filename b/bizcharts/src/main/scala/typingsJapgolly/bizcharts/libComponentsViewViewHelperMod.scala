package typingsJapgolly.bizcharts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsViewViewHelperMod {
  
  @JSImport("bizcharts/lib/components/View/viewHelper", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ViewHelper {
    def this(chart: Any) = this()
    
    /* CompleteClass */
    var chart: typingsJapgolly.antvG2.libChartChartMod.default = js.native
    
    /* CompleteClass */
    var config: Record[String, Any] = js.native
    
    /* CompleteClass */
    override def creatViewInstance(options: Any): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getView(): View = js.native
    
    /* CompleteClass */
    override val isRootView: /* false */ Boolean = js.native
    
    /* CompleteClass */
    override def processOptions(options: Any): Any = js.native
    
    /* CompleteClass */
    override def update(newConfig: Any): Unit = js.native
    
    /* CompleteClass */
    var view: View = js.native
  }
  
  trait ViewHelper extends StObject {
    
    var chart: typingsJapgolly.antvG2.libChartChartMod.default
    
    var config: Record[String, Any]
    
    def creatViewInstance(options: Any): Unit
    
    def destroy(): Unit
    
    def getView(): View
    
    val isRootView: /* false */ Boolean
    
    def processOptions(options: Any): Any
    
    def update(newConfig: Any): Unit
    
    var view: View
  }
  object ViewHelper {
    
    inline def apply(
      chart: typingsJapgolly.antvG2.libChartChartMod.default,
      config: Record[String, Any],
      creatViewInstance: Any => Callback,
      destroy: Callback,
      getView: CallbackTo[View],
      isRootView: /* false */ Boolean,
      processOptions: Any => Any,
      update: Any => Callback,
      view: View
    ): ViewHelper = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], creatViewInstance = js.Any.fromFunction1((t0: Any) => creatViewInstance(t0).runNow()), destroy = destroy.toJsFn, getView = getView.toJsFn, isRootView = isRootView.asInstanceOf[js.Any], processOptions = js.Any.fromFunction1(processOptions), update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewHelper]
    }
    
    extension [Self <: ViewHelper](x: Self) {
      
      inline def setChart(value: typingsJapgolly.antvG2.libChartChartMod.default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreatViewInstance(value: Any => Callback): Self = StObject.set(x, "creatViewInstance", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetView(value: CallbackTo[View]): Self = StObject.set(x, "getView", value.toJsFn)
      
      inline def setIsRootView(value: /* false */ Boolean): Self = StObject.set(x, "isRootView", value.asInstanceOf[js.Any])
      
      inline def setProcessOptions(value: Any => Any): Self = StObject.set(x, "processOptions", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
