package typingsJapgolly.sequelize.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Deferrable
// ~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/deferrable.js
//
/**
  * Abstract Deferrable interface. Use this if you want to create an interface that has a value any of the
  * Deferrables that Sequelize supports.
  */
trait DeferrableAbstract extends js.Object {
  def toSql(): String
}

object DeferrableAbstract {
  @scala.inline
  def apply(toSql: CallbackTo[String]): DeferrableAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toSql")(toSql.toJsFn)
    __obj.asInstanceOf[DeferrableAbstract]
  }
}

