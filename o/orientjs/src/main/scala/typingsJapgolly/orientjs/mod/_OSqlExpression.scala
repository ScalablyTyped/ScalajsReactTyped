package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OSqlExpression extends js.Object

object _OSqlExpression {
  @scala.inline
  def ORawExpression(as: String => CallbackTo[typingsJapgolly.orientjs.mod.ORawExpression], db: ODB, value: String): _OSqlExpression = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(js.Any.fromFunction1((t0: java.lang.String) => as(t0).runNow()))
    __obj.asInstanceOf[_OSqlExpression]
  }
  @scala.inline
  def OSqlFunction(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): _OSqlExpression = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_OSqlExpression]
  }
}

