package typingsJapgolly.nivoVoronoi

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.d3Delaunay.mod.Delaunay.Point
import typingsJapgolly.d3Delaunay.mod.Voronoi
import typingsJapgolly.nivoVoronoi.anon.Data
import typingsJapgolly.nivoVoronoi.anon.Debug
import typingsJapgolly.nivoVoronoi.anon.Delaunay
import typingsJapgolly.nivoVoronoi.anon.Height
import typingsJapgolly.nivoVoronoi.anon.PartialOmitVoronoiSvgProp
import typingsJapgolly.nivoVoronoi.anon.Points
import typingsJapgolly.nivoVoronoi.distTypesMeshMod.MeshProps
import typingsJapgolly.nivoVoronoi.distTypesResponsiveVoronoiMod.ResponsiveVoronoiProps
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiCustomLayerProps
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiDomain
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiLayer
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/voronoi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Mesh[Datum](hasNodesWidthHeightXYOnMouseEnterOnMouseMoveOnMouseLeaveOnClickDebug: MeshProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Mesh")(hasNodesWidthHeightXYOnMouseEnterOnMouseMoveOnMouseLeaveOnClickDebug.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveVoronoi(props: ResponsiveVoronoiProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveVoronoi")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Voronoi(hasThemeOtherProps: PartialOmitVoronoiSvgProp): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Voronoi")(hasThemeOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def computeMesh(hasPointsWidthHeightDebug: Debug): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMesh")(hasPointsWidthHeightDebug.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
  
  inline def computeMeshPoints[Datum](hasPointsXY: Points[Datum]): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMeshPoints")(hasPointsXY.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  object defaultVoronoiProps {
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.cellLineColor")
    @js.native
    def cellLineColor: String = js.native
    inline def cellLineColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellLineColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.cellLineWidth")
    @js.native
    def cellLineWidth: Double = js.native
    inline def cellLineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellLineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.enableCells")
    @js.native
    def enableCells: Boolean = js.native
    inline def enableCells_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableCells")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.enableLinks")
    @js.native
    def enableLinks: Boolean = js.native
    inline def enableLinks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.enablePoints")
    @js.native
    def enablePoints: Boolean = js.native
    inline def enablePoints_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enablePoints")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.layers")
    @js.native
    def layers: js.Array[VoronoiLayer] = js.native
    inline def layers_=(x: js.Array[VoronoiLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.linkLineColor")
    @js.native
    def linkLineColor: String = js.native
    inline def linkLineColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkLineColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.linkLineWidth")
    @js.native
    def linkLineWidth: Double = js.native
    inline def linkLineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkLineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.pointColor")
    @js.native
    def pointColor: String = js.native
    inline def pointColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.pointSize")
    @js.native
    def pointSize: Double = js.native
    inline def pointSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.xDomain")
    @js.native
    def xDomain: VoronoiDomain = js.native
    inline def xDomain_=(x: VoronoiDomain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xDomain")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/voronoi", "defaultVoronoiProps.yDomain")
    @js.native
    def yDomain: VoronoiDomain = js.native
    inline def yDomain_=(x: VoronoiDomain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yDomain")(x.asInstanceOf[js.Any])
  }
  
  inline def renderVoronoiCellToCanvas(ctx: CanvasRenderingContext2D, voronoi: Voronoi[Point], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderVoronoiCellToCanvas")(ctx.asInstanceOf[js.Any], voronoi.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderVoronoiToCanvas(ctx: CanvasRenderingContext2D, voronoi: Voronoi[Point]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderVoronoiToCanvas")(ctx.asInstanceOf[js.Any], voronoi.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useVoronoi(hasDataWidthHeightXDomainYDomain: Data): typingsJapgolly.nivoVoronoi.anon.Voronoi = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoi")(hasDataWidthHeightXDomainYDomain.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nivoVoronoi.anon.Voronoi]
  
  inline def useVoronoiLayerContext(hasPointsDelaunayVoronoi: VoronoiCustomLayerProps): VoronoiCustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiLayerContext")(hasPointsDelaunayVoronoi.asInstanceOf[js.Any]).asInstanceOf[VoronoiCustomLayerProps]
  
  inline def useVoronoiMesh[Datum](hasPointsXYWidthHeightDebug: Height[Datum]): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiMesh")(hasPointsXYWidthHeightDebug.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
}
