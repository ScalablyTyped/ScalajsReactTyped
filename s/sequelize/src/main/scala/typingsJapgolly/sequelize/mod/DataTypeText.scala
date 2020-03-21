package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.AnonLengthString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeText extends DataTypeAbstract {
  /**
    * Length of the text field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def apply(): DataTypeText = js.native
  def apply(length: String): DataTypeText = js.native
  def apply(options: AnonLengthString): DataTypeText = js.native
}

