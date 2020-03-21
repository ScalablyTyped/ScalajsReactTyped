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
		 * Module for notification channels.
		 */
trait NotificationChannel extends Proxy {
  /**
  			 * Whether or not notifications posted to this channel can interrupt the user.
  			 */
  var bypassDnd: Boolean
  /**
  			 * User visible description of this channel.
  			 */
  var description: String
  /**
  			 * Whether notifications posted to this channel should display notification lights
  			 */
  var enableLights: Boolean
  /**
  			 * Whether notification posted to this channel should vibrate.
  			 */
  var enableVibration: Boolean
  /**
  			 * Group id this channel belongs to.
  			 */
  var groupId: String
  /**
  			 * The channel id specified for the notification channel.
  			 */
  var id: String
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var importance: Double
  /**
  			 * The notification light color for notifications posted to this channel.
  			 */
  var lightColor: Double
  /**
  			 * Whether or not notifications posted to this channel are shown on the lockscreen in full or redacted form.
  			 */
  var lockscreenVisibility: Double
  /**
  			 * Whether notifications posted to this channel can appear as application icon badges in a Launcher.
  			 */
  var showBadge: Boolean
  /**
  			 * A URL to the sound to play.
  			 */
  var sound: String
  /**
  			 * The vibration pattern for notifications posted to this channel.
  			 */
  var vibratePattern: js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def getBypassDnd(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def getDescription(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def getEnableLights(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def getEnableVibration(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def getGroupId(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def getImportance(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def getLightColor(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def getLockscreenVisibility(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def getShowBadge(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def getSound(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def getVibratePattern(): js.Array[Double]
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def setBypassDnd(bypassDnd: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def setDescription(description: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def setEnableLights(enableLights: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def setEnableVibration(enableVibration: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def setGroupId(groupId: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def setId(id: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def setImportance(importance: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def setLightColor(lightColor: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def setLockscreenVisibility(lockscreenVisibility: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def setShowBadge(showBadge: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def setSound(sound: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def setVibratePattern(vibratePattern: js.Array[Double]): Unit
}

object NotificationChannel {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    bypassDnd: Boolean,
    description: String,
    enableLights: Boolean,
    enableVibration: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getBypassDnd: CallbackTo[Boolean],
    getDescription: CallbackTo[String],
    getEnableLights: CallbackTo[Boolean],
    getEnableVibration: CallbackTo[Boolean],
    getGroupId: CallbackTo[String],
    getId: CallbackTo[String],
    getImportance: CallbackTo[Double],
    getLightColor: CallbackTo[Double],
    getLockscreenVisibility: CallbackTo[Double],
    getShowBadge: CallbackTo[Boolean],
    getSound: CallbackTo[String],
    getVibratePattern: CallbackTo[js.Array[Double]],
    groupId: String,
    id: String,
    importance: Double,
    lightColor: Double,
    lockscreenVisibility: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setBypassDnd: Boolean => Callback,
    setDescription: String => Callback,
    setEnableLights: Boolean => Callback,
    setEnableVibration: Boolean => Callback,
    setGroupId: String => Callback,
    setId: String => Callback,
    setImportance: Double => Callback,
    setLightColor: Double => Callback,
    setLockscreenVisibility: Double => Callback,
    setShowBadge: Boolean => Callback,
    setSound: String => Callback,
    setVibratePattern: js.Array[Double] => Callback,
    showBadge: Boolean,
    sound: String,
    vibratePattern: js.Array[Double],
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): NotificationChannel = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], bypassDnd = bypassDnd.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableLights = enableLights.asInstanceOf[js.Any], enableVibration = enableVibration.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], lockscreenVisibility = lockscreenVisibility.asInstanceOf[js.Any], showBadge = showBadge.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], vibratePattern = vibratePattern.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getBypassDnd")(getBypassDnd.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getEnableLights")(getEnableLights.toJsFn)
    __obj.updateDynamic("getEnableVibration")(getEnableVibration.toJsFn)
    __obj.updateDynamic("getGroupId")(getGroupId.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getImportance")(getImportance.toJsFn)
    __obj.updateDynamic("getLightColor")(getLightColor.toJsFn)
    __obj.updateDynamic("getLockscreenVisibility")(getLockscreenVisibility.toJsFn)
    __obj.updateDynamic("getShowBadge")(getShowBadge.toJsFn)
    __obj.updateDynamic("getSound")(getSound.toJsFn)
    __obj.updateDynamic("getVibratePattern")(getVibratePattern.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setBypassDnd")(js.Any.fromFunction1((t0: scala.Boolean) => setBypassDnd(t0).runNow()))
    __obj.updateDynamic("setDescription")(js.Any.fromFunction1((t0: java.lang.String) => setDescription(t0).runNow()))
    __obj.updateDynamic("setEnableLights")(js.Any.fromFunction1((t0: scala.Boolean) => setEnableLights(t0).runNow()))
    __obj.updateDynamic("setEnableVibration")(js.Any.fromFunction1((t0: scala.Boolean) => setEnableVibration(t0).runNow()))
    __obj.updateDynamic("setGroupId")(js.Any.fromFunction1((t0: java.lang.String) => setGroupId(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setImportance")(js.Any.fromFunction1((t0: scala.Double) => setImportance(t0).runNow()))
    __obj.updateDynamic("setLightColor")(js.Any.fromFunction1((t0: scala.Double) => setLightColor(t0).runNow()))
    __obj.updateDynamic("setLockscreenVisibility")(js.Any.fromFunction1((t0: scala.Double) => setLockscreenVisibility(t0).runNow()))
    __obj.updateDynamic("setShowBadge")(js.Any.fromFunction1((t0: scala.Boolean) => setShowBadge(t0).runNow()))
    __obj.updateDynamic("setSound")(js.Any.fromFunction1((t0: java.lang.String) => setSound(t0).runNow()))
    __obj.updateDynamic("setVibratePattern")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setVibratePattern(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
}

