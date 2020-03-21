package typingsJapgolly.lzmaNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var fileSize: Double
  var memlimit: js.UndefOr[Double] = js.undefined
  def read(count: Double, offset: Double, cb: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Unit
}

object FileOptions {
  @scala.inline
  def apply(
    fileSize: Double,
    read: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Callback,
    memlimit: Int | Double = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any])
    __obj.updateDynamic("read")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function2[/* err */ js.Any, /* buffer */ typingsJapgolly.node.Buffer, scala.Unit]) => read(t0, t1, t2).runNow()))
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

