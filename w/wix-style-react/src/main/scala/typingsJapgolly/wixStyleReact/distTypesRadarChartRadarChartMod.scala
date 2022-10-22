package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Data
import typingsJapgolly.wixStyleReact.anon.LabelString
import typingsJapgolly.wixStyleReact.anon.LabelValue
import typingsJapgolly.wixStyleReact.anon.TooltipContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarChartRadarChartMod {
  
  object default {
    
    inline def apply(hasDataHookDataScaleDisabledWidthLabelDistanceHoverIndexLabelWidthOnDataPointHover: Data): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookDataScaleDisabledWidthLabelDistanceHoverIndexLabelWidthOnDataPointHover.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps.data_1")
      @js.native
      val data1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps.labelDistance_1")
      @js.native
      val labelDistance1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps.labelWidth_1")
      @js.native
      val labelWidth1: Double = js.native
      
      inline def onDataPointHover1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDataPointHover_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps.scale_1")
      @js.native
      val scale1: js.Array[LabelString] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.defaultProps.width_1")
      @js.native
      val width1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.data")
      @js.native
      val data: Requireable[js.Array[js.UndefOr[InferProps[TooltipContent] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.hoverIndex")
      @js.native
      val hoverIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.labelDistance")
      @js.native
      val labelDistance: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.labelWidth")
      @js.native
      val labelWidth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.onDataPointHover")
      @js.native
      val onDataPointHover: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.scale")
      @js.native
      val scale: Requireable[js.Array[js.UndefOr[InferProps[LabelValue] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/RadarChart/RadarChart", "default.propTypes.width")
      @js.native
      val width: Requireable[Double] = js.native
    }
  }
}
