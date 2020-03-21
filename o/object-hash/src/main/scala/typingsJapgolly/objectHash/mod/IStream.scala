package typingsJapgolly.objectHash.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStream extends js.Object {
  var update: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object IStream {
  @scala.inline
  def apply(
    update: (/* chunk */ js.Any, /* encoding */ String, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Callback = null,
    write: (/* chunk */ js.Any, /* encoding */ String, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Callback = null
  ): IStream = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* chunk */ js.Any, t1: /* encoding */ java.lang.String, t2: /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => update(t0, t1, t2).runNow()))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3((t0: /* chunk */ js.Any, t1: /* encoding */ java.lang.String, t2: /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => write(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IStream]
  }
}

