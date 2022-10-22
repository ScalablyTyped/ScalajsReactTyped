package typingsJapgolly.wixStyleReact

import typingsJapgolly.lodash.mod.DebouncedFunc
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAreaChartAreaChartMod {
  
  /** An area chart is a way of plotting data points on a line. Often, it is used to show trend data */
  @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", JSImport.Default)
  @js.native
  open class default protected () extends AreaChart {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.defaultProps.maxYTicksLimit_1")
      @js.native
      val maxYTicksLimit1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.data")
      @js.native
      val data: Validator[js.Array[js.UndefOr[InferProps[Value] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.maxYTicksLimit")
      @js.native
      val maxYTicksLimit: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.onTooltipShow")
      @js.native
      val onTooltipShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AreaChart/AreaChart", "default.propTypes.tooltipContent")
      @js.native
      val tooltipContent: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** An area chart is a way of plotting data points on a line. Often, it is used to show trend data */
  @js.native
  trait AreaChart extends PureComponent[Any, Any, Any] {
    
    var cursorLine: Null = js.native
    
    def handleHover(_underscore: Any, activeItems: Any): Unit = js.native
    
    var handleHoverThrottled: DebouncedFunc[js.Function2[/* _ */ Any, /* activeItems */ Any, Unit]] = js.native
    
    def onMouseMove(tooltip: Any): Unit = js.native
  }
}
