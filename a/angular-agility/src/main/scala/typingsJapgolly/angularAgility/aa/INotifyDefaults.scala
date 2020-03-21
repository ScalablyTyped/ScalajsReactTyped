package typingsJapgolly.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyDefaults extends js.Object {
  @JSName("danger")
  var danger_Original: INotifyPredicate = js.native
  @JSName("error")
  var error_Original: INotifyPredicate = js.native
  @JSName("info")
  var info_Original: INotifyPredicate = js.native
  @JSName("success")
  var success_Original: INotifyPredicate = js.native
  @JSName("warning")
  var warning_Original: INotifyPredicate = js.native
  def danger(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
  def error(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
  def info(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
  def success(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
  def warning(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
}

