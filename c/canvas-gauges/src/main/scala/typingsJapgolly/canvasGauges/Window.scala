package typingsJapgolly.canvasGauges

import typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge
import typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge
import typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge
  var LinearGauge: typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge
  var RadialGauge: typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

