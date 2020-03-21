package typingsJapgolly.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends js.Object {
  /**
    * if true, does not delete the old key name, keeping both the new and old keys in place. Defaults to false.
    */
  var alias: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, skip renaming of a key if it's undefined. Defaults to false.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, allows renaming multiple keys to the same destination where the last rename wins. Defaults to false.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, allows renaming a key over an existing key. Defaults to false.
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object RenameOptions {
  @scala.inline
  def apply(
    alias: js.UndefOr[Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    `override`: js.UndefOr[Boolean] = js.undefined
  ): RenameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
}

