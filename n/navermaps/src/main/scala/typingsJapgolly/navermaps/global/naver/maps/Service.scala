package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Service.GeocodeResponse
import typingsJapgolly.navermaps.naver.maps.Service.GeocodeServiceOptions
import typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeResponse
import typingsJapgolly.navermaps.naver.maps.Service.ReverseServiceOptions
import typingsJapgolly.navermaps.naver.maps.Service.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Service {
  
  // Sub module: geocoder
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.Service")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.Service.CoordinatesType")
  @js.native
  object CoordinatesType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.CoordinatesType & Double] = js.native
    
    /* 3 */ val EPSG3857: typingsJapgolly.navermaps.naver.maps.Service.CoordinatesType.EPSG3857 & Double = js.native
    
    /* 0 */ val LATLNG: typingsJapgolly.navermaps.naver.maps.Service.CoordinatesType.LATLNG & Double = js.native
    
    /* 2 */ val TM128: typingsJapgolly.navermaps.naver.maps.Service.CoordinatesType.TM128 & Double = js.native
    
    /* 1 */ val UTMK: typingsJapgolly.navermaps.naver.maps.Service.CoordinatesType.UTMK & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.GeocodeStatus")
  @js.native
  object GeocodeStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.GeocodeStatus & Double] = js.native
    
    /* 1 */ val INVALID_REQUEST: typingsJapgolly.navermaps.naver.maps.Service.GeocodeStatus.INVALID_REQUEST & Double = js.native
    
    /* 0 */ val OK: typingsJapgolly.navermaps.naver.maps.Service.GeocodeStatus.OK & Double = js.native
    
    /* 2 */ val SYSTEM_ERROR: typingsJapgolly.navermaps.naver.maps.Service.GeocodeStatus.SYSTEM_ERROR & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.OrderType")
  @js.native
  object OrderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.OrderType & Double] = js.native
    
    /* 1 */ val ADDR: typingsJapgolly.navermaps.naver.maps.Service.OrderType.ADDR & Double = js.native
    
    /* 3 */ val ADM_CODE: typingsJapgolly.navermaps.naver.maps.Service.OrderType.ADM_CODE & Double = js.native
    
    /* 0 */ val LEGAL_CODE: typingsJapgolly.navermaps.naver.maps.Service.OrderType.LEGAL_CODE & Double = js.native
    
    /* 2 */ val ROAD_ADDR: typingsJapgolly.navermaps.naver.maps.Service.OrderType.ROAD_ADDR & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.ReverseGeocodeStatusCode")
  @js.native
  object ReverseGeocodeStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusCode & Double] = js.native
    
    /* 0 */ val CODE_0: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_0 & Double = js.native
    
    /* 2 */ val CODE_100: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_100 & Double = js.native
    
    /* 1 */ val CODE_3: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_3 & Double = js.native
    
    /* 3 */ val CODE_900: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_900 & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.ReverseGeocodeStatusName")
  @js.native
  object ReverseGeocodeStatusName extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusName & Double] = js.native
    
    /* 2 */ val INVALID_REQUEST: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusName.INVALID_REQUEST & Double = js.native
    
    /* 1 */ val NO_RESULTS: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusName.NO_RESULTS & Double = js.native
    
    /* 0 */ val OK: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusName.OK & Double = js.native
    
    /* 3 */ val UNKNOWN_ERROR_IO_ERROR: typingsJapgolly.navermaps.naver.maps.Service.ReverseGeocodeStatusName.UNKNOWN_ERROR_IO_ERROR & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.Service.Status & Double] = js.native
    
    /* 1 */ val ERROR: typingsJapgolly.navermaps.naver.maps.Service.Status.ERROR & Double = js.native
    
    /* 0 */ val OK: typingsJapgolly.navermaps.naver.maps.Service.Status.OK & Double = js.native
  }
  
  inline def fromAddrToCoord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddrToCoord")().asInstanceOf[Unit]
  
  inline def fromCoordToAddr(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToAddr")().asInstanceOf[Unit]
  
  inline def geocode(options: GeocodeServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def geocode(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reverseGeocode(options: ReverseServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reverseGeocode(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
