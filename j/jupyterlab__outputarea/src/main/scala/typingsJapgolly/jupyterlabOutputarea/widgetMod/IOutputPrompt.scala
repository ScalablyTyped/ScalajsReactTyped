package typingsJapgolly.jupyterlabOutputarea.widgetMod

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputPrompt extends Widget {
  /**
    * The execution count for the prompt.
    */
  var executionCount: ExecutionCount = js.native
}

