package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A page in a presentation.
  */
@js.native
trait SchemaPage extends js.Object {
  /**
    * Layout specific properties. Only set if page_type = LAYOUT.
    */
  var layoutProperties: js.UndefOr[SchemaLayoutProperties] = js.native
  /**
    * Master specific properties. Only set if page_type = MASTER.
    */
  var masterProperties: js.UndefOr[SchemaMasterProperties] = js.native
  /**
    * Notes specific properties. Only set if page_type = NOTES.
    */
  var notesProperties: js.UndefOr[SchemaNotesProperties] = js.native
  /**
    * The object ID for this page. Object IDs used by Page and PageElement
    * share the same namespace.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The page elements rendered on the page.
    */
  var pageElements: js.UndefOr[js.Array[SchemaPageElement]] = js.native
  /**
    * The properties of the page.
    */
  var pageProperties: js.UndefOr[SchemaPageProperties] = js.native
  /**
    * The type of the page.
    */
  var pageType: js.UndefOr[String] = js.native
  /**
    * The revision ID of the presentation containing this page. Can be used in
    * update requests to assert that the presentation revision hasn&#39;t
    * changed since the last read operation. Only populated if the user has
    * edit access to the presentation.  The format of the revision ID may
    * change over time, so it should be treated opaquely. A returned revision
    * ID is only guaranteed to be valid for 24 hours after it has been returned
    * and cannot be shared across users. If the revision ID is unchanged
    * between calls, then the presentation has not changed. Conversely, a
    * changed ID (for the same presentation and user) usually means the
    * presentation has been updated; however, a changed ID can also be due to
    * internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Slide specific properties. Only set if page_type = SLIDE.
    */
  var slideProperties: js.UndefOr[SchemaSlideProperties] = js.native
}

object SchemaPage {
  @scala.inline
  def apply(
    layoutProperties: SchemaLayoutProperties = null,
    masterProperties: SchemaMasterProperties = null,
    notesProperties: SchemaNotesProperties = null,
    objectId: String = null,
    pageElements: js.Array[SchemaPageElement] = null,
    pageProperties: SchemaPageProperties = null,
    pageType: String = null,
    revisionId: String = null,
    slideProperties: SchemaSlideProperties = null
  ): SchemaPage = {
    val __obj = js.Dynamic.literal()
    if (layoutProperties != null) __obj.updateDynamic("layoutProperties")(layoutProperties.asInstanceOf[js.Any])
    if (masterProperties != null) __obj.updateDynamic("masterProperties")(masterProperties.asInstanceOf[js.Any])
    if (notesProperties != null) __obj.updateDynamic("notesProperties")(notesProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pageElements != null) __obj.updateDynamic("pageElements")(pageElements.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (pageType != null) __obj.updateDynamic("pageType")(pageType.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (slideProperties != null) __obj.updateDynamic("slideProperties")(slideProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPage]
  }
}

