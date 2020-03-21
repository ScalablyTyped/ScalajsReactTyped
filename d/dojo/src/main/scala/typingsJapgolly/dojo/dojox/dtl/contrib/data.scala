package typingsJapgolly.dojo.dojox.dtl.contrib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/data.html
  *
  *
  */
trait data extends js.Object {
  /**
    *
    * @param items
    * @param query
    * @param store
    * @param alias
    */
  def BindDataNode(items: js.Any, query: js.Any, store: js.Any, alias: js.Any): Unit
  /**
    * Turns a list of data store items into DTL compatible items
    *
    * @param parser
    * @param token
    */
  def bind_data(parser: js.Any, token: js.Any): js.Any
  /**
    * Queries a data store and makes the returned items DTL compatible
    *
    * @param parser
    * @param token
    */
  def bind_query(parser: js.Any, token: js.Any): js.Any
}

object data {
  @scala.inline
  def apply(
    BindDataNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    bind_data: (js.Any, js.Any) => CallbackTo[js.Any],
    bind_query: (js.Any, js.Any) => CallbackTo[js.Any]
  ): data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BindDataNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => BindDataNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("bind_data")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => bind_data(t0, t1).runNow()))
    __obj.updateDynamic("bind_query")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => bind_query(t0, t1).runNow()))
    __obj.asInstanceOf[data]
  }
}

