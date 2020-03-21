package typingsJapgolly.insertModuleGlobals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When opts.always is true, wrap every file with all the global variables without parsing.
    * This is handy because parsing the scope can take a long time, so you can prioritize fast builds over saving bytes in the final output.
    * When opts.always is truthy but not true, avoid parsing but perform a quick test to determine if wrapping should be skipped.
    */
  var always: js.UndefOr[Boolean] = js.undefined
  var basedir: js.UndefOr[String] = js.undefined
  /**
    * If opts.debug is true, an inline source map will be generated to compensate for the extra lines.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Use opts.vars to override the default inserted variables, or set opts.vars[name] to undefined to not insert a variable which would otherwise be inserted.
    *
    * opts.vars properties with a . in their name will be executed instead of the parent object if ONLY that property is used.
    * For example, "Buffer.isBuffer" will mask "Buffer" only when there is a Buffer.isBuffer() call in a file and no other references to Buffer.
    */
  var vars: js.UndefOr[VarsOption] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    always: js.UndefOr[Boolean] = js.undefined,
    basedir: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    vars: VarsOption = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always)) __obj.updateDynamic("always")(always.asInstanceOf[js.Any])
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

