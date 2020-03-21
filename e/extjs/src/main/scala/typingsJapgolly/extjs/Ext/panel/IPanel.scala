package typingsJapgolly.extjs.Ext.panel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IAbstractPanel {
  /** [Method] Add tools to this panel
  		* @param tools Object[]/Ext.panel.Tool[] The tools to add
  		*/
  var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Collapsed
  		* @param animated Boolean
  		*/
  var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded
  		* @param animated Boolean
  		*/
  var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var animCollapse: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var bbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var buttonAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var buttons: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Closes the Panel  */
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var closeAction: js.UndefOr[String] = js.undefined
  /** [Method] Collapses the panel body so that the body becomes hidden
  		* @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
  		* @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
  		* @returns Ext.panel.Panel this
  		*/
  var collapse: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (String) */
  var collapseDirection: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var collapseMode: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
  		* @param collapseDir Object
  		*/
  var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
  var dd: js.UndefOr[js.Any] = js.undefined
  /** [Method] Expands the panel body so that it becomes visible
  		* @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
  		* @returns Ext.panel.Panel this
  		*/
  var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var fbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var floatable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var frameHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current collapsed state of the panel
  		* @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
  		*/
  var getCollapsed: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the Header for this panel  */
  var getHeader: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var header: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var headerOverCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var headerPosition: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  /** [Method] Returns true if this component is visible
  		* @param deep Object
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var lbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var manageHeight: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var minButtonWidth: js.UndefOr[Double] = js.undefined
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_IPanel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
  		* @param destroying Object
  		*/
  @JSName("onRemoved")
  var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IPanel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var overlapHeader: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.Component/Object) */
  var placeholder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var placeholderCollapseHideMode: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var preventHeader: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var rbar: js.UndefOr[js.Any] = js.undefined
  /** [Method]
  		* @param border Object
  		* @param targetEl Object
  		*/
  @JSName("setBorder")
  var setBorder_IPanel: js.UndefOr[
    js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Set the glyph for the panel s header
  		* @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Set the icon for the panel s header
  		* @param newIcon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the iconCls for the panel s header
  		* @param newIconCls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set a title for the panel s header
  		* @param newTitle String
  		*/
  var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the UI for the component
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleDrag: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var tbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.undefined
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
  		* @returns Ext.panel.Panel this
  		*/
  var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Object[]/Ext.panel.Tool[]) */
  var tools: js.UndefOr[js.Any] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IAbstractPanel: IAbstractPanel = null,
    addTool: /* tools */ js.UndefOr[js.Any] => Callback = null,
    afterCollapse: /* animated */ js.UndefOr[Boolean] => Callback = null,
    afterExpand: /* animated */ js.UndefOr[Boolean] => Callback = null,
    animCollapse: js.UndefOr[Boolean] = js.undefined,
    bbar: js.Any = null,
    buttonAlign: String = null,
    buttons: js.Any = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    close: js.UndefOr[Callback] = js.undefined,
    closeAction: String = null,
    collapse: (/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean]) => CallbackTo[IPanel] = null,
    collapseDirection: String = null,
    collapseFirst: js.UndefOr[Boolean] = js.undefined,
    collapseMode: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedCls: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    constrainHeader: js.UndefOr[Boolean] = js.undefined,
    convertCollapseDir: /* collapseDir */ js.UndefOr[js.Any] => Callback = null,
    dd: js.Any = null,
    expand: /* animate */ js.UndefOr[Boolean] => CallbackTo[IPanel] = null,
    fbar: js.Any = null,
    floatable: js.UndefOr[Boolean] = js.undefined,
    frameHeader: js.UndefOr[Boolean] = js.undefined,
    getCollapsed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHeader: js.UndefOr[Callback] = js.undefined,
    glyph: js.Any = null,
    header: js.Any = null,
    headerOverCls: String = null,
    headerPosition: String = null,
    hideCollapseTool: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconCls: String = null,
    isVisible: /* deep */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    lbar: js.Any = null,
    manageHeight: js.UndefOr[Boolean] = js.undefined,
    minButtonWidth: Int | Double = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onRemoved: /* destroying */ js.UndefOr[js.Any] => Callback = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    overlapHeader: js.UndefOr[Boolean] = js.undefined,
    placeholder: js.Any = null,
    placeholderCollapseHideMode: Int | Double = null,
    preventHeader: js.UndefOr[Boolean] = js.undefined,
    rbar: js.Any = null,
    setBorder: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => Callback = null,
    setGlyph: /* newGlyph */ js.UndefOr[js.Any] => Callback = null,
    setIcon: /* newIcon */ js.UndefOr[String] => Callback = null,
    setIconCls: /* newIconCls */ js.UndefOr[String] => Callback = null,
    setTitle: /* newTitle */ js.UndefOr[String] => Callback = null,
    setUI: /* ui */ js.UndefOr[js.Any] => Callback = null,
    simpleDrag: js.UndefOr[Boolean] = js.undefined,
    tbar: js.Any = null,
    title: String = null,
    titleAlign: String = null,
    titleCollapse: js.UndefOr[Boolean] = js.undefined,
    toggleCollapse: js.UndefOr[CallbackTo[IPanel]] = js.undefined,
    tools: js.Any = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IAbstractPanel != null) js.Dynamic.global.Object.assign(__obj, IAbstractPanel)
    if (addTool != null) __obj.updateDynamic("addTool")(js.Any.fromFunction1((t0: /* tools */ js.UndefOr[js.Any]) => addTool(t0).runNow()))
    if (afterCollapse != null) __obj.updateDynamic("afterCollapse")(js.Any.fromFunction1((t0: /* animated */ js.UndefOr[scala.Boolean]) => afterCollapse(t0).runNow()))
    if (afterExpand != null) __obj.updateDynamic("afterExpand")(js.Any.fromFunction1((t0: /* animated */ js.UndefOr[scala.Boolean]) => afterExpand(t0).runNow()))
    if (!js.isUndefined(animCollapse)) __obj.updateDynamic("animCollapse")(animCollapse.asInstanceOf[js.Any])
    if (bbar != null) __obj.updateDynamic("bbar")(bbar.asInstanceOf[js.Any])
    if (buttonAlign != null) __obj.updateDynamic("buttonAlign")(buttonAlign.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (closeAction != null) __obj.updateDynamic("closeAction")(closeAction.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2((t0: /* direction */ js.UndefOr[java.lang.String], t1: /* animate */ js.UndefOr[scala.Boolean]) => collapse(t0, t1).runNow()))
    if (collapseDirection != null) __obj.updateDynamic("collapseDirection")(collapseDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseFirst)) __obj.updateDynamic("collapseFirst")(collapseFirst.asInstanceOf[js.Any])
    if (collapseMode != null) __obj.updateDynamic("collapseMode")(collapseMode.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedCls != null) __obj.updateDynamic("collapsedCls")(collapsedCls.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainHeader)) __obj.updateDynamic("constrainHeader")(constrainHeader.asInstanceOf[js.Any])
    if (convertCollapseDir != null) __obj.updateDynamic("convertCollapseDir")(js.Any.fromFunction1((t0: /* collapseDir */ js.UndefOr[js.Any]) => convertCollapseDir(t0).runNow()))
    if (dd != null) __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[scala.Boolean]) => expand(t0).runNow()))
    if (fbar != null) __obj.updateDynamic("fbar")(fbar.asInstanceOf[js.Any])
    if (!js.isUndefined(floatable)) __obj.updateDynamic("floatable")(floatable.asInstanceOf[js.Any])
    if (!js.isUndefined(frameHeader)) __obj.updateDynamic("frameHeader")(frameHeader.asInstanceOf[js.Any])
    getCollapsed.foreach(p => __obj.updateDynamic("getCollapsed")(p.toJsFn))
    getHeader.foreach(p => __obj.updateDynamic("getHeader")(p.toJsFn))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerOverCls != null) __obj.updateDynamic("headerOverCls")(headerOverCls.asInstanceOf[js.Any])
    if (headerPosition != null) __obj.updateDynamic("headerPosition")(headerPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCollapseTool)) __obj.updateDynamic("hideCollapseTool")(hideCollapseTool.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1((t0: /* deep */ js.UndefOr[js.Any]) => isVisible(t0).runNow()))
    if (lbar != null) __obj.updateDynamic("lbar")(lbar.asInstanceOf[js.Any])
    if (!js.isUndefined(manageHeight)) __obj.updateDynamic("manageHeight")(manageHeight.asInstanceOf[js.Any])
    if (minButtonWidth != null) __obj.updateDynamic("minButtonWidth")(minButtonWidth.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction1((t0: /* destroying */ js.UndefOr[js.Any]) => onRemoved(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (!js.isUndefined(overlapHeader)) __obj.updateDynamic("overlapHeader")(overlapHeader.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderCollapseHideMode != null) __obj.updateDynamic("placeholderCollapseHideMode")(placeholderCollapseHideMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preventHeader)) __obj.updateDynamic("preventHeader")(preventHeader.asInstanceOf[js.Any])
    if (rbar != null) __obj.updateDynamic("rbar")(rbar.asInstanceOf[js.Any])
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction2((t0: /* border */ js.UndefOr[js.Any], t1: /* targetEl */ js.UndefOr[js.Any]) => setBorder(t0, t1).runNow()))
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(js.Any.fromFunction1((t0: /* newGlyph */ js.UndefOr[js.Any]) => setGlyph(t0).runNow()))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: /* newIcon */ js.UndefOr[java.lang.String]) => setIcon(t0).runNow()))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1((t0: /* newIconCls */ js.UndefOr[java.lang.String]) => setIconCls(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* newTitle */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setUI != null) __obj.updateDynamic("setUI")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[js.Any]) => setUI(t0).runNow()))
    if (!js.isUndefined(simpleDrag)) __obj.updateDynamic("simpleDrag")(simpleDrag.asInstanceOf[js.Any])
    if (tbar != null) __obj.updateDynamic("tbar")(tbar.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(titleCollapse)) __obj.updateDynamic("titleCollapse")(titleCollapse.asInstanceOf[js.Any])
    toggleCollapse.foreach(p => __obj.updateDynamic("toggleCollapse")(p.toJsFn))
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel]
  }
}

