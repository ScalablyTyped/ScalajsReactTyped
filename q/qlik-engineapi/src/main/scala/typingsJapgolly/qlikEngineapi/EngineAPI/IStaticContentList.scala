package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of of content files (Information about the list of content files)
  */
trait IStaticContentList extends js.Object {
  var qItems: IStaticContentListItem
}

object IStaticContentList {
  @scala.inline
  def apply(qItems: IStaticContentListItem): IStaticContentList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStaticContentList]
  }
}

