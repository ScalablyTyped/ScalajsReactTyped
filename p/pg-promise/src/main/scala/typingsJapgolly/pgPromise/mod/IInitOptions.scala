package typingsJapgolly.pgPromise.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
trait IInitOptions[Ext, C /* <: IClient */] extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ js.Any, /* useCount */ Double, Unit]] = js.undefined
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ js.Any, Unit]] = js.undefined
  var error: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ IEventContext[C], Unit]] = js.undefined
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any, Unit]] = js.undefined
  var noLocking: js.UndefOr[Boolean] = js.undefined
  var noWarnings: js.UndefOr[Boolean] = js.undefined
  var pgFormatting: js.UndefOr[Boolean] = js.undefined
  var pgNative: js.UndefOr[Boolean] = js.undefined
  var promiseLib: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  var receive: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C], Unit]
  ] = js.undefined
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])] = js.undefined
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
}

object IInitOptions {
  @scala.inline
  def apply[Ext, C /* <: IClient */](
    capSQL: js.UndefOr[Boolean] = js.undefined,
    connect: (/* client */ C, /* dc */ js.Any, /* useCount */ Double) => Callback = null,
    disconnect: (/* client */ C, /* dc */ js.Any) => Callback = null,
    error: (/* err */ js.Any, /* e */ IEventContext[C]) => Callback = null,
    extend: (/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any) => Callback = null,
    noLocking: js.UndefOr[Boolean] = js.undefined,
    noWarnings: js.UndefOr[Boolean] = js.undefined,
    pgFormatting: js.UndefOr[Boolean] = js.undefined,
    pgNative: js.UndefOr[Boolean] = js.undefined,
    promiseLib: js.Any = null,
    query: /* e */ IEventContext[C] => Callback = null,
    receive: (/* data */ js.Array[js.Any], /* result */ IResultExt, /* e */ IEventContext[C]) => Callback = null,
    schema: ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema]) = null,
    task: /* e */ IEventContext[C] => Callback = null,
    transact: /* e */ IEventContext[C] => Callback = null
  ): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction3((t0: /* client */ C, t1: /* dc */ js.Any, t2: /* useCount */ scala.Double) => connect(t0, t1, t2).runNow()))
    if (disconnect != null) __obj.updateDynamic("disconnect")(js.Any.fromFunction2((t0: /* client */ C, t1: /* dc */ js.Any) => disconnect(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* err */ js.Any, t1: /* e */ typingsJapgolly.pgPromise.mod.IEventContext[C]) => error(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(js.Any.fromFunction2((t0: /* obj */ (typingsJapgolly.pgPromise.mod.IDatabase[Ext, C]) with Ext, t1: /* dc */ js.Any) => extend(t0, t1).runNow()))
    if (!js.isUndefined(noLocking)) __obj.updateDynamic("noLocking")(noLocking.asInstanceOf[js.Any])
    if (!js.isUndefined(noWarnings)) __obj.updateDynamic("noWarnings")(noWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(pgFormatting)) __obj.updateDynamic("pgFormatting")(pgFormatting.asInstanceOf[js.Any])
    if (!js.isUndefined(pgNative)) __obj.updateDynamic("pgNative")(pgNative.asInstanceOf[js.Any])
    if (promiseLib != null) __obj.updateDynamic("promiseLib")(promiseLib.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.pgPromise.mod.IEventContext[C]) => query(t0).runNow()))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* result */ typingsJapgolly.pgPromise.mod.IResultExt, t2: /* e */ typingsJapgolly.pgPromise.mod.IEventContext[C]) => receive(t0, t1, t2).runNow()))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.pgPromise.mod.IEventContext[C]) => task(t0).runNow()))
    if (transact != null) __obj.updateDynamic("transact")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.pgPromise.mod.IEventContext[C]) => transact(t0).runNow()))
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
}

