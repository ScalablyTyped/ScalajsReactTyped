package typingsJapgolly.webix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webix.webixStrings.onAfterLoad
  - typingsJapgolly.webix.webixStrings.onBeforeLoad
  - typingsJapgolly.webix.webixStrings.onBindRequest
  - typingsJapgolly.webix.webixStrings.onChange
  - typingsJapgolly.webix.webixStrings.onLoadError
*/
trait DataRecordEventName extends js.Object

object DataRecordEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAfterLoad: typingsJapgolly.webix.webixStrings.onAfterLoad = this.cast("onAfterLoad")
  @scala.inline
  def onBeforeLoad: typingsJapgolly.webix.webixStrings.onBeforeLoad = this.cast("onBeforeLoad")
  @scala.inline
  def onBindRequest: typingsJapgolly.webix.webixStrings.onBindRequest = this.cast("onBindRequest")
  @scala.inline
  def onChange: typingsJapgolly.webix.webixStrings.onChange = this.cast("onChange")
  @scala.inline
  def onLoadError: typingsJapgolly.webix.webixStrings.onLoadError = this.cast("onLoadError")
}

