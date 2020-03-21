package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.add
import typingsJapgolly.qlik.qlikStrings.remove
import typingsJapgolly.qlik.qlikStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var qOp: add | remove | replace
  var qPath: String
  var qValue: String
}

object Patch {
  @scala.inline
  def apply(qOp: add | remove | replace, qPath: String, qValue: String): Patch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Patch]
  }
}

