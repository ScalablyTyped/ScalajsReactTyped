package typingsJapgolly.jestValidate

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class ValidationError protected () extends Error {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  val DEPRECATION: String = js.native
  val ERROR: String = js.native
  val WARNING: String = js.native
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = js.native
  def format(value: js.Any): String = js.native
  def formatPrettyObject(value: js.Any): String = js.native
  def logValidationWarning(name: String, message: String): Unit = js.native
  def logValidationWarning(name: String, message: String, comment: String): Unit = js.native
}

