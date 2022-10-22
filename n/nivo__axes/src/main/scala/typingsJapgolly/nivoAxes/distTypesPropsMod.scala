package typingsJapgolly.nivoAxes

import typingsJapgolly.nivoAxes.anon.AriaHidden
import typingsJapgolly.nivoAxes.nivoAxesStrings.bottom
import typingsJapgolly.nivoAxes.nivoAxesStrings.left
import typingsJapgolly.nivoAxes.nivoAxesStrings.right
import typingsJapgolly.nivoAxes.nivoAxesStrings.top
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPropsMod {
  
  @JSImport("@nivo/axes/dist/types/props", "axisPropType")
  @js.native
  val axisPropType: Requireable[InferProps[AriaHidden]] = js.native
  
  object axisPropTypes {
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.ariaHidden")
    @js.native
    def ariaHidden: Requireable[Boolean] = js.native
    inline def ariaHidden_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.format")
    @js.native
    def format: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
    inline def format_=(x: Requireable[String | (js.Function1[/* repeated */ Any, Any])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.legend")
    @js.native
    def legend: Requireable[ReactNodeLike] = js.native
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.legendOffset")
    @js.native
    def legendOffset: Requireable[Double] = js.native
    inline def legendOffset_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.legendPosition")
    @js.native
    def legendPosition: Requireable[String] = js.native
    inline def legendPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(x.asInstanceOf[js.Any])
    
    inline def legend_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.renderTick")
    @js.native
    def renderTick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def renderTick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTick")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.tickPadding")
    @js.native
    def tickPadding: Requireable[Double] = js.native
    inline def tickPadding_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.tickRotation")
    @js.native
    def tickRotation: Requireable[Double] = js.native
    inline def tickRotation_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.tickSize")
    @js.native
    def tickSize: Requireable[Double] = js.native
    inline def tickSize_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.tickValues")
    @js.native
    def tickValues: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])] = js.native
    inline def tickValues_=(x: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickValues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes/dist/types/props", "axisPropTypes.ticksPosition")
    @js.native
    def ticksPosition: Requireable[String] = js.native
    inline def ticksPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticksPosition")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/axes/dist/types/props", "positions")
  @js.native
  val positions: js.Tuple4[top, right, bottom, left] = js.native
}
