package typingsJapgolly.bootstrapMenu.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every function attribute is called before rendering the menu each time it is opened.
  * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
  */
trait BootstrapMenuActions extends js.Object {
  /**
    * Optional, classes to add to the action.
    */
  var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.undefined
  /**
    * Optional, Font Awesome class of the icon to show for the action.
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Optional, decides if the action should appear enabled or disabled in the context menu.
    */
  var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
  /**
    * Optional, decides if the action should be shown or hidden in the context menu.
    */
  var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
  /**
    * The name of the action.
    */
  var name: String
  /**
    * Handler to run when an action is clicked.
    */
  def onClick(rowElement: BootstrapMenuRowElement): Unit
}

object BootstrapMenuActions {
  @scala.inline
  def apply(
    name: String,
    onClick: BootstrapMenuRowElement => Callback,
    classNames: String | js.Object | (js.Function0[String | js.Object]) = null,
    iconClass: String = null,
    isEnabled: /* rowElement */ BootstrapMenuRowElement => CallbackTo[Boolean] = null,
    isShown: /* rowElement */ BootstrapMenuRowElement => CallbackTo[Boolean] = null
  ): BootstrapMenuActions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.bootstrapMenu.mod.BootstrapMenuRowElement) => onClick(t0).runNow()))
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: /* rowElement */ typingsJapgolly.bootstrapMenu.mod.BootstrapMenuRowElement) => isEnabled(t0).runNow()))
    if (isShown != null) __obj.updateDynamic("isShown")(js.Any.fromFunction1((t0: /* rowElement */ typingsJapgolly.bootstrapMenu.mod.BootstrapMenuRowElement) => isShown(t0).runNow()))
    __obj.asInstanceOf[BootstrapMenuActions]
  }
}

