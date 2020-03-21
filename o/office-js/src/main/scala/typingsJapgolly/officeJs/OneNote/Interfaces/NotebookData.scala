package typingsJapgolly.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "notebook.toJSON()". */
trait NotebookData extends js.Object {
  /**
    *
    * The url of the site that this notebook is located. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    *
    * The client url of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the ID of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isVirtual: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * The section groups in the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
  /**
    *
    * The the sections of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}

object NotebookData {
  @scala.inline
  def apply(
    baseUrl: String = null,
    clientUrl: String = null,
    id: String = null,
    isVirtual: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    sectionGroups: js.Array[SectionGroupData] = null,
    sections: js.Array[SectionData] = null
  ): NotebookData = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isVirtual)) __obj.updateDynamic("isVirtual")(isVirtual.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookData]
  }
}

