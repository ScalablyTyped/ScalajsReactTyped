package typingsJapgolly.walk.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptionsListeners extends js.Object {
  var directories: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var directory: js.UndefOr[WalkStatEventCallback] = js.undefined
  var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var end: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var errors: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var file: js.UndefOr[WalkStatEventCallback] = js.undefined
  var files: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var names: js.UndefOr[WalkNamesEventCallback] = js.undefined
  var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
}

object WalkOptionsListeners {
  @scala.inline
  def apply(
    directories: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null,
    directory: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Callback = null,
    directoryError: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null,
    end: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null,
    errors: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null,
    file: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Callback = null,
    files: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null,
    names: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Callback = null,
    nodeError: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback = null
  ): WalkOptionsListeners = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => directories(t0, t1, t2).runNow()))
    if (directory != null) __obj.updateDynamic("directory")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ typingsJapgolly.walk.mod.WalkStats, t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => directory(t0, t1, t2).runNow()))
    if (directoryError != null) __obj.updateDynamic("directoryError")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => directoryError(t0, t1, t2).runNow()))
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => end(t0, t1, t2).runNow()))
    if (errors != null) __obj.updateDynamic("errors")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => errors(t0, t1, t2).runNow()))
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ typingsJapgolly.walk.mod.WalkStats, t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => file(t0, t1, t2).runNow()))
    if (files != null) __obj.updateDynamic("files")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => files(t0, t1, t2).runNow()))
    if (names != null) __obj.updateDynamic("names")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[java.lang.String], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => names(t0, t1, t2).runNow()))
    if (nodeError != null) __obj.updateDynamic("nodeError")(js.Any.fromFunction3((t0: /* base */ java.lang.String, t1: /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], t2: /* next */ typingsJapgolly.walk.mod.WalkNext) => nodeError(t0, t1, t2).runNow()))
    __obj.asInstanceOf[WalkOptionsListeners]
  }
}

