package typingsJapgolly.apolloLink.testingUtilsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloLink.linkMod.ApolloLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultType extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  var link: ApolloLink
  var query: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[js.Array[_]] = js.undefined
  var variables: js.UndefOr[js.Any] = js.undefined
}

object TestResultType {
  @scala.inline
  def apply(
    link: ApolloLink,
    context: js.Any = null,
    done: js.UndefOr[Callback] = js.undefined,
    query: String = null,
    results: js.Array[_] = null,
    variables: js.Any = null
  ): TestResultType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    done.foreach(p => __obj.updateDynamic("done")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultType]
  }
}

