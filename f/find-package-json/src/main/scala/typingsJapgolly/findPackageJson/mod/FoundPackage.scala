package typingsJapgolly.findPackageJson.mod

import typingsJapgolly.findPackageJson.findPackageJsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundPackage extends FindResult {
  var done: `false`
  var filename: String
  var value: Package
}

object FoundPackage {
  @scala.inline
  def apply(done: `false`, filename: String, value: Package): FoundPackage = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FoundPackage]
  }
}

