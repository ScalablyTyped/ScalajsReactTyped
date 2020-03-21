package typingsJapgolly.jupyterlabApputils.mod

import typingsJapgolly.jupyterlabApputils.vdomMod.ReactRenderElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "ReactWidget")
@js.native
abstract class ReactWidget ()
  extends typingsJapgolly.jupyterlabApputils.vdomMod.ReactWidget

/* static members */
@JSImport("@jupyterlab/apputils", "ReactWidget")
@js.native
object ReactWidget extends js.Object {
  /**
    * Creates a new `ReactWidget` that renders a constant element.
    * @param element React element to render.
    */
  def create(element: ReactRenderElement): typingsJapgolly.jupyterlabApputils.vdomMod.ReactWidget = js.native
}

