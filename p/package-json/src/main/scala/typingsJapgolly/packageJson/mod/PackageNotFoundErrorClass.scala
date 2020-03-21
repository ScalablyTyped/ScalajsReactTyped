package typingsJapgolly.packageJson.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageNotFoundErrorClass extends Error {
  @JSName("name")
  val name_PackageNotFoundErrorClass: typingsJapgolly.packageJson.packageJsonStrings.PackageNotFoundError
}

object PackageNotFoundErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.packageJson.packageJsonStrings.PackageNotFoundError,
    stack: String = null
  ): PackageNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageNotFoundErrorClass]
  }
}

