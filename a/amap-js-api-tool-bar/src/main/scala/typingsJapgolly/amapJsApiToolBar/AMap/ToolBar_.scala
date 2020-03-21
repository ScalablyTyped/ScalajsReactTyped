package typingsJapgolly.amapJsApiToolBar.AMap

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiToolBar.AMap.ToolBar.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ToolBar")
@js.native
class ToolBar_ () extends EventEmitter {
  def this(options: Options) = this()
  /**
    * 进行位置定位
    */
  def doLocation(): Unit = js.native
  /**
    * 获取上次定位的结果
    */
  def getLocation(): js.UndefOr[LngLat | Null] = js.native
  /**
    * 获取工具条相对于地图容器左上角的偏移量
    */
  def getOffset(): Pixel = js.native
  /**
    * 隐藏工具条
    */
  def hide(): Unit = js.native
  /**
    * 隐藏方向键盘
    */
  def hideDirection(): Unit = js.native
  /**
    * 隐藏定位小部件
    */
  def hideLocation(): Unit = js.native
  /**
    * 隐藏缩放级别等级条
    */
  def hideRuler(): Unit = js.native
  /**
    * 设置工具条相对于地图容器左上角的偏移量
    * @param offset 偏移量
    */
  def setOffset(offset: Pixel): Unit = js.native
  /**
    * 显示工具条
    */
  def show(): Unit = js.native
  /**
    * 显示方向键盘
    */
  def showDirection(): Unit = js.native
  /**
    * 显示定位小部件
    */
  def showLocation(): Unit = js.native
  /**
    * 显示缩放级别等级条
    */
  def showRuler(): Unit = js.native
}

