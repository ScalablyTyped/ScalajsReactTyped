package typingsJapgolly.csvParse

import typingsJapgolly.csvParse.es5Mod._ColumnOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName
  extends _ColumnOption
     with typingsJapgolly.csvParse.mod._ColumnOption {
  var name: String
}

object AnonName {
  @scala.inline
  def apply(name: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

