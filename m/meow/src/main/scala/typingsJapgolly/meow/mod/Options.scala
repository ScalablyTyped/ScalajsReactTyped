package typingsJapgolly.meow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var argv: js.UndefOr[js.Array[String]] = js.undefined
  var autoHelp: js.UndefOr[Boolean] = js.undefined
  var autoVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * Caution: Explicitly specifying undefined for booleanDefault
    * has different meaning from omitting key itself.
    */
  var booleanDefault: js.UndefOr[Boolean | Null] = js.undefined
  var description: js.UndefOr[String | Boolean] = js.undefined
  var flags: js.UndefOr[typingsJapgolly.minimistOptions.mod.Options] = js.undefined
  var help: js.UndefOr[String | Boolean] = js.undefined
  var inferType: js.UndefOr[Boolean] = js.undefined
  var pkg: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[String | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    argv: js.Array[String] = null,
    autoHelp: js.UndefOr[Boolean] = js.undefined,
    autoVersion: js.UndefOr[Boolean] = js.undefined,
    booleanDefault: js.UndefOr[Boolean] = js.undefined,
    description: String | Boolean = null,
    flags: typingsJapgolly.minimistOptions.mod.Options = null,
    help: String | Boolean = null,
    inferType: js.UndefOr[Boolean] = js.undefined,
    pkg: js.Any = null,
    version: String | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHelp)) __obj.updateDynamic("autoHelp")(autoHelp.asInstanceOf[js.Any])
    if (!js.isUndefined(autoVersion)) __obj.updateDynamic("autoVersion")(autoVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanDefault)) __obj.updateDynamic("booleanDefault")(booleanDefault.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(inferType)) __obj.updateDynamic("inferType")(inferType.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

