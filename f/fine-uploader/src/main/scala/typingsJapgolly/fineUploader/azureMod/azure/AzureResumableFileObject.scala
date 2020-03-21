package typingsJapgolly.fineUploader.azureMod.azure

import typingsJapgolly.fineUploader.coreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureResumableFileObject extends ResumableFileObject {
  /**
    * The associated file's blob name in Azure Blob Storage
    */
  var key: js.UndefOr[String] = js.undefined
}

object AzureResumableFileObject {
  @scala.inline
  def apply(
    customResumeData: js.Any = null,
    key: String = null,
    name: String = null,
    remaining: Int | Double = null,
    size: Int | Double = null,
    uuid: Int | Double = null
  ): AzureResumableFileObject = {
    val __obj = js.Dynamic.literal()
    if (customResumeData != null) __obj.updateDynamic("customResumeData")(customResumeData.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureResumableFileObject]
  }
}

