package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentElement extends js.Object {
  var isReadOnly: Boolean
  def addElement(element: IElement, index: Double): js.Any
  def removeElement(element: IElement): Boolean
}

object IParentElement {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => CallbackTo[js.Any],
    isReadOnly: Boolean,
    removeElement: IElement => CallbackTo[Boolean]
  ): IParentElement = {
    val __obj = js.Dynamic.literal(isReadOnly = isReadOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("addElement")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IElement, t1: scala.Double) => addElement(t0, t1).runNow()))
    __obj.updateDynamic("removeElement")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => removeElement(t0).runNow()))
    __obj.asInstanceOf[IParentElement]
  }
}

