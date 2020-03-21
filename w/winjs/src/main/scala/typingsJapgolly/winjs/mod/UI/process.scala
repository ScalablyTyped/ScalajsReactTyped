package typingsJapgolly.winjs.mod.UI

import typingsJapgolly.winjs.Element
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "UI.process")
@js.native
object process extends js.Object {
  /**
    * Applies declarative control binding to the specified element.
    * @param element The element to bind.
    * @returns A promise that is fulfilled after the control is activated. The value of the promise is the control that is attached to element.
    **/
  def apply(element: Element): Promise[_] = js.native
}

