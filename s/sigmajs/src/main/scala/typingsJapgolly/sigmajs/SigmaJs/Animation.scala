package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def camera(camera: Camera, target: StringDictionary[js.Any], options: StringDictionary[js.Any]): Double
}

object Animation {
  @scala.inline
  def apply(camera: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => CallbackTo[Double]): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camera")(js.Any.fromFunction3((t0: typingsJapgolly.sigmajs.SigmaJs.Camera, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: org.scalablytyped.runtime.StringDictionary[js.Any]) => camera(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Animation]
  }
}

