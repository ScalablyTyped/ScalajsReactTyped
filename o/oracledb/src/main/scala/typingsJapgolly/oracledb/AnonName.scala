package typingsJapgolly.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**
    * Name of the column that stores the media type of the document. A media type column is needed if
    * the collection is to be heterogeneous, that is, it can store documents other than
    * JavaScript Object Notation (JSON).
    */
  var name: js.UndefOr[String] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

