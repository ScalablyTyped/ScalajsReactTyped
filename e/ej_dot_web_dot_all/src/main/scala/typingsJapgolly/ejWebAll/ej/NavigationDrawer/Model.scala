package typingsJapgolly.ejWebAll.ej.NavigationDrawer

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Event triggers after the AJAX content loaded completely.
    */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.undefined
  /** Event triggers when the AJAX request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the NavigationDrawer control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Event triggers after the AJAX content loaded successfully.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
  /** Event triggers before the control gets closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** Specifies the contentId for navigation drawer, where the AJAX content need to updated
    * @Default {null}
    */
  var contentId: js.UndefOr[String] = js.undefined
  /** Sets the root class for NavigationDrawer theme. This cssClass API helps to use custom skinning option for NavigationDrawer control. By defining the root class using this API, we
    * need to include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the Direction for the control. See Direction
    * @Default {left}
    */
  var direction: js.UndefOr[Direction | String] = js.undefined
  /** Sets the listview to be enabled or not
    * @Default {false}
    */
  var enableListView: js.UndefOr[Boolean] = js.undefined
  /** Navigation pane opened initially when isPaneOpen property is true.
    * @Default {false}
    */
  var isPaneOpen: js.UndefOr[Boolean] = js.undefined
  /** Specifies the listview items as an array of object.
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets all the properties of listview to render in navigation drawer
    */
  var listViewSettings: js.UndefOr[js.Any] = js.undefined
  /** Event triggers when the control open.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Specifies position whether it is in fixed or relative to the page. See Position
    * @Default {normal}
    */
  var position: js.UndefOr[String] = js.undefined
  /** Event triggers when the Swipe happens.
    */
  var swipe: js.UndefOr[js.Function1[/* e */ SwipeEventArgs, Unit]] = js.undefined
  /** Specifies the targetId for navigation drawer
    */
  var targetId: js.UndefOr[String] = js.undefined
  /** Sets the rendering type of the control. See Type
    * @Default {overlay}
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Specifies the width of the control
    * @Default {auto}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxComplete: /* e */ AjaxCompleteEventArgs => Callback = null,
    ajaxError: /* e */ AjaxErrorEventArgs => Callback = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => Callback = null,
    beforeClose: /* e */ BeforeCloseEventArgs => Callback = null,
    contentId: String = null,
    cssClass: String = null,
    direction: Direction | String = null,
    enableListView: js.UndefOr[Boolean] = js.undefined,
    isPaneOpen: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[_] = null,
    listViewSettings: js.Any = null,
    open: /* e */ OpenEventArgs => Callback = null,
    position: String = null,
    swipe: /* e */ SwipeEventArgs => Callback = null,
    targetId: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxComplete != null) __obj.updateDynamic("ajaxComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.AjaxCompleteEventArgs) => ajaxComplete(t0).runNow()))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.AjaxErrorEventArgs) => ajaxError(t0).runNow()))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.AjaxSuccessEventArgs) => ajaxSuccess(t0).runNow()))
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.BeforeCloseEventArgs) => beforeClose(t0).runNow()))
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enableListView)) __obj.updateDynamic("enableListView")(enableListView.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaneOpen)) __obj.updateDynamic("isPaneOpen")(isPaneOpen.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (listViewSettings != null) __obj.updateDynamic("listViewSettings")(listViewSettings.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.OpenEventArgs) => open(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.NavigationDrawer.SwipeEventArgs) => swipe(t0).runNow()))
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

