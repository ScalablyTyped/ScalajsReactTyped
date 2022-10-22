package typingsJapgolly.nivoVoronoi

import typingsJapgolly.nivoVoronoi.anon.Data
import typingsJapgolly.nivoVoronoi.anon.Delaunay
import typingsJapgolly.nivoVoronoi.anon.Height
import typingsJapgolly.nivoVoronoi.anon.Voronoi
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiCustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/voronoi/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVoronoi(hasDataWidthHeightXDomainYDomain: Data): Voronoi = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoi")(hasDataWidthHeightXDomainYDomain.asInstanceOf[js.Any]).asInstanceOf[Voronoi]
  
  inline def useVoronoiLayerContext(hasPointsDelaunayVoronoi: VoronoiCustomLayerProps): VoronoiCustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiLayerContext")(hasPointsDelaunayVoronoi.asInstanceOf[js.Any]).asInstanceOf[VoronoiCustomLayerProps]
  
  inline def useVoronoiMesh[Datum](hasPointsXYWidthHeightDebug: Height[Datum]): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiMesh")(hasPointsXYWidthHeightDebug.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
}
