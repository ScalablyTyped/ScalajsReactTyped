package typingsJapgolly.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* telemetry types */
/**
  * Type of scalar: 'count' for numeric values, 'string' for string values, 'boolean' for boolean values. Maps to
  * `nsITelemetry.SCALAR_TYPE_*`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.count
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.string
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean
*/
trait ScalarType extends js.Object

object ScalarType {
  @scala.inline
  def boolean: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.count = this.cast("count")
  @scala.inline
  def string: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.string = this.cast("string")
}

