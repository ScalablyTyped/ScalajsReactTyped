package typingsJapgolly.jupyterlabExtensionmanager.queryMod

import typingsJapgolly.jupyterlabExtensionmanager.AnonFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchResult extends js.Object {
  /**
    * A collection of search results.
    */
  var objects: js.Array[AnonFlags]
  /**
    * Timestamp of the search result creation.
    */
  var time: String
  /**
    * The total number of objects found by the search.
    *
    * This can be greater than the number of objects due
    * to pagination of the search results.
    */
  var total: Double
}

object ISearchResult {
  @scala.inline
  def apply(objects: js.Array[AnonFlags], time: String, total: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchResult]
  }
}

