package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaCropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaCropHint]] = js.native
}

object SchemaCropHintsAnnotation {
  @scala.inline
  def apply(cropHints: js.Array[SchemaCropHint] = null): SchemaCropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (cropHints != null) __obj.updateDynamic("cropHints")(cropHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCropHintsAnnotation]
  }
}

