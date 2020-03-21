package typingsJapgolly.yargs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireDirectoryOptions extends js.Object {
  /** Blacklist certain modules. */
  var exclude: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
  /** The types of files to look for when requiring command modules. */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Whitelist certain modules */
  var include: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.undefined
  /** Look for command modules in all subdirectories and apply them as a flattened (non-hierarchical) list. */
  var recurse: js.UndefOr[Boolean] = js.undefined
  /**
    * A synchronous function called for each command module encountered.
    * Accepts `commandObject`, `pathToFile`, and `filename` as arguments.
    * Returns `commandObject` to include the command; any falsy value to exclude/skip it.
    */
  var visit: js.UndefOr[
    js.Function3[
      /* commandObject */ js.Any, 
      /* pathToFile */ js.UndefOr[String], 
      /* filename */ js.UndefOr[String], 
      _
    ]
  ] = js.undefined
}

object RequireDirectoryOptions {
  @scala.inline
  def apply(
    exclude: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean]) = null,
    extensions: js.Array[String] = null,
    include: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean]) = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    visit: (/* commandObject */ js.Any, /* pathToFile */ js.UndefOr[String], /* filename */ js.UndefOr[String]) => CallbackTo[js.Any] = null
  ): RequireDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction3((t0: /* commandObject */ js.Any, t1: /* pathToFile */ js.UndefOr[java.lang.String], t2: /* filename */ js.UndefOr[java.lang.String]) => visit(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RequireDirectoryOptions]
  }
}

