package typingsJapgolly.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxHighlightRanges extends js.Object {
  var qRanges: js.Array[CharRange]
}

object NxHighlightRanges {
  @scala.inline
  def apply(qRanges: js.Array[CharRange]): NxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxHighlightRanges]
  }
}

