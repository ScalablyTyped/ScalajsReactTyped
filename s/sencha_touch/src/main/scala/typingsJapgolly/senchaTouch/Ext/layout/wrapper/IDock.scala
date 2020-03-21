package typingsJapgolly.senchaTouch.Ext.layout.wrapper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDock extends IBase {
  /** [Method] Returns the value of bodyElement
  		* @returns Object
  		*/
  var getBodyElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of container
  		* @returns Object
  		*/
  var getContainer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of innerWrapper
  		* @returns Object
  		*/
  var getInnerWrapper: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sizeState
  		* @returns Boolean
  		*/
  var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of bodyElement
  		* @param bodyElement Object The new value.
  		*/
  var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of container
  		* @param container Object The new value.
  		*/
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of innerWrapper
  		* @param innerWrapper Object The new value.
  		*/
  var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sizeState
  		* @param sizeState Boolean The new value.
  		*/
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IDock {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getBodyElement: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getContainer: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getElement: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInnerWrapper: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSizeState: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setBodyElement: /* bodyElement */ js.UndefOr[js.Any] => Callback = null,
    setContainer: /* container */ js.UndefOr[js.Any] => Callback = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setElement: /* element */ js.UndefOr[js.Any] => Callback = null,
    setInnerWrapper: /* innerWrapper */ js.UndefOr[js.Any] => Callback = null,
    setSizeState: /* sizeState */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDock = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getBodyElement.foreach(p => __obj.updateDynamic("getBodyElement")(p.toJsFn))
    getContainer.foreach(p => __obj.updateDynamic("getContainer")(p.toJsFn))
    getDirection.foreach(p => __obj.updateDynamic("getDirection")(p.toJsFn))
    getElement.foreach(p => __obj.updateDynamic("getElement")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getInnerWrapper.foreach(p => __obj.updateDynamic("getInnerWrapper")(p.toJsFn))
    getSizeState.foreach(p => __obj.updateDynamic("getSizeState")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBodyElement != null) __obj.updateDynamic("setBodyElement")(js.Any.fromFunction1((t0: /* bodyElement */ js.UndefOr[js.Any]) => setBodyElement(t0).runNow()))
    if (setContainer != null) __obj.updateDynamic("setContainer")(js.Any.fromFunction1((t0: /* container */ js.UndefOr[js.Any]) => setContainer(t0).runNow()))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setElement != null) __obj.updateDynamic("setElement")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => setElement(t0).runNow()))
    if (setInnerWrapper != null) __obj.updateDynamic("setInnerWrapper")(js.Any.fromFunction1((t0: /* innerWrapper */ js.UndefOr[js.Any]) => setInnerWrapper(t0).runNow()))
    if (setSizeState != null) __obj.updateDynamic("setSizeState")(js.Any.fromFunction1((t0: /* sizeState */ js.UndefOr[scala.Boolean]) => setSizeState(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDock]
  }
}

