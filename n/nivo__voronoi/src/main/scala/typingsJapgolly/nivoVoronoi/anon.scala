package typingsJapgolly.nivoVoronoi

import typingsJapgolly.d3Delaunay.mod.Delaunay.Point
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoVoronoi.distTypesComputeMeshMod.XYAccessor
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiDatum
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiDomain
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Array[VoronoiDatum]
    
    var height: Double
    
    var width: Double
    
    var xDomain: VoronoiDomain
    
    var yDomain: VoronoiDomain
  }
  object Data {
    
    inline def apply(
      data: js.Array[VoronoiDatum],
      height: Double,
      width: Double,
      xDomain: VoronoiDomain,
      yDomain: VoronoiDomain
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xDomain = xDomain.asInstanceOf[js.Any], yDomain = yDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[VoronoiDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: VoronoiDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXDomain(value: VoronoiDomain): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
      
      inline def setYDomain(value: VoronoiDomain): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var points: js.Array[js.Tuple2[Double, Double]]
    
    var width: Double
  }
  object Debug {
    
    inline def apply(height: Double, points: js.Array[js.Tuple2[Double, Double]], width: Double): Debug = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delaunay extends StObject {
    
    var delaunay: typingsJapgolly.d3Delaunay.mod.Delaunay[Point]
    
    var voronoi: js.UndefOr[typingsJapgolly.d3Delaunay.mod.Voronoi[Point]] = js.undefined
  }
  object Delaunay {
    
    inline def apply(delaunay: typingsJapgolly.d3Delaunay.mod.Delaunay[Point]): Delaunay = {
      val __obj = js.Dynamic.literal(delaunay = delaunay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delaunay]
    }
    
    extension [Self <: Delaunay](x: Self) {
      
      inline def setDelaunay(value: typingsJapgolly.d3Delaunay.mod.Delaunay[Point]): Self = StObject.set(x, "delaunay", value.asInstanceOf[js.Any])
      
      inline def setVoronoi(value: typingsJapgolly.d3Delaunay.mod.Voronoi[Point]): Self = StObject.set(x, "voronoi", value.asInstanceOf[js.Any])
      
      inline def setVoronoiUndefined: Self = StObject.set(x, "voronoi", js.undefined)
    }
  }
  
  trait Height[Datum] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var points: js.Array[Datum]
    
    var width: Double
    
    var x: js.UndefOr[XYAccessor[Datum]] = js.undefined
    
    var y: js.UndefOr[XYAccessor[Datum]] = js.undefined
  }
  object Height {
    
    inline def apply[Datum](height: Double, points: js.Array[Datum], width: Double): Height[Datum] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height[Datum]]
    }
    
    extension [Self <: Height[?], Datum](x: Self & Height[Datum]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Datum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Datum*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: XYAccessor[Datum]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXFunction1(value: Datum => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: XYAccessor[Datum]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYFunction1(value: Datum => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<@nivo/voronoi.@nivo/voronoi/dist/types/types.VoronoiSvgProps, 'data' | 'width' | 'height'>> & std.Pick<@nivo/voronoi.@nivo/voronoi/dist/types/types.VoronoiSvgProps, 'data' | 'width' | 'height'> */
  trait PartialOmitVoronoiSvgProp extends StObject {
    
    var cellLineColor: js.UndefOr[String] = js.undefined
    
    var cellLineWidth: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[VoronoiDatum]
    
    var enableCells: js.UndefOr[Boolean] = js.undefined
    
    var enableLinks: js.UndefOr[Boolean] = js.undefined
    
    var enablePoints: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var layers: js.UndefOr[js.Array[VoronoiLayer]] = js.undefined
    
    var linkLineColor: js.UndefOr[String] = js.undefined
    
    var linkLineWidth: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var pointColor: js.UndefOr[String] = js.undefined
    
    var pointSize: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var width: Double
    
    var xDomain: js.UndefOr[VoronoiDomain] = js.undefined
    
    var yDomain: js.UndefOr[VoronoiDomain] = js.undefined
  }
  object PartialOmitVoronoiSvgProp {
    
    inline def apply(data: js.Array[VoronoiDatum], height: Double, width: Double): PartialOmitVoronoiSvgProp = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialOmitVoronoiSvgProp]
    }
    
    extension [Self <: PartialOmitVoronoiSvgProp](x: Self) {
      
      inline def setCellLineColor(value: String): Self = StObject.set(x, "cellLineColor", value.asInstanceOf[js.Any])
      
      inline def setCellLineColorUndefined: Self = StObject.set(x, "cellLineColor", js.undefined)
      
      inline def setCellLineWidth(value: Double): Self = StObject.set(x, "cellLineWidth", value.asInstanceOf[js.Any])
      
      inline def setCellLineWidthUndefined: Self = StObject.set(x, "cellLineWidth", js.undefined)
      
      inline def setData(value: js.Array[VoronoiDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: VoronoiDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableCells(value: Boolean): Self = StObject.set(x, "enableCells", value.asInstanceOf[js.Any])
      
      inline def setEnableCellsUndefined: Self = StObject.set(x, "enableCells", js.undefined)
      
      inline def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
      
      inline def setEnableLinksUndefined: Self = StObject.set(x, "enableLinks", js.undefined)
      
      inline def setEnablePoints(value: Boolean): Self = StObject.set(x, "enablePoints", value.asInstanceOf[js.Any])
      
      inline def setEnablePointsUndefined: Self = StObject.set(x, "enablePoints", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[VoronoiLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: VoronoiLayer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLinkLineColor(value: String): Self = StObject.set(x, "linkLineColor", value.asInstanceOf[js.Any])
      
      inline def setLinkLineColorUndefined: Self = StObject.set(x, "linkLineColor", js.undefined)
      
      inline def setLinkLineWidth(value: Double): Self = StObject.set(x, "linkLineWidth", value.asInstanceOf[js.Any])
      
      inline def setLinkLineWidthUndefined: Self = StObject.set(x, "linkLineWidth", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
      
      inline def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
      
      inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXDomain(value: VoronoiDomain): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
      
      inline def setXDomainUndefined: Self = StObject.set(x, "xDomain", js.undefined)
      
      inline def setYDomain(value: VoronoiDomain): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
      
      inline def setYDomainUndefined: Self = StObject.set(x, "yDomain", js.undefined)
    }
  }
  
  trait Points[Datum] extends StObject {
    
    var points: js.Array[Datum]
    
    var x: js.UndefOr[XYAccessor[Datum]] = js.undefined
    
    var y: js.UndefOr[XYAccessor[Datum]] = js.undefined
  }
  object Points {
    
    inline def apply[Datum](points: js.Array[Datum]): Points[Datum] = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Points[Datum]]
    }
    
    extension [Self <: Points[?], Datum](x: Self & Points[Datum]) {
      
      inline def setPoints(value: js.Array[Datum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Datum*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setX(value: XYAccessor[Datum]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXFunction1(value: Datum => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: XYAccessor[Datum]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYFunction1(value: Datum => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Voronoi extends StObject {
    
    var delaunay: typingsJapgolly.d3Delaunay.mod.Delaunay[Point]
    
    var points: js.Array[X]
    
    var voronoi: typingsJapgolly.d3Delaunay.mod.Voronoi[Point]
  }
  object Voronoi {
    
    inline def apply(
      delaunay: typingsJapgolly.d3Delaunay.mod.Delaunay[Point],
      points: js.Array[X],
      voronoi: typingsJapgolly.d3Delaunay.mod.Voronoi[Point]
    ): Voronoi = {
      val __obj = js.Dynamic.literal(delaunay = delaunay.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], voronoi = voronoi.asInstanceOf[js.Any])
      __obj.asInstanceOf[Voronoi]
    }
    
    extension [Self <: Voronoi](x: Self) {
      
      inline def setDelaunay(value: typingsJapgolly.d3Delaunay.mod.Delaunay[Point]): Self = StObject.set(x, "delaunay", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setVoronoi(value: typingsJapgolly.d3Delaunay.mod.Voronoi[Point]): Self = StObject.set(x, "voronoi", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var data: VoronoiDatum
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(data: VoronoiDatum, x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setData(value: VoronoiDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
