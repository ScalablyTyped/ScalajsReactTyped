package typingsJapgolly.titanium.Titanium.Android

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Blob
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Message objects passed between Android application components.
		 */
trait Intent extends Proxy {
  /**
  			 * The action associated with this intent.
  			 */
  var action: String
  /**
  			 * The Java class name of the activity associated with this intent
  			 * ([packageName](Titanium.Android.Intent.packageName) must also be set).
  			 */
  var className: String
  /**
  			 * The Intent's Data URI.
  			 */
  val data: String
  /**
  			 * Intent flags.
  			 */
  var flags: Double
  /**
  			 * The fully-qualified Java package name of the activity.
  			 */
  var packageName: String
  /**
  			 * The MIME type for this Intent.
  			 */
  val `type`: String
  /**
  			 * The URL to a Titanium JavaScript Activity.
  			 */
  var url: String
  /**
  			 * Adds a category to this Intent.
  			 */
  def addCategory(name: String): Unit
  /**
  			 * Adds to the existing flags on the `Intent`.
  			 */
  def addFlags(flags: Double): Unit
  /**
  			 * Gets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def getAction(): String
  /**
  			 * Get a <Titanium.Blob> property from this `Intent`.
  			 */
  def getBlobExtra(name: String): Blob
  /**
  			 * Get a boolean property from this Intent.
  			 */
  def getBooleanExtra(name: String, defaultValue: Boolean): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def getClassName(): String
  /**
  			 * Get the Data URI from this `Intent`.
  			 */
  def getData(): String
  /**
  			 * Get a double property from this `Intent`.
  			 */
  def getDoubleExtra(name: String, defaultValue: Double): Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def getFlags(): Double
  /**
  			 * Get an integer property from this `Intent`.
  			 */
  def getIntExtra(name: String, defaultValue: Double): Double
  /**
  			 * Get a long property from this `Intent`.
  			 */
  def getLongExtra(name: String, defaultValue: Double): Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def getPackageName(): String
  /**
  			 * Get a string property from this `Intent`.
  			 */
  def getStringExtra(name: String): String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.type> property.
  			 */
  def getType(): String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Returns `true` if this `Intent` has the specified property.
  			 */
  def hasExtra(name: String): Boolean
  /**
  			 * Puts an extra property on this `Intent`.
  			 */
  def putExtra(name: String, value: js.Any): Unit
  /**
  			 * Put a URI property on this `Intent` (useful for <Titanium.Android.EXTRA_STREAM>).
  			 */
  def putExtraUri(name: String, value: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def setAction(action: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def setClassName(className: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def setFlags(flags: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def setPackageName(packageName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def setUrl(url: String): Unit
}

object Intent {
  @scala.inline
  def apply(
    action: String,
    addCategory: String => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addFlags: Double => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    className: String,
    data: String,
    fireEvent: (String, js.Any) => Callback,
    flags: Double,
    getAction: CallbackTo[String],
    getApiName: CallbackTo[String],
    getBlobExtra: String => CallbackTo[Blob],
    getBooleanExtra: (String, Boolean) => CallbackTo[Boolean],
    getBubbleParent: CallbackTo[Boolean],
    getClassName: CallbackTo[String],
    getData: CallbackTo[String],
    getDoubleExtra: (String, Double) => CallbackTo[Double],
    getFlags: CallbackTo[Double],
    getIntExtra: (String, Double) => CallbackTo[Double],
    getLongExtra: (String, Double) => CallbackTo[Double],
    getPackageName: CallbackTo[String],
    getStringExtra: String => CallbackTo[String],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    hasExtra: String => CallbackTo[Boolean],
    packageName: String,
    putExtra: (String, js.Any) => Callback,
    putExtraUri: (String, js.Any) => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAction: String => Callback,
    setBubbleParent: Boolean => Callback,
    setClassName: String => Callback,
    setFlags: Double => Callback,
    setPackageName: String => Callback,
    setUrl: String => Callback,
    `type`: String,
    url: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Intent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("addCategory")(js.Any.fromFunction1((t0: java.lang.String) => addCategory(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addFlags")(js.Any.fromFunction1((t0: scala.Double) => addFlags(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAction")(getAction.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBlobExtra")(js.Any.fromFunction1((t0: java.lang.String) => getBlobExtra(t0).runNow()))
    __obj.updateDynamic("getBooleanExtra")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => getBooleanExtra(t0, t1).runNow()))
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getClassName")(getClassName.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getDoubleExtra")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getDoubleExtra(t0, t1).runNow()))
    __obj.updateDynamic("getFlags")(getFlags.toJsFn)
    __obj.updateDynamic("getIntExtra")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getIntExtra(t0, t1).runNow()))
    __obj.updateDynamic("getLongExtra")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getLongExtra(t0, t1).runNow()))
    __obj.updateDynamic("getPackageName")(getPackageName.toJsFn)
    __obj.updateDynamic("getStringExtra")(js.Any.fromFunction1((t0: java.lang.String) => getStringExtra(t0).runNow()))
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("hasExtra")(js.Any.fromFunction1((t0: java.lang.String) => hasExtra(t0).runNow()))
    __obj.updateDynamic("putExtra")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => putExtra(t0, t1).runNow()))
    __obj.updateDynamic("putExtraUri")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => putExtraUri(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: java.lang.String) => setAction(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setClassName")(js.Any.fromFunction1((t0: java.lang.String) => setClassName(t0).runNow()))
    __obj.updateDynamic("setFlags")(js.Any.fromFunction1((t0: scala.Double) => setFlags(t0).runNow()))
    __obj.updateDynamic("setPackageName")(js.Any.fromFunction1((t0: java.lang.String) => setPackageName(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
}

