package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.ShortcutParams
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The Home screen quick actions API is for adding shortcuts to your app icon that anticipate and accelerate a
			 * user's interaction with your app.
			 */
trait ApplicationShortcuts extends Proxy {
  /**
  				 * Creates a new dynamic application shortcut item.
  				 */
  def addDynamicShortcut(params: ShortcutParams): Unit
  /**
  				 * Returns true or false depending if the provided shortcut object already exists.
  				 */
  def dynamicShortcutExists(itemtype: String): Boolean
  /**
  				 * Gets the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def getDynamicShortcut(itemtype: String): Unit
  /**
  				 * Returns an array of the application shortcuts created dynamically.
  				 */
  def listDynamicShortcuts(): js.Array[ShortcutParams]
  /**
  				 * Returns an array of the application shortcuts listed in your tiapp.xml file.
  				 */
  def listStaticShortcuts(): js.Array[ShortcutParams]
  /**
  				 * Removes all dynamically created application shortcuts.
  				 */
  def removeAllDynamicShortcuts(): Unit
  /**
  				 * Removes the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def removeDynamicShortcut(itemtype: String): Unit
}

object ApplicationShortcuts {
  @scala.inline
  def apply(
    addDynamicShortcut: ShortcutParams => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    dynamicShortcutExists: String => CallbackTo[Boolean],
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDynamicShortcut: String => Callback,
    listDynamicShortcuts: CallbackTo[js.Array[ShortcutParams]],
    listStaticShortcuts: CallbackTo[js.Array[ShortcutParams]],
    removeAllDynamicShortcuts: Callback,
    removeDynamicShortcut: String => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ApplicationShortcuts = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addDynamicShortcut")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.ShortcutParams) => addDynamicShortcut(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("dynamicShortcutExists")(js.Any.fromFunction1((t0: java.lang.String) => dynamicShortcutExists(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDynamicShortcut")(js.Any.fromFunction1((t0: java.lang.String) => getDynamicShortcut(t0).runNow()))
    __obj.updateDynamic("listDynamicShortcuts")(listDynamicShortcuts.toJsFn)
    __obj.updateDynamic("listStaticShortcuts")(listStaticShortcuts.toJsFn)
    __obj.updateDynamic("removeAllDynamicShortcuts")(removeAllDynamicShortcuts.toJsFn)
    __obj.updateDynamic("removeDynamicShortcut")(js.Any.fromFunction1((t0: java.lang.String) => removeDynamicShortcut(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationShortcuts]
  }
}

