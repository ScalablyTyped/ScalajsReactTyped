package typingsJapgolly.umzug.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.umzug.AnonDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationOptions extends js.Object {
  /**
    * A function that maps a file path to a migration object in the form
    * { up: Function, down: Function }. The default for this is to require(...)
    * the file as javascript, but you can use this to transpile TypeScript,
    * read raw sql etc.
    * See https://github.com/sequelize/umzug/tree/master/test/fixtures
    * for examples.
    */
  var customResolver: js.UndefOr[js.Function1[/* path */ String, AnonDown]] = js.undefined
  /*
    * The params that gets passed to the migrations.
    * Might be an array or a synchronous function which returns an array.
    */
  var params: js.UndefOr[js.Array[_]] = js.undefined
  /** The path to the migrations directory. */
  var path: js.UndefOr[String] = js.undefined
  /** The pattern that determines whether or not a file is a migration. */
  var pattern: js.UndefOr[js.RegExp] = js.undefined
  /**
    * A function that receives and returns the to be executed function.
    * This can be used to modify the function.
    */
  var wrap: js.UndefOr[js.Function1[/* fn */ js.Any, _]] = js.undefined
}

object MigrationOptions {
  @scala.inline
  def apply(
    customResolver: /* path */ String => CallbackTo[AnonDown] = null,
    params: js.Array[_] = null,
    path: String = null,
    pattern: js.RegExp = null,
    wrap: /* fn */ js.Any => CallbackTo[js.Any] = null
  ): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    if (customResolver != null) __obj.updateDynamic("customResolver")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => customResolver(t0).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction1((t0: /* fn */ js.Any) => wrap(t0).runNow()))
    __obj.asInstanceOf[MigrationOptions]
  }
}

