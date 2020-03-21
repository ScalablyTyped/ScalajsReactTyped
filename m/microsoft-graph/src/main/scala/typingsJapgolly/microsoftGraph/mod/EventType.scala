package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.singleInstance
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.occurrence
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exception
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.seriesMaster
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exception: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exception = this.cast("exception")
  @scala.inline
  def occurrence: typingsJapgolly.microsoftGraph.microsoftGraphStrings.occurrence = this.cast("occurrence")
  @scala.inline
  def seriesMaster: typingsJapgolly.microsoftGraph.microsoftGraphStrings.seriesMaster = this.cast("seriesMaster")
  @scala.inline
  def singleInstance: typingsJapgolly.microsoftGraph.microsoftGraphStrings.singleInstance = this.cast("singleInstance")
}

