package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavigationView extends IContainer {
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of defaultBackButtonText
  		* @returns String
  		*/
  var getDefaultBackButtonText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of navigationBar
  		* @returns Boolean/Object
  		*/
  var getNavigationBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the previous item if one exists
  		* @returns Mixed The previous view
  		*/
  var getPreviousItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of useTitleForBackButtonText
  		* @returns Boolean
  		*/
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
  		* @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
  		* @returns Ext.Component The new active item
  		*/
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
  		* @param view Object The view to push.
  		* @returns Ext.Component The new item you just pushed.
  		*/
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Resets the view by removing all items between the first and last item
  		* @returns Ext.Component The view that is now active
  		*/
  var reset: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the value of defaultBackButtonText
  		* @param defaultBackButtonText String The new value.
  		*/
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of navigationBar
  		* @param navigationBar Boolean/Object The new value.
  		*/
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of useTitleForBackButtonText
  		* @param useTitleForBackButtonText Boolean The new value.
  		*/
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.undefined
}

object INavigationView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    defaultBackButtonText: java.lang.String = null,
    getDefaultBackButtonText: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getNavigationBar: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPreviousItem: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUseTitleForBackButtonText: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    navigationBar: js.Any = null,
    pop: /* count */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    push: /* view */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    reset: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    setDefaultBackButtonText: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => Callback = null,
    setNavigationBar: /* navigationBar */ js.UndefOr[js.Any] => Callback = null,
    setUseTitleForBackButtonText: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Callback = null,
    useTitleForBackButtonText: js.UndefOr[Boolean] = js.undefined
  ): INavigationView = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (defaultBackButtonText != null) __obj.updateDynamic("defaultBackButtonText")(defaultBackButtonText.asInstanceOf[js.Any])
    getDefaultBackButtonText.foreach(p => __obj.updateDynamic("getDefaultBackButtonText")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getNavigationBar.foreach(p => __obj.updateDynamic("getNavigationBar")(p.toJsFn))
    getPreviousItem.foreach(p => __obj.updateDynamic("getPreviousItem")(p.toJsFn))
    getUseTitleForBackButtonText.foreach(p => __obj.updateDynamic("getUseTitleForBackButtonText")(p.toJsFn))
    if (navigationBar != null) __obj.updateDynamic("navigationBar")(navigationBar.asInstanceOf[js.Any])
    if (pop != null) __obj.updateDynamic("pop")(js.Any.fromFunction1((t0: /* count */ js.UndefOr[js.Any]) => pop(t0).runNow()))
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* view */ js.UndefOr[js.Any]) => push(t0).runNow()))
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (setDefaultBackButtonText != null) __obj.updateDynamic("setDefaultBackButtonText")(js.Any.fromFunction1((t0: /* defaultBackButtonText */ js.UndefOr[java.lang.String]) => setDefaultBackButtonText(t0).runNow()))
    if (setNavigationBar != null) __obj.updateDynamic("setNavigationBar")(js.Any.fromFunction1((t0: /* navigationBar */ js.UndefOr[js.Any]) => setNavigationBar(t0).runNow()))
    if (setUseTitleForBackButtonText != null) __obj.updateDynamic("setUseTitleForBackButtonText")(js.Any.fromFunction1((t0: /* useTitleForBackButtonText */ js.UndefOr[scala.Boolean]) => setUseTitleForBackButtonText(t0).runNow()))
    if (!js.isUndefined(useTitleForBackButtonText)) __obj.updateDynamic("useTitleForBackButtonText")(useTitleForBackButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavigationView]
  }
}

