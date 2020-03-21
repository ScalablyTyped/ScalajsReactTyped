package typingsJapgolly.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.agGrid.agGridStrings.String
  - typingsJapgolly.agGrid.agGridStrings.Number
  - typingsJapgolly.agGrid.agGridStrings.Boolean
  - typingsJapgolly.agGrid.agGridStrings.DateTime
  - typingsJapgolly.agGrid.agGridStrings.Error
*/
trait ExcelDataType extends js.Object

object ExcelDataType {
  @scala.inline
  def Boolean: typingsJapgolly.agGrid.agGridStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def DateTime: typingsJapgolly.agGrid.agGridStrings.DateTime = this.cast("DateTime")
  @scala.inline
  def Error: typingsJapgolly.agGrid.agGridStrings.Error = this.cast("Error")
  @scala.inline
  def Number: typingsJapgolly.agGrid.agGridStrings.Number = this.cast("Number")
  @scala.inline
  def String: typingsJapgolly.agGrid.agGridStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

