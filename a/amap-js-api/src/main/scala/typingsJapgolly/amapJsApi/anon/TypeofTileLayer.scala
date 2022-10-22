package typingsJapgolly.amapJsApi.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible
import typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible.Options
import typingsJapgolly.amapJsApi.AMap.TileLayer.RoadNet
import typingsJapgolly.amapJsApi.AMap.TileLayer.Satellite
import typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic
import typingsJapgolly.amapJsApi.AMap.TileLayer.WMS
import typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTileLayer extends StObject {
  
  val Flexible: Instantiable1[
    /* options */ js.UndefOr[Options], 
    typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible
  ]
  
  /**
    * 路网图层
    */
  var RoadNet: Instantiable0[typingsJapgolly.amapJsApi.AMap.TileLayer.RoadNet]
  
  /**
    * 卫星图层
    */
  var Satellite: Instantiable0[typingsJapgolly.amapJsApi.AMap.TileLayer.Satellite]
  
  val Traffic: Instantiable1[
    /* options */ js.UndefOr[typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic.Options], 
    typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic
  ]
  
  val WMS: Instantiable1[
    /* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMS.Options, 
    typingsJapgolly.amapJsApi.AMap.TileLayer.WMS
  ]
  
  val WMTS: Instantiable1[
    /* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS.Options, 
    typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS
  ]
}
object TypeofTileLayer {
  
  inline def apply(
    Flexible: Instantiable1[/* options */ js.UndefOr[Options], Flexible],
    RoadNet: Instantiable0[RoadNet],
    Satellite: Instantiable0[Satellite],
    Traffic: Instantiable1[
      /* options */ js.UndefOr[typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic.Options], 
      Traffic
    ],
    WMS: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMS.Options, WMS],
    WMTS: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]
  ): TypeofTileLayer = {
    val __obj = js.Dynamic.literal(Flexible = Flexible.asInstanceOf[js.Any], RoadNet = RoadNet.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Traffic = Traffic.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], WMTS = WMTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTileLayer]
  }
  
  extension [Self <: TypeofTileLayer](x: Self) {
    
    inline def setFlexible(value: Instantiable1[/* options */ js.UndefOr[Options], Flexible]): Self = StObject.set(x, "Flexible", value.asInstanceOf[js.Any])
    
    inline def setRoadNet(value: Instantiable0[RoadNet]): Self = StObject.set(x, "RoadNet", value.asInstanceOf[js.Any])
    
    inline def setSatellite(value: Instantiable0[Satellite]): Self = StObject.set(x, "Satellite", value.asInstanceOf[js.Any])
    
    inline def setTraffic(
      value: Instantiable1[
          /* options */ js.UndefOr[typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic.Options], 
          Traffic
        ]
    ): Self = StObject.set(x, "Traffic", value.asInstanceOf[js.Any])
    
    inline def setWMS(value: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMS.Options, WMS]): Self = StObject.set(x, "WMS", value.asInstanceOf[js.Any])
    
    inline def setWMTS(value: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]): Self = StObject.set(x, "WMTS", value.asInstanceOf[js.Any])
  }
}
