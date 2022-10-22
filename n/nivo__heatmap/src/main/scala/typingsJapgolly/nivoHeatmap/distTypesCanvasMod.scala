package typingsJapgolly.nivoHeatmap

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellCanvasRendererProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCanvasMod {
  
  @JSImport("@nivo/heatmap/dist/types/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderCircle[Datum /* <: HeatMapDatum */](
    ctx: CanvasRenderingContext2D,
    hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme: CellCanvasRendererProps[Datum]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCircle")(ctx.asInstanceOf[js.Any], hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderRect[Datum /* <: HeatMapDatum */](
    ctx: CanvasRenderingContext2D,
    hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme: CellCanvasRendererProps[Datum]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRect")(ctx.asInstanceOf[js.Any], hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
