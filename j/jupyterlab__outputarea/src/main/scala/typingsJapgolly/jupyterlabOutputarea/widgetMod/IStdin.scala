package typingsJapgolly.jupyterlabOutputarea.widgetMod

import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStdin extends Widget {
  /**
    * The stdin value.
    */
  val value: js.Promise[String] = js.native
}

