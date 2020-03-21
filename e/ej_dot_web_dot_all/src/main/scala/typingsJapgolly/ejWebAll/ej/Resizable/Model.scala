package typingsJapgolly.ejWebAll.ej.Resizable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Sets the offset of the resizing helper relative to the mouse cursor.
    * @Default {{ top: -1, left: -2 }}
    */
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when the widget destroys.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Distance in pixels after mousedown the mouse must move before resizing should start. This option can be used to prevent unwanted drags when clicking on an element.
    * @Default {1}
    */
  var distance: js.UndefOr[Double] = js.undefined
  /** If specified, restricts resize start click to the specified element(s).
    * @Default {null}
    */
  var handle: js.UndefOr[String] = js.undefined
  /** This event is triggered when resized.
    */
  var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, Unit]] = js.undefined
  /** Sets the max height till which an element has to be resized.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** Sets the max width till which an element has to be resized.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** Sets the min Height below which an element cannot be resized.
    * @Default {10}
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** Sets the min Width below which an element cannot be resized.
    * @Default {10}
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** Used to group sets of resizable items.
    * @Default {'default'}
    */
  var scope: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    cursorAt: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    distance: Int | Double = null,
    handle: String = null,
    helper: /* e */ HelperEventArgs => Callback = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    scope: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Resizable.DestroyEventArgs) => destroy(t0).runNow()))
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Resizable.HelperEventArgs) => helper(t0).runNow()))
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

