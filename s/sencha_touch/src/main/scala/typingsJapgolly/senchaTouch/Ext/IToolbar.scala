package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolbar extends IContainer {
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an Ext Title component
  		* @returns Ext.Title
  		*/
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.undefined
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Use this to update the title configuration
  		* @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[Boolean] = js.undefined
}

object IToolbar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[ITitle]] = js.undefined,
    hideTitle: js.UndefOr[Callback] = js.undefined,
    minHeight: java.lang.String = null,
    setMinHeight: /* minHeight */ js.UndefOr[java.lang.String] => Callback = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Callback = null,
    showTitle: js.UndefOr[Callback] = js.undefined,
    title: js.Any = null,
    titleCls: js.UndefOr[Boolean] = js.undefined
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    hideTitle.foreach(p => __obj.updateDynamic("hideTitle")(p.toJsFn))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1((t0: /* minHeight */ js.UndefOr[java.lang.String]) => setMinHeight(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[js.Any]) => setTitle(t0).runNow()))
    showTitle.foreach(p => __obj.updateDynamic("showTitle")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleCls)) __obj.updateDynamic("titleCls")(titleCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbar]
  }
}

