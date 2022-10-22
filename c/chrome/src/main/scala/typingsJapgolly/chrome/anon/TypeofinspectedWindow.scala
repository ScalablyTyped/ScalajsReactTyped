package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvalOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ReloadOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.Resource
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceAddedEvent
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceContentCommittedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofinspectedWindow extends StObject {
  
  def eval[T](expression: String): Unit = js.native
  def eval[T](
    expression: String,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  def eval[T](
    expression: String,
    options: Unit,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  def eval[T](expression: String, options: EvalOptions): Unit = js.native
  def eval[T](
    expression: String,
    options: EvalOptions,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  
  def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = js.native
  
  var onResourceAdded: ResourceAddedEvent = js.native
  
  var onResourceContentCommitted: ResourceContentCommittedEvent = js.native
  
  def reload(): Unit = js.native
  def reload(reloadOptions: ReloadOptions): Unit = js.native
  
  var tabId: Double = js.native
}
