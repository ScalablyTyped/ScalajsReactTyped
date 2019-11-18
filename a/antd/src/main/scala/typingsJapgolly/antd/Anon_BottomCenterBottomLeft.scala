package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.bottomCenter
import typingsJapgolly.antd.antdStrings.bottomLeft
import typingsJapgolly.antd.antdStrings.bottomRight
import typingsJapgolly.antd.antdStrings.topCenter
import typingsJapgolly.antd.antdStrings.topLeft
import typingsJapgolly.antd.antdStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeft extends js.Object {
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
  var placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter
}

object Anon_BottomCenterBottomLeft {
  @scala.inline
  def apply(
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter
  ): Anon_BottomCenterBottomLeft = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BottomCenterBottomLeft]
  }
}

