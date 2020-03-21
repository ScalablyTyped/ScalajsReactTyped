package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds the getAnnotations callback to LintStateOptions which may be overridden by the user if they choose use their own
  * linter.
  */
trait LintOptions extends LintStateOptions {
  var getAnnotations: js.UndefOr[Linter | AsyncLinter] = js.undefined
}

object LintOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    getAnnotations: Linter | AsyncLinter = null,
    hasGutters: js.UndefOr[Boolean] = js.undefined,
    onUpdateLinting: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Callback = null
  ): LintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (getAnnotations != null) __obj.updateDynamic("getAnnotations")(getAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(hasGutters)) __obj.updateDynamic("hasGutters")(hasGutters.asInstanceOf[js.Any])
    if (onUpdateLinting != null) __obj.updateDynamic("onUpdateLinting")(js.Any.fromFunction3((t0: /* annotationsNotSorted */ js.Array[typingsJapgolly.codemirror.mod.Annotation], t1: /* annotations */ js.Array[typingsJapgolly.codemirror.mod.Annotation], t2: /* codeMirror */ typingsJapgolly.codemirror.mod.Editor) => onUpdateLinting(t0, t1, t2).runNow()))
    __obj.asInstanceOf[LintOptions]
  }
}

