package typingsJapgolly.androiduix.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.graphics.Canvas
import typingsJapgolly.androiduix.android.graphics.Rect
import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.View.Predicate
import typingsJapgolly.androiduix.android.widget.ListView.FixedViewInfo
import typingsJapgolly.androiduix.java.lang.Runnable
import typingsJapgolly.androiduix.java.util.ArrayList
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListView")
@js.native
class ListView protected () extends AbsListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mAreAllItemsSelectable: js.Any = js.native
  var mArrowScrollFocusResult: js.Any = js.native
  var mDivider: Drawable = js.native
  var mDividerHeight: Double = js.native
  var mDividerIsOpaque: js.Any = js.native
  var mDividerPaint: js.Any = js.native
  var mFocusSelector: js.Any = js.native
  var mFooterDividersEnabled: js.Any = js.native
  var mFooterViewInfos: js.Any = js.native
  var mHeaderDividersEnabled: js.Any = js.native
  var mHeaderViewInfos: js.Any = js.native
  var mIsCacheColorOpaque: js.Any = js.native
  var mItemsCanFocus: js.Any = js.native
  var mOverScrollFooter: Drawable = js.native
  var mOverScrollHeader: Drawable = js.native
  var mTempRect: js.Any = js.native
  def addFooterView(v: View): Unit = js.native
  def addFooterView(v: View, data: js.Any): Unit = js.native
  def addFooterView(v: View, data: js.Any, isSelectable: Boolean): Unit = js.native
  def addHeaderView(v: View): Unit = js.native
  def addHeaderView(v: View, data: js.Any): Unit = js.native
  def addHeaderView(v: View, data: js.Any, isSelectable: Boolean): Unit = js.native
  /* private */ def addViewAbove(theView: js.Any, position: js.Any): js.Any = js.native
  /* private */ def addViewBelow(theView: js.Any, position: js.Any): js.Any = js.native
  /* private */ def adjustViewsUpOrDown(): js.Any = js.native
  /* private */ def amountToScroll(direction: js.Any, nextSelectedPosition: js.Any): js.Any = js.native
  /* private */ def amountToScrollToNewFocus(direction: js.Any, newFocus: js.Any, positionOfNewFocus: js.Any): js.Any = js.native
  def areFooterDividersEnabled(): Boolean = js.native
  def areHeaderDividersEnabled(): Boolean = js.native
  def arrowScroll(direction: Double): Boolean = js.native
  /* private */ def arrowScrollFocused(direction: js.Any): js.Any = js.native
  /* private */ def arrowScrollImpl(direction: js.Any): js.Any = js.native
  /* private */ def clearRecycledState(infos: js.Any): js.Any = js.native
  /* private */ def commonKey(keyCode: js.Any, count: js.Any, event: js.Any): js.Any = js.native
  /* private */ def correctTooHigh(childCount: js.Any): js.Any = js.native
  /* private */ def correctTooLow(childCount: js.Any): js.Any = js.native
  /* private */ def distanceToView(descendant: js.Any): js.Any = js.native
  def drawDivider(canvas: Canvas, bounds: Rect, childIndex: Double): Unit = js.native
  def drawOverscrollFooter(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = js.native
  def drawOverscrollHeader(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = js.native
  /* private */ def fillAboveAndBelow(sel: js.Any, position: js.Any): js.Any = js.native
  /* private */ def fillDown(pos: js.Any, nextTop: js.Any): js.Any = js.native
  /* private */ def fillFromMiddle(childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillFromSelection(selectedTop: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillFromTop(nextTop: js.Any): js.Any = js.native
  /* private */ def fillSpecific(position: js.Any, top: js.Any): js.Any = js.native
  /* private */ def fillUp(pos: js.Any, nextBottom: js.Any): js.Any = js.native
  def findViewByPredicateInHeadersOrFooters(where: ArrayList[FixedViewInfo], predicate: Predicate[View], childToSkip: View): View = js.native
  def findViewInHeadersOrFooters(where: ArrayList[FixedViewInfo], id: String): View = js.native
  def fullScroll(direction: Double): Boolean = js.native
  /* private */ def getArrowScrollPreviewLength(): js.Any = js.native
  /* private */ def getBottomSelectionPixel(childrenBottom: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  def getCheckItemIds(): js.Array[Double] = js.native
  def getDivider(): Drawable = js.native
  def getDividerHeight(): Double = js.native
  def getItemsCanFocus(): Boolean = js.native
  def getMaxScrollAmount(): Double = js.native
  def getOverscrollFooter(): Drawable = js.native
  def getOverscrollHeader(): Drawable = js.native
  /* private */ def getTopSelectionPixel(childrenTop: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  /* private */ def handleHorizontalFocusWithinListItem(direction: js.Any): js.Any = js.native
  /* private */ def handleNewSelectionChange(selectedView: js.Any, direction: js.Any, newSelectedPosition: js.Any, newFocusAssigned: js.Any): js.Any = js.native
  /* private */ def isViewAncestorOf(child: js.Any, parent: js.Any): js.Any = js.native
  def lookForSelectablePositionAfter(current: Double, position: Double, lookDown: Boolean): Double = js.native
  /* private */ def lookForSelectablePositionOnScreen(direction: js.Any): js.Any = js.native
  /* private */ def makeAndAddView(position: js.Any, y: js.Any, flow: js.Any, childrenLeft: js.Any, selected: js.Any): js.Any = js.native
  /* private */ def measureAndAdjustDown(child: js.Any, childIndex: js.Any, numChildren: js.Any): js.Any = js.native
  def measureHeightOfChildren(
    widthMeasureSpec: Double,
    startPosition: Double,
    endPosition: Double,
    maxHeight: Double,
    disallowPartialChildPosition: Double
  ): Double = js.native
  /* private */ def measureItem(child: js.Any): js.Any = js.native
  /* private */ def measureScrapChild(child: js.Any, position: js.Any, widthMeasureSpec: js.Any): js.Any = js.native
  /* private */ def moveSelection(oldSel: js.Any, newSel: js.Any, delta: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def nextSelectedPositionForDirection(selectedView: js.Any, selectedPos: js.Any, direction: js.Any): js.Any = js.native
  def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
  def pageScroll(direction: Double): Boolean = js.native
  /* private */ def positionOfNewFocus(newFocus: js.Any): js.Any = js.native
  /* protected */ def recycleOnMeasure(): Boolean = js.native
  /* private */ def relayoutMeasuredItem(child: js.Any): js.Any = js.native
  /* private */ def removeFixedViewInfo(v: js.Any, where: js.Any): js.Any = js.native
  def removeFooterView(v: View): Boolean = js.native
  def removeHeaderView(v: View): Boolean = js.native
  /* private */ def scrollListItemsBy(amount: js.Any): js.Any = js.native
  def setDivider(divider: Drawable): Unit = js.native
  def setDividerHeight(height: Double): Unit = js.native
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  def setItemsCanFocus(itemsCanFocus: Boolean): Unit = js.native
  def setOverscrollFooter(footer: Drawable): Unit = js.native
  def setOverscrollHeader(header: Drawable): Unit = js.native
  def setSelectionAfterHeaderView(): Unit = js.native
  def setSelectionFromTop(position: Double, y: Double): Unit = js.native
  /* private */ def setupChild(
    child: js.Any,
    position: js.Any,
    y: js.Any,
    flowDown: js.Any,
    childrenLeft: js.Any,
    selected: js.Any,
    recycled: js.Any
  ): js.Any = js.native
  /* private */ def showingBottomFadingEdge(): js.Any = js.native
  /* private */ def showingTopFadingEdge(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ListView")
@js.native
object ListView extends js.Object {
  @js.native
  class ArrowScrollFocusResult () extends js.Object {
    var mAmountToScroll: js.Any = js.native
    var mSelectedPosition: js.Any = js.native
    def getAmountToScroll(): Double = js.native
    def getSelectedPosition(): Double = js.native
    def populate(selectedPosition: Double, amountToScroll: Double): Unit = js.native
  }
  
  @js.native
  class FixedViewInfo protected () extends js.Object {
    def this(arg: ListView) = this()
    var _ListView_this: ListView = js.native
    var data: js.Any = js.native
    var isSelectable: Boolean = js.native
    var view: View = js.native
  }
  
  @js.native
  class FocusSelector protected () extends Runnable {
    def this(arg: ListView) = this()
    var _ListView_this: ListView = js.native
    var mPosition: js.Any = js.native
    var mPositionTop: js.Any = js.native
    /* CompleteClass */
    override def run(): js.Any = js.native
    def setup(position: Double, top: Double): FocusSelector = js.native
  }
  
  var MAX_SCROLL_FACTOR: js.Any = js.native
  var MIN_SCROLL_PREVIEW_PIXELS: js.Any = js.native
  var NO_POSITION: Double = js.native
}

