package typingsJapgolly.json2md.mod.DefaultConverters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInput extends js.Object {
  var headers: js.Array[String]
  var rows: js.Array[js.Array[String] | StringDictionary[String]]
}

object TableInput {
  @scala.inline
  def apply(headers: js.Array[String], rows: js.Array[js.Array[String] | StringDictionary[String]]): TableInput = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableInput]
  }
}

