package typingsJapgolly.kakaomaps.global.kakao.maps

import typingsJapgolly.kakaomaps.kakao.maps.services.ANALYZE_TYPE
import typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_
import typingsJapgolly.kakaomaps.kakao.maps.services.MarkerClusterOptions
import typingsJapgolly.kakaomaps.kakao.maps.services.SORT_BY
import typingsJapgolly.kakaomaps.kakao.maps.services.STATUS_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// # Library
// ## services namespace
object services {
  
  @JSGlobal("kakao.maps.services.ANALYZE_TYPE")
  @js.native
  object ANALYZE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kakaomaps.kakao.maps.services.ANALYZE_TYPE & String] = js.native
    
    /* "exact" */ val EXACT: typingsJapgolly.kakaomaps.kakao.maps.services.ANALYZE_TYPE.EXACT & String = js.native
    
    /* "similar" */ val SIMILAR: typingsJapgolly.kakaomaps.kakao.maps.services.ANALYZE_TYPE.SIMILAR & String = js.native
  }
  
  object AnalyzeType {
    
    @JSGlobal("kakao.maps.services.AnalyzeType.EXACT")
    @js.native
    val EXACT: ANALYZE_TYPE = js.native
    
    @JSGlobal("kakao.maps.services.AnalyzeType.SIMILAR")
    @js.native
    val SIMILAR: ANALYZE_TYPE = js.native
  }
  
  @JSGlobal("kakao.maps.services.COORDS")
  @js.native
  object COORDS_ extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_ & String] = js.native
    
    /* "CONGNAMUL" */ val CONGNAMUL: typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_.CONGNAMUL & String = js.native
    
    /* "TM" */ val TM: typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_.TM & String = js.native
    
    /* "WCONGNAMUL" */ val WCONGNAMUL: typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_.WCONGNAMUL & String = js.native
    
    /* "WGS84" */ val WGS84: typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_.WGS84 & String = js.native
    
    /* "WTM" */ val WTM: typingsJapgolly.kakaomaps.kakao.maps.services.COORDS_.WTM & String = js.native
  }
  
  @JSGlobal("kakao.maps.services.Cluster")
  @js.native
  open class Cluster ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.services.Cluster {
    
    /* CompleteClass */
    override def getBounds(): typingsJapgolly.kakaomaps.kakao.maps.LatLngBounds = js.native
    
    /* CompleteClass */
    override def getCenter(): typingsJapgolly.kakaomaps.kakao.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getClusterMarker(): typingsJapgolly.kakaomaps.kakao.maps.CustomOverlay = js.native
    
    /* CompleteClass */
    override def getMarkers(): js.Array[typingsJapgolly.kakaomaps.kakao.maps.Marker] = js.native
    
    /* CompleteClass */
    override def getSize(): Double = js.native
  }
  
  object Coords {
    
    @JSGlobal("kakao.maps.services.Coords.CONGNAMUL")
    @js.native
    val CONGNAMUL: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.TM")
    @js.native
    val TM: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WCONGNAMUL")
    @js.native
    val WCONGNAMUL: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WGS84")
    @js.native
    val WGS84: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WTM")
    @js.native
    val WTM: COORDS_ = js.native
  }
  
  @JSGlobal("kakao.maps.services.Geocoder")
  @js.native
  open class Geocoder ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.services.Geocoder
  
  @JSGlobal("kakao.maps.services.MarkerCluster")
  @js.native
  open class MarkerCluster ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.services.MarkerCluster {
    def this(options: MarkerClusterOptions) = this()
  }
  
  @JSGlobal("kakao.maps.services.Pagination")
  @js.native
  open class Pagination ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.services.Pagination {
    
    /* CompleteClass */
    var current: Double = js.native
    
    /* CompleteClass */
    override def gotoFirst(): Unit = js.native
    
    /* CompleteClass */
    override def gotoLast(): Unit = js.native
    
    /* CompleteClass */
    override def gotoPage(page: Double): Unit = js.native
    
    /* CompleteClass */
    var hasNextPage: Boolean = js.native
    
    /* CompleteClass */
    var hasPrevPage: Boolean = js.native
    
    /* CompleteClass */
    override def nextPage(): Unit = js.native
    
    /* CompleteClass */
    override def prevPage(): Unit = js.native
    
    /* CompleteClass */
    var totalCount: Double = js.native
  }
  
  @JSGlobal("kakao.maps.services.Places")
  @js.native
  open class Places protected ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.services.Places {
    def this(map: typingsJapgolly.kakaomaps.kakao.maps.Map) = this()
  }
  
  @JSGlobal("kakao.maps.services.SORT_BY")
  @js.native
  object SORT_BY extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kakaomaps.kakao.maps.services.SORT_BY & String] = js.native
    
    /* "accuracy" */ val ACCURACY: typingsJapgolly.kakaomaps.kakao.maps.services.SORT_BY.ACCURACY & String = js.native
    
    /* "distance" */ val DISTANCE: typingsJapgolly.kakaomaps.kakao.maps.services.SORT_BY.DISTANCE & String = js.native
  }
  
  @JSGlobal("kakao.maps.services.STATUS")
  @js.native
  object STATUS_ extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kakaomaps.kakao.maps.services.STATUS_ & String] = js.native
    
    /* "ERROR" */ val ERROR: typingsJapgolly.kakaomaps.kakao.maps.services.STATUS_.ERROR & String = js.native
    
    /* "OK" */ val OK: typingsJapgolly.kakaomaps.kakao.maps.services.STATUS_.OK & String = js.native
    
    /* "ZERO_RESULT" */ val ZERO_RESULT: typingsJapgolly.kakaomaps.kakao.maps.services.STATUS_.ZERO_RESULT & String = js.native
  }
  
  object SortBy {
    
    @JSGlobal("kakao.maps.services.SortBy.ACCURACY")
    @js.native
    val ACCURACY: SORT_BY = js.native
    
    @JSGlobal("kakao.maps.services.SortBy.DISTANCE")
    @js.native
    val DISTANCE: SORT_BY = js.native
  }
  
  object Status {
    
    @JSGlobal("kakao.maps.services.Status.ERROR")
    @js.native
    val ERROR: STATUS_ = js.native
    
    @JSGlobal("kakao.maps.services.Status.OK")
    @js.native
    val OK: STATUS_ = js.native
    
    @JSGlobal("kakao.maps.services.Status.ZERO_RESULT")
    @js.native
    val ZERO_RESULT: STATUS_ = js.native
  }
}
