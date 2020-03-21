package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.TypeofAMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.plugin")
@js.native
object plugin extends js.Object {
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def apply(plugin: String, callback: js.Function0[Unit]): TypeofAMap = js.native
  def apply(plugin: js.Array[String], callback: js.Function0[Unit]): TypeofAMap = js.native
}

