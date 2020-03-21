package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The updated labeling from the input document, accounting for the submitted feedback. */
trait UpdatedLabelsIn extends js.Object {
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.Array[Category]
  /** Description of the action specified by the element and whom it affects. */
  var types: js.Array[TypeLabel]
}

object UpdatedLabelsIn {
  @scala.inline
  def apply(categories: js.Array[Category], types: js.Array[TypeLabel]): UpdatedLabelsIn = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatedLabelsIn]
  }
}

