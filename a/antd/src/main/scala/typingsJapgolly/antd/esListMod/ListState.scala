package typingsJapgolly.antd.esListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListState extends js.Object {
  var paginationCurrent: Double
  var paginationSize: Double
}

object ListState {
  @scala.inline
  def apply(paginationCurrent: Double, paginationSize: Double): ListState = {
    val __obj = js.Dynamic.literal(paginationCurrent = paginationCurrent.asInstanceOf[js.Any], paginationSize = paginationSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListState]
  }
}

