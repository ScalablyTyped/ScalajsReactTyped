package typingsJapgolly.urlParse

import typingsJapgolly.urlParse.mod.QueryParser
import typingsJapgolly.urlParse.mod.StringifyQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParse extends js.Object {
  @JSName("parse")
  var parse_Original: QueryParser = js.native
  @JSName("stringify")
  var stringify_Original: StringifyQuery = js.native
  def parse(query: String): js.Object = js.native
  def stringify(query: js.Object): String = js.native
}

