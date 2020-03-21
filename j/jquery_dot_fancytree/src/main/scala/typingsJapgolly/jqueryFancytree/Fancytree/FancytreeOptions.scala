package typingsJapgolly.jqueryFancytree.Fancytree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryFancytree.AnonBottom
import typingsJapgolly.jqueryFancytree.AnonCache
import typingsJapgolly.jqueryFancytree.Fancytree.Extensions.DragAndDrop5
import typingsJapgolly.jqueryFancytree.Fancytree.Extensions.Filter
import typingsJapgolly.jqueryFancytree.Fancytree.Extensions.Table
import typingsJapgolly.jqueryFancytree.JQuery
import typingsJapgolly.jqueryFancytree.jqueryFancytreeBooleans.`false`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeNumbers.`0`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeNumbers.`1`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeNumbers.`2`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeNumbers.`3`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeNumbers.`4`
import typingsJapgolly.jqueryFancytree.jqueryFancytreeStrings.dnd5
import typingsJapgolly.jqueryFancytree.jqueryFancytreeStrings.filter
import typingsJapgolly.jqueryFancytree.jqueryFancytreeStrings.table
import typingsJapgolly.jqueryui.JQueryUI.EffectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancytreeOptions
  extends FancytreeEvents
     with /** Options for misc extensions - see docs for typings */
