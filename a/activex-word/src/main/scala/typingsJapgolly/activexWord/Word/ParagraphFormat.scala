package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphFormat extends StObject {
  
  var AddSpaceBetweenFarEastAndAlpha: Double
  
  var AddSpaceBetweenFarEastAndDigit: Double
  
  var Alignment: WdParagraphAlignment
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var AutoAdjustRightIndent: Double
  
  var BaseLineAlignment: WdBaselineAlignment
  
  var Borders: typingsJapgolly.activexWord.Word.Borders
  
  var CharacterUnitFirstLineIndent: Double
  
  var CharacterUnitLeftIndent: Double
  
  var CharacterUnitRightIndent: Double
  
  def CloseUp(): Unit
  
  val Creator: Double
  
  var DisableLineHeightGrid: Double
  
  val Duplicate: ParagraphFormat
  
  var FarEastLineBreakControl: Double
  
  var FirstLineIndent: Double
  
  var HalfWidthPunctuationOnTopOfLine: Double
  
  var HangingPunctuation: Double
  
  var Hyphenation: Double
  
  def IndentCharWidth(Count: Double): Unit
  
  def IndentFirstLineCharWidth(Count: Double): Unit
  
  var KeepTogether: Double
  
  var KeepWithNext: Double
  
  var LeftIndent: Double
  
  var LineSpacing: Double
  
  var LineSpacingRule: WdLineSpacing
  
  var LineUnitAfter: Double
  
  var LineUnitBefore: Double
  
  var MirrorIndents: Double
  
  var NoLineNumber: Double
  
  def OpenOrCloseUp(): Unit
  
  def OpenUp(): Unit
  
  var OutlineLevel: WdOutlineLevel
  
  var PageBreakBefore: Double
  
  val Parent: Any
  
  var ReadingOrder: WdReadingOrder
  
  def Reset(): Unit
  
  var RightIndent: Double
  
  val Shading: typingsJapgolly.activexWord.Word.Shading
  
  def Space1(): Unit
  
  def Space15(): Unit
  
  def Space2(): Unit
  
  var SpaceAfter: Double
  
  var SpaceAfterAuto: Double
  
  var SpaceBefore: Double
  
  var SpaceBeforeAuto: Double
  
  var Style: Any
  
  def TabHangingIndent(Count: Double): Unit
  
  def TabIndent(Count: Double): Unit
  
  var TabStops: typingsJapgolly.activexWord.Word.TabStops
  
  var TextboxTightWrap: WdTextboxTightWrap
  
  var WidowControl: Double
  
  /* private */ @JSName("Word.ParagraphFormat_typekey")
  var WordDotParagraphFormat_typekey: ParagraphFormat
  
  var WordWrap: Double
}
object ParagraphFormat {
  
