package typingsJapgolly.fundamentalReact.modalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.fundamentalReact.AnonCloseButton
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends /* x */ StringDictionary[js.Any] {
  /* Node(s) to render within the footer of the dialog. */
  var actions: js.UndefOr[Node] = js.undefined
  /* Additional props to be spread to the body section of the dialog. */
  var bodyProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the close `<button>` element. */
  var closeProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the content section of the dialog. */
  var contentProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Additional props to be spread to the footer of the dialog. */
  var footerProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the header of the dialog. */
  var headerProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  var localizedText: js.UndefOr[AnonCloseButton] = js.undefined
  /* Callback function passing event when close button is clicked. */
  var onClose: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /* Set to **true** to make the dialog visible. */
  var show: js.UndefOr[Boolean] = js.undefined
  var title: String
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: VdomNode = null,
    bodyProps: StringDictionary[js.Any] = null,
    closeProps: StringDictionary[js.Any] = null,
    contentProps: StringDictionary[js.Any] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    footerProps: StringDictionary[js.Any] = null,
    headerProps: StringDictionary[js.Any] = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    localizedText: AnonCloseButton = null,
    onClose: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    show: js.UndefOr[Boolean] = js.undefined,
    titleProps: StringDictionary[js.Any] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps.asInstanceOf[js.Any])
    if (closeProps != null) __obj.updateDynamic("closeProps")(closeProps.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClose(t0).runNow()))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

