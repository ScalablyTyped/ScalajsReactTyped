package typingsJapgolly.jqueryFancytree.Fancytree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The `this` context of any event function is set to tree's the HTMLDivElement  */
trait FancytreeEvents extends js.Object {
  /** 'data.node' was deactivated. */
  var activate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Return false to prevent default processing */
  var beforeActivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** Return `false` to prevent default processing */
  var beforeExpand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** Return `false` to prevent default processing */
  var beforeSelect: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** `data.node` lost keyboard focus */
  var blur: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.tree` lost keyboard focus */
  var blurTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` was clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. activating, etc. */
  var click: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** `data.node` was collapsed */
  var collapse: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Widget was created (called only once, even if re-initialized). */
  var create: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Allow tweaking and binding, after node was created for the first time (NOTE: this event is only available as callback, but not for bind()) */
  var createNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` was double-clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. expanding, etc. */
  var dblclick: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** `data.node` was deactivated */
  var deactivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` was expanded */
  var expand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` received keyboard focus */
  var focus: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /**`data.tree` received keyboard focus */
  var focusTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Widget was (re-)initialized. */
  var init: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` received key. `event.which` contains the key. Return `false` to prevent default processing, i.e. navigation. Call `data.result = "preventNav";` to prevent navigation but still allow default handling inside embedded input controls. */
  var keydown: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** (currently unused) */
  var keypress: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` is a lazy node that is expanded for the first time. The new child data must be returned in the `data.result` property (see `source` option for available formats). */
  var lazyLoad: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Node data was loaded, i.e. `node.nodeLoadChildren()` finished */
  var loadChildren: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** A load error occured. Return `false` to prevent default processing. */
  var loadError: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.undefined
  /** Allows to modify the ajax response. */
  var postProcess: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** `data.node` was removed (NOTE: this event is only available as callback, but not for bind()) */
  var removeNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** (used by table extension) */
  var renderColumns: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Allow tweaking after node state was rendered (NOTE: this event is only available as callback, but not for bind()) */
  var renderNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Allow replacing the `<span class='fancytree-title'>` markup (NOTE: this event is only available as callback, but not for bind()) */
  var renderTitle: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** ext-persist has expanded, selected, and activated the previous state */
  var restore: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
  /** Enable RTL version, default is false */
  var rtl: js.UndefOr[Boolean] = js.undefined
  /** `data.node` was selected */
  var select: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.undefined
}

object FancytreeEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    beforeActivate: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    beforeExpand: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    beforeSelect: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    blur: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    blurTree: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    click: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    collapse: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    create: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    createNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    dblclick: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    deactivate: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    expand: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    focus: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    focusTree: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    init: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    keydown: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    keypress: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    lazyLoad: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    loadChildren: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    loadError: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    postProcess: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    removeNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderColumns: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderTitle: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    restore: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    select: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null
  ): FancytreeEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => activate(t0, t1).runNow()))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeActivate(t0, t1).runNow()))
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeExpand(t0, t1).runNow()))
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeSelect(t0, t1).runNow()))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => blur(t0, t1).runNow()))
    if (blurTree != null) __obj.updateDynamic("blurTree")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => blurTree(t0, t1).runNow()))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => click(t0, t1).runNow()))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => collapse(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => create(t0, t1).runNow()))
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => createNode(t0, t1).runNow()))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => dblclick(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => deactivate(t0, t1).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => expand(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => focus(t0, t1).runNow()))
    if (focusTree != null) __obj.updateDynamic("focusTree")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => focusTree(t0, t1).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => init(t0, t1).runNow()))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => keydown(t0, t1).runNow()))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => keypress(t0, t1).runNow()))
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => lazyLoad(t0, t1).runNow()))
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => loadChildren(t0, t1).runNow()))
    if (loadError != null) __obj.updateDynamic("loadError")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => loadError(t0, t1).runNow()))
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => postProcess(t0, t1).runNow()))
    if (removeNode != null) __obj.updateDynamic("removeNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => removeNode(t0, t1).runNow()))
    if (renderColumns != null) __obj.updateDynamic("renderColumns")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderColumns(t0, t1).runNow()))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderNode(t0, t1).runNow()))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderTitle(t0, t1).runNow()))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => restore(t0, t1).runNow()))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => select(t0, t1).runNow()))
    __obj.asInstanceOf[FancytreeEvents]
  }
}