  inline def apply(
    AddSpaceBetweenFarEastAndAlpha: Double,
    AddSpaceBetweenFarEastAndDigit: Double,
    Alignment: WdParagraphAlignment,
    Application: Application,
    AutoAdjustRightIndent: Double,
    BaseLineAlignment: WdBaselineAlignment,
    Borders: Borders,
    CharacterUnitFirstLineIndent: Double,
    CharacterUnitLeftIndent: Double,
    CharacterUnitRightIndent: Double,
    CloseUp: Callback,
    Creator: Double,
    DisableLineHeightGrid: Double,
    Duplicate: ParagraphFormat,
    FarEastLineBreakControl: Double,
    FirstLineIndent: Double,
    HalfWidthPunctuationOnTopOfLine: Double,
    HangingPunctuation: Double,
    Hyphenation: Double,
    IndentCharWidth: Double => Callback,
    IndentFirstLineCharWidth: Double => Callback,
    KeepTogether: Double,
    KeepWithNext: Double,
    LeftIndent: Double,
    LineSpacing: Double,
    LineSpacingRule: WdLineSpacing,
    LineUnitAfter: Double,
    LineUnitBefore: Double,
    MirrorIndents: Double,
    NoLineNumber: Double,
    OpenOrCloseUp: Callback,
    OpenUp: Callback,
    OutlineLevel: WdOutlineLevel,
    PageBreakBefore: Double,
    Parent: Any,
    ReadingOrder: WdReadingOrder,
    Reset: Callback,
    RightIndent: Double,
    Shading: Shading,
    Space1: Callback,
    Space15: Callback,
    Space2: Callback,
    SpaceAfter: Double,
    SpaceAfterAuto: Double,
    SpaceBefore: Double,
    SpaceBeforeAuto: Double,
    Style: Any,
    TabHangingIndent: Double => Callback,
    TabIndent: Double => Callback,
    TabStops: TabStops,
    TextboxTightWrap: WdTextboxTightWrap,
    WidowControl: Double,
    WordDotParagraphFormat_typekey: ParagraphFormat,
    WordWrap: Double
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(AddSpaceBetweenFarEastAndAlpha = AddSpaceBetweenFarEastAndAlpha.asInstanceOf[js.Any], AddSpaceBetweenFarEastAndDigit = AddSpaceBetweenFarEastAndDigit.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAdjustRightIndent = AutoAdjustRightIndent.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], CharacterUnitFirstLineIndent = CharacterUnitFirstLineIndent.asInstanceOf[js.Any], CharacterUnitLeftIndent = CharacterUnitLeftIndent.asInstanceOf[js.Any], CharacterUnitRightIndent = CharacterUnitRightIndent.asInstanceOf[js.Any], CloseUp = CloseUp.toJsFn, Creator = Creator.asInstanceOf[js.Any], DisableLineHeightGrid = DisableLineHeightGrid.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], FirstLineIndent = FirstLineIndent.asInstanceOf[js.Any], HalfWidthPunctuationOnTopOfLine = HalfWidthPunctuationOnTopOfLine.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], Hyphenation = Hyphenation.asInstanceOf[js.Any], IndentCharWidth = js.Any.fromFunction1((t0: Double) => IndentCharWidth(t0).runNow()), IndentFirstLineCharWidth = js.Any.fromFunction1((t0: Double) => IndentFirstLineCharWidth(t0).runNow()), KeepTogether = KeepTogether.asInstanceOf[js.Any], KeepWithNext = KeepWithNext.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LineSpacing = LineSpacing.asInstanceOf[js.Any], LineSpacingRule = LineSpacingRule.asInstanceOf[js.Any], LineUnitAfter = LineUnitAfter.asInstanceOf[js.Any], LineUnitBefore = LineUnitBefore.asInstanceOf[js.Any], MirrorIndents = MirrorIndents.asInstanceOf[js.Any], NoLineNumber = NoLineNumber.asInstanceOf[js.Any], OpenOrCloseUp = OpenOrCloseUp.toJsFn, OpenUp = OpenUp.toJsFn, OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageBreakBefore = PageBreakBefore.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Reset = Reset.toJsFn, RightIndent = RightIndent.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Space1 = Space1.toJsFn, Space15 = Space15.toJsFn, Space2 = Space2.toJsFn, SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceAfterAuto = SpaceAfterAuto.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceBeforeAuto = SpaceBeforeAuto.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TabHangingIndent = js.Any.fromFunction1((t0: Double) => TabHangingIndent(t0).runNow()), TabIndent = js.Any.fromFunction1((t0: Double) => TabIndent(t0).runNow()), TabStops = TabStops.asInstanceOf[js.Any], TextboxTightWrap = TextboxTightWrap.asInstanceOf[js.Any], WidowControl = WidowControl.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ParagraphFormat_typekey")(WordDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  
  extension [Self <: ParagraphFormat](x: Self) {
    
    inline def setAddSpaceBetweenFarEastAndAlpha(value: Double): Self = StObject.set(x, "AddSpaceBetweenFarEastAndAlpha", value.asInstanceOf[js.Any])
    
    inline def setAddSpaceBetweenFarEastAndDigit(value: Double): Self = StObject.set(x, "AddSpaceBetweenFarEastAndDigit", value.asInstanceOf[js.Any])
    
    inline def setAlignment(value: WdParagraphAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoAdjustRightIndent(value: Double): Self = StObject.set(x, "AutoAdjustRightIndent", value.asInstanceOf[js.Any])
    
    inline def setBaseLineAlignment(value: WdBaselineAlignment): Self = StObject.set(x, "BaseLineAlignment", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setCharacterUnitFirstLineIndent(value: Double): Self = StObject.set(x, "CharacterUnitFirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setCharacterUnitLeftIndent(value: Double): Self = StObject.set(x, "CharacterUnitLeftIndent", value.asInstanceOf[js.Any])
    
    inline def setCharacterUnitRightIndent(value: Double): Self = StObject.set(x, "CharacterUnitRightIndent", value.asInstanceOf[js.Any])
    
    inline def setCloseUp(value: Callback): Self = StObject.set(x, "CloseUp", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDisableLineHeightGrid(value: Double): Self = StObject.set(x, "DisableLineHeightGrid", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: ParagraphFormat): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    inline def setFarEastLineBreakControl(value: Double): Self = StObject.set(x, "FarEastLineBreakControl", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "FirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setHalfWidthPunctuationOnTopOfLine(value: Double): Self = StObject.set(x, "HalfWidthPunctuationOnTopOfLine", value.asInstanceOf[js.Any])
    
    inline def setHangingPunctuation(value: Double): Self = StObject.set(x, "HangingPunctuation", value.asInstanceOf[js.Any])
    
    inline def setHyphenation(value: Double): Self = StObject.set(x, "Hyphenation", value.asInstanceOf[js.Any])
    
    inline def setIndentCharWidth(value: Double => Callback): Self = StObject.set(x, "IndentCharWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIndentFirstLineCharWidth(value: Double => Callback): Self = StObject.set(x, "IndentFirstLineCharWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setKeepTogether(value: Double): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNext(value: Double): Self = StObject.set(x, "KeepWithNext", value.asInstanceOf[js.Any])
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "LeftIndent", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "LineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingRule(value: WdLineSpacing): Self = StObject.set(x, "LineSpacingRule", value.asInstanceOf[js.Any])
    
    inline def setLineUnitAfter(value: Double): Self = StObject.set(x, "LineUnitAfter", value.asInstanceOf[js.Any])
    
    inline def setLineUnitBefore(value: Double): Self = StObject.set(x, "LineUnitBefore", value.asInstanceOf[js.Any])
    
    inline def setMirrorIndents(value: Double): Self = StObject.set(x, "MirrorIndents", value.asInstanceOf[js.Any])
    
    inline def setNoLineNumber(value: Double): Self = StObject.set(x, "NoLineNumber", value.asInstanceOf[js.Any])
    
    inline def setOpenOrCloseUp(value: Callback): Self = StObject.set(x, "OpenOrCloseUp", value.toJsFn)
    
    inline def setOpenUp(value: Callback): Self = StObject.set(x, "OpenUp", value.toJsFn)
    
    inline def setOutlineLevel(value: WdOutlineLevel): Self = StObject.set(x, "OutlineLevel", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBefore(value: Double): Self = StObject.set(x, "PageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReadingOrder(value: WdReadingOrder): Self = StObject.set(x, "ReadingOrder", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "RightIndent", value.asInstanceOf[js.Any])
    
    inline def setShading(value: Shading): Self = StObject.set(x, "Shading", value.asInstanceOf[js.Any])
    
    inline def setSpace1(value: Callback): Self = StObject.set(x, "Space1", value.toJsFn)
    
    inline def setSpace15(value: Callback): Self = StObject.set(x, "Space15", value.toJsFn)
    
    inline def setSpace2(value: Callback): Self = StObject.set(x, "Space2", value.toJsFn)
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "SpaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterAuto(value: Double): Self = StObject.set(x, "SpaceAfterAuto", value.asInstanceOf[js.Any])
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "SpaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeAuto(value: Double): Self = StObject.set(x, "SpaceBeforeAuto", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTabHangingIndent(value: Double => Callback): Self = StObject.set(x, "TabHangingIndent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTabIndent(value: Double => Callback): Self = StObject.set(x, "TabIndent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTabStops(value: TabStops): Self = StObject.set(x, "TabStops", value.asInstanceOf[js.Any])
    
    inline def setTextboxTightWrap(value: WdTextboxTightWrap): Self = StObject.set(x, "TextboxTightWrap", value.asInstanceOf[js.Any])
    
    inline def setWidowControl(value: Double): Self = StObject.set(x, "WidowControl", value.asInstanceOf[js.Any])
    
    inline def setWordDotParagraphFormat_typekey(value: ParagraphFormat): Self = StObject.set(x, "Word.ParagraphFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: Double): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
