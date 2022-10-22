package typingsJapgolly.amapJsApiDistrictSearch

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch.Level
import typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchResult
import typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchStatus
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchInts.`0`
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchInts.`1`
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchInts.`2`
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchInts.`3`
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.all
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.base
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
import typingsJapgolly.amapJsApiDistrictSearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait DistrictSearch
    extends StObject
       with EventEmitter {
    
    /**
      * 根据关键字查询行政区或商圈信息
      * @param keyword 关键词
      * @param callback 回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    // internal
    def setExtensions(): Unit = js.native
    def setExtensions(extensions: Boolean): Unit = js.native
    
    /**
      * 设置关键字对应的行政区级别或商圈
      * @param level 级别
      */
    def setLevel(): Unit = js.native
    def setLevel(level: Level): Unit = js.native
    
    /**
      * 设置下级行政区级数
      * @param district 级数
      */
    def setSubdistrict(): Unit = js.native
    def setSubdistrict(district: `0` | `1` | `2` | `3`): Unit = js.native
  }
  object DistrictSearch {
    
    trait District extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String
      
      /**
        * 边界坐标集合
        */
      var boundaries: js.UndefOr[js.Array[js.Array[LngLat]]] = js.undefined
      
      /**
        * 中心点经纬度坐标
        */
      var center: LngLat
      
      /**
        * 城市编码
        */
      var citycode: String
      
      /**
        * 下级行政区信息列表
        */
      var districtList: js.UndefOr[js.Array[District]] = js.undefined
      
      /**
        * 行政区划级别
        */
      var level: Level
      
      /**
        * 行政区名称
        */
      var name: String
    }
    object District {
      
      inline def apply(adcode: String, center: LngLat, citycode: String, level: Level, name: String): District = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[District]
      }
      
      extension [Self <: District](x: Self) {
        
        inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        inline def setBoundaries(value: js.Array[js.Array[LngLat]]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
        
        inline def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
        
        inline def setBoundariesVarargs(value: js.Array[LngLat]*): Self = StObject.set(x, "boundaries", js.Array(value*))
        
        inline def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
        
        inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        inline def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
        
        inline def setDistrictListUndefined: Self = StObject.set(x, "districtList", js.undefined)
        
        inline def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value*))
        
        inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait EventMap extends StObject {
      
      var complete: Event_[
            typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete, 
            SearchResult
          ]
      
      var error: Event_[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error, Info]
    }
    object EventMap {
      
      inline def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area
    */
    trait Level extends StObject
    object Level {
      
      inline def biz_area: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area = "biz_area".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area]
      
      inline def city: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city = "city".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city]
      
      inline def country: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country = "country".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country]
      
      inline def district: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district = "district".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district]
      
      inline def province: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province = "province".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province]
    }
    
    trait Options extends StObject {
      
      /**
        * 是否返回行政区边界坐标点
        */
      var extensions: js.UndefOr[base | all] = js.undefined
      
      /**
        * 关键字对应的行政区级别或商圈
        */
      var level: js.UndefOr[Level] = js.undefined
      
      /**
        * 是否显示商圈
        */
      var showbiz: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 显示下级行政区级数
        * 0：不返回下级行政区
        * 1：返回下一级行政区
        * 2：返回下两级行政区
        * 3：返回下三级行政区
        */
      var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
        
        inline def setShowbiz(value: Boolean): Self = StObject.set(x, "showbiz", value.asInstanceOf[js.Any])
        
        inline def setShowbizUndefined: Self = StObject.set(x, "showbiz", js.undefined)
        
        inline def setSubdistrict(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "subdistrict", value.asInstanceOf[js.Any])
        
        inline def setSubdistrictUndefined: Self = StObject.set(x, "subdistrict", js.undefined)
      }
    }
    
    trait SearchResult extends StObject {
      
      /**
        * 行政区划列表
        */
      var districtList: js.Array[District]
      
      /**
        * 成功状态文字描述
        */
      var info: String
    }
    object SearchResult {
      
      inline def apply(districtList: js.Array[District], info: String): SearchResult = {
        val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
        
        inline def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value*))
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
      - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete = "complete".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete]
      
      inline def error: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error = "error".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error]
      
      inline def no_data: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data = "no_data".asInstanceOf[typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data]
    }
  }
}
