package typingsJapgolly.activexMsforms.MSForms.EventHelperTypes

import typingsJapgolly.activexMsforms.MSForms.Control
import typingsJapgolly.activexMsforms.MSForms.DataObject
import typingsJapgolly.activexMsforms.MSForms.ReturnBoolean
import typingsJapgolly.activexMsforms.MSForms.ReturnEffect
import typingsJapgolly.activexMsforms.MSForms.fmAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerBeforeDropOrPasteParameter extends js.Object {
  val Action: fmAction
  val Cancel: ReturnBoolean
  val Control: typingsJapgolly.activexMsforms.MSForms.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Shift: Double
  val X: Double
  val Y: Double
}

object ContainerBeforeDropOrPasteParameter {
  @scala.inline
  def apply(
    Action: fmAction,
    Cancel: ReturnBoolean,
    Control: Control,
    Data: DataObject,
    Effect: ReturnEffect,
    Shift: Double,
    X: Double,
    Y: Double
  ): ContainerBeforeDropOrPasteParameter = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerBeforeDropOrPasteParameter]
  }
}

