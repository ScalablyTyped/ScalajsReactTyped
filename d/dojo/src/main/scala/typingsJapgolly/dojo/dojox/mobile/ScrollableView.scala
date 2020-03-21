package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.allowNestedScrolls
import typingsJapgolly.dojo.dojoStrings.appBars
import typingsJapgolly.dojo.dojoStrings.constraint
import typingsJapgolly.dojo.dojoStrings.dirLock
import typingsJapgolly.dojo.dojoStrings.disableFlashScrollBar
import typingsJapgolly.dojo.dojoStrings.fadeScrollBar
import typingsJapgolly.dojo.dojoStrings.fixedFooter
import typingsJapgolly.dojo.dojoStrings.fixedFooterHeight
import typingsJapgolly.dojo.dojoStrings.fixedHeader
import typingsJapgolly.dojo.dojoStrings.fixedHeaderHeight
import typingsJapgolly.dojo.dojoStrings.height
import typingsJapgolly.dojo.dojoStrings.isLocalFooter
import typingsJapgolly.dojo.dojoStrings.propagatable
import typingsJapgolly.dojo.dojoStrings.scrollBar
import typingsJapgolly.dojo.dojoStrings.scrollDir
import typingsJapgolly.dojo.dojoStrings.scrollType
import typingsJapgolly.dojo.dojoStrings.scrollableParams
import typingsJapgolly.dojo.dojoStrings.threshold
import typingsJapgolly.dojo.dojoStrings.touchNode
import typingsJapgolly.dojo.dojoStrings.weight
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ScrollableView.html
  *
  * A container that has a touch scrolling capability.
  * ScrollableView is a subclass of View (dojox/mobile/View).
  * Unlike the base View class, ScrollableView's domNode always stays
  * at the top of the screen and its height is "100%" of the screen.
  * Inside this fixed domNode, the containerNode scrolls. The browser's
  * default scrolling behavior is disabled, and the scrolling mechanism is
  * reimplemented in JavaScript. Thus the user does not need to use the
  * two-finger operation to scroll the inner DIV (containerNode).
  * The main purpose of this widget is to realize fixed-positioned header
  * and/or footer bars.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojox.mobile.scrollable because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dojox.mobile.ScrollableMixin because Inheritance from two classes. Inlined allowNestedScrolls, appBars, constraint, dirLock, disableFlashScrollBar, fadeScrollBar, fixedFooter, fixedFooterHeight, fixedHeader, fixedHeaderHeight, height, isLocalFooter, propagatable, scrollableParams, scrollBar, scrollDir, scrollType, threshold, touchNode, weight, abort, addCover, adjustDestination, calcScrollBarPos, calcSpeed, checkFixedBar, cleanup, createMask, destroy, findAppBars, findDisp, flashScrollBar, getDim, getPos, getScreenSize, getSpeed, hideScrollBar, init, isFormElement, isTopLevel, makeTranslateStr, removeCover, resetScrollBar, resize, scrollIntoView, scrollScrollBarTo, scrollTo, setKeyframes, setSelectable, showScrollBar, slideScrollBarTo, slideTo, startup, stopAnimation, onAfterScroll, onBeforeScroll, onFlickAnimationEnd, onFlickAnimationStart, onTouchEnd, onTouchMove, onTouchStart */ @JSGlobal("dojox.mobile.ScrollableView")
