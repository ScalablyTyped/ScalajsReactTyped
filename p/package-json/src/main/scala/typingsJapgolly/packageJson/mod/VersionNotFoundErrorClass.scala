package typingsJapgolly.packageJson.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionNotFoundErrorClass extends Error {
  @JSName("name")
  val name_VersionNotFoundErrorClass: typingsJapgolly.packageJson.packageJsonStrings.VersionNotFoundError
}

object VersionNotFoundErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.packageJson.packageJsonStrings.VersionNotFoundError,
    stack: String = null
  ): VersionNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionNotFoundErrorClass]
  }
}

