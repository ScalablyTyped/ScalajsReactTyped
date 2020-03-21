package typingsJapgolly.diff.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.diff.diffStrings.Space
import typingsJapgolly.diff.diffStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchOptions extends js.Object {
  /**
    * Callback used to compare to given lines to determine if they should be considered equal when patching.
    * Should return `false` if the lines should be rejected.
    *
    * @default strict equality
    */
  var compareLine: js.UndefOr[
    js.Function4[
      /* lineNumber */ Double, 
      /* line */ String, 
      /* operation */ `-_` | Space, 
      /* patchContent */ String, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.undefined
}

object ApplyPatchOptions {
  @scala.inline
  def apply(
    compareLine: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => CallbackTo[Boolean] = null,
    fuzzFactor: Int | Double = null
  ): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4((t0: /* lineNumber */ scala.Double, t1: /* line */ java.lang.String, t2: /* operation */ typingsJapgolly.diff.diffStrings.`-_` | typingsJapgolly.diff.diffStrings.Space, t3: /* patchContent */ java.lang.String) => compareLine(t0, t1, t2, t3).runNow()))
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchOptions]
  }
}

