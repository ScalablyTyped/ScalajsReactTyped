package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An entity that corresponds with an argument in a relation. */
trait RelationEntity extends js.Object {
  /** Text that corresponds to the entity. */
  var text: js.UndefOr[String] = js.undefined
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object RelationEntity {
  @scala.inline
  def apply(text: String = null, `type`: String = null): RelationEntity = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationEntity]
  }
}

