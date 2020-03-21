package typingsJapgolly.faker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollation extends js.Object {
  def collation(): String
  def column(): String
  def engine(): String
  def `type`(): String
}

object AnonCollation {
  @scala.inline
  def apply(
    collation: CallbackTo[String],
    column: CallbackTo[String],
    engine: CallbackTo[String],
    `type`: CallbackTo[String]
  ): AnonCollation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collation")(collation.toJsFn)
    __obj.updateDynamic("column")(column.toJsFn)
    __obj.updateDynamic("engine")(engine.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[AnonCollation]
  }
}

