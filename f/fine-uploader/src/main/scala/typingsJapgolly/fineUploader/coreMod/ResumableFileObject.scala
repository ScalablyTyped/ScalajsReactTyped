package typingsJapgolly.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumableFileObject extends js.Object {
  /**
    * an object containing any custom resume data for the file
    */
  var customResumeData: js.UndefOr[js.Any] = js.undefined
  /**
    * filename
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * number of bytes to be uploaded
    */
  var remaining: js.UndefOr[Double] = js.undefined
  /**
    * total file size in bytes
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * the unique id
    */
  var uuid: js.UndefOr[Double] = js.undefined
}

object ResumableFileObject {
  @scala.inline
  def apply(
    customResumeData: js.Any = null,
    name: String = null,
    remaining: Int | Double = null,
    size: Int | Double = null,
    uuid: Int | Double = null
  ): ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    if (customResumeData != null) __obj.updateDynamic("customResumeData")(customResumeData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumableFileObject]
  }
}

