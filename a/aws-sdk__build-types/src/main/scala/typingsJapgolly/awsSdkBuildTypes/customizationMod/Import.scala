package typingsJapgolly.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  /**
    * The name of the package to import (as would be used with `npm install`).
    */
  @JSName("package")
  var _package: String
  /**
    * The version constraint to require. This value should use standard semver
    * notation with the caveat that "or" operators (`||`) are not permitted.
    */
  var version: String
}

object Import {
  @scala.inline
  def apply(_package: String, version: String): Import = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
}

