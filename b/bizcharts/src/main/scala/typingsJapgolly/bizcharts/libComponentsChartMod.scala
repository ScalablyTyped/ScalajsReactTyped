package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Filter
import typingsJapgolly.bizcharts.libInterfaceMod.IChartProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import typingsJapgolly.std.ResizeObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/components/Chart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/components/Chart", "Chart")
  @js.native
  open class Chart protected ()
    extends Component[IChartProps, js.Object, Any] {
    def this(props: Any) = this()
    
    /* private */ var chartHelper: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MChart(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MChart(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MChart(): Unit = js.native
    
    def getG2Instance(): typingsJapgolly.antvG2.libChartChartMod.default = js.native
    
    var isError: Boolean = js.native
    
    val isRootView: /* true */ Boolean = js.native
    
    /* private */ var resize: Any = js.native
    
    /* protected */ var resizeObserver: ResizeObserver = js.native
  }
  /* static members */
  object Chart {
    
    @JSImport("bizcharts/lib/components/Chart", "Chart")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/components/Chart", "Chart.defaultProps")
    @js.native
    def defaultProps: Filter = js.native
    inline def defaultProps_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsChartMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]] = default
}
