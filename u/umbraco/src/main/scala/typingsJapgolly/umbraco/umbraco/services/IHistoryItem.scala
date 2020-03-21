package typingsJapgolly.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * History item
  */
trait IHistoryItem extends js.Object {
  //css class for the list, ex: "icon-image", "icon-doc"
  var icon: String
  //route to the editor, ex: "/content/edit/1234"
  var link: String
  //friendly name for the history listing
  var name: String
}

object IHistoryItem {
  @scala.inline
  def apply(icon: String, link: String, name: String): IHistoryItem = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHistoryItem]
  }
}

