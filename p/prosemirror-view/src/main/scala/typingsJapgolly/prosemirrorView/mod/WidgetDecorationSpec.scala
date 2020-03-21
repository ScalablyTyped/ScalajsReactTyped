package typingsJapgolly.prosemirrorView.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prosemirrorModel.mod.Mark
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetDecorationSpec extends js.Object {
  /**
    * When comparing decorations of this type (in order to decide
    * whether it needs to be redrawn), ProseMirror will by default
    * compare the widget DOM node by identity. If you pass a key,
    * that key will be compared instead, which can be useful when
    * you generate decorations on the fly and don't want to store
    * and reuse DOM nodes. Make sure that any widgets with the same
    * key are interchangeable—if widgets differ in, for example,
    * the behavior of some event handler, they should get
    * different keys.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  /**
    * The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[Mark[_]] | Null] = js.undefined
  /**
    * Controls which side of the document position this widget is
    * associated with. When negative, it is drawn before a cursor
    * at its position, and content inserted at that position ends
    * up after the widget. When zero (the default) or positive, the
    * widget is drawn after the cursor and content inserted there
    * ends up before the widget.
    *
    * When there are multiple widgets at a given position, their
    * `side` values determine the order in which they appear. Those
    * with lower values appear first. The ordering of widgets with
    * the same `side` value is unspecified.
    *
    * When `marks` is null, `side` also determines the marks that
    * the widget is wrapped in—those of the node before when
    * negative, those of the node after when positive.
    */
  var side: js.UndefOr[Double | Null] = js.undefined
  /**
    * Can be used to control which DOM events, when they bubble out
    * of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event_, Boolean]) | Null] = js.undefined
}

object WidgetDecorationSpec {
  @scala.inline
  def apply(
    key: String = null,
    marks: js.Array[Mark[_]] = null,
    side: Int | Double = null,
    stopEvent: /* event */ Event_ => CallbackTo[Boolean] = null
  ): WidgetDecorationSpec = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => stopEvent(t0).runNow()))
    __obj.asInstanceOf[WidgetDecorationSpec]
  }
}

