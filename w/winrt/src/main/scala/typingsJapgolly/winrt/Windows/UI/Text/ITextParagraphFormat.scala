package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextParagraphFormat extends StObject {
  
  def addTab(position: Double, align: TabAlignment, leader: TabLeader): Unit
  
  var alignment: ParagraphAlignment
  
  def clearAllTabs(): Unit
  
  def deleteTab(position: Double): Unit
  
  var firstLineIndent: Double
  
  def getClone(): ITextParagraphFormat
  
  def getTab(index: Double): Align
  
  def isEqual(format: ITextParagraphFormat): Boolean
  
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
  
  def setClone(format: ITextParagraphFormat): Unit
  
  def setIndents(start: Double, left: Double, right: Double): Unit
  
  def setLineSpacing(rule: LineSpacingRule, spacing: Double): Unit
  
  var spaceAfter: Double
  
  var spaceBefore: Double
  
  var style: ParagraphStyle
  
  var tabCount: Double
  
  var widowControl: FormatEffect
}
object ITextParagraphFormat {
  
  inline def apply(
    addTab: (Double, TabAlignment, TabLeader) => Callback,
    alignment: ParagraphAlignment,
    clearAllTabs: Callback,
    deleteTab: Double => Callback,
    firstLineIndent: Double,
    getClone: CallbackTo[ITextParagraphFormat],
    getTab: Double => Align,
    isEqual: ITextParagraphFormat => Boolean,
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
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction3((t0: Double, t1: TabAlignment, t2: TabLeader) => (addTab(t0, t1, t2)).runNow()), alignment = alignment.asInstanceOf[js.Any], clearAllTabs = clearAllTabs.toJsFn, deleteTab = js.Any.fromFunction1((t0: Double) => deleteTab(t0).runNow()), firstLineIndent = firstLineIndent.asInstanceOf[js.Any], getClone = getClone.toJsFn, getTab = js.Any.fromFunction1(getTab), isEqual = js.Any.fromFunction1(isEqual), keepTogether = keepTogether.asInstanceOf[js.Any], keepWithNext = keepWithNext.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingRule = lineSpacingRule.asInstanceOf[js.Any], listAlignment = listAlignment.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], listStart = listStart.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any], listTab = listTab.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], noLineNumber = noLineNumber.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], setClone = js.Any.fromFunction1((t0: ITextParagraphFormat) => setClone(t0).runNow()), setIndents = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setIndents(t0, t1, t2)).runNow()), setLineSpacing = js.Any.fromFunction2((t0: LineSpacingRule, t1: Double) => (setLineSpacing(t0, t1)).runNow()), spaceAfter = spaceAfter.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabCount = tabCount.asInstanceOf[js.Any], widowControl = widowControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextParagraphFormat]
  }
  
  extension [Self <: ITextParagraphFormat](x: Self) {
    
    inline def setAddTab(value: (Double, TabAlignment, TabLeader) => Callback): Self = StObject.set(x, "addTab", js.Any.fromFunction3((t0: Double, t1: TabAlignment, t2: TabLeader) => (value(t0, t1, t2)).runNow()))
    
    inline def setAlignment(value: ParagraphAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setClearAllTabs(value: Callback): Self = StObject.set(x, "clearAllTabs", value.toJsFn)
    
    inline def setDeleteTab(value: Double => Callback): Self = StObject.set(x, "deleteTab", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setGetClone(value: CallbackTo[ITextParagraphFormat]): Self = StObject.set(x, "getClone", value.toJsFn)
    
    inline def setGetTab(value: Double => Align): Self = StObject.set(x, "getTab", js.Any.fromFunction1(value))
    
    inline def setIsEqual(value: ITextParagraphFormat => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setKeepTogether(value: FormatEffect): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNext(value: FormatEffect): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingRule(value: LineSpacingRule): Self = StObject.set(x, "lineSpacingRule", value.asInstanceOf[js.Any])
    
    inline def setListAlignment(value: MarkerAlignment): Self = StObject.set(x, "listAlignment", value.asInstanceOf[js.Any])
    
    inline def setListLevelIndex(value: Double): Self = StObject.set(x, "listLevelIndex", value.asInstanceOf[js.Any])
    
    inline def setListStart(value: Double): Self = StObject.set(x, "listStart", value.asInstanceOf[js.Any])
    
    inline def setListStyle(value: MarkerStyle): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    inline def setListTab(value: Double): Self = StObject.set(x, "listTab", value.asInstanceOf[js.Any])
    
    inline def setListType(value: MarkerType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setNoLineNumber(value: FormatEffect): Self = StObject.set(x, "noLineNumber", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBefore(value: FormatEffect): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: FormatEffect): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSetClone(value: ITextParagraphFormat => Callback): Self = StObject.set(x, "setClone", js.Any.fromFunction1((t0: ITextParagraphFormat) => value(t0).runNow()))
    
    inline def setSetIndents(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setIndents", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetLineSpacing(value: (LineSpacingRule, Double) => Callback): Self = StObject.set(x, "setLineSpacing", js.Any.fromFunction2((t0: LineSpacingRule, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTabCount(value: Double): Self = StObject.set(x, "tabCount", value.asInstanceOf[js.Any])
    
    inline def setWidowControl(value: FormatEffect): Self = StObject.set(x, "widowControl", value.asInstanceOf[js.Any])
  }
}
