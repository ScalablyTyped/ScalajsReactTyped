package typingsJapgolly.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var b: Double
  var l: Double
  var pad: Double
  var r: Double
  var t: Double
}

object Margin {
  @scala.inline
  def apply(b: Double, l: Double, pad: Double, r: Double, t: Double): Margin = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Margin]
  }
}

