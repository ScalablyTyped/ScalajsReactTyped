package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.AND
import typingsJapgolly.qlik.qlikStrings.NORMAL
import typingsJapgolly.qlik.qlikStrings.NOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxFieldSelectionInfo extends js.Object {
  var qFieldSelectionmode: NORMAL | AND | NOT
  var qName: String
}

object NxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionmode: NORMAL | AND | NOT, qName: String): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
}

