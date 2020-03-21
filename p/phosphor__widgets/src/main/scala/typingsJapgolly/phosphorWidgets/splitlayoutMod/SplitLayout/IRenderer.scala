package typingsJapgolly.phosphorWidgets.splitlayoutMod.SplitLayout

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a split layout.
  */
trait IRenderer extends js.Object {
  /**
    * Create a new handle for use with a split layout.
    *
    * @returns A new handle element.
    */
  def createHandle(): HTMLDivElement
}

object IRenderer {
  @scala.inline
  def apply(createHandle: CallbackTo[HTMLDivElement]): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHandle")(createHandle.toJsFn)
    __obj.asInstanceOf[IRenderer]
  }
}

