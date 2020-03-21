package typingsJapgolly.rcFieldForm

import typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath
import typingsJapgolly.rcFieldForm.interfaceMod.NotifyInfo
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelatedFields extends NotifyInfo {
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath]
  var `type`: dependenciesUpdate
}

object AnonRelatedFields {
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): AnonRelatedFields = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelatedFields]
  }
}

