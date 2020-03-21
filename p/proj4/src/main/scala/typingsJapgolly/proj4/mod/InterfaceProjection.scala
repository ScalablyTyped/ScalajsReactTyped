package typingsJapgolly.proj4.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceProjection extends js.Object {
  var b: Double
  var datum: String
  var e: Double
  var ep2: Double
  var es: Double
  var rf: Double
  var sphere: Double
  def forward(coordinates: TemplateCoordinates): js.Array[Double]
  def inverse(coordinates: TemplateCoordinates): js.Array[Double]
}

object InterfaceProjection {
  @scala.inline
  def apply(
    b: Double,
    datum: String,
    e: Double,
    ep2: Double,
    es: Double,
    forward: TemplateCoordinates => CallbackTo[js.Array[Double]],
    inverse: TemplateCoordinates => CallbackTo[js.Array[Double]],
    rf: Double,
    sphere: Double
  ): InterfaceProjection = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], rf = rf.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
    __obj.updateDynamic("forward")(js.Any.fromFunction1((t0: typingsJapgolly.proj4.mod.TemplateCoordinates) => forward(t0).runNow()))
    __obj.updateDynamic("inverse")(js.Any.fromFunction1((t0: typingsJapgolly.proj4.mod.TemplateCoordinates) => inverse(t0).runNow()))
    __obj.asInstanceOf[InterfaceProjection]
  }
}

