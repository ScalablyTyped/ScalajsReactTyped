package typingsJapgolly.extjs.Ext.dom.abstractelement

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.ICompositeElement
import typingsJapgolly.extjs.Ext.IElementLoader
import typingsJapgolly.extjs.Ext.dd.IDD
import typingsJapgolly.extjs.Ext.dd.IDDProxy
import typingsJapgolly.extjs.Ext.dd.IDDTarget
import typingsJapgolly.extjs.Ext.dom.IElement
import typingsJapgolly.extjs.Ext.util.IKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFly extends IElement {
  /** [Property] (Boolean) */
  var isFly: js.UndefOr[Boolean] = js.undefined
}

object IFly {
  @scala.inline
  def apply(
    ASCLASS: Int | Double = null,
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    addClsOnClick: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    addClsOnFocus: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    addClsOnOver: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    addKeyListener: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IKeyMap] = null,
    addKeyMap: /* config */ js.UndefOr[js.Any] => CallbackTo[IKeyMap] = null,
    addListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: /* config */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    appendChild: (/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    appendTo: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    autoBoxAdjust: js.UndefOr[Boolean] = js.undefined,
    blur: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    boxWrap: /* clazz */ js.UndefOr[String] => CallbackTo[IFly] = null,
    cacheScrollValues: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    center: /* centerIn */ js.UndefOr[js.Any] => Callback = null,
    child: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    clean: /* forceReclean */ js.UndefOr[Boolean] => Callback = null,
    clearListeners: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    clearOpacity: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    clearPositioning: /* value */ js.UndefOr[String] => CallbackTo[IFly] = null,
    clip: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    createProxy: (/* config */ js.UndefOr[js.Any], /* renderTo */ js.UndefOr[js.Any], /* matchBox */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    createShim: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    defaultUnit: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    enableDisplayMode: /* display */ js.UndefOr[String] => CallbackTo[IFly] = null,
    extend: String = null,
    fadeIn: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    fadeOut: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    findParent: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    findParentNode: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    first: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    focus: /* defer */ js.UndefOr[Double] => CallbackTo[IFly] = null,
    focusable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    frame: (/* color */ js.UndefOr[String], /* count */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    getActiveElement: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getAttribute: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[String] = null,
    getAttributeNS: (/* namespace */ js.UndefOr[String], /* name */ js.UndefOr[String]) => CallbackTo[String] = null,
    getBorderWidth: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getBottom: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getById: (/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean]) => Callback = null,
    getCenterXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getColor: (/* attr */ js.UndefOr[String], /* defaultValue */ js.UndefOr[String], /* prefix */ js.UndefOr[String]) => Callback = null,
    getComputedHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getComputedWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFrameWidth: /* sides */ js.UndefOr[String] => CallbackTo[Double] = null,
    getHTML: js.UndefOr[Callback] = js.undefined,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLeft: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getLoader: js.UndefOr[CallbackTo[IElementLoader]] = js.undefined,
    getLocalX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLocalXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getLocalY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMargin: /* sides */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getPadding: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getPositioning: /* autoPx */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getRight: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getScroll: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getScrollLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollTop: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSize: /* contentSize */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getStyle: (/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getStyleSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTextWidth: (/* text */ js.UndefOr[String], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    getTop: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getViewSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    ghost: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    hasCls: /* className */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hide: /* animate */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    highlight: (/* color */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    hover: (/* overFn */ js.UndefOr[js.Any], /* outFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    initDD: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDD] = null,
    initDDProxy: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDDProxy] = null,
    initDDTarget: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDDTarget] = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    insertFirst: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    insertHtml: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    is: /* selector */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isBorderBox: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isDisplayed: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFly: js.UndefOr[Boolean] = js.undefined,
    isFocusable: /* asFocusEl */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isMasked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isScrollable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isStyle: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    isTransparent: /* prop */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isVisible: /* deep */ js.UndefOr[Boolean] => CallbackTo[Boolean] = null,
    last: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    load: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    mask: (/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String]) => CallbackTo[IFly] = null,
    mixins: js.Any = null,
    monitorMouseLeave: (/* delay */ js.UndefOr[Double], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    moveTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    needsTabIndex: js.UndefOr[Callback] = js.undefined,
    next: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    on: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    originalDisplay: String = null,
    parent: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    pause: /* seconds */ js.UndefOr[Double] => CallbackTo[IFly] = null,
    position: (/* pos */ js.UndefOr[String], /* zIndex */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    prev: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    puff: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    purgeAllListeners: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    query: /* selector */ js.UndefOr[String] => CallbackTo[Array] = null,
    radioCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    relayEvent: (/* eventName */ js.UndefOr[String], /* observable */ js.UndefOr[js.Any]) => Callback = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAllListeners: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    removeCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    repaint: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    replace: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    replaceCls: (/* oldClassName */ js.UndefOr[String], /* newClassName */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    requires: Array = null,
    scale: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    scroll: (/* direction */ js.UndefOr[String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    scrollBy: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    scrollIntoView: (/* container */ js.UndefOr[js.Any], /* hscroll */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], /* highlight */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    scrollTo: (/* side */ js.UndefOr[String], /* value */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    select: (/* selector */ js.UndefOr[String], /* unique */ js.UndefOr[Boolean]) => CallbackTo[ICompositeElement] = null,
    selectable: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    set: (/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setBounds: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    setDisplayed: /* value */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setHTML: /* html */ js.UndefOr[String] => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    setHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setLeft: /* left */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setLeftTop: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    setLocation: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    setOpacity: (/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    setPositioning: /* posCfg */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setRight: /* right */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setScrollLeft: /* left */ js.UndefOr[Double] => CallbackTo[IFly] = null,
    setScrollTop: /* top */ js.UndefOr[Double] => CallbackTo[IFly] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    setTop: /* top */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    setVisible: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    setWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    shift: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    show: /* animate */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slideIn: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    slideOut: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    statics: js.Any = null,
    swallowEvent: (/* eventName */ js.UndefOr[js.Any], /* preventDefault */ js.UndefOr[Boolean]) => CallbackTo[IFly] = null,
    switchOff: /* options */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    toggle: /* animate */ js.UndefOr[js.Any] => CallbackTo[IFly] = null,
    toggleCls: /* className */ js.UndefOr[String] => CallbackTo[IElement] = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    unclip: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    unmask: js.UndefOr[Callback] = js.undefined,
    unselectable: js.UndefOr[CallbackTo[IFly]] = js.undefined,
    up: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    update: (/* html */ js.UndefOr[String], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => CallbackTo[IFly] = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[String]) => CallbackTo[js.Any] = null
  ): IFly = {
    val __obj = js.Dynamic.literal()
    if (ASCLASS != null) __obj.updateDynamic("ASCLASS")(ASCLASS.asInstanceOf[js.Any])
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (addClsOnClick != null) __obj.updateDynamic("addClsOnClick")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnClick(t0, t1, t2).runNow()))
    if (addClsOnFocus != null) __obj.updateDynamic("addClsOnFocus")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnFocus(t0, t1, t2).runNow()))
    if (addClsOnOver != null) __obj.updateDynamic("addClsOnOver")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnOver(t0, t1, t2).runNow()))
    if (addKeyListener != null) __obj.updateDynamic("addKeyListener")(js.Any.fromFunction3((t0: /* key */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addKeyListener(t0, t1, t2).runNow()))
    if (addKeyMap != null) __obj.updateDynamic("addKeyMap")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => addKeyMap(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => animate(t0).runNow()))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => appendChild(t0, t1).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => appendTo(t0).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1((t0: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0).runNow()))
    if (!js.isUndefined(autoBoxAdjust)) __obj.updateDynamic("autoBoxAdjust")(autoBoxAdjust.asInstanceOf[js.Any])
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    if (boxWrap != null) __obj.updateDynamic("boxWrap")(js.Any.fromFunction1((t0: /* clazz */ js.UndefOr[java.lang.String]) => boxWrap(t0).runNow()))
    cacheScrollValues.foreach(p => __obj.updateDynamic("cacheScrollValues")(p.toJsFn))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction1((t0: /* centerIn */ js.UndefOr[js.Any]) => center(t0).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => child(t0, t1).runNow()))
    if (clean != null) __obj.updateDynamic("clean")(js.Any.fromFunction1((t0: /* forceReclean */ js.UndefOr[scala.Boolean]) => clean(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearOpacity.foreach(p => __obj.updateDynamic("clearOpacity")(p.toJsFn))
    if (clearPositioning != null) __obj.updateDynamic("clearPositioning")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => clearPositioning(t0).runNow()))
    clip.foreach(p => __obj.updateDynamic("clip")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* insertBefore */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => createChild(t0, t1, t2).runNow()))
    if (createProxy != null) __obj.updateDynamic("createProxy")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* renderTo */ js.UndefOr[js.Any], t2: /* matchBox */ js.UndefOr[scala.Boolean]) => createProxy(t0, t1, t2).runNow()))
    createShim.foreach(p => __obj.updateDynamic("createShim")(p.toJsFn))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => down(t0, t1).runNow()))
    if (enableDisplayMode != null) __obj.updateDynamic("enableDisplayMode")(js.Any.fromFunction1((t0: /* display */ js.UndefOr[java.lang.String]) => enableDisplayMode(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => fadeIn(t0).runNow()))
    if (fadeOut != null) __obj.updateDynamic("fadeOut")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => fadeOut(t0).runNow()))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParent(t0, t1, t2).runNow()))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParentNode(t0, t1, t2).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => first(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1((t0: /* defer */ js.UndefOr[scala.Double]) => focus(t0).runNow()))
    focusable.foreach(p => __obj.updateDynamic("focusable")(p.toJsFn))
    if (frame != null) __obj.updateDynamic("frame")(js.Any.fromFunction3((t0: /* color */ js.UndefOr[java.lang.String], t1: /* count */ js.UndefOr[scala.Double], t2: /* options */ js.UndefOr[js.Any]) => frame(t0, t1, t2).runNow()))
    getActiveElement.foreach(p => __obj.updateDynamic("getActiveElement")(p.toJsFn))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* namespace */ js.UndefOr[java.lang.String]) => getAttribute(t0, t1).runNow()))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ js.UndefOr[java.lang.String], t1: /* name */ js.UndefOr[java.lang.String]) => getAttributeNS(t0, t1).runNow()))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getBorderWidth(t0).runNow()))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getBottom(t0).runNow()))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* asDom */ js.UndefOr[scala.Boolean]) => getById(t0, t1).runNow()))
    getCenterXY.foreach(p => __obj.updateDynamic("getCenterXY")(p.toJsFn))
    if (getColor != null) __obj.updateDynamic("getColor")(js.Any.fromFunction3((t0: /* attr */ js.UndefOr[java.lang.String], t1: /* defaultValue */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String]) => getColor(t0, t1, t2).runNow()))
    getComputedHeight.foreach(p => __obj.updateDynamic("getComputedHeight")(p.toJsFn))
    getComputedWidth.foreach(p => __obj.updateDynamic("getComputedWidth")(p.toJsFn))
    if (getFrameWidth != null) __obj.updateDynamic("getFrameWidth")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getFrameWidth(t0).runNow()))
    getHTML.foreach(p => __obj.updateDynamic("getHTML")(p.toJsFn))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1((t0: /* contentHeight */ js.UndefOr[scala.Boolean]) => getHeight(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getLeft(t0).runNow()))
    getLoader.foreach(p => __obj.updateDynamic("getLoader")(p.toJsFn))
    getLocalX.foreach(p => __obj.updateDynamic("getLocalX")(p.toJsFn))
    getLocalXY.foreach(p => __obj.updateDynamic("getLocalXY")(p.toJsFn))
    getLocalY.foreach(p => __obj.updateDynamic("getLocalY")(p.toJsFn))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getMargin(t0).runNow()))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getPadding(t0).runNow()))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1((t0: /* asRegion */ js.UndefOr[scala.Boolean]) => getPageBox(t0).runNow()))
    if (getPositioning != null) __obj.updateDynamic("getPositioning")(js.Any.fromFunction1((t0: /* autoPx */ js.UndefOr[scala.Boolean]) => getPositioning(t0).runNow()))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getRight(t0).runNow()))
    getScroll.foreach(p => __obj.updateDynamic("getScroll")(p.toJsFn))
    getScrollLeft.foreach(p => __obj.updateDynamic("getScrollLeft")(p.toJsFn))
    getScrollTop.foreach(p => __obj.updateDynamic("getScrollTop")(p.toJsFn))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1((t0: /* contentSize */ js.UndefOr[scala.Boolean]) => getSize(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* inline */ js.UndefOr[scala.Boolean]) => getStyle(t0, t1).runNow()))
    getStyleSize.foreach(p => __obj.updateDynamic("getStyleSize")(p.toJsFn))
    if (getTextWidth != null) __obj.updateDynamic("getTextWidth")(js.Any.fromFunction3((t0: /* text */ js.UndefOr[java.lang.String], t1: /* min */ js.UndefOr[scala.Double], t2: /* max */ js.UndefOr[scala.Double]) => getTextWidth(t0, t1, t2).runNow()))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getTop(t0).runNow()))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* asNumber */ js.UndefOr[scala.Boolean]) => getValue(t0).runNow()))
    getViewSize.foreach(p => __obj.updateDynamic("getViewSize")(p.toJsFn))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1((t0: /* contentWidth */ js.UndefOr[scala.Boolean]) => getWidth(t0).runNow()))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    if (ghost != null) __obj.updateDynamic("ghost")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => ghost(t0, t1).runNow()))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => hide(t0).runNow()))
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2((t0: /* color */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => highlight(t0, t1).runNow()))
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction4((t0: /* overFn */ js.UndefOr[js.Any], t1: /* outFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => hover(t0, t1, t2, t3).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (initDD != null) __obj.updateDynamic("initDD")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDD(t0, t1, t2).runNow()))
    if (initDDProxy != null) __obj.updateDynamic("initDDProxy")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDDProxy(t0, t1, t2).runNow()))
    if (initDDTarget != null) __obj.updateDynamic("initDDTarget")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDDTarget(t0, t1, t2).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertAfter(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertBefore(t0).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertFirst(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* html */ js.UndefOr[java.lang.String], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => insertHtml(t0, t1, t2).runNow()))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* where */ js.UndefOr[java.lang.String], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => insertSibling(t0, t1, t2).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    isBorderBox.foreach(p => __obj.updateDynamic("isBorderBox")(p.toJsFn))
    isDisplayed.foreach(p => __obj.updateDynamic("isDisplayed")(p.toJsFn))
    if (!js.isUndefined(isFly)) __obj.updateDynamic("isFly")(isFly.asInstanceOf[js.Any])
    if (isFocusable != null) __obj.updateDynamic("isFocusable")(js.Any.fromFunction1((t0: /* asFocusEl */ js.UndefOr[js.Any]) => isFocusable(t0).runNow()))
    isMasked.foreach(p => __obj.updateDynamic("isMasked")(p.toJsFn))
    isScrollable.foreach(p => __obj.updateDynamic("isScrollable")(p.toJsFn))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2((t0: /* style */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[java.lang.String]) => isStyle(t0, t1).runNow()))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => isTransparent(t0).runNow()))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1((t0: /* deep */ js.UndefOr[scala.Boolean]) => isVisible(t0).runNow()))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => last(t0, t1).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction2((t0: /* msg */ js.UndefOr[java.lang.String], t1: /* msgCls */ js.UndefOr[java.lang.String]) => mask(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (monitorMouseLeave != null) __obj.updateDynamic("monitorMouseLeave")(js.Any.fromFunction3((t0: /* delay */ js.UndefOr[scala.Double], t1: /* handler */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => monitorMouseLeave(t0, t1, t2).runNow()))
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => moveTo(t0, t1, t2).runNow()))
    needsTabIndex.foreach(p => __obj.updateDynamic("needsTabIndex")(p.toJsFn))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => next(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (originalDisplay != null) __obj.updateDynamic("originalDisplay")(originalDisplay.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => parent(t0, t1).runNow()))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: /* seconds */ js.UndefOr[scala.Double]) => pause(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction4((t0: /* pos */ js.UndefOr[java.lang.String], t1: /* zIndex */ js.UndefOr[scala.Double], t2: /* x */ js.UndefOr[scala.Double], t3: /* y */ js.UndefOr[scala.Double]) => position(t0, t1, t2, t3).runNow()))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => prev(t0, t1).runNow()))
    if (puff != null) __obj.updateDynamic("puff")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => puff(t0).runNow()))
    purgeAllListeners.foreach(p => __obj.updateDynamic("purgeAllListeners")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => radioCls(t0).runNow()))
    if (relayEvent != null) __obj.updateDynamic("relayEvent")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* observable */ js.UndefOr[js.Any]) => relayEvent(t0, t1).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    removeAllListeners.foreach(p => __obj.updateDynamic("removeAllListeners")(p.toJsFn))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    repaint.foreach(p => __obj.updateDynamic("repaint")(p.toJsFn))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replace(t0).runNow()))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction2((t0: /* oldClassName */ js.UndefOr[java.lang.String], t1: /* newClassName */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replaceWith(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction3((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double], t2: /* options */ js.UndefOr[js.Any]) => scale(t0, t1, t2).runNow()))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction3((t0: /* direction */ js.UndefOr[java.lang.String], t1: /* distance */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => scroll(t0, t1, t2).runNow()))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3((t0: /* deltaX */ js.UndefOr[js.Any], t1: /* deltaY */ js.UndefOr[js.Any], t2: /* animate */ js.UndefOr[js.Any]) => scrollBy(t0, t1, t2).runNow()))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction4((t0: /* container */ js.UndefOr[js.Any], t1: /* hscroll */ js.UndefOr[scala.Boolean], t2: /* animate */ js.UndefOr[js.Any], t3: /* highlight */ js.UndefOr[scala.Boolean]) => scrollIntoView(t0, t1, t2, t3).runNow()))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction3((t0: /* side */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => scrollTo(t0, t1, t2).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* unique */ js.UndefOr[scala.Boolean]) => select(t0, t1).runNow()))
    selectable.foreach(p => __obj.updateDynamic("selectable")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => serializeForm(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* o */ js.UndefOr[js.Any], t1: /* useSet */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[js.Any]) => setBottom(t0).runNow()))
    if (setBounds != null) __obj.updateDynamic("setBounds")(js.Any.fromFunction5((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[js.Any], t3: /* height */ js.UndefOr[js.Any], t4: /* animate */ js.UndefOr[js.Any]) => setBounds(t0, t1, t2, t3, t4).runNow()))
    if (setDisplayed != null) __obj.updateDynamic("setDisplayed")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setDisplayed(t0).runNow()))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHTML(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[js.Any]) => setLeft(t0).runNow()))
    if (setLeftTop != null) __obj.updateDynamic("setLeftTop")(js.Any.fromFunction2((t0: /* left */ js.UndefOr[js.Any], t1: /* top */ js.UndefOr[js.Any]) => setLeftTop(t0, t1).runNow()))
    if (setLocation != null) __obj.updateDynamic("setLocation")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => setLocation(t0, t1, t2).runNow()))
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(js.Any.fromFunction2((t0: /* opacity */ js.UndefOr[scala.Double], t1: /* animate */ js.UndefOr[js.Any]) => setOpacity(t0, t1).runNow()))
    if (setPositioning != null) __obj.updateDynamic("setPositioning")(js.Any.fromFunction1((t0: /* posCfg */ js.UndefOr[js.Any]) => setPositioning(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[js.Any]) => setRight(t0).runNow()))
    if (setScrollLeft != null) __obj.updateDynamic("setScrollLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[scala.Double]) => setScrollLeft(t0).runNow()))
    if (setScrollTop != null) __obj.updateDynamic("setScrollTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[scala.Double]) => setScrollTop(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[js.Any]) => setTop(t0).runNow()))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[js.Any]) => setVisibilityMode(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction2((t0: /* visible */ js.UndefOr[scala.Boolean], t1: /* animate */ js.UndefOr[js.Any]) => setVisible(t0, t1).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (shift != null) __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => shift(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slideIn != null) __obj.updateDynamic("slideIn")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => slideIn(t0, t1).runNow()))
    if (slideOut != null) __obj.updateDynamic("slideOut")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => slideOut(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (swallowEvent != null) __obj.updateDynamic("swallowEvent")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[js.Any], t1: /* preventDefault */ js.UndefOr[scala.Boolean]) => swallowEvent(t0, t1).runNow()))
    if (switchOff != null) __obj.updateDynamic("switchOff")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => switchOff(t0).runNow()))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => toggle(t0).runNow()))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => toggleCls(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    unclip.foreach(p => __obj.updateDynamic("unclip")(p.toJsFn))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    unselectable.foreach(p => __obj.updateDynamic("unselectable")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => up(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* html */ js.UndefOr[java.lang.String], t1: /* loadScripts */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any]) => update(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean], t2: /* selector */ js.UndefOr[java.lang.String]) => wrap(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IFly]
  }
}

