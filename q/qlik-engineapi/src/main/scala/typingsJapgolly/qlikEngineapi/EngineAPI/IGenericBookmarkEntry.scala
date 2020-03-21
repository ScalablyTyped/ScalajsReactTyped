package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkEntry...
  */
trait IGenericBookmarkEntry extends js.Object {
  /**
    * Information about the bookmark.
    */
  var qBookmark: INxBookmark
  /**
    * Information about the properties of the bookmark.
    */
  var qProperties: IGenericBookmarkProperties
}

object IGenericBookmarkEntry {
  @scala.inline
  def apply(qBookmark: INxBookmark, qProperties: IGenericBookmarkProperties): IGenericBookmarkEntry = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qProperties = qProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericBookmarkEntry]
  }
}