@js.native
class ScrollableView () extends View {
  /**
    * Flag to allow scrolling in nested containers, e.g. to allow ScrollableView in a SwapView.
    *
    */
  var allowNestedScrolls: Boolean = js.native
  /**
    * Enables the search for application-specific bars (header or footer).
    *
    */
  var appBars: Boolean = js.native
  /**
    * bounce back to the content area
    *
    */
  var constraint: Boolean = js.native
  /**
    * disable the move handler if scroll starts in the unexpected direction
    *
    */
  var dirLock: Boolean = js.native
  /**
    *
    */
  var disableFlashScrollBar: Boolean = js.native
  /**
    *
    */
  var fadeScrollBar: Boolean = js.native
  /**
    * Id of the fixed footer.
    *
    */
  var fixedFooter: String = js.native
  /**
    * height of a fixed footer
    *
    */
  var fixedFooterHeight: Double = js.native
  /**
    * Id of the fixed header.
    *
    */
  var fixedHeader: String = js.native
  /**
    * height of a fixed header
    *
    */
  var fixedHeaderHeight: Double = js.native
  /**
    * explicitly specified height of this widget (ex. "300px")
    *
    */
  var height: String = js.native
  /**
    * footer is view-local (as opposed to application-wide)
    *
    */
  var isLocalFooter: Boolean = js.native
  /**
    * let touchstart event propagate up
    *
    */
  var propagatable: Boolean = js.native
  /**
    * show scroll bar or not
    *
    */
  var scrollBar: Boolean = js.native
  /**
    * v: vertical, h: horizontal, vh: both, f: flip
    *
    */
  var scrollDir: String = js.native
  /**
    *
    * 1: use (-webkit-)transform:translate3d(x,y,z) style, use (-webkit-)animation for slide animation
    * 2: use top/left style,
    * 3: use (-webkit-)transform:translate3d(x,y,z) style, use (-webkit-)transition for slide animation
    * 0: use default value (3 for Android, iOS6+, and BlackBerry; otherwise 1)
    *
    */
  var scrollType: Double = js.native
  /**
    * Parameters for dojox/mobile/scrollable.init().
    *
    */
  var scrollableParams: js.Object = js.native
  /**
    * drag threshold value in pixels
    *
    */
  var threshold: Double = js.native
  /**
    * a node that will have touch event handlers
    *
    */
  var touchNode: HTMLElement = js.native
  /**
    * frictional drag
    *
    */
  var weight: Double = js.native
  /**
    * Aborts scrolling.
    * This function stops the scrolling animation that is currently
    * running. It is called when the user touches the screen while
    * scrolling.
    *
    */
  def abort(): Unit = js.native
  /**
    * Adds the transparent DIV cover.
    * The cover is to prevent DOM events from affecting the child
    * widgets such as a list widget. Without the cover, for example,
    * child widgets may receive a click event and respond to it
    * unexpectedly when the user flicks the screen to scroll.
    * Note that only the desktop browsers need the cover.
    *
    */
  def addCover(): Unit = js.native
  /**
    * Adds a view local fixed bar to this widget.
    * This method can be used to programmatically add a view local
    * fixed bar to ScrollableView. The bar is appended to this
    * widget's domNode. The addChild API cannot be used for this
    * purpose, because it adds the given widget to containerNode.
    *
    * @param widget
    */
  def addFixedBar(widget: WidgetBase): Unit = js.native
  /**
    * A stub function to be overridden by subclasses.
    * This function is called from onTouchEnd(). The purpose is to give its
    * subclasses a chance to adjust the destination position. If this
    * function returns false, onTouchEnd() returns immediately without
    * performing scroll.
    *
    * @param to The destination position. An object with x and y.
    * @param pos The current position. An object with x and y.
    * @param dim Dimension information returned by getDim().
    */
  def adjustDestination(to: js.Object, pos: js.Object, dim: js.Object): Boolean = js.native
  /**
    * Calculates the scroll bar position.
    * Given the scroll destination position, calculates the top and/or
    * the left of the scroll bar(s). Returns an object with x and y.
    *
    * @param to The scroll destination position. An object with x and y.ex. {x:0, y:-5}
    */
  def calcScrollBarPos(to: js.Object): js.Object = js.native
  /**
    * Calculate the speed given the distance and time.
    *
    * @param distance
    * @param time
    */
  def calcSpeed(distance: Double, time: Double): Double = js.native
  /**
    * Checks if the given node is a fixed bar or not.
    *
    * @param node
    * @param local
    */
  def checkFixedBar(node: HTMLElement, local: Boolean): js.Any = js.native
  /**
    * Uninitialize the module.
    *
    */
  def cleanup(): Unit = js.native
  /**
    * Creates a mask for a scroll bar edge.
    * This function creates a mask that hides corners of one scroll
    * bar edge to make it round edge. The other side of the edge is
    * always visible and round shaped with the border-radius style.
    *
    */
  def createMask(): Unit = js.native
  /**
    * Search for application-specific header or footer.
    *
    */
  def findAppBars(): Unit = js.native
  /**
    * Finds the currently displayed view node from my sibling nodes.
    *
    * @param node
    */
  def findDisp(node: HTMLElement): js.Any = js.native
  /**
    * Shows the scroll bar instantly.
    * This function shows the scroll bar, and then hides it 300ms
    * later. This is used to show the scroll bar to the user for a
    * short period of time when a hidden view is revealed.
    *
    */
  def flashScrollBar(): Unit = js.native
  /**
    * Returns various internal dimensional information needed for calculation.
    *
    */
  def getDim(): js.Object = js.native
  /**
    * Gets the top position in the midst of animation.
    *
    */
  def getPos(): js.Object = js.native
  /**
    * Returns the dimensions of the browser window.
    *
    */
  def getScreenSize(): js.Object = js.native
  /**
    * Returns an object that indicates the scrolling speed.
    * From the position and elapsed time information, calculates the
    * scrolling speed, and returns an object with x and y.
    *
    */
  def getSpeed(): js.Object = js.native
  @JSName("get")
  def get_allowNestedScrolls(property: allowNestedScrolls): Boolean = js.native
  @JSName("get")
  def get_appBars(property: appBars): Boolean = js.native
  @JSName("get")
  def get_constraint(property: constraint): Boolean = js.native
  @JSName("get")
  def get_dirLock(property: dirLock): Boolean = js.native
  @JSName("get")
  def get_disableFlashScrollBar(property: disableFlashScrollBar): Boolean = js.native
  @JSName("get")
  def get_fadeScrollBar(property: fadeScrollBar): Boolean = js.native
  @JSName("get")
  def get_fixedFooter(property: fixedFooter): String = js.native
  @JSName("get")
  def get_fixedFooterHeight(property: fixedFooterHeight): Double = js.native
  @JSName("get")
  def get_fixedHeader(property: fixedHeader): String = js.native
  @JSName("get")
  def get_fixedHeaderHeight(property: fixedHeaderHeight): Double = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_isLocalFooter(property: isLocalFooter): Boolean = js.native
  @JSName("get")
  def get_propagatable(property: propagatable): Boolean = js.native
  @JSName("get")
  def get_scrollBar(property: scrollBar): Boolean = js.native
  @JSName("get")
  def get_scrollDir(property: scrollDir): String = js.native
  @JSName("get")
  def get_scrollType(property: scrollType): Double = js.native
  @JSName("get")
  def get_scrollableParams(property: scrollableParams): js.Object = js.native
  @JSName("get")
  def get_threshold(property: threshold): Double = js.native
  @JSName("get")
  def get_touchNode(property: touchNode): HTMLElement = js.native
  @JSName("get")
  def get_weight(property: weight): Double = js.native
  /**
    * Hides the scroll bar.
    * If the fadeScrollBar property is true, hides the scroll bar with
    * the fade animation.
    *
    */
  def hideScrollBar(): Unit = js.native
  /**
    * Initialize according to the given params.
    * Mixes in the given params into this instance. At least domNode
    * and containerNode have to be given.
    * Starts listening to the touchstart events.
    * Calls resize(), if this widget is a top level widget.
    *
    * @param params               Optional
    */
  def init(params: js.Object): Unit = js.native
  /**
    * Returns true if the given node is a form control.
    *
    * @param node
    */
  def isFormElement(node: HTMLElement): Boolean = js.native
  /**
    * Returns true if this is a top-level widget.
    * Overrides dojox/mobile/scrollable.isTopLevel.
    *
    * @param e
    */
  /**
    * Returns true if this is a top-level widget.
    * Subclass may want to override.
    *
    */
  def isTopLevel(): Boolean = js.native
  def isTopLevel(e: Event_): Boolean = js.native
  /**
    * Constructs a string value that is passed to the -webkit-transform property.
    * Return value example: "translate3d(0px,-8px,0px)"
    *
    * @param to The destination position. An object with x and/or y.
    */
  def makeTranslateStr(to: js.Object): String = js.native
  /**
    * called after a scroll has been performed.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onAfterScroll(e: Event_): Unit = js.native
  /**
    * called before a scroll is initiated. If this method returns false,
    * the scroll is canceled.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onBeforeScroll(e: Event_): Boolean = js.native
  /**
    *
    * @param e
    */
  def onFlickAnimationEnd(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onFlickAnimationStart(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle touchEnd events.
    *
    * @param e
    */
  def onTouchEnd(e: Event_): Unit = js.native
  /**
    * User-defined function to handle touchMove events.
    *
    * @param e
    */
  def onTouchMove(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle touchStart events.
    *
    * @param e
    */
  def onTouchStart(e: js.Any): Unit = js.native
  /**
    * Removes the transparent DIV cover.
    *
    */
  def removeCover(): Unit = js.native
  /**
    * Moves all the children, except header and footer, to
    * containerNode.
    *
    */
  def reparent(): Unit = js.native
  /**
    * Resets the scroll bar length, position, etc.
    *
    */
  def resetScrollBar(): Unit = js.native
  /**
    * Adjusts the height of the widget.
    * If the height property is 'inherit', the height is inherited
    * from its offset parent. If 'auto', the content height, which
    * could be smaller than the entire screen height, is used. If an
    * explicit height value (ex. "300px"), it is used as the new
    * height. If nothing is specified as the height property, from the
    * current top position of the widget to the bottom of the screen
    * will be the new height.
    *
    * @param e
    */
  def resize(e: js.Any): Unit = js.native
  /**
    * Scrolls the pane until the searching node is in the view.
    * Just like the scrollIntoView method of DOM elements, this
    * function causes the given node to scroll into view, aligning it
    * either at the top or bottom of the pane.
    *
    * @param node A DOM node to be searched for view.
    * @param alignWithTop               OptionalIf true, aligns the node at the top of the pane.If false, aligns the node at the bottom of the pane.
    * @param duration               OptionalDuration of scrolling in seconds. (ex. 0.3)If not specified, scrolls without animation.
    */
  def scrollIntoView(node: HTMLElement, alignWithTop: Boolean, duration: Double): Unit = js.native
  /**
    * Moves the scroll bar(s) to the given position without animation.
    *
    * @param to The destination position. An object with x and/or y.ex. {x:2, y:5}, {y:20}, etc.
    */
  def scrollScrollBarTo(to: js.Object): Unit = js.native
  /**
    * Scrolls to the given position immediately without animation.
    *
    * @param to The destination position. An object with x and y.ex. {x:0, y:-5}
    * @param doNotMoveScrollBar               OptionalIf true, the scroll bar will not be updated. If not specified,it will be updated.
    * @param node               OptionalA DOM node to scroll. If not specified, defaults tothis.containerNode.
    */
  def scrollTo(to: js.Object, doNotMoveScrollBar: Boolean, node: HTMLElement): Unit = js.native
  /**
    * Programmatically sets key frames for the scroll animation.
    *
    * @param from
    * @param to
    * @param idx
    */
  def setKeyframes(from: js.Object, to: js.Object, idx: Double): Unit = js.native
  /**
    * Sets the given node as selectable or unselectable.
    *
    * @param node
    * @param selectable
    */
  def setSelectable(node: HTMLElement, selectable: Boolean): Unit = js.native
  @JSName("set")
  def set_allowNestedScrolls(property: allowNestedScrolls, value: Boolean): Unit = js.native
  @JSName("set")
  def set_appBars(property: appBars, value: Boolean): Unit = js.native
  @JSName("set")
  def set_constraint(property: constraint, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dirLock(property: dirLock, value: Boolean): Unit = js.native
  @JSName("set")
  def set_disableFlashScrollBar(property: disableFlashScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fadeScrollBar(property: fadeScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fixedFooter(property: fixedFooter, value: String): Unit = js.native
  @JSName("set")
  def set_fixedFooterHeight(property: fixedFooterHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_fixedHeader(property: fixedHeader, value: String): Unit = js.native
  @JSName("set")
  def set_fixedHeaderHeight(property: fixedHeaderHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_isLocalFooter(property: isLocalFooter, value: Boolean): Unit = js.native
  @JSName("set")
  def set_propagatable(property: propagatable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollBar(property: scrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollDir(property: scrollDir, value: String): Unit = js.native
  @JSName("set")
  def set_scrollType(property: scrollType, value: Double): Unit = js.native
  @JSName("set")
  def set_scrollableParams(property: scrollableParams, value: js.Object): Unit = js.native
  @JSName("set")
  def set_threshold(property: threshold, value: Double): Unit = js.native
  @JSName("set")
  def set_touchNode(property: touchNode, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_weight(property: weight, value: Double): Unit = js.native
  /**
    * Shows the scroll bar.
    * This function creates the scroll bar instance if it does not
    * exist yet, and calls resetScrollBar() to reset its length and
    * position.
    *
    */
  def showScrollBar(): Unit = js.native
  /**
    * Moves the scroll bar(s) to the given position with the slide animation.
    *
    * @param to The destination position. An object with x and y.ex. {x:0, y:-5}
    * @param duration Duration of the animation in seconds. (ex. 0.3)
    * @param easing The name of easing effect which webkit supports."ease", "linear", "ease-in", "ease-out", etc.
    */
  def slideScrollBarTo(to: js.Object, duration: Double, easing: String): Unit = js.native
  /**
    * Scrolls to the given position with the slide animation.
    *
    * @param to The scroll destination position. An object with x and/or y.ex. {x:0, y:-5}, {y:-29}, etc.
    * @param duration Duration of scrolling in seconds. (ex. 0.3)
    * @param easing The name of easing effect which webkit supports."ease", "linear", "ease-in", "ease-out", etc.
    */
  def slideTo(to: js.Object, duration: Double, easing: String): Unit = js.native
  /**
    * Stops the currently running animation.
    *
    */
  def stopAnimation(): Unit = js.native
  @JSName("watch")
  def watch_allowNestedScrolls(
    property: allowNestedScrolls,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_appBars(
    property: appBars,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_constraint(
    property: constraint,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dirLock(
    property: dirLock,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_disableFlashScrollBar(
    property: disableFlashScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fadeScrollBar(
    property: fadeScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedFooter(
    property: fixedFooter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedFooterHeight(
    property: fixedFooterHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedHeader(
    property: fixedHeader,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedHeaderHeight(
    property: fixedHeaderHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isLocalFooter(
    property: isLocalFooter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_propagatable(
    property: propagatable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollBar(
    property: scrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollDir(
    property: scrollDir,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollType(
    property: scrollType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollableParams(
    property: scrollableParams,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_threshold(
    property: threshold,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_touchNode(
    property: touchNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_weight(
    property: weight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

