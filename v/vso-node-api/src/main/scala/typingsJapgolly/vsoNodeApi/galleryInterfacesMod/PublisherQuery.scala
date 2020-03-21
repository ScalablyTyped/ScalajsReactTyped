package typingsJapgolly.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherQuery extends js.Object {
  /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter]
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
  var flags: PublisherQueryFlags
}

object PublisherQuery {
  @scala.inline
  def apply(filters: js.Array[QueryFilter], flags: PublisherQueryFlags): PublisherQuery = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublisherQuery]
  }
}

