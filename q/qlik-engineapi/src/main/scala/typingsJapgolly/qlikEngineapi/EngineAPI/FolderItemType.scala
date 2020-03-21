package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FOLDER
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.OTHER
*/
trait FolderItemType extends js.Object

object FolderItemType {
  @scala.inline
  def FILE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FOLDER: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FOLDER = this.cast("FOLDER")
  @scala.inline
  def OTHER: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

