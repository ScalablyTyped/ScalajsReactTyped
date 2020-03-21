package typingsJapgolly.mediumEditor.MediumEditor

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  var activeButtonClass: js.UndefOr[String] = js.undefined
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined
  var anchor: js.UndefOr[AnchorFormOptions] = js.undefined
  var anchorPreview: js.UndefOr[AnchorPreviewOptions | Boolean] = js.undefined
  var autoLink: js.UndefOr[Boolean] = js.undefined
  var buttonLabels: js.UndefOr[String | Boolean] = js.undefined
  var contentWindow: js.UndefOr[Window_] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disableDoubleReturn: js.UndefOr[Boolean] = js.undefined
  var disableEditing: js.UndefOr[Boolean] = js.undefined
  var disableExtraSpaces: js.UndefOr[Boolean] = js.undefined
  var disableReturn: js.UndefOr[Boolean] = js.undefined
  var elementsContainer: js.UndefOr[HTMLElement] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var imageDragging: js.UndefOr[Boolean] = js.undefined
  var keyboardCommands: js.UndefOr[KeyboardCommandsOptions | Boolean] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
  var paste: js.UndefOr[PasteOptions] = js.undefined
  var placeholder: js.UndefOr[PlaceholderOptions | Boolean] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var targetBlank: js.UndefOr[Boolean] = js.undefined
  var toolbar: js.UndefOr[ToolbarOptions | Boolean] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(
    activeButtonClass: String = null,
    allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined,
    anchor: AnchorFormOptions = null,
    anchorPreview: AnchorPreviewOptions | Boolean = null,
    autoLink: js.UndefOr[Boolean] = js.undefined,
    buttonLabels: String | Boolean = null,
    contentWindow: Window_ = null,
    delay: Int | Double = null,
    disableDoubleReturn: js.UndefOr[Boolean] = js.undefined,
    disableEditing: js.UndefOr[Boolean] = js.undefined,
    disableExtraSpaces: js.UndefOr[Boolean] = js.undefined,
    disableReturn: js.UndefOr[Boolean] = js.undefined,
    elementsContainer: HTMLElement = null,
    extensions: js.Any = null,
    imageDragging: js.UndefOr[Boolean] = js.undefined,
    keyboardCommands: KeyboardCommandsOptions | Boolean = null,
    ownerDocument: Document_ = null,
    paste: PasteOptions = null,
    placeholder: PlaceholderOptions | Boolean = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    targetBlank: js.UndefOr[Boolean] = js.undefined,
    toolbar: ToolbarOptions | Boolean = null
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (activeButtonClass != null) __obj.updateDynamic("activeButtonClass")(activeButtonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiParagraphSelection)) __obj.updateDynamic("allowMultiParagraphSelection")(allowMultiParagraphSelection.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (anchorPreview != null) __obj.updateDynamic("anchorPreview")(anchorPreview.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLink)) __obj.updateDynamic("autoLink")(autoLink.asInstanceOf[js.Any])
    if (buttonLabels != null) __obj.updateDynamic("buttonLabels")(buttonLabels.asInstanceOf[js.Any])
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleReturn)) __obj.updateDynamic("disableDoubleReturn")(disableDoubleReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditing)) __obj.updateDynamic("disableEditing")(disableEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(disableExtraSpaces)) __obj.updateDynamic("disableExtraSpaces")(disableExtraSpaces.asInstanceOf[js.Any])
    if (!js.isUndefined(disableReturn)) __obj.updateDynamic("disableReturn")(disableReturn.asInstanceOf[js.Any])
    if (elementsContainer != null) __obj.updateDynamic("elementsContainer")(elementsContainer.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(imageDragging)) __obj.updateDynamic("imageDragging")(imageDragging.asInstanceOf[js.Any])
    if (keyboardCommands != null) __obj.updateDynamic("keyboardCommands")(keyboardCommands.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (!js.isUndefined(targetBlank)) __obj.updateDynamic("targetBlank")(targetBlank.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

