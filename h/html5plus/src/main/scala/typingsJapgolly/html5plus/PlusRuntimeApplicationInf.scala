package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，打开第三方程序参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeApplicationInf extends js.Object {
  /**
    * 程序的操作行为
    * Android平台上与系统的action值一致；iOS平台为要调用程序的URLScheme格式字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var action: js.UndefOr[String] = js.undefined
  /**
    * 调用程序的参数
    * 仅Android平台支持，为JSON格式，用于传递给要调用程序的参数，如extra:{url:"http://www.html5plus.org"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var extra: js.UndefOr[js.Any] = js.undefined
  /**
    * 新任务模式标记
    * 可取值：
    * 		true-使用新任务模式标记（FLAG_ACTIVITY_NEW_TASK）启动应用；
    * 		false-不使用新任务模式标记（FLAG_ACTIVITY_NEW_TASK）启动应用。
    * 	默认值为true。
    * 	注意：由于5+应用配置的launchMode为singleTask，所以另一个5+应用通过plus.runtime.launchApplication启动时如果应用已经在后台运行则不会触发newintent事件，为了避免此问题需要将newTask参数值设置为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var newTask: js.UndefOr[Boolean] = js.undefined
  /**
    * 第三方程序包名
    * 仅Android平台支持，表示程序的包名，其它平台忽略此属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var pname: js.UndefOr[String] = js.undefined
}

object PlusRuntimeApplicationInf {
  @scala.inline
  def apply(
    action: String = null,
    extra: js.Any = null,
    newTask: js.UndefOr[Boolean] = js.undefined,
    pname: String = null
  ): PlusRuntimeApplicationInf = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(newTask)) __obj.updateDynamic("newTask")(newTask.asInstanceOf[js.Any])
    if (pname != null) __obj.updateDynamic("pname")(pname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusRuntimeApplicationInf]
  }
}

