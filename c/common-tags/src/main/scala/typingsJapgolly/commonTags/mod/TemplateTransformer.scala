package typingsJapgolly.commonTags.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateTransformer[TCtx] extends js.Object {
  /**
    * Called before everything else.
    * The result of this hook will be passed to other hooks as `context`.
    * If omitted, `context` will be an empty object.
    */
  var getInitialContext: js.UndefOr[js.Function0[TCtx]] = js.undefined
  /**
    * Called when all substitutions have been parsed
    * `endResult` is the final value.
    */
  var onEndResult: js.UndefOr[js.Function2[/* endResult */ String, /* context */ TCtx, String]] = js.undefined
  /**
    * Called when the tag encounters a string.
    * (a string is whatever's not inside "${}" in your template literal)
    * `str` is the value of the current string
    */
  var onString: js.UndefOr[js.Function2[/* str */ String, /* context */ TCtx, String]] = js.undefined
  /**
    * Called when the tag encounters a substitution.
    * (a substitution is whatever's inside "${}" in your template literal)
    * `substitution` is the value of the current substitution
    * `resultSoFar` is the end result up to the point of this substitution
    */
  var onSubstitution: js.UndefOr[
    js.Function3[/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx, String]
  ] = js.undefined
}

object TemplateTransformer {
  @scala.inline
  def apply[TCtx](
    getInitialContext: js.UndefOr[CallbackTo[TCtx]] = js.undefined,
    onEndResult: (/* endResult */ String, /* context */ TCtx) => CallbackTo[String] = null,
    onString: (/* str */ String, /* context */ TCtx) => CallbackTo[String] = null,
    onSubstitution: (/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx) => CallbackTo[String] = null
  ): TemplateTransformer[TCtx] = {
    val __obj = js.Dynamic.literal()
    getInitialContext.foreach(p => __obj.updateDynamic("getInitialContext")(p.toJsFn))
    if (onEndResult != null) __obj.updateDynamic("onEndResult")(js.Any.fromFunction2((t0: /* endResult */ java.lang.String, t1: /* context */ TCtx) => onEndResult(t0, t1).runNow()))
    if (onString != null) __obj.updateDynamic("onString")(js.Any.fromFunction2((t0: /* str */ java.lang.String, t1: /* context */ TCtx) => onString(t0, t1).runNow()))
    if (onSubstitution != null) __obj.updateDynamic("onSubstitution")(js.Any.fromFunction3((t0: /* substitution */ java.lang.String, t1: /* resultSoFar */ java.lang.String, t2: /* context */ TCtx) => onSubstitution(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TemplateTransformer[TCtx]]
  }
}

