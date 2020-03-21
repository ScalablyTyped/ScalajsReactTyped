package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted subject from the sentence. */
trait SemanticRolesResultSubject extends js.Object {
  /** An array of extracted entities. */
  var entities: js.UndefOr[js.Array[SemanticRolesEntity]] = js.undefined
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.undefined
  /** Text that corresponds to the subject role. */
  var text: js.UndefOr[String] = js.undefined
}

object SemanticRolesResultSubject {
  @scala.inline
  def apply(
    entities: js.Array[SemanticRolesEntity] = null,
    keywords: js.Array[SemanticRolesKeyword] = null,
    text: String = null
  ): SemanticRolesResultSubject = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesResultSubject]
  }
}

