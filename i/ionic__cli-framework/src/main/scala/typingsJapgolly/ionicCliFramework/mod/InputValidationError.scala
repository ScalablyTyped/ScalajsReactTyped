package typingsJapgolly.ionicCliFramework.mod

import typingsJapgolly.ionicCliFramework.definitionsMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "InputValidationError")
@js.native
class InputValidationError protected ()
  extends typingsJapgolly.ionicCliFramework.errorsMod.InputValidationError {
  def this(message: String, errors: js.Array[ValidationError]) = this()
}

