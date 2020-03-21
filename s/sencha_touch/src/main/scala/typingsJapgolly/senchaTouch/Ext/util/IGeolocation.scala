package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeolocation extends IEvented {
  /** [Property] (Number) */
  var accuracy: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Number) */
  var altitude: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of allowHighAccuracy
  		* @returns Boolean
  		*/
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoUpdate
  		* @returns Boolean
  		*/
  var getAutoUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of frequency
  		* @returns Number
  		*/
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maximumAge
  		* @returns Number
  		*/
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Property] (Number) */
  var heading: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var latitude: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var longitude: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of allowHighAccuracy
  		* @param allowHighAccuracy Boolean The new value.
  		*/
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoUpdate
  		* @param autoUpdate Boolean The new value.
  		*/
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of frequency
  		* @param frequency Number The new value.
  		*/
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maximumAge
  		* @param maximumAge Number The new value.
  		*/
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Property] (Number) */
  var speed: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Property] (Date) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
  		* @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		*/
  var updateLocation: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IGeolocation {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    allowHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    autoUpdate: js.UndefOr[Boolean] = js.undefined,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    frequency: Int | Double = null,
    getAllowHighAccuracy: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoUpdate: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFrequency: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaximumAge: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    heading: Int | Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    latitude: Int | Double = null,
    listeners: js.Any = null,
    longitude: Int | Double = null,
    maximumAge: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.mixin.IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setAllowHighAccuracy: /* allowHighAccuracy */ js.UndefOr[Boolean] => Callback = null,
    setAutoUpdate: /* autoUpdate */ js.UndefOr[Boolean] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setFrequency: /* frequency */ js.UndefOr[Double] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMaximumAge: /* maximumAge */ js.UndefOr[Double] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    timeout: Int | Double = null,
    timestamp: js.Any = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    updateLocation: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IGeolocation = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHighAccuracy)) __obj.updateDynamic("allowHighAccuracy")(allowHighAccuracy.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    getAllowHighAccuracy.foreach(p => __obj.updateDynamic("getAllowHighAccuracy")(p.toJsFn))
    getAutoUpdate.foreach(p => __obj.updateDynamic("getAutoUpdate")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getFrequency.foreach(p => __obj.updateDynamic("getFrequency")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMaximumAge.foreach(p => __obj.updateDynamic("getMaximumAge")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowHighAccuracy != null) __obj.updateDynamic("setAllowHighAccuracy")(js.Any.fromFunction1((t0: /* allowHighAccuracy */ js.UndefOr[scala.Boolean]) => setAllowHighAccuracy(t0).runNow()))
    if (setAutoUpdate != null) __obj.updateDynamic("setAutoUpdate")(js.Any.fromFunction1((t0: /* autoUpdate */ js.UndefOr[scala.Boolean]) => setAutoUpdate(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setFrequency != null) __obj.updateDynamic("setFrequency")(js.Any.fromFunction1((t0: /* frequency */ js.UndefOr[scala.Double]) => setFrequency(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMaximumAge != null) __obj.updateDynamic("setMaximumAge")(js.Any.fromFunction1((t0: /* maximumAge */ js.UndefOr[scala.Double]) => setMaximumAge(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (updateLocation != null) __obj.updateDynamic("updateLocation")(js.Any.fromFunction2((t0: /* callback */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => updateLocation(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeolocation]
  }
}

