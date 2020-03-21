package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabs extends js.Object {
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
}

object IonTabs {
  @scala.inline
  def apply(
    onIonTabsDidChange: /* event */ CustomEvent => Callback = null,
    onIonTabsWillChange: /* event */ CustomEvent => Callback = null
  ): IonTabs = {
    val __obj = js.Dynamic.literal()
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsDidChange(t0).runNow()))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsWillChange(t0).runNow()))
    __obj.asInstanceOf[IonTabs]
  }
}

