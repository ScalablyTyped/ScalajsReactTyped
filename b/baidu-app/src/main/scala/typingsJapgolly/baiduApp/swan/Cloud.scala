package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baiduApp.AnonEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 云开发
// 文档：https://smartprogram.baidu.com/docs/develop/tutorial/codedir/
trait Cloud extends js.Object {
  /**
  		 * 接受一个 name 参数，指定需引用的集合名称
  		 */
  def collection(name: String): js.Object
  /**
  		 * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
  		 */
  def database(options: AnonEnv): js.Object
  /**
  		 * 初始化方法（全局只需一次）
  		 */
  def init(options: InitCloudOptions): Unit
}

object Cloud {
  @scala.inline
  def apply(
    collection: String => CallbackTo[js.Object],
    database: AnonEnv => CallbackTo[js.Object],
    init: InitCloudOptions => Callback
  ): Cloud = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(js.Any.fromFunction1((t0: java.lang.String) => collection(t0).runNow()))
    __obj.updateDynamic("database")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.AnonEnv) => database(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.InitCloudOptions) => init(t0).runNow()))
    __obj.asInstanceOf[Cloud]
  }
}

