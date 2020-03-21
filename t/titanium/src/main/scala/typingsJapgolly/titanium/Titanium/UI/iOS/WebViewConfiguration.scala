package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import typingsJapgolly.titanium.WebViewPreferencesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A collection of properties used to initialize a web view.
			 */
trait WebViewConfiguration extends Proxy {
  /**
  				 * A Boolean value indicating whether AirPlay is allowed.
  				 */
  var allowsAirPlayMediaPlayback: Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos play inline or use the native full-screen controller.
  				 */
  var allowsInlineMediaPlayback: Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos can play picture-in-picture.
  				 */
  var allowsPictureInPictureMediaPlayback: Boolean
  /**
  				 * Determines which media types require a user gesture to begin playing.
  				 */
  var mediaTypesRequiringUserActionForPlayback: Double
  /**
  				 * The preference settings to be used by the web view.
  				 */
  var preferences: WebViewPreferencesObject
  /**
  				 * The process pool from which to obtain the  Web Content process of view.
  				 */
  var processPool: WebViewProcessPool
  /**
  				 * The level of granularity with which the user can interactively select content in the web view.
  				 */
  var selectionGranularity: Double
  /**
  				 * A Boolean value indicating whether the web view suppresses content rendering until it is fully
  				 * loaded into memory.
  				 */
  var suppressesIncrementalRendering: Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def getAllowsAirPlayMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def getAllowsInlineMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def getAllowsPictureInPictureMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def getMediaTypesRequiringUserActionForPlayback(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def getPreferences(): WebViewPreferencesObject
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def getProcessPool(): WebViewProcessPool
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def getSelectionGranularity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def getSuppressesIncrementalRendering(): Boolean
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def setAllowsAirPlayMediaPlayback(allowsAirPlayMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def setAllowsInlineMediaPlayback(allowsInlineMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def setAllowsPictureInPictureMediaPlayback(allowsPictureInPictureMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def setMediaTypesRequiringUserActionForPlayback(mediaTypesRequiringUserActionForPlayback: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def setPreferences(preferences: WebViewPreferencesObject): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def setProcessPool(processPool: WebViewProcessPool): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def setSelectionGranularity(selectionGranularity: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def setSuppressesIncrementalRendering(suppressesIncrementalRendering: Boolean): Unit
}

object WebViewConfiguration {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    allowsAirPlayMediaPlayback: Boolean,
    allowsInlineMediaPlayback: Boolean,
    allowsPictureInPictureMediaPlayback: Boolean,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getAllowsAirPlayMediaPlayback: CallbackTo[Boolean],
    getAllowsInlineMediaPlayback: CallbackTo[Boolean],
    getAllowsPictureInPictureMediaPlayback: CallbackTo[Boolean],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getMediaTypesRequiringUserActionForPlayback: CallbackTo[Double],
    getPreferences: CallbackTo[WebViewPreferencesObject],
    getProcessPool: CallbackTo[WebViewProcessPool],
    getSelectionGranularity: CallbackTo[Double],
    getSuppressesIncrementalRendering: CallbackTo[Boolean],
    mediaTypesRequiringUserActionForPlayback: Double,
    preferences: WebViewPreferencesObject,
    processPool: WebViewProcessPool,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    selectionGranularity: Double,
    setAllowsAirPlayMediaPlayback: Boolean => Callback,
    setAllowsInlineMediaPlayback: Boolean => Callback,
    setAllowsPictureInPictureMediaPlayback: Boolean => Callback,
    setBubbleParent: Boolean => Callback,
    setMediaTypesRequiringUserActionForPlayback: Double => Callback,
    setPreferences: WebViewPreferencesObject => Callback,
    setProcessPool: WebViewProcessPool => Callback,
    setSelectionGranularity: Double => Callback,
    setSuppressesIncrementalRendering: Boolean => Callback,
    suppressesIncrementalRendering: Boolean,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): WebViewConfiguration = {
    val __obj = js.Dynamic.literal(allowsAirPlayMediaPlayback = allowsAirPlayMediaPlayback.asInstanceOf[js.Any], allowsInlineMediaPlayback = allowsInlineMediaPlayback.asInstanceOf[js.Any], allowsPictureInPictureMediaPlayback = allowsPictureInPictureMediaPlayback.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], mediaTypesRequiringUserActionForPlayback = mediaTypesRequiringUserActionForPlayback.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], processPool = processPool.asInstanceOf[js.Any], selectionGranularity = selectionGranularity.asInstanceOf[js.Any], suppressesIncrementalRendering = suppressesIncrementalRendering.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAllowsAirPlayMediaPlayback")(getAllowsAirPlayMediaPlayback.toJsFn)
    __obj.updateDynamic("getAllowsInlineMediaPlayback")(getAllowsInlineMediaPlayback.toJsFn)
    __obj.updateDynamic("getAllowsPictureInPictureMediaPlayback")(getAllowsPictureInPictureMediaPlayback.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getMediaTypesRequiringUserActionForPlayback")(getMediaTypesRequiringUserActionForPlayback.toJsFn)
    __obj.updateDynamic("getPreferences")(getPreferences.toJsFn)
    __obj.updateDynamic("getProcessPool")(getProcessPool.toJsFn)
    __obj.updateDynamic("getSelectionGranularity")(getSelectionGranularity.toJsFn)
    __obj.updateDynamic("getSuppressesIncrementalRendering")(getSuppressesIncrementalRendering.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAllowsAirPlayMediaPlayback")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowsAirPlayMediaPlayback(t0).runNow()))
    __obj.updateDynamic("setAllowsInlineMediaPlayback")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowsInlineMediaPlayback(t0).runNow()))
    __obj.updateDynamic("setAllowsPictureInPictureMediaPlayback")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowsPictureInPictureMediaPlayback(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setMediaTypesRequiringUserActionForPlayback")(js.Any.fromFunction1((t0: scala.Double) => setMediaTypesRequiringUserActionForPlayback(t0).runNow()))
    __obj.updateDynamic("setPreferences")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.WebViewPreferencesObject) => setPreferences(t0).runNow()))
    __obj.updateDynamic("setProcessPool")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.iOS.WebViewProcessPool) => setProcessPool(t0).runNow()))
    __obj.updateDynamic("setSelectionGranularity")(js.Any.fromFunction1((t0: scala.Double) => setSelectionGranularity(t0).runNow()))
    __obj.updateDynamic("setSuppressesIncrementalRendering")(js.Any.fromFunction1((t0: scala.Boolean) => setSuppressesIncrementalRendering(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewConfiguration]
  }
}

