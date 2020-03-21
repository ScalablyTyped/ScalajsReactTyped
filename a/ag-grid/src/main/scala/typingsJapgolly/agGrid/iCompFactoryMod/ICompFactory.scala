package typingsJapgolly.agGrid.iCompFactoryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompFactory extends js.Object {
  def create(): Component
}

object ICompFactory {
  @scala.inline
  def apply(create: CallbackTo[Component]): ICompFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.asInstanceOf[ICompFactory]
  }
}

