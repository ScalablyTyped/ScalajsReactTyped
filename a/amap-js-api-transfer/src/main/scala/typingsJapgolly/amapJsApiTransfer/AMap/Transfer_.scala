package typingsJapgolly.amapJsApiTransfer.AMap

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.LocationValue
import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.Options
import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchPoint
import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchResultBase
import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchResultExt
import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchStatus
import typingsJapgolly.amapJsApiTransfer.AnonDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Transfer")
@js.native
class Transfer_ protected () extends EventEmitter {
  /**
    * 公交换乘服务
    * @param options 构造函数选项
    */
  def this(options: Options) = this()
  /**
    * 清除结果显示
    */
  def clear(): Unit = js.native
  def close(): Unit = js.native
  /**
    * 设置公交路径规划出发时间
    * @param time 时间
    * @param date 日期
    */
  def leaveAt(): Unit = js.native
  def leaveAt(time: String): Unit = js.native
  def leaveAt(time: String, date: String): Unit = js.native
  // internal
  def open(): Unit = js.native
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param origin 起点坐标
    * @param destination 终点坐标
    * @param callback 查询回调
    */
  def search(origin: LocationValue, destination: LocationValue): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param path 路径名称关键字
    * @param callback 路径回调
    */
  def search(path: js.Tuple2[SearchPoint, SearchPoint]): Unit = js.native
  def search(
    path: js.Tuple2[SearchPoint, SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultExt, Unit]
  ): Unit = js.native
  /**
    * 唤起高德地图客户端公交路径规划
    * @param obj 唤起参数
    */
  def searchOnAMAP(obj: AnonDestination): Unit = js.native
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCityd(): Unit = js.native
  def setCityd(city: String): Unit = js.native
  /**
    * 设置公交换乘策略
    * @param policy 公交换乘策略
    */
  def setPolicy(): Unit = js.native
  def setPolicy(policy: TransferPolicy): Unit = js.native
}

