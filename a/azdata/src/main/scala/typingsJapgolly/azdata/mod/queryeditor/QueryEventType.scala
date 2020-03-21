package typingsJapgolly.azdata.mod.queryeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.azdataStrings.queryStart
  - typingsJapgolly.azdata.azdataStrings.queryUpdate
  - typingsJapgolly.azdata.azdataStrings.queryStop
  - typingsJapgolly.azdata.azdataStrings.executionPlan
  - typingsJapgolly.azdata.azdataStrings.visualize
*/
trait QueryEventType extends js.Object

object QueryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def executionPlan: typingsJapgolly.azdata.azdataStrings.executionPlan = this.cast("executionPlan")
  @scala.inline
  def queryStart: typingsJapgolly.azdata.azdataStrings.queryStart = this.cast("queryStart")
  @scala.inline
  def queryStop: typingsJapgolly.azdata.azdataStrings.queryStop = this.cast("queryStop")
  @scala.inline
  def queryUpdate: typingsJapgolly.azdata.azdataStrings.queryUpdate = this.cast("queryUpdate")
  @scala.inline
  def visualize: typingsJapgolly.azdata.azdataStrings.visualize = this.cast("visualize")
}

