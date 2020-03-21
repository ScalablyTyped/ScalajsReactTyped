package typingsJapgolly.sjcl

import typingsJapgolly.sjcl.mod.SjclEllipticalCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonC192 extends js.Object {
  var c192: SjclEllipticalCurve
  var c224: SjclEllipticalCurve
  var c256: SjclEllipticalCurve
  var c384: SjclEllipticalCurve
  var c521: SjclEllipticalCurve
  var k192: SjclEllipticalCurve
  var k224: SjclEllipticalCurve
  var k256: SjclEllipticalCurve
}

object AnonC192 {
  @scala.inline
  def apply(
    c192: SjclEllipticalCurve,
    c224: SjclEllipticalCurve,
    c256: SjclEllipticalCurve,
    c384: SjclEllipticalCurve,
    c521: SjclEllipticalCurve,
    k192: SjclEllipticalCurve,
    k224: SjclEllipticalCurve,
    k256: SjclEllipticalCurve
  ): AnonC192 = {
    val __obj = js.Dynamic.literal(c192 = c192.asInstanceOf[js.Any], c224 = c224.asInstanceOf[js.Any], c256 = c256.asInstanceOf[js.Any], c384 = c384.asInstanceOf[js.Any], c521 = c521.asInstanceOf[js.Any], k192 = k192.asInstanceOf[js.Any], k224 = k224.asInstanceOf[js.Any], k256 = k256.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonC192]
  }
}

