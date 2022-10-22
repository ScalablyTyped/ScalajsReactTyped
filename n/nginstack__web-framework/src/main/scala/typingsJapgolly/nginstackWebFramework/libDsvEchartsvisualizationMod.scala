package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvEchartsvisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/EChartsVisualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EChartsVisualization {
    def this(definition: Any) = this()
    
    /* private */ /* CompleteClass */
    var chart_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var ds_ : Any = js.native
    
    /* CompleteClass */
    var onGetOptions: Event = js.native
    
    /* CompleteClass */
    override def queryData(filterValues: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    override def render(outputObj: Any): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/EChartsVisualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EChartsVisualization extends StObject {
    
    /* private */ var chart_ : Any
    
    /* private */ var ds_ : Any
    
    var onGetOptions: Event
    
    def queryData(filterValues: Record[String, Any]): Unit
    
    def render(outputObj: Any): Unit
  }
  object EChartsVisualization {
    
    inline def apply(
      chart_ : Any,
      ds_ : Any,
      onGetOptions: Event,
      queryData: Record[String, Any] => Callback,
      render: Any => Callback
    ): EChartsVisualization = {
      val __obj = js.Dynamic.literal(chart_ = chart_.asInstanceOf[js.Any], ds_ = ds_.asInstanceOf[js.Any], onGetOptions = onGetOptions.asInstanceOf[js.Any], queryData = js.Any.fromFunction1((t0: Record[String, Any]) => queryData(t0).runNow()), render = js.Any.fromFunction1((t0: Any) => render(t0).runNow()))
      __obj.asInstanceOf[EChartsVisualization]
    }
    
    extension [Self <: EChartsVisualization](x: Self) {
      
      inline def setChart_(value: Any): Self = StObject.set(x, "chart_", value.asInstanceOf[js.Any])
      
      inline def setDs_(value: Any): Self = StObject.set(x, "ds_", value.asInstanceOf[js.Any])
      
      inline def setOnGetOptions(value: Event): Self = StObject.set(x, "onGetOptions", value.asInstanceOf[js.Any])
      
      inline def setQueryData(value: Record[String, Any] => Callback): Self = StObject.set(x, "queryData", js.Any.fromFunction1((t0: Record[String, Any]) => value(t0).runNow()))
      
      inline def setRender(value: Any => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type Event = typingsJapgolly.nginstackEngine.libEventEventMod.^
}
