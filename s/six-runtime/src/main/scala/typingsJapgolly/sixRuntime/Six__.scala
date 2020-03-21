package typingsJapgolly.sixRuntime

import typingsJapgolly.sixRuntime.Six_.PluginsMap
import typingsJapgolly.sixRuntime.Six_.plugins.rpc
import typingsJapgolly.sixRuntime.Six_.plugins.time.timmer
import typingsJapgolly.sixRuntime.Six_.plugins.view.render
import typingsJapgolly.sixRuntime.Six_.plugins.view.runtimeConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Six__ extends js.Object {
  /**
    * DataProvider类，所有的data-provider必须继承这个类
    */
  var DataProvider: typingsJapgolly.sixRuntime.Six_.plugins.dataProvider.DataProvider = js.native
  /**
    * NODE_ENV的缩短版
    *
    * production、prod => prod
    *
    * dev、develop、development => dev
    */
  val ENV: String = js.native
  /**
    * process.env.NODE_ENV
    */
  val NODE_ENV: String = js.native
  /**
    * Six的rootPath
    */
  val ROOT_PATH: String = js.native
  /**
    * 发送请求的工具方法，会将用户的cookie和traceId透传过去
    */
  var http: typingsJapgolly.sixRuntime.Six_.plugins.http = js.native
  /**
    * 打日志方法
    */
  var log: typingsJapgolly.sixRuntime.Six_.plugins.log = js.native
  /**
    * Six的plugin的map
    */
  val plugins: PluginsMap = js.native
  /**
    * 渲染函数
    */
  @JSName("render")
  var render_Original: render = js.native
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  @JSName("rpc")
  var rpc_Original: rpc = js.native
  /**
    * 时间统计工具
    */
  var time: timmer = js.native
  /**
    * 执行某个data-provider，并返回执行之后的值
    */
  def dp(name: String): js.Any = js.native
  /**
    * 针对这次请求生效的数据缓存 get
    */
  def get(key: String): js.Any = js.native
  /**
    * 渲染函数
    */
  def render(name: String): js.Promise[_] = js.native
  def render(name: String, runtimeConf: Null, data: js.Object): js.Promise[_] = js.native
  def render(name: String, runtimeConf: runtimeConf): js.Promise[_] = js.native
  def render(name: String, runtimeConf: runtimeConf, data: js.Object): js.Promise[_] = js.native
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  def rpc(config: js.Object): js.Object = js.native
  /**
    * 针对这次请求生效的数据缓存 set
    */
  def set(key: String, value: js.Any): Unit = js.native
}

