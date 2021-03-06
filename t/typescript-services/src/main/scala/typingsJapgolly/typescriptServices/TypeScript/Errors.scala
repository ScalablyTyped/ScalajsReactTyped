package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Errors")
@js.native
class Errors () extends js.Object

/* static members */
@JSGlobal("TypeScript.Errors")
@js.native
object Errors extends js.Object {
  def `abstract`(): js.Error = js.native
  def argument(argument: String): js.Error = js.native
  def argument(argument: String, message: String): js.Error = js.native
  def argumentNull(argument: String): js.Error = js.native
  def argumentOutOfRange(argument: String): js.Error = js.native
  def invalidOperation(): js.Error = js.native
  def invalidOperation(message: String): js.Error = js.native
  def notYetImplemented(): js.Error = js.native
}

