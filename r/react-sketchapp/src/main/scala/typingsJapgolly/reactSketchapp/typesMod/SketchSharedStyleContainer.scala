package typingsJapgolly.reactSketchapp.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchSharedStyleContainer extends js.Object {
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): js.Any
  def setObjects(objects: js.Array[SketchStyle]): Unit
}

object SketchSharedStyleContainer {
  @scala.inline
  def apply(
    addSharedStyleWithName_firstInstance: (String, SketchStyle) => CallbackTo[js.Any],
    setObjects: js.Array[SketchStyle] => Callback
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSharedStyleWithName_firstInstance")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reactSketchapp.typesMod.SketchStyle) => addSharedStyleWithName_firstInstance(t0, t1).runNow()))
    __obj.updateDynamic("setObjects")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.reactSketchapp.typesMod.SketchStyle]) => setObjects(t0).runNow()))
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
}

