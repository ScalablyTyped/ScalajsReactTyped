package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kakaomaps.anon.Analyzetype
import typingsJapgolly.kakaomaps.anon.Bounds
import typingsJapgolly.kakaomaps.anon.Inputcoord
import typingsJapgolly.kakaomaps.anon.Location
import typingsJapgolly.kakaomaps.anon.Outputcoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// # Library
// ## services namespace
object services {
  
  @js.native
  sealed trait ANALYZE_TYPE extends StObject
  @JSGlobal("kakao.maps.services.ANALYZE_TYPE")
  @js.native
  object ANALYZE_TYPE extends StObject {
    
    @js.native
    sealed trait EXACT
      extends StObject
         with ANALYZE_TYPE
    
    @js.native
    sealed trait SIMILAR
      extends StObject
         with ANALYZE_TYPE
  }
  
  @js.native
  sealed trait COORDS_ extends StObject
  @JSGlobal("kakao.maps.services.COORDS")
  @js.native
  object COORDS_ extends StObject {
    
    @js.native
    sealed trait CONGNAMUL
      extends StObject
         with COORDS_
    
    @js.native
    sealed trait TM
      extends StObject
         with COORDS_
    
    @js.native
    sealed trait WCONGNAMUL
      extends StObject
         with COORDS_
    
    @js.native
    sealed trait WGS84
      extends StObject
         with COORDS_
    
    @js.native
    sealed trait WTM
      extends StObject
         with COORDS_
  }
  
  @js.native
  sealed trait SORT_BY extends StObject
  @JSGlobal("kakao.maps.services.SORT_BY")
  @js.native
  object SORT_BY extends StObject {
    
    @js.native
    sealed trait ACCURACY
      extends StObject
         with SORT_BY
    
    @js.native
    sealed trait DISTANCE
      extends StObject
         with SORT_BY
  }
  
  @js.native
  sealed trait STATUS_ extends StObject
  @JSGlobal("kakao.maps.services.STATUS")
  @js.native
  object STATUS_ extends StObject {
    
    @js.native
    sealed trait ERROR
      extends StObject
         with STATUS_
    
    @js.native
    sealed trait OK
      extends StObject
         with STATUS_
    
    @js.native
    sealed trait ZERO_RESULT
      extends StObject
         with STATUS_
  }
  
  type AnalyzeType = ANALYZE_TYPE
  
  trait Cluster extends StObject {
    
    def getBounds(): LatLngBounds
    
    def getCenter(): LatLng
    
    def getClusterMarker(): CustomOverlay
    
    def getMarkers(): js.Array[Marker]
    
    def getSize(): Double
  }
  object Cluster {
    
    inline def apply(
      getBounds: CallbackTo[LatLngBounds],
      getCenter: CallbackTo[LatLng],
      getClusterMarker: CallbackTo[CustomOverlay],
      getMarkers: CallbackTo[js.Array[Marker]],
      getSize: CallbackTo[Double]
    ): Cluster = {
      val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, getCenter = getCenter.toJsFn, getClusterMarker = getClusterMarker.toJsFn, getMarkers = getMarkers.toJsFn, getSize = getSize.toJsFn)
      __obj.asInstanceOf[Cluster]
    }
    
    extension [Self <: Cluster](x: Self) {
      
      inline def setGetBounds(value: CallbackTo[LatLngBounds]): Self = StObject.set(x, "getBounds", value.toJsFn)
      
      inline def setGetCenter(value: CallbackTo[LatLng]): Self = StObject.set(x, "getCenter", value.toJsFn)
      
      inline def setGetClusterMarker(value: CallbackTo[CustomOverlay]): Self = StObject.set(x, "getClusterMarker", value.toJsFn)
      
