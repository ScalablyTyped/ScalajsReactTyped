package typingsJapgolly.arangodb.ArangoDB

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AqlLiteral extends js.Object {
  def toAQL(): String
}

object AqlLiteral {
  @scala.inline
  def apply(toAQL: CallbackTo[String]): AqlLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toAQL")(toAQL.toJsFn)
    __obj.asInstanceOf[AqlLiteral]
  }
}

