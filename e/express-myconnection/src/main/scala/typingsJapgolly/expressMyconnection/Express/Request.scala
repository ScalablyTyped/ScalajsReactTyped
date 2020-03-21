package typingsJapgolly.expressMyconnection.Express

import japgolly.scalajs.react.Callback
import typingsJapgolly.expressMyconnection.mysql.Connection
import typingsJapgolly.expressMyconnection.mysql.MysqlError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var getConnection: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit], 
      Unit
    ]
  ] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    getConnection: /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit] => Callback = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (getConnection != null) __obj.updateDynamic("getConnection")(js.Any.fromFunction1((t0: /* callback */ js.Function2[
  /* err */ typingsJapgolly.expressMyconnection.mysql.MysqlError, 
  /* connection */ typingsJapgolly.expressMyconnection.mysql.Connection, 
  scala.Unit]) => getConnection(t0).runNow()))
    __obj.asInstanceOf[Request]
  }
}

