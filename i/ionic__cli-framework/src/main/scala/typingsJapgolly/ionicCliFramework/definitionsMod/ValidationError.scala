package typingsJapgolly.ionicCliFramework.definitionsMod

import typingsJapgolly.ionicCliFramework.ionicCliFrameworkBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var key: String = js.native
  var message: String = js.native
  @JSName("validator")
  var validator_Original: Validator = js.native
  def validator(): `true` | String = js.native
  def validator(input: String): `true` | String = js.native
  def validator(input: String, key: String): `true` | String = js.native
}

