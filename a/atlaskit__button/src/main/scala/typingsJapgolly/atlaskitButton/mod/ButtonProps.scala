package typingsJapgolly.atlaskitButton.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  /** The base styling to apply to the button. */
  val appearance: js.UndefOr[ButtonAppearances] = js.undefined
  /** Pass aria-controls to underlying html button. */
  val ariaControls: js.UndefOr[String] = js.undefined
  /** Pass aria-expanded to underlying html button. */
  val ariaExpanded: js.UndefOr[Boolean] = js.undefined
  /** Pass aria-haspopup to underlying html button. */
  val ariaHaspopup: js.UndefOr[Boolean] = js.undefined
  /** This button's child nodes. */
  val children: js.UndefOr[Node] = js.undefined
  /** Add a classname to the button. */
  val className: js.UndefOr[String] = js.undefined
  /** A custom component to use instead of the default button. */
  val component: js.UndefOr[ComponentClassP[js.Object]] = js.undefined
  /** Name property of a linked form that the button submits when clicked. */
  val form: js.UndefOr[String] = js.undefined
  /** Provides a url for buttons being used as a link. */
  val href: js.UndefOr[String] = js.undefined
  /** Places an icon within the button, after the button's text. */
  val iconAfter: js.UndefOr[Element] = js.undefined
  /** Places an icon within the button, before the button's text. */
  val iconBefore: js.UndefOr[Element] = js.undefined
  /** Provide a unique id to the button. */
  val id: js.UndefOr[String] = js.undefined
  /** Pass a reference on to the styled component */
  val innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  /** Set if the button is disabled. */
  val isDisabled: js.UndefOr[Boolean] = js.undefined
  /** Change the style to indicate the button is selected. */
  val isSelected: js.UndefOr[Boolean] = js.undefined
  /** Handler to be called on click. */
  val onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  /** Option to fit button width to its parent width */
  val shouldFitContainer: js.UndefOr[Boolean] = js.undefined
  /** Set the amount of padding in the button. */
  val spacing: js.UndefOr[ButtonSpacing] = js.undefined
  /** Assign specific tabIndex order to the underlying html button. */
  val tabIndex: js.UndefOr[Double] = js.undefined
  /** Pass target down to a link within the button component, if a href is provided. */
  val target: js.UndefOr[String] = js.undefined
  /** Set whether it is a button or a form submission. */
  val `type`: js.UndefOr[ButtonType] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    appearance: ButtonAppearances = null,
    ariaControls: String = null,
    ariaExpanded: js.UndefOr[Boolean] = js.undefined,
    ariaHaspopup: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    component: ComponentClassP[js.Object] = null,
    form: String = null,
    href: String = null,
    iconAfter: VdomElement = null,
    iconBefore: VdomElement = null,
    id: String = null,
    innerRef: /* instance */ js.Any => Callback = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    spacing: ButtonSpacing = null,
    tabIndex: Int | Double = null,
    target: String = null,
    `type`: ButtonType = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHaspopup)) __obj.updateDynamic("ariaHaspopup")(ariaHaspopup.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (iconAfter != null) __obj.updateDynamic("iconAfter")(iconAfter.rawElement.asInstanceOf[js.Any])
    if (iconBefore != null) __obj.updateDynamic("iconBefore")(iconBefore.rawElement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* instance */ js.Any) => innerRef(t0).runNow()))
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

