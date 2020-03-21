package typingsJapgolly.diff.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.diff.diffStrings.Space
import typingsJapgolly.diff.diffStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchesOptions extends ApplyPatchOptions {
  def complete(err: js.Any): Unit
  def loadFile(index: ParsedDiff, callback: js.Function2[/* err */ js.Any, /* data */ String, Unit]): Unit
  def patched(index: ParsedDiff, content: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
}

object ApplyPatchesOptions {
  @scala.inline
  def apply(
    complete: js.Any => japgolly.scalajs.react.Callback,
    loadFile: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => japgolly.scalajs.react.Callback,
    patched: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => japgolly.scalajs.react.Callback,
    compareLine: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => CallbackTo[Boolean] = null,
    fuzzFactor: Int | Double = null
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    __obj.updateDynamic("loadFile")(js.Any.fromFunction2((t0: typingsJapgolly.diff.mod.ParsedDiff, t1: js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit]) => loadFile(t0, t1).runNow()))
    __obj.updateDynamic("patched")(js.Any.fromFunction3((t0: typingsJapgolly.diff.mod.ParsedDiff, t1: java.lang.String, t2: js.Function1[/* err */ js.Any, scala.Unit]) => patched(t0, t1, t2).runNow()))
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4((t0: /* lineNumber */ scala.Double, t1: /* line */ java.lang.String, t2: /* operation */ typingsJapgolly.diff.diffStrings.`-_` | typingsJapgolly.diff.diffStrings.Space, t3: /* patchContent */ java.lang.String) => compareLine(t0, t1, t2, t3).runNow()))
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
}

