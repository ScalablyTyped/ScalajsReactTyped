package typingsJapgolly.rxJquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryAjaxSettings
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def ajaxAsObservable[T](settings: JQueryAjaxSettings): Observable[RxJQueryAjaxResult[T]]
  def getAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
  def getJSONAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]]
  def getScriptAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]]
  def postAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
}

object JQueryStatic {
  @scala.inline
  def apply(
    ajaxAsObservable: JQueryAjaxSettings => CallbackTo[Observable[RxJQueryAjaxResult[js.Any]]],
    getAsObservable: (String, js.Any, String) => CallbackTo[Observable[RxJQueryAjaxResult[js.Any]]],
    getJSONAsObservable: (String, js.Any) => CallbackTo[Observable[RxJQueryAjaxResult[js.Any]]],
    getScriptAsObservable: (String, js.Any) => CallbackTo[Observable[RxJQueryAjaxResult[js.Any]]],
    postAsObservable: (String, js.Any, String) => CallbackTo[Observable[RxJQueryAjaxResult[js.Any]]]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxAsObservable")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQueryAjaxSettings) => ajaxAsObservable(t0).runNow()))
    __obj.updateDynamic("getAsObservable")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: java.lang.String) => getAsObservable(t0, t1, t2).runNow()))
    __obj.updateDynamic("getJSONAsObservable")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getJSONAsObservable(t0, t1).runNow()))
    __obj.updateDynamic("getScriptAsObservable")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getScriptAsObservable(t0, t1).runNow()))
    __obj.updateDynamic("postAsObservable")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: java.lang.String) => postAsObservable(t0, t1, t2).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

