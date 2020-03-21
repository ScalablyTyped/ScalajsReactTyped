package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CSV_C
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CSV_T
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.OOXML
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def CSV_C: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CSV_C = this.cast("CSV_C")
  @scala.inline
  def CSV_T: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CSV_T = this.cast("CSV_T")
  @scala.inline
  def OOXML: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.OOXML = this.cast("OOXML")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

