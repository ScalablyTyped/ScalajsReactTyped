package typingsJapgolly.findPackageJson.mod

import typingsJapgolly.findPackageJson.findPackageJsonBooleans.`false`
import typingsJapgolly.findPackageJson.findPackageJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.findPackageJson.mod.FoundPackage
  - typingsJapgolly.findPackageJson.mod.Done
*/
trait FindResult extends js.Object

object FindResult {
  @scala.inline
  def FoundPackage(done: `false`, filename: String, value: Package): FindResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FindResult]
  }
  @scala.inline
  def Done(
    done: `true`,
    filename: js.UndefOr[scala.Nothing] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): FindResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult]
  }
}

