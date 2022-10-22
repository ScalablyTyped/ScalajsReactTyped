package typingsJapgolly.nivoLine.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.d3Shape.mod.Line_
import typingsJapgolly.nivoLine.anon.Y
import typingsJapgolly.nivoScales.distTypesTypesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomCanvasLayerProps
  extends StObject
     with CustomLayerProps {
  
  var ctx: CanvasRenderingContext2D
}
object CustomCanvasLayerProps {
  
  inline def apply(
    ctx: CanvasRenderingContext2D,
    data: js.Array[Serie],
    innerHeight: Double,
    innerWidth: Double,
    lineGenerator: Line_[js.Array[Y]],
    points: js.Array[Point],
    series: js.Array[ComputedSerie],
    xScale: Scale[Any, Any],
    yScale: Scale[Any, Any]
  ): CustomCanvasLayerProps = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], lineGenerator = lineGenerator.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCanvasLayerProps]
  }
  
  extension [Self <: CustomCanvasLayerProps](x: Self) {
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
  }
}
