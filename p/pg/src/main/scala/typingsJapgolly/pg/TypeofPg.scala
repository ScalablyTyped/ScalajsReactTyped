package typingsJapgolly.pg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.pg.mod.Client
import typingsJapgolly.pg.mod.ClientBase
import typingsJapgolly.pg.mod.ClientConfig
import typingsJapgolly.pg.mod.Connection
import typingsJapgolly.pg.mod.ConnectionConfig
import typingsJapgolly.pg.mod.Defaults_
import typingsJapgolly.pg.mod.Events
import typingsJapgolly.pg.mod.Pool
import typingsJapgolly.pg.mod.PoolConfig
import typingsJapgolly.pg.mod.Query
import typingsJapgolly.pg.mod.QueryConfig
import typingsJapgolly.pg.mod.QueryResultRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPg extends js.Object {
  var Client: Instantiable1[js.UndefOr[String | ClientConfig], typingsJapgolly.pg.mod.Client]
  var ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], typingsJapgolly.pg.mod.ClientBase]
  var Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], typingsJapgolly.pg.mod.Connection]
  var Events: Instantiable0[typingsJapgolly.pg.mod.Events]
  var Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], typingsJapgolly.pg.mod.Pool]
  var Query: Instantiable2[
    js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
    ], 
    js.UndefOr[
      /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
    ], 
    typingsJapgolly.pg.mod.Query[QueryResultRow, js.Array[js.Any]]
  ]
  val defaults: Defaults_ with ClientConfig
  val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null
}

object TypeofPg {
  @scala.inline
  def apply(
    Client: Instantiable1[js.UndefOr[String | ClientConfig], Client],
    ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], ClientBase],
    Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], Connection],
    Events: Instantiable0[Events],
    Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], Pool],
    Query: Instantiable2[
      js.UndefOr[
        String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
      ], 
      js.UndefOr[
        /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
      ], 
      Query[QueryResultRow, js.Array[js.Any]]
    ],
    defaults: Defaults_ with ClientConfig,
    native: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any = null
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPg]
  }
}

