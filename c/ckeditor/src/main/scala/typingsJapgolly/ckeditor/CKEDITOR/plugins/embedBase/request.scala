package typingsJapgolly.ckeditor.CKEDITOR.plugins.embedBase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait request extends js.Object {
  var response: StringDictionary[String]
  var task: typingsJapgolly.ckeditor.CKEDITOR.plugins.notificationAggregator.task
  var url: String
  def callback(): Unit
  def cancel(): Unit
  def errorCallback(error: String): Unit
}

object request {
  @scala.inline
  def apply(
    callback: Callback,
    cancel: Callback,
    errorCallback: String => Callback,
    response: StringDictionary[String],
    task: task,
    url: String
  ): request = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("errorCallback")(js.Any.fromFunction1((t0: java.lang.String) => errorCallback(t0).runNow()))
    __obj.asInstanceOf[request]
  }
}

