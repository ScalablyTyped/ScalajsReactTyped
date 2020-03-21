package typingsJapgolly.hapiJoi.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiJoi.hapiJoiBooleans.`false`
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRule extends js.Object {
  /**
    * alternative name for this rule.
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * list of arguments accepted by `method`.
    */
  var args: js.UndefOr[js.Array[RuleArgs | String]] = js.undefined
  /**
    * Dual rule: converts or validates.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  var manifest: js.UndefOr[Boolean] = js.undefined
  /**
    * rule body.
    */
  var method: js.UndefOr[RuleMethod | `false`] = js.undefined
  /**
    * whether rule supports multiple invocations.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  /**
    * undocumented flags.
    */
  var priority: js.UndefOr[Boolean] = js.undefined
  /**
    * validation function.
    */
  var validate: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* helpers */ js.Any, 
      /* args */ Record[String, _], 
      /* options */ js.Any, 
      _
    ]
  ] = js.undefined
}

object ExtensionRule {
  @scala.inline
  def apply(
    alias: String = null,
    args: js.Array[RuleArgs | String] = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    manifest: js.UndefOr[Boolean] = js.undefined,
    method: RuleMethod | `false` = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Boolean] = js.undefined,
    validate: (/* value */ js.Any, /* helpers */ js.Any, /* args */ Record[String, js.Any], /* options */ js.Any) => CallbackTo[js.Any] = null
  ): ExtensionRule = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (!js.isUndefined(manifest)) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction4((t0: /* value */ js.Any, t1: /* helpers */ js.Any, t2: /* args */ typingsJapgolly.std.Record[java.lang.String, js.Any], t3: /* options */ js.Any) => validate(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ExtensionRule]
  }
}

