package typingsJapgolly.ionicCliFramework

import typingsJapgolly.ionicCliFramework.definitionsMod.Validator
import typingsJapgolly.ionicCliFramework.definitionsMod.Validators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  val validators: Validators = js.native
  def combine(validators: Validator*): Validator = js.native
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: AnonCaseSensitive): Validator = js.native
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
}

