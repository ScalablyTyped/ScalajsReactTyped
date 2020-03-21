package typingsJapgolly.titanium.Titanium.Android

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.View
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An action bar is a window feature that identifies the application and user location,
		 * and provides user actions and navigation modes.
		 */
trait ActionBar extends Proxy {
  /**
  			 * The background image for the action bar, specified as a local file path or URL.
  			 */
  var backgroundImage: String
  /**
  			 * Sets a view to be used for a custom navigation mode.
  			 */
  var customView: View
  /**
  			 * Displays an "up" affordance on the "home" area of the action bar.
  			 */
  var displayHomeAsUp: Boolean
  /**
  			 * Enable or disable the "home" button in the corner of the action bar.
  			 */
  var homeButtonEnabled: Boolean
  /**
  			 * Sets the application icon displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var icon: String
  /**
  			 * Sets the application logo displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var logo: String
  /**
  			 * Controls the navigation mode.
  			 */
  var navigationMode: Double
  /**
  			 * Sets the subtitle of the action bar.
  			 */
  var subtitle: String
  /**
  			 * Sets the title of the action bar.
  			 */
  var title: String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def getCustomView(): View
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def getNavigationMode(): Double
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def getSubtitle(): String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Hides the action bar if it is currently showing.
  			 */
  def hide(): Unit
  /**
  			 * Callback function called when the home icon is clicked.
  			 */
  def onHomeIconItemSelected(): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.backgroundImage> property.
  			 */
  def setBackgroundImage(backgroundImage: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def setCustomView(customView: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.displayHomeAsUp> property.
  			 */
  def setDisplayHomeAsUp(displayHomeAsUp: Boolean): Unit
  /**
  			 * Shows or hides the action bar home icon
  			 */
  def setDisplayShowHomeEnabled(show: Boolean): Unit
  /**
  			 * Shows or hides the action bar title/subtitle
  			 */
  def setDisplayShowTitleEnabled(show: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.homeButtonEnabled> property.
  			 */
  def setHomeButtonEnabled(homeButtonEnabled: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.icon> property.
  			 */
  def setIcon(icon: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.logo> property.
  			 */
  def setLogo(logo: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def setNavigationMode(navigationMode: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.onHomeIconItemSelected> property.
  			 */
  def setOnHomeIconItemSelected(onHomeIconItemSelected: js.Function0[_]): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def setSubtitle(subtitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def setTitle(title: String): Unit
  /**
  			 * Shows the action bar if it is currently hidden.
  			 */
  def show(): Unit
}

object ActionBar {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    backgroundImage: String,
    bubbleParent: Boolean,
    customView: View,
    displayHomeAsUp: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getCustomView: CallbackTo[View],
    getNavigationMode: CallbackTo[Double],
    getSubtitle: CallbackTo[String],
    getTitle: CallbackTo[String],
    hide: Callback,
    homeButtonEnabled: Boolean,
    icon: String,
    logo: String,
    navigationMode: Double,
    onHomeIconItemSelected: CallbackTo[js.Any],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBackgroundImage: String => Callback,
    setBubbleParent: Boolean => Callback,
    setCustomView: js.Any => Callback,
    setDisplayHomeAsUp: Boolean => Callback,
    setDisplayShowHomeEnabled: Boolean => Callback,
    setDisplayShowTitleEnabled: Boolean => Callback,
    setHomeButtonEnabled: Boolean => Callback,
    setIcon: String => Callback,
    setLogo: String => Callback,
    setNavigationMode: Double => Callback,
    setOnHomeIconItemSelected: js.Function0[js.Any] => Callback,
    setSubtitle: String => Callback,
    setTitle: String => Callback,
    show: Callback,
    subtitle: String,
    title: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ActionBar = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], customView = customView.asInstanceOf[js.Any], displayHomeAsUp = displayHomeAsUp.asInstanceOf[js.Any], homeButtonEnabled = homeButtonEnabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], navigationMode = navigationMode.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getCustomView")(getCustomView.toJsFn)
    __obj.updateDynamic("getNavigationMode")(getNavigationMode.toJsFn)
    __obj.updateDynamic("getSubtitle")(getSubtitle.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("onHomeIconItemSelected")(onHomeIconItemSelected.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBackgroundImage")(js.Any.fromFunction1((t0: java.lang.String) => setBackgroundImage(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setCustomView")(js.Any.fromFunction1((t0: js.Any) => setCustomView(t0).runNow()))
    __obj.updateDynamic("setDisplayHomeAsUp")(js.Any.fromFunction1((t0: scala.Boolean) => setDisplayHomeAsUp(t0).runNow()))
    __obj.updateDynamic("setDisplayShowHomeEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisplayShowHomeEnabled(t0).runNow()))
    __obj.updateDynamic("setDisplayShowTitleEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisplayShowTitleEnabled(t0).runNow()))
    __obj.updateDynamic("setHomeButtonEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setHomeButtonEnabled(t0).runNow()))
    __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: java.lang.String) => setIcon(t0).runNow()))
    __obj.updateDynamic("setLogo")(js.Any.fromFunction1((t0: java.lang.String) => setLogo(t0).runNow()))
    __obj.updateDynamic("setNavigationMode")(js.Any.fromFunction1((t0: scala.Double) => setNavigationMode(t0).runNow()))
    __obj.updateDynamic("setOnHomeIconItemSelected")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => setOnHomeIconItemSelected(t0).runNow()))
    __obj.updateDynamic("setSubtitle")(js.Any.fromFunction1((t0: java.lang.String) => setSubtitle(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBar]
  }
}

