package typingsJapgolly.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a script project.
  */
@js.native
trait SchemaCreateProjectRequest extends js.Object {
  /**
    * The Drive ID of a parent file that the created script project is bound
    * to. This is usually the ID of a Google Doc, Google Sheet, Google Form, or
    * Google Slides file. If not set, a standalone script project is created.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCreateProjectRequest {
  @scala.inline
  def apply(parentId: String = null, title: String = null): SchemaCreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateProjectRequest]
  }
}

