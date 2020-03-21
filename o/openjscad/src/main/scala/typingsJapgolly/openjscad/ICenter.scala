package typingsJapgolly.openjscad

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICenter extends js.Object {
  def center(cAxes: js.Array[String]): CxG
}

object ICenter {
  @scala.inline
  def apply(center: js.Array[String] => CallbackTo[CxG]): ICenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => center(t0).runNow()))
    __obj.asInstanceOf[ICenter]
  }
}

