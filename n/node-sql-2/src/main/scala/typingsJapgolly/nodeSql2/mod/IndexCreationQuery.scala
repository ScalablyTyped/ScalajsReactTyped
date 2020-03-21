package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexCreationQuery extends Executable {
  def fulltext(): IndexCreationQuery
  def on(columns: ((Column[_, _]) | OrderByValueNode)*): IndexCreationQuery
  def spatial(): IndexCreationQuery
  def unique(): IndexCreationQuery
  def using(name: String): IndexCreationQuery
  def withParser(parserName: String): IndexCreationQuery
}

object IndexCreationQuery {
  @scala.inline
  def apply(
    fulltext: CallbackTo[IndexCreationQuery],
    on: /* repeated */ (Column[js.Any, js.Any]) | OrderByValueNode => CallbackTo[IndexCreationQuery],
    spatial: CallbackTo[IndexCreationQuery],
    toQuery: CallbackTo[QueryLike],
    unique: CallbackTo[IndexCreationQuery],
    using: String => CallbackTo[IndexCreationQuery],
    withParser: String => CallbackTo[IndexCreationQuery]
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fulltext")(fulltext.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: /* repeated */ (typingsJapgolly.nodeSql2.mod.Column[js.Any, js.Any]) | typingsJapgolly.nodeSql2.mod.OrderByValueNode) => on(t0).runNow()))
    __obj.updateDynamic("spatial")(spatial.toJsFn)
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.updateDynamic("unique")(unique.toJsFn)
    __obj.updateDynamic("using")(js.Any.fromFunction1((t0: java.lang.String) => using(t0).runNow()))
    __obj.updateDynamic("withParser")(js.Any.fromFunction1((t0: java.lang.String) => withParser(t0).runNow()))
    __obj.asInstanceOf[IndexCreationQuery]
  }
}

