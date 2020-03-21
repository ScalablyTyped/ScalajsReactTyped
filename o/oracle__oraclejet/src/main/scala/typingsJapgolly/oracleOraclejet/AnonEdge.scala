package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdge extends js.Object {
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var query: String | Null
  var selector: String
}

object AnonEdge {
  @scala.inline
  def apply(selector: String, edge: start | end | top | bottom = null, query: String = null): AnonEdge = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdge]
  }
}

