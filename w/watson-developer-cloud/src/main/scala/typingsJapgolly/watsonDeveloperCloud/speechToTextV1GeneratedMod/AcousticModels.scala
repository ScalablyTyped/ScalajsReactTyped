package typingsJapgolly.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AcousticModels. */
trait AcousticModels extends js.Object {
  /** An array of `AcousticModel` objects that provides information about each available custom acoustic model. The array is empty if the requesting credentials own no custom acoustic models (if no language is specified) or own no custom acoustic models for the specified language. */
  var customizations: js.Array[AcousticModel]
}

object AcousticModels {
  @scala.inline
  def apply(customizations: js.Array[AcousticModel]): AcousticModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AcousticModels]
  }
}

