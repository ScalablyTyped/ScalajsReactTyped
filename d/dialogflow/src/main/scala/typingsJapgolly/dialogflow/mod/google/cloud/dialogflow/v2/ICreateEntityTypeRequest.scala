package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateEntityTypeRequest. */
trait ICreateEntityTypeRequest extends js.Object {
  /** CreateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.undefined
  /** CreateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** CreateEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateEntityTypeRequest {
  @scala.inline
  def apply(entityType: IEntityType = null, languageCode: String = null, parent: String = null): ICreateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateEntityTypeRequest]
  }
}

