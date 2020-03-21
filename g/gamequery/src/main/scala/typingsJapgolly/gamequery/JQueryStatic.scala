package typingsJapgolly.gamequery

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var gQ: GameQuery
  var gameQuery: GameQuery
  def playground(): JQuery
}

object JQueryStatic {
  @scala.inline
  def apply(gQ: GameQuery, gameQuery: GameQuery, playground: CallbackTo[JQuery]): JQueryStatic = {
    val __obj = js.Dynamic.literal(gQ = gQ.asInstanceOf[js.Any], gameQuery = gameQuery.asInstanceOf[js.Any])
    __obj.updateDynamic("playground")(playground.toJsFn)
    __obj.asInstanceOf[JQueryStatic]
  }
}