/* extension */ StringDictionary[js.Any] {
  /** Make sure that the active node is always visible, i.e. its parents are expanded (default: true). */
  var activeVisible: js.UndefOr[Boolean] = js.undefined
  /** Default options for ajax requests. */
  var ajax: js.UndefOr[AnonCache] = js.undefined
  /** (default: false) Add WAI-ARIA attributes to markup */
  var aria: js.UndefOr[Boolean] = js.undefined
  /** Activate a node when focused with the keyboard (default: true) */
  var autoActivate: js.UndefOr[Boolean] = js.undefined
  /** Automatically collapse all siblings, when a node is expanded (default: false). */
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
  /** Scroll node into visible area, when focused by keyboard (default: false). */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  /** Display checkboxes to allow selection (default: false) */
  var checkbox: js.UndefOr[
    Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
  ] = js.undefined
  /** Defines what happens, when the user click a folder node. (default: activate_dblclick_expands) */
  var clickFolderMode: js.UndefOr[FancytreeClickFolderMode] = js.undefined
  /** 0..4 (null: use global setting $.ui.fancytree.debugInfo) */
  var debugLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.undefined
  /** callback(node) is called for new nodes without a key. Must return a new unique key. (default null: generates default keys like that: "_" + counter) */
  var defaultKey: js.UndefOr[js.Function1[/* node */ FancytreeNode, String]] = js.undefined
  ////////////////
  // EXTENSIONS //
  ////////////////
  var dnd5: js.UndefOr[DragAndDrop5] = js.undefined
  /** Accept passing ajax data in a property named `d` (default: true). */
  var enableAspx: js.UndefOr[Boolean] = js.undefined
  /** Enable titles (default: false) */
  var enableTitles: js.UndefOr[Boolean] = js.undefined
  /** List of active extensions (default: []) */
  var extensions: js.UndefOr[js.Array[dnd5 | filter | table | String]] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  /** Set focus when node is checked by a mouse click (default: false) */
  var focusOnSelect: js.UndefOr[Boolean] = js.undefined
  /** Add `id="..."` to node markup (default: true). */
  var generateIds: js.UndefOr[Boolean] = js.undefined
  /** Node icon url, if only filename, please use imagePath to set the path */
  var icon: js.UndefOr[Boolean | String] = js.undefined
  /** Prefix (default: "ft_") */
  var idPrefix: js.UndefOr[String] = js.undefined
  /** Path to a folder containing icons (default: null, using 'skin/' subdirectory). */
  var imagePath: js.UndefOr[String] = js.undefined
  /** (default: "/") */
  var keyPathSeparator: js.UndefOr[String] = js.undefined
  /** Support keyboard navigation (default: true). */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /** 2: top-level nodes are not collapsible (default: 1) */
  var minExpandLevel: js.UndefOr[Double] = js.undefined
  /** navigate to next node by typing the first letters (default: false) */
  var quicksearch: js.UndefOr[Boolean] = js.undefined
  /** Right to left mode (default: false) */
  @JSName("rtl")
  var rtl_FancytreeOptions: js.UndefOr[`false`] = js.undefined
  /** optional margins for node.scrollIntoView() (default: {top: 0, bottom: 0}) */
  var scrollOfs: js.UndefOr[AnonBottom] = js.undefined
  /** scrollable container for node.scrollIntoView() (default: $container) */
  var scrollParent: js.UndefOr[JQuery | Null] = js.undefined
  /** default: multi_hier */
  var selectMode: js.UndefOr[FancytreeSelectMode] = js.undefined
  /** Used to Initialize the tree. */
  var source: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** Translation table */
  var strings: js.UndefOr[TranslationTable] = js.undefined
  /** Add tabindex='0' to container, so tree can be reached using TAB */
  var tabbable: js.UndefOr[Boolean] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  /** Add tabindex='0' to node title span, so it can receive keyboard focus */
  var titlesTabbable: js.UndefOr[Boolean] = js.undefined
  /** Animation options, false:off (default: { effect: "blind", options: {direction: "vertical", scale: "box"}, duration: 200 }) */
  var toggleEffect: js.UndefOr[`false` | EffectOptions] = js.undefined
  /** Tooltips */
  var tooltip: js.UndefOr[Boolean] = js.undefined
  /** (dynamic Option)Prevent (de-)selection using mouse or keyboard. */
  var unselectable: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.undefined
  /** (dynamic Option)Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.undefined
  /** (dynamic Option)Use this as constant selected value (overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.undefined
}

object FancytreeOptions {
  @scala.inline
  def apply(
    StringDictionary: /** Options for misc extensions - see docs for typings */
  /* extension */ StringDictionary[js.Any] = null,
    activate: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    activeVisible: js.UndefOr[Boolean] = js.undefined,
    ajax: AnonCache = null,
    aria: js.UndefOr[Boolean] = js.undefined,
    autoActivate: js.UndefOr[Boolean] = js.undefined,
    autoCollapse: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    beforeActivate: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    beforeExpand: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    beforeSelect: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    blur: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    blurTree: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    checkbox: Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]) = null,
    click: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    clickFolderMode: FancytreeClickFolderMode = null,
    collapse: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    create: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    createNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    dblclick: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    deactivate: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    debugLevel: `0` | `1` | `2` | `3` | `4` = null,
    defaultKey: /* node */ FancytreeNode => CallbackTo[String] = null,
    dnd5: DragAndDrop5 = null,
    enableAspx: js.UndefOr[Boolean] = js.undefined,
    enableTitles: js.UndefOr[Boolean] = js.undefined,
    expand: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    extensions: js.Array[dnd5 | filter | table | String] = null,
    filter: Filter = null,
    focus: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    focusTree: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    generateIds: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | String = null,
    idPrefix: String = null,
    imagePath: String = null,
    init: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    keyPathSeparator: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    keydown: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    keypress: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    lazyLoad: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    loadChildren: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    loadError: (/* event */ JQueryEventObject, /* data */ EventData) => CallbackTo[Boolean] = null,
    minExpandLevel: Int | Double = null,
    postProcess: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    quicksearch: js.UndefOr[Boolean] = js.undefined,
    removeNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderColumns: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderNode: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    renderTitle: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    restore: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    rtl: `false` = null,
    scrollOfs: AnonBottom = null,
    scrollParent: JQuery = null,
    select: (/* event */ JQueryEventObject, /* data */ EventData) => Callback = null,
    selectMode: FancytreeSelectMode = null,
    source: js.Array[_] | js.Any = null,
    strings: TranslationTable = null,
    tabbable: js.UndefOr[Boolean] = js.undefined,
    table: Table = null,
    titlesTabbable: js.UndefOr[Boolean] = js.undefined,
    toggleEffect: `false` | EffectOptions = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    unselectable: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]]) = null,
    unselectableIgnore: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]]) = null,
    unselectableStatus: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]]) = null
  ): FancytreeOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => activate(t0, t1).runNow()))
    if (!js.isUndefined(activeVisible)) __obj.updateDynamic("activeVisible")(activeVisible.asInstanceOf[js.Any])
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(aria)) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (!js.isUndefined(autoActivate)) __obj.updateDynamic("autoActivate")(autoActivate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeActivate(t0, t1).runNow()))
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeExpand(t0, t1).runNow()))
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => beforeSelect(t0, t1).runNow()))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => blur(t0, t1).runNow()))
    if (blurTree != null) __obj.updateDynamic("blurTree")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => blurTree(t0, t1).runNow()))
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => click(t0, t1).runNow()))
    if (clickFolderMode != null) __obj.updateDynamic("clickFolderMode")(clickFolderMode.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => collapse(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => create(t0, t1).runNow()))
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => createNode(t0, t1).runNow()))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => dblclick(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => deactivate(t0, t1).runNow()))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel.asInstanceOf[js.Any])
    if (defaultKey != null) __obj.updateDynamic("defaultKey")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.jqueryFancytree.Fancytree.FancytreeNode) => defaultKey(t0).runNow()))
    if (dnd5 != null) __obj.updateDynamic("dnd5")(dnd5.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAspx)) __obj.updateDynamic("enableAspx")(enableAspx.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTitles)) __obj.updateDynamic("enableTitles")(enableTitles.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => expand(t0, t1).runNow()))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => focus(t0, t1).runNow()))
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect.asInstanceOf[js.Any])
    if (focusTree != null) __obj.updateDynamic("focusTree")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => focusTree(t0, t1).runNow()))
    if (!js.isUndefined(generateIds)) __obj.updateDynamic("generateIds")(generateIds.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (imagePath != null) __obj.updateDynamic("imagePath")(imagePath.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => init(t0, t1).runNow()))
    if (keyPathSeparator != null) __obj.updateDynamic("keyPathSeparator")(keyPathSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => keydown(t0, t1).runNow()))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => keypress(t0, t1).runNow()))
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => lazyLoad(t0, t1).runNow()))
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => loadChildren(t0, t1).runNow()))
    if (loadError != null) __obj.updateDynamic("loadError")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => loadError(t0, t1).runNow()))
    if (minExpandLevel != null) __obj.updateDynamic("minExpandLevel")(minExpandLevel.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => postProcess(t0, t1).runNow()))
    if (!js.isUndefined(quicksearch)) __obj.updateDynamic("quicksearch")(quicksearch.asInstanceOf[js.Any])
    if (removeNode != null) __obj.updateDynamic("removeNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => removeNode(t0, t1).runNow()))
    if (renderColumns != null) __obj.updateDynamic("renderColumns")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderColumns(t0, t1).runNow()))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderNode(t0, t1).runNow()))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => renderTitle(t0, t1).runNow()))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => restore(t0, t1).runNow()))
    if (rtl != null) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (scrollOfs != null) __obj.updateDynamic("scrollOfs")(scrollOfs.asInstanceOf[js.Any])
    if (scrollParent != null) __obj.updateDynamic("scrollParent")(scrollParent.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFancytree.Fancytree.EventData) => select(t0, t1).runNow()))
    if (selectMode != null) __obj.updateDynamic("selectMode")(selectMode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (!js.isUndefined(tabbable)) __obj.updateDynamic("tabbable")(tabbable.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (!js.isUndefined(titlesTabbable)) __obj.updateDynamic("titlesTabbable")(titlesTabbable.asInstanceOf[js.Any])
    if (toggleEffect != null) __obj.updateDynamic("toggleEffect")(toggleEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (unselectableIgnore != null) __obj.updateDynamic("unselectableIgnore")(unselectableIgnore.asInstanceOf[js.Any])
    if (unselectableStatus != null) __obj.updateDynamic("unselectableStatus")(unselectableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancytreeOptions]
  }
}

