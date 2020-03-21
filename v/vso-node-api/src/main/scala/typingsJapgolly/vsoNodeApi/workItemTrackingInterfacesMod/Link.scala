package typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * Collection of link attributes.
    */
  var attributes: StringDictionary[js.Any]
  /**
    * Relation type.
    */
  var rel: String
  /**
    * Link url.
    */
  var url: String
}

object Link {
  @scala.inline
  def apply(attributes: StringDictionary[js.Any], rel: String, url: String): Link = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Link]
  }
}

