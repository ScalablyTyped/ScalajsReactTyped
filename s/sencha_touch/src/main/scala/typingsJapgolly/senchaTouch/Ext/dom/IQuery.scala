package typingsJapgolly.senchaTouch.Ext.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuery extends IBase {
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/Array An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  var is: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.undefined
  /** [Method] Selects a group of elements
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  var selectNode: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], HTMLElement]
  ] = js.undefined
}

object IQuery {
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
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    is: (/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    select: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    selectNode: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => CallbackTo[HTMLElement] = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IQuery = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* selector */ js.UndefOr[java.lang.String]) => is(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[js.Any]) => select(t0, t1).runNow()))
    if (selectNode != null) __obj.updateDynamic("selectNode")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[js.Any]) => selectNode(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuery]
  }
}

