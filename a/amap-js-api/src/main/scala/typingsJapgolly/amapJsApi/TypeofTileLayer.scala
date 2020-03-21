package typingsJapgolly.amapJsApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible
import typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible.Options
import typingsJapgolly.amapJsApi.AMap.TileLayer.RoadNet
import typingsJapgolly.amapJsApi.AMap.TileLayer.Satellite
import typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic
import typingsJapgolly.amapJsApi.AMap.TileLayer.WMS
import typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTileLayer extends js.Object {
  val Flexible: Instantiable1[
    js.UndefOr[/* options */ Options], 
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
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic.Options], 
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
  @scala.inline
  def apply(
    Flexible: Instantiable1[js.UndefOr[/* options */ Options], Flexible],
    RoadNet: Instantiable0[RoadNet],
    Satellite: Instantiable0[Satellite],
    Traffic: Instantiable1[
      js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.Traffic.Options], 
      Traffic
    ],
    WMS: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMS.Options, WMS],
    WMTS: Instantiable1[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]
  ): TypeofTileLayer = {
    val __obj = js.Dynamic.literal(Flexible = Flexible.asInstanceOf[js.Any], RoadNet = RoadNet.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Traffic = Traffic.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], WMTS = WMTS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofTileLayer]
  }
}

