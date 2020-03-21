package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayWidget extends js.Object {
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null
}

object IOverlayWidget {
  @scala.inline
  def apply(
    getDomNode: CallbackTo[HTMLElement],
    getId: CallbackTo[String],
    getPosition: CallbackTo[IOverlayWidgetPosition | Null]
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDomNode")(getDomNode.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.asInstanceOf[IOverlayWidget]
  }
}

