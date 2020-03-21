package typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React properties for collapsible section component.
  */
trait IProperties extends js.Object {
  /**
    * If given, this will be diplayed instead of the children.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  /**
    * The header string for section list.
    */
  var header: String
  /**
    * Any additional elements to add to the header.
    */
  var headerElements: js.UndefOr[Node] = js.undefined
  /**
    * Whether the view will be expanded or collapsed initially, defaults to open.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Handle collapse event.
    */
  var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
}

object IProperties {
  @scala.inline
  def apply(
    header: String,
    errorMessage: String = null,
    headerElements: VdomNode = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onCollapse: /* isOpen */ Boolean => Callback = null
  ): IProperties = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headerElements != null) __obj.updateDynamic("headerElements")(headerElements.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onCollapse(t0).runNow()))
    __obj.asInstanceOf[IProperties]
  }
}

