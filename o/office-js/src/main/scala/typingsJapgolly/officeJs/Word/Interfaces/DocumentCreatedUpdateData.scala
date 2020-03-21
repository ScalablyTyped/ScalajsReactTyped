package typingsJapgolly.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentCreated object, for use in "documentCreated.set({ ... })". */
trait DocumentCreatedUpdateData extends js.Object {
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
}

object DocumentCreatedUpdateData {
  @scala.inline
  def apply(body: BodyUpdateData = null, properties: DocumentPropertiesUpdateData = null): DocumentCreatedUpdateData = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCreatedUpdateData]
  }
}

