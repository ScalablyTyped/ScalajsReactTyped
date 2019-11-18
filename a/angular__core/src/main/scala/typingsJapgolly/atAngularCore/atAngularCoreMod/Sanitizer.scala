package typingsJapgolly.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "Sanitizer")
@js.native
abstract class Sanitizer () extends js.Object {
  def sanitize(context: SecurityContext): String | Null = js.native
  def sanitize(context: SecurityContext, value: String): String | Null = js.native
  def sanitize(context: SecurityContext, value: js.Object): String | Null = js.native
}

