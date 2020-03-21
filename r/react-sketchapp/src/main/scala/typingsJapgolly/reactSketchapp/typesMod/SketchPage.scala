package typingsJapgolly.reactSketchapp.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPage extends js.Object {
  def layers(): js.Array[SketchLayer]
  def name(): NSString
  def setName(name: String): Unit
}

object SketchPage {
  @scala.inline
  def apply(layers: CallbackTo[js.Array[SketchLayer]], name: CallbackTo[NSString], setName: String => Callback): SketchPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layers")(layers.toJsFn)
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[SketchPage]
  }
}

