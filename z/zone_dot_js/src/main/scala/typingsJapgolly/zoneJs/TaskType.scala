package typingsJapgolly.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `microTask`, `macroTask`, `eventTask`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zoneJs.zoneJsStrings.microTask
  - typingsJapgolly.zoneJs.zoneJsStrings.macroTask
  - typingsJapgolly.zoneJs.zoneJsStrings.eventTask
*/
trait TaskType extends js.Object

object TaskType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventTask: typingsJapgolly.zoneJs.zoneJsStrings.eventTask = this.cast("eventTask")
  @scala.inline
  def macroTask: typingsJapgolly.zoneJs.zoneJsStrings.macroTask = this.cast("macroTask")
  @scala.inline
  def microTask: typingsJapgolly.zoneJs.zoneJsStrings.microTask = this.cast("microTask")
}

