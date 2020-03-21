package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvalOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ReloadOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.Resource
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceAddedEvent
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceContentCommittedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofinspectedWindow extends js.Object {
  var onResourceAdded: ResourceAddedEvent = js.native
  var onResourceContentCommitted: ResourceContentCommittedEvent = js.native
  var tabId: Double = js.native
  def eval[T](expression: String): Unit = js.native
  def eval[T](
    expression: String,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  def eval[T](expression: String, options: EvalOptions): Unit = js.native
  def eval[T](
    expression: String,
    options: EvalOptions,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = js.native
  def reload(reloadOptions: ReloadOptions): Unit = js.native
}

