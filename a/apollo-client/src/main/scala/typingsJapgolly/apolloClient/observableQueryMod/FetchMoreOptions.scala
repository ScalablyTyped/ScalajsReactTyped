package typingsJapgolly.apolloClient.observableQueryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.AnonFetchMoreResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreOptions[TData, TVariables] extends js.Object {
  def updateQuery(previousQueryResult: TData, options: AnonFetchMoreResult[TData, TVariables]): TData
}

object FetchMoreOptions {
  @scala.inline
  def apply[TData, TVariables](updateQuery: (TData, AnonFetchMoreResult[TData, TVariables]) => CallbackTo[TData]): FetchMoreOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateQuery")(js.Any.fromFunction2((t0: TData, t1: typingsJapgolly.apolloClient.AnonFetchMoreResult[TData, TVariables]) => updateQuery(t0, t1).runNow()))
    __obj.asInstanceOf[FetchMoreOptions[TData, TVariables]]
  }
}

