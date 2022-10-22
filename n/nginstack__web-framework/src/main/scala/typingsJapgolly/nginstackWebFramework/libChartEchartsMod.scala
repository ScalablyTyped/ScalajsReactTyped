package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackWebFramework.anon.DevicePixelRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartEchartsMod {
  
  inline def apply(options: Unit, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def apply(options: DevicePixelRatio, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/chart/ECharts", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ECharts {
    def this(options: Unit, args: Any*) = this()
    def this(options: DevicePixelRatio, args: Any*) = this()
    
    /* CompleteClass */
    override def html(): String = js.native
    
    /* private */ /* CompleteClass */
    var initOptions_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var options_ : Any = js.native
    
    /* CompleteClass */
    override def setOption(options: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var theme_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/chart/ECharts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ECharts extends StObject {
    
    def html(): String
    
    /* private */ var initOptions_ : Any
    
    /* private */ var options_ : Any
    
    def setOption(options: Any): Unit
    
    /* private */ var theme_ : Any
  }
  object ECharts {
    
    inline def apply(
      html: CallbackTo[String],
      initOptions_ : Any,
      options_ : Any,
      setOption: Any => Callback,
      theme_ : Any
    ): ECharts = {
      val __obj = js.Dynamic.literal(html = html.toJsFn, initOptions_ = initOptions_.asInstanceOf[js.Any], options_ = options_.asInstanceOf[js.Any], setOption = js.Any.fromFunction1((t0: Any) => setOption(t0).runNow()), theme_ = theme_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECharts]
    }
    
    extension [Self <: ECharts](x: Self) {
      
      inline def setHtml(value: CallbackTo[String]): Self = StObject.set(x, "html", value.toJsFn)
      
      inline def setInitOptions_(value: Any): Self = StObject.set(x, "initOptions_", value.asInstanceOf[js.Any])
      
      inline def setOptions_(value: Any): Self = StObject.set(x, "options_", value.asInstanceOf[js.Any])
      
      inline def setSetOption(value: Any => Callback): Self = StObject.set(x, "setOption", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setTheme_(value: Any): Self = StObject.set(x, "theme_", value.asInstanceOf[js.Any])
    }
  }
}
