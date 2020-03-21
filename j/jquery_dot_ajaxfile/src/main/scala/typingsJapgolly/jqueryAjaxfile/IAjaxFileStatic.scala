package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxFileStatic extends js.Object {
  var DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any
  def send[T](option: IOption): IAjaxFilePromise[T]
}

object IAjaxFileStatic {
  @scala.inline
  def apply(
    DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any,
    send: IOption => CallbackTo[IAjaxFilePromise[js.Any]]
  ): IAjaxFileStatic = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryAjaxfile.IOption) => send(t0).runNow()))
    __obj.asInstanceOf[IAjaxFileStatic]
  }
}

