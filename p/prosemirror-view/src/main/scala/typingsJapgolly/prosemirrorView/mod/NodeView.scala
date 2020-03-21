package typingsJapgolly.prosemirrorView.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MutationRecord
import org.scalajs.dom.raw.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorView.AnonTarget
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeView[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * The DOM node that should hold the node's content. Only meaningful
    * if the node view also defines a `dom` property and if its node
    * type is not a leaf node type. When this is present, ProseMirror
    * will take care of rendering the node's children into it. When it
    * is not present, the node view itself is responsible for rendering
    * (or deciding not to render) its child nodes.
    */
  var contentDOM: js.UndefOr[Node | Null] = js.undefined
  /**
    * When defining a `selectNode` method, you should also provide a
    * `deselectNode` method to remove the effect again.
    */
  var deselectNode: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * Called when the node view is removed from the editor or the whole
    * editor is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * The outer DOM node that represents the document node. When not
    * given, the default strategy is used to create a DOM node.
    */
  var dom: js.UndefOr[Node | Null] = js.undefined
  /**
    * Called when a DOM
    * [mutation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
    * or a selection change happens within the view. When the change is
    * a selection change, the record will have a `type` property of
    * `"selection"` (which doesn't occur for native mutation records).
    * Return false if the editor should re-read the selection or
    * re-parse the range around the mutation, true if it can safely be
    * ignored.
    */
  var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord | AnonTarget, Boolean]) | Null] = js.undefined
  /**
    * Can be used to override the way the node's selected status (as a
    * node selection) is displayed.
    */
  var selectNode: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * This will be called to handle setting the selection inside the
    * node. The `anchor` and `head` positions are relative to the start
    * of the node. By default, a DOM selection will be created between
    * the DOM positions corresponding to those positions, but if you
    * override it you can do something else.
    */
  var setSelection: js.UndefOr[
    (js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document_, Unit]) | Null
  ] = js.undefined
  /**
    * Can be used to prevent the editor view from trying to handle some
    * or all DOM events that bubble up from the node view. Events for
    * which this returns true are not handled by the editor.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event_, Boolean]) | Null] = js.undefined
  /**
    * When given, this will be called when the view is updating itself.
    * It will be given a node (possibly of a different type), and an
    * array of active decorations (which are automatically drawn, and
    * the node view may ignore if it isn't interested in them), and
    * should return true if it was able to update to that node, and
    * false otherwise. If the node view has a `contentDOM` property (or
    * no `dom` property), updating its child nodes will be handled by
    * ProseMirror.
    */
  var update: js.UndefOr[
    (js.Function2[
      /* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], 
      /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
      Boolean
    ]) | Null
  ] = js.undefined
}

object NodeView {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    contentDOM: Node = null,
    deselectNode: js.UndefOr[Callback] = js.undefined,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: Node = null,
    ignoreMutation: /* p */ MutationRecord | AnonTarget => CallbackTo[Boolean] = null,
    selectNode: js.UndefOr[Callback] = js.undefined,
    setSelection: (/* anchor */ Double, /* head */ Double, /* root */ Document_) => Callback = null,
    stopEvent: /* event */ Event_ => CallbackTo[Boolean] = null,
    update: (/* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[js.Any]]]) => CallbackTo[Boolean] = null
  ): NodeView[S] = {
    val __obj = js.Dynamic.literal()
    if (contentDOM != null) __obj.updateDynamic("contentDOM")(contentDOM.asInstanceOf[js.Any])
    deselectNode.foreach(p => __obj.updateDynamic("deselectNode")(p.toJsFn))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (ignoreMutation != null) __obj.updateDynamic("ignoreMutation")(js.Any.fromFunction1((t0: /* p */ org.scalajs.dom.raw.MutationRecord | typingsJapgolly.prosemirrorView.AnonTarget) => ignoreMutation(t0).runNow()))
    selectNode.foreach(p => __obj.updateDynamic("selectNode")(p.toJsFn))
    if (setSelection != null) __obj.updateDynamic("setSelection")(js.Any.fromFunction3((t0: /* anchor */ scala.Double, t1: /* head */ scala.Double, t2: /* root */ typingsJapgolly.std.Document_) => setSelection(t0, t1, t2).runNow()))
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => stopEvent(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], t1: /* decorations */ js.Array[
  typingsJapgolly.prosemirrorView.mod.Decoration[org.scalablytyped.runtime.StringDictionary[js.Any]]]) => update(t0, t1).runNow()))
    __obj.asInstanceOf[NodeView[S]]
  }
}

