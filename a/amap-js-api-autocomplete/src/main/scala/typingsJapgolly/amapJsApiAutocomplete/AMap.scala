package typingsJapgolly.amapJsApiAutocomplete

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.Lang
import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete.SearchResult
import typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete.SearchStatus
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import typingsJapgolly.amapJsApiAutocomplete.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait Autocomplete
    extends StObject
       with EventEmitter {
    
    /**
      * 返回查询语言
      */
    def getLang(): js.UndefOr[Lang] = js.native
    
    /**
      * 根据输入关键字提示匹配信息
      * @param keyword 关键字
      * @param callback 回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 设置城市
      * @param city 城市
      */
    def setCity(): Unit = js.native
    def setCity(city: String): Unit = js.native
    
    /**
      * 设置是否强制限制城市
      * @param cityLimit 是否强制限制城市
      */
    def setCityLimit(cityLimit: Boolean): Unit = js.native
    
    // internal
    /**
      * 设置查询语言
      * @param lang 语言
      */
    def setLang(): Unit = js.native
    def setLang(lang: Lang): Unit = js.native
    
    /**
      * 设置提示Poi类型，多个类型用“|”分隔
      * @param type Poi类型
      */
    def setType(): Unit = js.native
    def setType(`type`: String): Unit = js.native
  }
  object Autocomplete {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.all
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.bus
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.poi
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.busline
    */
    trait DataType extends StObject
    object DataType {
      
      inline def all: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.all = "all".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.all]
      
      inline def bus: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.bus = "bus".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.bus]
      
      inline def busline: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.busline = "busline".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.busline]
      
      inline def poi: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.poi = "poi".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.poi]
    }
    
    trait EventMap extends StObject {
      
      var choose: Event_[
            typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, 
            typingsJapgolly.amapJsApiAutocomplete.anon.Tip
          ]
      
      var complete: Event_[
            typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
            SearchResult | Info
          ]
      
      var error: Event_[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, Info]
      
      var select: Event_[
            typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, 
            typingsJapgolly.amapJsApiAutocomplete.anon.Tip
          ]
    }
    object EventMap {
      
      inline def apply(
        choose: Event_[choose, typingsJapgolly.amapJsApiAutocomplete.anon.Tip],
        complete: Event_[complete, SearchResult | Info],
        error: Event_[error, Info],
        select: Event_[select, typingsJapgolly.amapJsApiAutocomplete.anon.Tip]
      ): EventMap = {
        val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setChoose(value: Event_[choose, typingsJapgolly.amapJsApiAutocomplete.anon.Tip]): Self = StObject.set(x, "choose", value.asInstanceOf[js.Any])
        
        inline def setComplete(value: Event_[complete, SearchResult | Info]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setSelect(value: Event_[select, typingsJapgolly.amapJsApiAutocomplete.anon.Tip]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 输入提示时限定城市
        */
      var city: js.UndefOr[String] = js.undefined
      
      /**
        * 是否强制限制在设置的城市内搜索
        */
      var citylimit: js.UndefOr[Boolean] = js.undefined
      
      // internal
      var closeResultOnScroll: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 返回的数据类型
        */
      var datatype: js.UndefOr[DataType] = js.undefined
      
      /**
        * 指定输入框
        */
      var input: js.UndefOr[String | HTMLInputElement] = js.undefined
      
      var lang: js.UndefOr[Lang] = js.undefined
      
      /**
        * 是否在input位于页面较下方的时候自动将输入面板显示在input上方以避免被遮挡
        */
      var outPutDirAuto: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 指定输出面板
        */
      var output: js.UndefOr[String | HTMLDivElement] = js.undefined
      
      /**
        * 输入提示时限定POI类型，多个类型用“|”分隔
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        inline def setCitylimit(value: Boolean): Self = StObject.set(x, "citylimit", value.asInstanceOf[js.Any])
        
        inline def setCitylimitUndefined: Self = StObject.set(x, "citylimit", js.undefined)
        
        inline def setCloseResultOnScroll(value: Boolean): Self = StObject.set(x, "closeResultOnScroll", value.asInstanceOf[js.Any])
        
        inline def setCloseResultOnScrollUndefined: Self = StObject.set(x, "closeResultOnScroll", js.undefined)
        
        inline def setDatatype(value: DataType): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        inline def setInput(value: String | HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
        
        inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        inline def setOutPutDirAuto(value: Boolean): Self = StObject.set(x, "outPutDirAuto", value.asInstanceOf[js.Any])
        
        inline def setOutPutDirAutoUndefined: Self = StObject.set(x, "outPutDirAuto", js.undefined)
        
        inline def setOutput(value: String | HTMLDivElement): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait SearchResult extends StObject {
      
      /**
        * 输入提示条数
        */
      var count: Double
      
      /**
        * 查询状态说明
        */
      var info: String
      
      /**
        * 输入提示列表
        */
      var tips: js.Array[Tip]
    }
    object SearchResult {
      
      inline def apply(count: Double, info: String, tips: js.Array[Tip]): SearchResult = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setTips(value: js.Array[Tip]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
        
        inline def setTipsVarargs(value: Tip*): Self = StObject.set(x, "tips", js.Array(value*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
      - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete = "complete".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete]
      
      inline def error: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error = "error".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error]
      
      inline def no_data: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data = "no_data".asInstanceOf[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data]
    }
    
    trait Tip extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String
      
      /**
        * 地址
        */
      var address: String
      
      /**
        * 城市
        */
      var city: js.Array[Any]
      
      /**
        * 所属区域
        */
      var district: String
      
      /**
        * ID
        */
      var id: String
      
      /**
        * 坐标经纬度
        */
      var location: LngLat
      
      /**
        * 名称
        */
      var name: String
      
      /**
        * 类型编码
        */
      var typecode: String
    }
    object Tip {
      
      inline def apply(
        adcode: String,
        address: String,
        city: js.Array[Any],
        district: String,
        id: String,
        location: LngLat,
        name: String,
        typecode: String
      ): Tip = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typecode = typecode.asInstanceOf[js.Any])
        __obj.asInstanceOf[Tip]
      }
      
      extension [Self <: Tip](x: Self) {
        
        inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setCity(value: js.Array[Any]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        inline def setCityVarargs(value: Any*): Self = StObject.set(x, "city", js.Array(value*))
        
        inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTypecode(value: String): Self = StObject.set(x, "typecode", value.asInstanceOf[js.Any])
      }
    }
  }
}
