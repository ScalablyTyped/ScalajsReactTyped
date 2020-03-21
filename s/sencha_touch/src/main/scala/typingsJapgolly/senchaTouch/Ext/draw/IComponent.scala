package typingsJapgolly.senchaTouch.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent extends IContainer {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of autoSize
  		* @returns Boolean
  		*/
  var getAutoSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of fitSurface
  		* @returns Boolean
  		*/
  var getFitSurface: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of gradients
  		* @returns Object[]
  		*/
  var getGradients: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of resizeHandler
  		* @returns Function
  		*/
  var getResizeHandler: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sprites
  		* @returns Object
  		*/
  var getSprites: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param id String
  		* @returns Ext.draw.Surface
  		*/
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], ISurface]] = js.undefined
  /** [Method] Returns the value of viewBox
  		* @returns Boolean
  		*/
  var getViewBox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.undefined
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of autoSize
  		* @param autoSize Boolean The new value.
  		*/
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of fitSurface
  		* @param fitSurface Boolean The new value.
  		*/
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of gradients
  		* @param gradients Object[] The new value.
  		*/
  var setGradients: js.UndefOr[js.Function1[/* gradients */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of resizeHandler
  		* @param resizeHandler Function The new value.
  		*/
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sprites
  		* @param sprites Object The new value.
  		*/
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of viewBox
  		* @param viewBox Boolean The new value.
  		*/
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    fitSurface: js.UndefOr[Boolean] = js.undefined,
    getAutoSize: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBackground: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getFitSurface: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getGradients: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getResizeHandler: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSprites: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSurface: /* id */ js.UndefOr[String] => CallbackTo[ISurface] = null,
    getViewBox: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    gradients: Array = null,
    onPlaceWatermark: js.UndefOr[Callback] = js.undefined,
    renderFrame: js.UndefOr[Callback] = js.undefined,
    resizeHandler: js.Any = null,
    setAutoSize: /* autoSize */ js.UndefOr[Boolean] => Callback = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Callback = null,
    setCls: /* cls */ js.UndefOr[String] => Callback = null,
    setFitSurface: /* fitSurface */ js.UndefOr[Boolean] => Callback = null,
    setGradients: /* gradients */ js.UndefOr[Array] => Callback = null,
    setResizeHandler: /* resizeHandler */ js.UndefOr[js.Any] => Callback = null,
    setSprites: /* sprites */ js.UndefOr[js.Any] => Callback = null,
    setViewBox: /* viewBox */ js.UndefOr[Boolean] => Callback = null,
    viewBox: js.UndefOr[Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fitSurface)) __obj.updateDynamic("fitSurface")(fitSurface.asInstanceOf[js.Any])
    getAutoSize.foreach(p => __obj.updateDynamic("getAutoSize")(p.toJsFn))
    getBackground.foreach(p => __obj.updateDynamic("getBackground")(p.toJsFn))
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getFitSurface.foreach(p => __obj.updateDynamic("getFitSurface")(p.toJsFn))
    getGradients.foreach(p => __obj.updateDynamic("getGradients")(p.toJsFn))
    getResizeHandler.foreach(p => __obj.updateDynamic("getResizeHandler")(p.toJsFn))
    getSprites.foreach(p => __obj.updateDynamic("getSprites")(p.toJsFn))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => getSurface(t0).runNow()))
    getViewBox.foreach(p => __obj.updateDynamic("getViewBox")(p.toJsFn))
    if (gradients != null) __obj.updateDynamic("gradients")(gradients.asInstanceOf[js.Any])
    onPlaceWatermark.foreach(p => __obj.updateDynamic("onPlaceWatermark")(p.toJsFn))
    renderFrame.foreach(p => __obj.updateDynamic("renderFrame")(p.toJsFn))
    if (resizeHandler != null) __obj.updateDynamic("resizeHandler")(resizeHandler.asInstanceOf[js.Any])
    if (setAutoSize != null) __obj.updateDynamic("setAutoSize")(js.Any.fromFunction1((t0: /* autoSize */ js.UndefOr[scala.Boolean]) => setAutoSize(t0).runNow()))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1((t0: /* background */ js.UndefOr[js.Any]) => setBackground(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setFitSurface != null) __obj.updateDynamic("setFitSurface")(js.Any.fromFunction1((t0: /* fitSurface */ js.UndefOr[scala.Boolean]) => setFitSurface(t0).runNow()))
    if (setGradients != null) __obj.updateDynamic("setGradients")(js.Any.fromFunction1((t0: /* gradients */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setGradients(t0).runNow()))
    if (setResizeHandler != null) __obj.updateDynamic("setResizeHandler")(js.Any.fromFunction1((t0: /* resizeHandler */ js.UndefOr[js.Any]) => setResizeHandler(t0).runNow()))
    if (setSprites != null) __obj.updateDynamic("setSprites")(js.Any.fromFunction1((t0: /* sprites */ js.UndefOr[js.Any]) => setSprites(t0).runNow()))
    if (setViewBox != null) __obj.updateDynamic("setViewBox")(js.Any.fromFunction1((t0: /* viewBox */ js.UndefOr[scala.Boolean]) => setViewBox(t0).runNow()))
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

