package typingsJapgolly.jupyterlabApputils.inputdialogMod.InputDialog

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.Header
import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for number input dialogs
  */
trait INumberOptions extends IOptions {
  /**
    * Default value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object INumberOptions {
  @scala.inline
  def apply(
    title: Header,
    cancelLabel: String = null,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    renderer: IRenderer = null,
    value: Int | Double = null
  ): INumberOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberOptions]
  }
}

