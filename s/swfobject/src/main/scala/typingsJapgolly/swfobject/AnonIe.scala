package typingsJapgolly.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIe extends js.Object {
      // number or boolean
  var ie: Boolean
  var mac: Boolean
  var pv: js.Array[Double]
  var w3: Boolean
  var win: Boolean
  var wk: js.Any
}

object AnonIe {
  @scala.inline
  def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: js.Any): AnonIe = {
    val __obj = js.Dynamic.literal(ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], w3 = w3.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], wk = wk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIe]
  }
}

