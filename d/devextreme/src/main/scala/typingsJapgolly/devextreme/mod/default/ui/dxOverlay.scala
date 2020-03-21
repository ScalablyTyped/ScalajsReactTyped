package typingsJapgolly.devextreme.mod.default.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxOverlayOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "ui.dxOverlay")
@js.native
class dxOverlay protected ()
  extends typingsJapgolly.devextreme.mod.DevExpress.ui.dxOverlay {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: dxOverlayOptions[typingsJapgolly.devextreme.mod.DevExpress.ui.dxOverlay]) = this()
  def this(
    element: Element,
    options: dxOverlayOptions[typingsJapgolly.devextreme.mod.DevExpress.ui.dxOverlay]
  ) = this()
}

@JSImport("devextreme", "ui.dxOverlay")
@js.native
object dxOverlay extends js.Object {
  def baseZIndex(zIndex: Double): Unit = js.native
}

