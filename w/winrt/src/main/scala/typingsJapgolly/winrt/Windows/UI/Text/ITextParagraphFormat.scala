package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextParagraphFormat extends js.Object {
  var alignment: ParagraphAlignment
  var firstLineIndent: Double
  var keepTogether: FormatEffect
  var keepWithNext: FormatEffect
  var leftIndent: Double
  var lineSpacing: Double
  var lineSpacingRule: LineSpacingRule
  var listAlignment: MarkerAlignment
  var listLevelIndex: Double
  var listStart: Double
  var listStyle: MarkerStyle
  var listTab: Double
  var listType: MarkerType
  var noLineNumber: FormatEffect
  var pageBreakBefore: FormatEffect
  var rightIndent: Double
  var rightToLeft: FormatEffect
  var spaceAfter: Double
  var spaceBefore: Double
  var style: ParagraphStyle
  var tabCount: Double
  var widowControl: FormatEffect
  def addTab(position: Double, align: TabAlignment, leader: TabLeader): Unit
  def clearAllTabs(): Unit
  def deleteTab(position: Double): Unit
  def getClone(): ITextParagraphFormat
  def getTab(index: Double): AnonAlign
  def isEqual(format: ITextParagraphFormat): Boolean
  def setClone(format: ITextParagraphFormat): Unit
  def setIndents(start: Double, left: Double, right: Double): Unit
  def setLineSpacing(rule: LineSpacingRule, spacing: Double): Unit
}

object ITextParagraphFormat {
  @scala.inline
  def apply(
    addTab: (Double, TabAlignment, TabLeader) => Callback,
    alignment: ParagraphAlignment,
    clearAllTabs: Callback,
    deleteTab: Double => Callback,
    firstLineIndent: Double,
    getClone: CallbackTo[ITextParagraphFormat],
    getTab: Double => CallbackTo[AnonAlign],
    isEqual: ITextParagraphFormat => CallbackTo[Boolean],
    keepTogether: FormatEffect,
    keepWithNext: FormatEffect,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingRule: LineSpacingRule,
    listAlignment: MarkerAlignment,
    listLevelIndex: Double,
    listStart: Double,
    listStyle: MarkerStyle,
    listTab: Double,
    listType: MarkerType,
    noLineNumber: FormatEffect,
    pageBreakBefore: FormatEffect,
    rightIndent: Double,
    rightToLeft: FormatEffect,
    setClone: ITextParagraphFormat => Callback,
    setIndents: (Double, Double, Double) => Callback,
    setLineSpacing: (LineSpacingRule, Double) => Callback,
    spaceAfter: Double,
    spaceBefore: Double,
    style: ParagraphStyle,
    tabCount: Double,
    widowControl: FormatEffect
  ): ITextParagraphFormat = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], firstLineIndent = firstLineIndent.asInstanceOf[js.Any], keepTogether = keepTogether.asInstanceOf[js.Any], keepWithNext = keepWithNext.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingRule = lineSpacingRule.asInstanceOf[js.Any], listAlignment = listAlignment.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], listStart = listStart.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any], listTab = listTab.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], noLineNumber = noLineNumber.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], spaceAfter = spaceAfter.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabCount = tabCount.asInstanceOf[js.Any], widowControl = widowControl.asInstanceOf[js.Any])
    __obj.updateDynamic("addTab")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment, t2: typingsJapgolly.winrt.Windows.UI.Text.TabLeader) => addTab(t0, t1, t2).runNow()))
    __obj.updateDynamic("clearAllTabs")(clearAllTabs.toJsFn)
    __obj.updateDynamic("deleteTab")(js.Any.fromFunction1((t0: scala.Double) => deleteTab(t0).runNow()))
    __obj.updateDynamic("getClone")(getClone.toJsFn)
    __obj.updateDynamic("getTab")(js.Any.fromFunction1((t0: scala.Double) => getTab(t0).runNow()))
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextParagraphFormat) => isEqual(t0).runNow()))
    __obj.updateDynamic("setClone")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextParagraphFormat) => setClone(t0).runNow()))
    __obj.updateDynamic("setIndents")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setIndents(t0, t1, t2).runNow()))
    __obj.updateDynamic("setLineSpacing")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule, t1: scala.Double) => setLineSpacing(t0, t1).runNow()))
    __obj.asInstanceOf[ITextParagraphFormat]
  }
}

