package typingsJapgolly.evernote

import typingsJapgolly.evernote.mod.Types.BusinessNotebook
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.NotebookRecipientSettings
import typingsJapgolly.evernote.mod.Types.NotebookRestrictions
import typingsJapgolly.evernote.mod.Types.Publishing
import typingsJapgolly.evernote.mod.Types.SharedNotebook
import typingsJapgolly.evernote.mod.Types.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBusinessNotebook extends js.Object {
  var businessNotebook: js.UndefOr[BusinessNotebook] = js.undefined
  var contact: js.UndefOr[User] = js.undefined
  var defaultNotebook: js.UndefOr[Boolean] = js.undefined
  var guid: js.UndefOr[Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var published: js.UndefOr[Boolean] = js.undefined
  var publishing: js.UndefOr[Publishing] = js.undefined
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.undefined
  var restrictions: js.UndefOr[NotebookRestrictions] = js.undefined
  var serviceCreated: js.UndefOr[Double] = js.undefined
  var serviceUpdated: js.UndefOr[Double] = js.undefined
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.undefined
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object AnonBusinessNotebook {
  @scala.inline
  def apply(
    businessNotebook: BusinessNotebook = null,
    contact: User = null,
    defaultNotebook: js.UndefOr[Boolean] = js.undefined,
    guid: Guid = null,
    name: String = null,
    published: js.UndefOr[Boolean] = js.undefined,
    publishing: Publishing = null,
    recipientSettings: NotebookRecipientSettings = null,
    restrictions: NotebookRestrictions = null,
    serviceCreated: Int | Double = null,
    serviceUpdated: Int | Double = null,
    sharedNotebookIds: js.Array[Double] = null,
    sharedNotebooks: js.Array[SharedNotebook] = null,
    stack: String = null,
    updateSequenceNum: Int | Double = null
  ): AnonBusinessNotebook = {
    val __obj = js.Dynamic.literal()
    if (businessNotebook != null) __obj.updateDynamic("businessNotebook")(businessNotebook.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNotebook)) __obj.updateDynamic("defaultNotebook")(defaultNotebook.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (publishing != null) __obj.updateDynamic("publishing")(publishing.asInstanceOf[js.Any])
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (sharedNotebookIds != null) __obj.updateDynamic("sharedNotebookIds")(sharedNotebookIds.asInstanceOf[js.Any])
    if (sharedNotebooks != null) __obj.updateDynamic("sharedNotebooks")(sharedNotebooks.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBusinessNotebook]
  }
}

