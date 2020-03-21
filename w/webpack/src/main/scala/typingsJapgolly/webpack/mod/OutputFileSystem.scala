package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFileSystem extends js.Object {
  def join(paths: String*): String
  def mkdir(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  def mkdirp(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  def writeFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
}

object OutputFileSystem {
  @scala.inline
  def apply(
    join: /* repeated */ String => CallbackTo[String],
    mkdir: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    mkdirp: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    rmdir: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    unlink: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    writeFile: (String, js.Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback
  ): OutputFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => join(t0).runNow()))
    __obj.updateDynamic("mkdir")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => mkdir(t0, t1).runNow()))
    __obj.updateDynamic("mkdirp")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => mkdirp(t0, t1).runNow()))
    __obj.updateDynamic("rmdir")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => rmdir(t0, t1).runNow()))
    __obj.updateDynamic("unlink")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => unlink(t0, t1).runNow()))
    __obj.updateDynamic("writeFile")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => writeFile(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OutputFileSystem]
  }
}

