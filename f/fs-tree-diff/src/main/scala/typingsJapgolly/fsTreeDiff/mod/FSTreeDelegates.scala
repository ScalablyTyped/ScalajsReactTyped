package typingsJapgolly.fsTreeDiff.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in fs-tree-diff.fs-tree-diff.ChangeType ]:? (inputPath : string, outputPath : string, relativePath : string): void} */
trait FSTreeDelegates extends js.Object {
  var change: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var create: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var mkdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var rmdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var unlink: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
}

object FSTreeDelegates {
  @scala.inline
  def apply(
    change: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Callback = null,
    create: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Callback = null,
    mkdir: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Callback = null,
    rmdir: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Callback = null,
    unlink: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Callback = null
  ): FSTreeDelegates = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction3((t0: /* inputPath */ java.lang.String, t1: /* outputPath */ java.lang.String, t2: /* relativePath */ java.lang.String) => change(t0, t1, t2).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction3((t0: /* inputPath */ java.lang.String, t1: /* outputPath */ java.lang.String, t2: /* relativePath */ java.lang.String) => create(t0, t1, t2).runNow()))
    if (mkdir != null) __obj.updateDynamic("mkdir")(js.Any.fromFunction3((t0: /* inputPath */ java.lang.String, t1: /* outputPath */ java.lang.String, t2: /* relativePath */ java.lang.String) => mkdir(t0, t1, t2).runNow()))
    if (rmdir != null) __obj.updateDynamic("rmdir")(js.Any.fromFunction3((t0: /* inputPath */ java.lang.String, t1: /* outputPath */ java.lang.String, t2: /* relativePath */ java.lang.String) => rmdir(t0, t1, t2).runNow()))
    if (unlink != null) __obj.updateDynamic("unlink")(js.Any.fromFunction3((t0: /* inputPath */ java.lang.String, t1: /* outputPath */ java.lang.String, t2: /* relativePath */ java.lang.String) => unlink(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FSTreeDelegates]
  }
}

