package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function0[Unit]] = js.undefined
  def readFile(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* contents */ Buffer, Unit]
  ): Unit
  def readFileSync(path: String): Buffer
  def readlink(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* linkString */ String, Unit]
  ): Unit
  def readlinkSync(path: String): String
  def stat(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stats */ js.Any, Unit]
  ): Unit
  def statSync(path: String): js.Any
}

object InputFileSystem {
  @scala.inline
  def apply(
    readFile: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* contents */ Buffer, Unit]) => Callback,
    readFileSync: String => CallbackTo[Buffer],
    readlink: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* linkString */ String, Unit]) => Callback,
    readlinkSync: String => CallbackTo[String],
    stat: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stats */ js.Any, Unit]) => Callback,
    statSync: String => CallbackTo[js.Any],
    purge: js.UndefOr[Callback] = js.undefined
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readFile")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ js.UndefOr[js.Error | scala.Null], 
  /* contents */ typingsJapgolly.node.Buffer, 
  scala.Unit]) => readFile(t0, t1).runNow()))
    __obj.updateDynamic("readFileSync")(js.Any.fromFunction1((t0: java.lang.String) => readFileSync(t0).runNow()))
    __obj.updateDynamic("readlink")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ js.UndefOr[js.Error | scala.Null], 
  /* linkString */ java.lang.String, 
  scala.Unit]) => readlink(t0, t1).runNow()))
    __obj.updateDynamic("readlinkSync")(js.Any.fromFunction1((t0: java.lang.String) => readlinkSync(t0).runNow()))
    __obj.updateDynamic("stat")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.UndefOr[js.Error | scala.Null], /* stats */ js.Any, scala.Unit]) => stat(t0, t1).runNow()))
    __obj.updateDynamic("statSync")(js.Any.fromFunction1((t0: java.lang.String) => statSync(t0).runNow()))
    purge.foreach(p => __obj.updateDynamic("purge")(p.toJsFn))
    __obj.asInstanceOf[InputFileSystem]
  }
}

