package typingsJapgolly.senchaTouch.Ext.event

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends IBase
     with IDom {
  /** [Property] (Number) */
  var angle: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var direction: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var duration: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var rotation: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var scale: js.UndefOr[Double] = js.undefined
  /** [Method] Stop the event preventDefault and stopPropagation
  		* @returns Ext.event.Event this
  		*/
  var stopEvent: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Cancels bubbling of the event
  		* @returns Ext.event.Event this
  		*/
  var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    angle: Int | Double = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    direction: Int | Double = null,
    distance: Int | Double = null,
    duration: Int | Double = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getPageX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPageY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTarget: (/* selector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    getTime: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    platformConfig: js.Any = null,
    preventDefault: js.UndefOr[Callback] = js.undefined,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopEvent: js.UndefOr[CallbackTo[IEvent]] = js.undefined,
    stopPropagation: js.UndefOr[CallbackTo[IEvent]] = js.undefined,
    target: HTMLElement = null,
    uses: Array = null
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getPageX.foreach(p => __obj.updateDynamic("getPageX")(p.toJsFn))
    getPageY.foreach(p => __obj.updateDynamic("getPageY")(p.toJsFn))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => getTarget(t0, t1, t2).runNow()))
    getTime.foreach(p => __obj.updateDynamic("getTime")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    preventDefault.foreach(p => __obj.updateDynamic("preventDefault")(p.toJsFn))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    stopEvent.foreach(p => __obj.updateDynamic("stopEvent")(p.toJsFn))
    stopPropagation.foreach(p => __obj.updateDynamic("stopPropagation")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

