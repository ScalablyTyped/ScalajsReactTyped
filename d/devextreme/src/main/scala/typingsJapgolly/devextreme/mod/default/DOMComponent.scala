package typingsJapgolly.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonDevice
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "DOMComponent")
@js.native
class DOMComponent protected ()
  extends typingsJapgolly.devextreme.mod.DevExpress.DOMComponent {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(
    element: JQuery,
    options: DOMComponentOptions[typingsJapgolly.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
  def this(
    element: Element,
    options: DOMComponentOptions[typingsJapgolly.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
}

/* static members */
@JSImport("devextreme", "DOMComponent")
@js.native
object DOMComponent extends js.Object {
  /** Specifies the device-dependent default configuration options for this component. */
  def defaultOptions(rule: AnonDevice): Unit = js.native
  def getInstance(element: JQuery): typingsJapgolly.devextreme.mod.DevExpress.DOMComponent = js.native
  /** Gets the instance of a widget found using its DOM node. */
  def getInstance(element: typingsJapgolly.std.Element): typingsJapgolly.devextreme.mod.DevExpress.DOMComponent = js.native
}

