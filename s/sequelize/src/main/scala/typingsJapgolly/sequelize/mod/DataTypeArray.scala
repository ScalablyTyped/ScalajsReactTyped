package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeArray extends DataTypeAbstract {
  /**
    * Array field for Postgre
    *
    * Accepts type any of the DataTypes
    */
  def apply(options: AnonType): DataTypeArray = js.native
  def apply(`type`: DataTypeAbstract): DataTypeArray = js.native
}

