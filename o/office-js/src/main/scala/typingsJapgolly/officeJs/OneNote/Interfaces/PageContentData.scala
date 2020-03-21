package typingsJapgolly.officeJs.OneNote.Interfaces

import typingsJapgolly.officeJs.OneNote.PageContentType
import typingsJapgolly.officeJs.officeJsStrings.Image
import typingsJapgolly.officeJs.officeJsStrings.Ink
import typingsJapgolly.officeJs.officeJsStrings.Other
import typingsJapgolly.officeJs.officeJsStrings.Outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageContent.toJSON()". */
trait PageContentData extends js.Object {
  /**
    *
    * Gets the ID of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.undefined
  /**
    *
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkData] = js.undefined
  /**
    *
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineData] = js.undefined
  /**
    *
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the type of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[PageContentType | Outline | Image | Ink | Other] = js.undefined
}

object PageContentData {
  @scala.inline
  def apply(
    id: String = null,
    image: ImageData = null,
    ink: FloatingInkData = null,
    left: Int | Double = null,
    outline: OutlineData = null,
    top: Int | Double = null,
    `type`: PageContentType | Outline | Image | Ink | Other = null
  ): PageContentData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (ink != null) __obj.updateDynamic("ink")(ink.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageContentData]
  }
}

