package typingsJapgolly.openlayers

import typingsJapgolly.openlayers.mod.OverlayPositioning
import typingsJapgolly.openlayers.mod.RasterOperationType
import typingsJapgolly.openlayers.mod.RendererType
import typingsJapgolly.openlayers.mod.control.ScaleLine.Units
import typingsJapgolly.openlayers.mod.format.IGCZ
import typingsJapgolly.openlayers.mod.geom.GeometryLayout
import typingsJapgolly.openlayers.mod.geom.GeometryType
import typingsJapgolly.openlayers.mod.layer.VectorTileRenderType
import typingsJapgolly.openlayers.mod.olx.layer.VectorRenderType
import typingsJapgolly.openlayers.mod.olx.style.TextPlacement
import typingsJapgolly.openlayers.mod.source.State
import typingsJapgolly.openlayers.mod.source.WMTSRequestEncoding
import typingsJapgolly.openlayers.mod.source.wms.ServerType
import typingsJapgolly.openlayers.mod.style.IconAnchorUnits
import typingsJapgolly.openlayers.mod.style.IconOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openlayersStrings {
  
  @js.native
  sealed trait Circle
    extends StObject
       with GeometryType
  inline def Circle: Circle = "Circle".asInstanceOf[Circle]
  
  @js.native
  sealed trait GeometryCollection
    extends StObject
       with GeometryType
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait KVP
    extends StObject
       with WMTSRequestEncoding
  inline def KVP: KVP = "KVP".asInstanceOf[KVP]
  
  @js.native
  sealed trait LineString
    extends StObject
       with GeometryType
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait LinearRing
    extends StObject
       with GeometryType
  inline def LinearRing: LinearRing = "LinearRing".asInstanceOf[LinearRing]
  
  @js.native
  sealed trait MultiLineString
    extends StObject
       with GeometryType
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint
    extends StObject
       with GeometryType
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon
    extends StObject
       with GeometryType
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point
    extends StObject
       with GeometryType
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with GeometryType
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait REST
    extends StObject
       with WMTSRequestEncoding
  inline def REST: REST = "REST".asInstanceOf[REST]
  
  @js.native
  sealed trait XY
    extends StObject
       with GeometryLayout
  inline def XY: XY = "XY".asInstanceOf[XY]
  
  @js.native
  sealed trait XYM
    extends StObject
       with GeometryLayout
  inline def XYM: XYM = "XYM".asInstanceOf[XYM]
  
  @js.native
  sealed trait XYZ
    extends StObject
       with GeometryLayout
  inline def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait XYZM
    extends StObject
       with GeometryLayout
  inline def XYZM: XYZM = "XYZM".asInstanceOf[XYZM]
  
  @js.native
  sealed trait barometric
    extends StObject
       with IGCZ
  inline def barometric: barometric = "barometric".asInstanceOf[barometric]
  
  @js.native
  sealed trait `bottom-center`
    extends StObject
       with OverlayPositioning
  inline def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with IconOrigin
       with OverlayPositioning
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with IconOrigin
       with OverlayPositioning
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait canvas
    extends StObject
       with RendererType
  inline def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait carmentaserver
    extends StObject
       with ServerType
  inline def carmentaserver: carmentaserver = "carmentaserver".asInstanceOf[carmentaserver]
  
  @js.native
  sealed trait `center-center`
    extends StObject
       with OverlayPositioning
  inline def `center-center`: `center-center` = "center-center".asInstanceOf[`center-center`]
  
  @js.native
  sealed trait `center-left`
    extends StObject
       with OverlayPositioning
  inline def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  
  @js.native
  sealed trait `center-right`
    extends StObject
       with OverlayPositioning
  inline def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  
  @js.native
  sealed trait degrees
    extends StObject
       with Units
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def degrees: degrees = "degrees".asInstanceOf[degrees]
  
  @js.native
  sealed trait dom
    extends StObject
       with RendererType
  inline def dom: dom = "dom".asInstanceOf[dom]
  
  @js.native
  sealed trait error
    extends StObject
       with State
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fraction
    extends StObject
       with IconAnchorUnits
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait ft
    extends StObject
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def ft: ft = "ft".asInstanceOf[ft]
  
  @js.native
  sealed trait geoserver
    extends StObject
       with ServerType
  inline def geoserver: geoserver = "geoserver".asInstanceOf[geoserver]
  
  @js.native
  sealed trait gps
    extends StObject
       with IGCZ
  inline def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait hybrid
    extends StObject
       with VectorTileRenderType
  inline def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @js.native
  sealed trait image
    extends StObject
       with RasterOperationType
       with VectorRenderType
       with VectorTileRenderType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imperial
    extends StObject
       with Units
  inline def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait line
    extends StObject
       with TextPlacement
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait loading
    extends StObject
       with State
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait m
    extends StObject
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait mapserver
    extends StObject
       with ServerType
  inline def mapserver: mapserver = "mapserver".asInstanceOf[mapserver]
  
  @js.native
  sealed trait metric
    extends StObject
       with Units
  inline def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait nautical
    extends StObject
       with Units
  inline def nautical: nautical = "nautical".asInstanceOf[nautical]
  
  @js.native
  sealed trait none
    extends StObject
       with IGCZ
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait pixel
    extends StObject
       with RasterOperationType
  inline def pixel: pixel = "pixel".asInstanceOf[pixel]
  
  @js.native
  sealed trait pixels
    extends StObject
       with IconAnchorUnits
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def pixels: pixels = "pixels".asInstanceOf[pixels]
  
  @js.native
  sealed trait point_
    extends StObject
       with TextPlacement
  inline def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait qgis
    extends StObject
       with ServerType
  inline def qgis: qgis = "qgis".asInstanceOf[qgis]
  
  @js.native
  sealed trait ready
    extends StObject
       with State
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait `tile-pixels`
    extends StObject
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def `tile-pixels`: `tile-pixels` = "tile-pixels".asInstanceOf[`tile-pixels`]
  
  @js.native
  sealed trait `top-center`
    extends StObject
       with OverlayPositioning
  inline def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with IconOrigin
       with OverlayPositioning
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with IconOrigin
       with OverlayPositioning
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait undefined
    extends StObject
       with State
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait us
    extends StObject
       with Units
  inline def us: us = "us".asInstanceOf[us]
  
  @js.native
  sealed trait `us-ft`
    extends StObject
       with typingsJapgolly.openlayers.mod.proj.Units
  inline def `us-ft`: `us-ft` = "us-ft".asInstanceOf[`us-ft`]
  
  @js.native
  sealed trait vector
    extends StObject
       with VectorRenderType
       with VectorTileRenderType
  inline def vector: vector = "vector".asInstanceOf[vector]
  
  @js.native
  sealed trait webgl
    extends StObject
       with RendererType
  inline def webgl: webgl = "webgl".asInstanceOf[webgl]
}
