package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.core.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderable extends IBase {
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Ensures that this component is attached to document body
  		* @param runLayout Boolean True to run the component's layout.
  		*/
  var ensureAttachedToBody: js.UndefOr[js.Function1[/* runLayout */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
  		* @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
  		* @returns HTMLElement DOM element that you can use in the insertBefore
  		*/
  var getInsertPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], HTMLElement]] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  var initRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created
  		* @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
  		* @param containerIdx Number The index within the parent Container's child collection of this Component.
  		*/
  var onRender: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[IElement], /* containerIdx */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Renders the Component into the passed HTML element
  		* @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
  		* @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
  		*/
  var render: js.UndefOr[
    js.Function2[/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IRenderable {
  @scala.inline
  def apply(
    afterRender: js.UndefOr[Callback] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    doAutoRender: js.UndefOr[Callback] = js.undefined,
    ensureAttachedToBody: /* runLayout */ js.UndefOr[Boolean] => Callback = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInsertPosition: /* position */ js.UndefOr[js.Any] => CallbackTo[HTMLElement] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IRenderable] = null,
    initRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    mixins: js.Any = null,
    onRender: (/* parentNode */ js.UndefOr[IElement], /* containerIdx */ js.UndefOr[Double]) => Callback = null,
    render: (/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRenderable = {
    val __obj = js.Dynamic.literal()
    afterRender.foreach(p => __obj.updateDynamic("afterRender")(p.toJsFn))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    doAutoRender.foreach(p => __obj.updateDynamic("doAutoRender")(p.toJsFn))
    if (ensureAttachedToBody != null) __obj.updateDynamic("ensureAttachedToBody")(js.Any.fromFunction1((t0: /* runLayout */ js.UndefOr[scala.Boolean]) => ensureAttachedToBody(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getInsertPosition != null) __obj.updateDynamic("getInsertPosition")(js.Any.fromFunction1((t0: /* position */ js.UndefOr[js.Any]) => getInsertPosition(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initRenderData.foreach(p => __obj.updateDynamic("initRenderData")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2((t0: /* parentNode */ js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], t1: /* containerIdx */ js.UndefOr[scala.Double]) => onRender(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* container */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[js.Any]) => render(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderable]
  }
}

