package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ORawExpression extends _OSqlExpression {
  var db: ODB
  var value: String
  def as(alias: String): ORawExpression
}

object ORawExpression {
  @scala.inline
  def apply(as: String => CallbackTo[ORawExpression], db: ODB, value: String): ORawExpression = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(js.Any.fromFunction1((t0: java.lang.String) => as(t0).runNow()))
    __obj.asInstanceOf[ORawExpression]
  }
}

