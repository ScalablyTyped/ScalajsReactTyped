package typingsJapgolly.validator

import typingsJapgolly.validator.validatorNumbers.`3`
import typingsJapgolly.validator.validatorNumbers.`4`
import typingsJapgolly.validator.validatorNumbers.`5`
import typingsJapgolly.validator.validatorStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isUUID", JSImport.Namespace)
@js.native
object isUUIDMod extends js.Object {
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def default(str: String): Boolean = js.native
  @JSName("default")
  def default_3(str: String, version: `3`): Boolean = js.native
  @JSName("default")
  def default_3(str: String, version: typingsJapgolly.validator.validatorStrings.`3`): Boolean = js.native
  @JSName("default")
  def default_4(str: String, version: `4`): Boolean = js.native
  @JSName("default")
  def default_4(str: String, version: typingsJapgolly.validator.validatorStrings.`4`): Boolean = js.native
  @JSName("default")
  def default_5(str: String, version: `5`): Boolean = js.native
  @JSName("default")
  def default_5(str: String, version: typingsJapgolly.validator.validatorStrings.`5`): Boolean = js.native
  @JSName("default")
  def default_all(str: String, version: all): Boolean = js.native
}