      inline def setGetMarkers(value: CallbackTo[js.Array[Marker]]): Self = StObject.set(x, "getMarkers", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[Double]): Self = StObject.set(x, "getSize", value.toJsFn)
    }
  }
  
  type Coords = COORDS_
  
  @js.native
  trait Geocoder extends StObject {
    
    def addressSearch(
      addr: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit]
    ): Unit = js.native
    def addressSearch(
      addr: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit],
      options: Analyzetype
    ): Unit = js.native
    
    def coord2Address(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit]
    ): Unit = js.native
    def coord2Address(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit],
      options: Inputcoord
    ): Unit = js.native
    
    def coord2RegionCode(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit]
    ): Unit = js.native
    def coord2RegionCode(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit],
      options: Outputcoord
    ): Unit = js.native
    
    def transCoord(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit]
    ): Unit = js.native
    def transCoord(
      x: Double,
      y: Double,
      callback: js.Function2[/* result */ js.Array[Any], /* status */ Status, Unit],
      options: Outputcoord
    ): Unit = js.native
  }
  
  @js.native
  trait MarkerCluster extends StObject {
    
    def addMarker(marker: Marker): Unit = js.native
    def addMarker(marker: Marker, nodraw: Boolean): Unit = js.native
    
    def addMarkers(marker: js.Array[Marker]): Unit = js.native
    def addMarkers(marker: js.Array[Marker], nodraw: Boolean): Unit = js.native
    
    def clear(): Unit = js.native
    
    def getAverageCenter(): Boolean = js.native
    
    def getCalculator(): js.Array[Double] | js.Function0[Unit] = js.native
    
    def getGridSize(): Double = js.native
    
    def getMinClusterSize(): Double = js.native
    
    def getMinLevel(): Double = js.native
    
    def getStyles(): js.Array[js.Object] = js.native
    
    def getTexts(): js.Array[String] | js.Function0[Unit] = js.native
    
    def redraw(): Unit = js.native
    
    def removeMarker(marker: Marker): Unit = js.native
    def removeMarker(marker: Marker, nodraw: Boolean): Unit = js.native
    
    def removeMarkers(marker: js.Array[Marker]): Unit = js.native
    def removeMarkers(marker: js.Array[Marker], nodraw: Boolean): Unit = js.native
    
    def setAverageCenter(bool: Boolean): Unit = js.native
    
    def setCalculator(calculator: js.Array[Double]): Unit = js.native
    def setCalculator(calculator: js.Function0[Unit]): Unit = js.native
    
    def setGridSize(size: Double): Unit = js.native
    
    def setMinClusterSize(size: Double): Unit = js.native
    
    def setMinLevel(level: Double): Unit = js.native
    
    def setStyles(styles: js.Array[js.Object]): Unit = js.native
    
    def setTexts(texts: js.Array[String]): Unit = js.native
    def setTexts(texts: js.Function0[Unit]): Unit = js.native
  }
  
  trait MarkerClusterOptions extends StObject {
    
    var averageCenter: js.UndefOr[Boolean] = js.undefined
    
    var calculator: js.UndefOr[js.Array[Double]] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var disableClickZoom: js.UndefOr[Boolean] = js.undefined
    
    var gridSize: js.UndefOr[Double] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var markers: js.UndefOr[js.Array[Marker]] = js.undefined
    
    var minClusterSize: js.UndefOr[Double] = js.undefined
    
    var minLevel: js.UndefOr[Double] = js.undefined
    
    var styles: js.UndefOr[js.Object] = js.undefined
    
    var texts: js.UndefOr[js.Array[String] | js.Function0[Unit]] = js.undefined
  }
  object MarkerClusterOptions {
    
    inline def apply(): MarkerClusterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerClusterOptions]
    }
    
    extension [Self <: MarkerClusterOptions](x: Self) {
      
      inline def setAverageCenter(value: Boolean): Self = StObject.set(x, "averageCenter", value.asInstanceOf[js.Any])
      
      inline def setAverageCenterUndefined: Self = StObject.set(x, "averageCenter", js.undefined)
      
      inline def setCalculator(value: js.Array[Double]): Self = StObject.set(x, "calculator", value.asInstanceOf[js.Any])
      
      inline def setCalculatorUndefined: Self = StObject.set(x, "calculator", js.undefined)
      
      inline def setCalculatorVarargs(value: Double*): Self = StObject.set(x, "calculator", js.Array(value*))
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setDisableClickZoom(value: Boolean): Self = StObject.set(x, "disableClickZoom", value.asInstanceOf[js.Any])
      
      inline def setDisableClickZoomUndefined: Self = StObject.set(x, "disableClickZoom", js.undefined)
      
      inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMarkers(value: js.Array[Marker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: Marker*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMinClusterSize(value: Double): Self = StObject.set(x, "minClusterSize", value.asInstanceOf[js.Any])
      
      inline def setMinClusterSizeUndefined: Self = StObject.set(x, "minClusterSize", js.undefined)
      
      inline def setMinLevel(value: Double): Self = StObject.set(x, "minLevel", value.asInstanceOf[js.Any])
      
      inline def setMinLevelUndefined: Self = StObject.set(x, "minLevel", js.undefined)
      
      inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTexts(value: js.Array[String] | js.Function0[Unit]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsCallback(value: Callback): Self = StObject.set(x, "texts", value.toJsFn)
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      inline def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value*))
    }
  }
  
  trait Pagination extends StObject {
    
    var current: Double
    
    def gotoFirst(): Unit
    
    def gotoLast(): Unit
    
    def gotoPage(page: Double): Unit
    
    var hasNextPage: Boolean
    
    var hasPrevPage: Boolean
    
    def nextPage(): Unit
    
    def prevPage(): Unit
    
    var totalCount: Double
  }
  object Pagination {
    
    inline def apply(
      current: Double,
      gotoFirst: Callback,
      gotoLast: Callback,
      gotoPage: Double => Callback,
      hasNextPage: Boolean,
      hasPrevPage: Boolean,
      nextPage: Callback,
      prevPage: Callback,
      totalCount: Double
    ): Pagination = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], gotoFirst = gotoFirst.toJsFn, gotoLast = gotoLast.toJsFn, gotoPage = js.Any.fromFunction1((t0: Double) => gotoPage(t0).runNow()), hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], nextPage = nextPage.toJsFn, prevPage = prevPage.toJsFn, totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination]
    }
    
    extension [Self <: Pagination](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGotoFirst(value: Callback): Self = StObject.set(x, "gotoFirst", value.toJsFn)
      
      inline def setGotoLast(value: Callback): Self = StObject.set(x, "gotoLast", value.toJsFn)
      
      inline def setGotoPage(value: Double => Callback): Self = StObject.set(x, "gotoPage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
      
      inline def setHasPrevPage(value: Boolean): Self = StObject.set(x, "hasPrevPage", value.asInstanceOf[js.Any])
      
      inline def setNextPage(value: Callback): Self = StObject.set(x, "nextPage", value.toJsFn)
      
      inline def setPrevPage(value: Callback): Self = StObject.set(x, "prevPage", value.toJsFn)
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Places extends StObject {
    
    def categorySearch(
      code: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit]
    ): Unit = js.native
    def categorySearch(
      code: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit],
      options: Location
    ): Unit = js.native
    
    def keywordSearch(
      keyword: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit]
    ): Unit = js.native
    def keywordSearch(
      keyword: String,
      callback: js.Function3[/* result */ js.Array[Any], /* status */ Status, /* pagination */ Pagination, Unit],
      options: Bounds
    ): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
  }
  
  type SortBy = SORT_BY
  
  type Status = STATUS_
}
