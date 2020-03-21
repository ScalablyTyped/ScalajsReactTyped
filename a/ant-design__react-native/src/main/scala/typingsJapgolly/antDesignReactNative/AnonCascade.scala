package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCascade extends js.Object {
  var cascade: Boolean
  var cols: Double
  var value: js.Array[scala.Nothing]
  def onChange(): Unit
}

object AnonCascade {
  @scala.inline
  def apply(cascade: Boolean, cols: Double, onChange: Callback, value: js.Array[scala.Nothing]): AnonCascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonCascade]
  }
}

