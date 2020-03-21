package typingsJapgolly.titanium.Titanium.Android

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
		 */
trait RemoteViews extends Proxy {
  /**
  			 * Android layout resource ID for the view to display. Required.
  			 */
  var layoutId: Double
  /**
  			 * Package name that the resource ID lives in. Optional.
  			 */
  var packageName: String
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def getLayoutId(): Double
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def getPackageName(): String
  /**
  			 * Calls a method taking a single `boolean` argument on a view in the remote view
  			 * hierarchy.  See Android's documentation for
  			 * [setBoolean](https://developer.android.com/reference/android/widget/RemoteViews.html#setBoolean(int, java.lang.String, boolean)).
  			 */
  def setBoolean(viewId: Double, methodName: String, value: Boolean): Unit
  /**
  			 * Sets the base time, format string, and started flag for a chronometer
  			 * in the remote view hierarchy.
  			 */
  def setChronometer(viewId: Double, base: js.Date, format: String, started: Boolean): Unit
  /**
  			 * Calls a method taking a single `double` argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setDouble(viewId: Double, methodName: String, value: Double): Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using an Android drawable resource.
  			 */
  def setImageViewResource(viewId: Double, srcId: Double): Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using a URI.
  			 */
  def setImageViewUri(viewId: Double, uri: String): Unit
  /**
  			 * Calls a method taking a single `int` argument on a view in the remote view hierarchy.
  			 */
  def setInt(viewId: Double, methodName: String, value: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def setLayoutId(layoutId: Double): Unit
  /**
  			 * Launches a <Titanium.Android.PendingIntent> when the specified view is clicked.
  			 */
  def setOnClickPendingIntent(viewId: Double, pendingIntent: PendingIntent): Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def setPackageName(packageName: String): Unit
  /**
  			 * Sets the progress, max value, and indeterminate flag of a progress bar in the
  			 * remote view hierarchy.
  			 */
  def setProgressBar(viewId: Double, max: Double, progress: Double, indeterminate: Boolean): Unit
  /**
  			 * Calls a method taking a single String argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setString(viewId: Double, methodName: String, value: String): Unit
  /**
  			 * Sets the text color of a view in the remote view hierarchy.
  			 */
  def setTextColor(viewId: Double, color: Double): Unit
  /**
  			 * Sets the text of a text view in the remote view hierarchy.
  			 */
  def setTextViewText(viewId: Double, text: String): Unit
  /**
  			 * Calls a method taking one URI on a view in the remote view hierarchy.
  			 */
  def setUri(viewId: Double, methodName: String, value: String): Unit
  /**
  			 * Sets the visibility of a view in the remote view hierarchy.
  			 */
  def setViewVisibility(viewId: Double, visibility: Double): Unit
}

object RemoteViews {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getLayoutId: CallbackTo[Double],
    getPackageName: CallbackTo[String],
    layoutId: Double,
    packageName: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBoolean: (Double, String, Boolean) => Callback,
    setBubbleParent: Boolean => Callback,
    setChronometer: (Double, js.Date, String, Boolean) => Callback,
    setDouble: (Double, String, Double) => Callback,
    setImageViewResource: (Double, Double) => Callback,
    setImageViewUri: (Double, String) => Callback,
    setInt: (Double, String, Double) => Callback,
    setLayoutId: Double => Callback,
    setOnClickPendingIntent: (Double, PendingIntent) => Callback,
    setPackageName: String => Callback,
    setProgressBar: (Double, Double, Double, Boolean) => Callback,
    setString: (Double, String, String) => Callback,
    setTextColor: (Double, Double) => Callback,
    setTextViewText: (Double, String) => Callback,
    setUri: (Double, String, String) => Callback,
    setViewVisibility: (Double, Double) => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RemoteViews = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getLayoutId")(getLayoutId.toJsFn)
    __obj.updateDynamic("getPackageName")(getPackageName.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBoolean")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Boolean) => setBoolean(t0, t1, t2).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setChronometer")(js.Any.fromFunction4((t0: scala.Double, t1: js.Date, t2: java.lang.String, t3: scala.Boolean) => setChronometer(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setDouble")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => setDouble(t0, t1, t2).runNow()))
    __obj.updateDynamic("setImageViewResource")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setImageViewResource(t0, t1).runNow()))
    __obj.updateDynamic("setImageViewUri")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => setImageViewUri(t0, t1).runNow()))
    __obj.updateDynamic("setInt")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => setInt(t0, t1, t2).runNow()))
    __obj.updateDynamic("setLayoutId")(js.Any.fromFunction1((t0: scala.Double) => setLayoutId(t0).runNow()))
    __obj.updateDynamic("setOnClickPendingIntent")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.titanium.Titanium.Android.PendingIntent) => setOnClickPendingIntent(t0, t1).runNow()))
    __obj.updateDynamic("setPackageName")(js.Any.fromFunction1((t0: java.lang.String) => setPackageName(t0).runNow()))
    __obj.updateDynamic("setProgressBar")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => setProgressBar(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setString")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => setString(t0, t1, t2).runNow()))
    __obj.updateDynamic("setTextColor")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setTextColor(t0, t1).runNow()))
    __obj.updateDynamic("setTextViewText")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => setTextViewText(t0, t1).runNow()))
    __obj.updateDynamic("setUri")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => setUri(t0, t1, t2).runNow()))
    __obj.updateDynamic("setViewVisibility")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setViewVisibility(t0, t1).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteViews]
  }
}

