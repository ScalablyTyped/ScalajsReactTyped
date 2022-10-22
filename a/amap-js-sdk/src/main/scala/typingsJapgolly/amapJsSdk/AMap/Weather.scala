package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weather extends StObject {
  
  /**
    * 查询四天预报天气，包括查询当天天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getForecast(
    district: String,
    callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]
  ): Unit
  
  /**
    * 查询实时天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getLive(
    district: String,
    callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]
  ): Unit
}
object Weather {
  
  inline def apply(
    getForecast: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => Callback,
    getLive: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => Callback
  ): Weather = {
    val __obj = js.Dynamic.literal(getForecast = js.Any.fromFunction2((t0: String, t1: js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => (getForecast(t0, t1)).runNow()), getLive = js.Any.fromFunction2((t0: String, t1: js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => (getLive(t0, t1)).runNow()))
    __obj.asInstanceOf[Weather]
  }
  
  extension [Self <: Weather](x: Self) {
    
    inline def setGetForecast(
      value: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => Callback
    ): Self = StObject.set(x, "getForecast", js.Any.fromFunction2((t0: String, t1: js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetLive(
      value: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => Callback
    ): Self = StObject.set(x, "getLive", js.Any.fromFunction2((t0: String, t1: js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => (value(t0, t1)).runNow()))
  }
}
