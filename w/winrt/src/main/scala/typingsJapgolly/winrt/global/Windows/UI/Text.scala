package typingsJapgolly.winrt.global.Windows.UI

import typingsJapgolly.winrt.Windows.UI.Color
import typingsJapgolly.winrt.Windows.UI.Text.FontStretch
import typingsJapgolly.winrt.Windows.UI.Text.FontStyle
import typingsJapgolly.winrt.Windows.UI.Text.FontWeight
import typingsJapgolly.winrt.Windows.UI.Text.IFontWeights
import typingsJapgolly.winrt.Windows.UI.Text.TabLeader.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSGlobal("Windows.UI.Text.CaretType")
  @js.native
  object CaretType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.CaretType & Double] = js.native
    
    /* 0 */ val normal: typingsJapgolly.winrt.Windows.UI.Text.CaretType.normal & Double = js.native
    
    /* 1 */ val null_ : typingsJapgolly.winrt.Windows.UI.Text.CaretType.null_ & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FindOptions")
  @js.native
  object FindOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.FindOptions & Double] = js.native
    
    /* 2 */ val case_ : typingsJapgolly.winrt.Windows.UI.Text.FindOptions.case_ & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Text.FindOptions.none & Double = js.native
    
    /* 1 */ val word: typingsJapgolly.winrt.Windows.UI.Text.FindOptions.word & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStretch")
  @js.native
  object FontStretch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.FontStretch & Double] = js.native
    
    /* 3 */ val condensed: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.condensed & Double = js.native
    
    /* 7 */ val expanded: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.expanded & Double = js.native
    
    /* 2 */ val extraCondensed: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.extraCondensed & Double = js.native
    
    /* 8 */ val extraExpanded: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.extraExpanded & Double = js.native
    
    /* 5 */ val normal: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.normal & Double = js.native
    
    /* 4 */ val semiCondensed: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.semiCondensed & Double = js.native
    
    /* 6 */ val semiExpanded: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.semiExpanded & Double = js.native
    
    /* 1 */ val ultraCondensed: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.ultraCondensed & Double = js.native
    
    /* 9 */ val ultraExpanded: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.ultraExpanded & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.FontStretch.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.FontStyle & Double] = js.native
    
    /* 2 */ val italic: typingsJapgolly.winrt.Windows.UI.Text.FontStyle.italic & Double = js.native
    
    /* 0 */ val normal: typingsJapgolly.winrt.Windows.UI.Text.FontStyle.normal & Double = js.native
    
    /* 1 */ val oblique: typingsJapgolly.winrt.Windows.UI.Text.FontStyle.oblique & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontWeights")
  @js.native
  open class FontWeights ()
    extends StObject
       with IFontWeights
  /* static members */
  object FontWeights {
    
    @JSGlobal("Windows.UI.Text.FontWeights")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.FontWeights.black")
    @js.native
    def black: FontWeight = js.native
    inline def black_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.bold")
    @js.native
    def bold: FontWeight = js.native
    inline def bold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBlack")
    @js.native
    def extraBlack: FontWeight = js.native
    inline def extraBlack_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBlack")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBold")
    @js.native
    def extraBold: FontWeight = js.native
    inline def extraBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraLight")
    @js.native
    def extraLight: FontWeight = js.native
    inline def extraLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.light")
    @js.native
    def light: FontWeight = js.native
    inline def light_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.medium")
    @js.native
    def medium: FontWeight = js.native
    inline def medium_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.normal")
    @js.native
    def normal: FontWeight = js.native
    inline def normal_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiBold")
    @js.native
    def semiBold: FontWeight = js.native
    inline def semiBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiLight")
    @js.native
    def semiLight: FontWeight = js.native
    inline def semiLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.thin")
    @js.native
    def thin: FontWeight = js.native
    inline def thin_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thin")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.FormatEffect")
  @js.native
  object FormatEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.FormatEffect & Double] = js.native
    
    /* 0 */ val off: typingsJapgolly.winrt.Windows.UI.Text.FormatEffect.off & Double = js.native
    
    /* 1 */ val on: typingsJapgolly.winrt.Windows.UI.Text.FormatEffect.on & Double = js.native
    
    /* 2 */ val toggle: typingsJapgolly.winrt.Windows.UI.Text.FormatEffect.toggle & Double = js.native
    
    /* 3 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.FormatEffect.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
  @js.native
  object HorizontalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.HorizontalCharacterAlignment & Double] = js.native
    
    /* 2 */ val center: typingsJapgolly.winrt.Windows.UI.Text.HorizontalCharacterAlignment.center & Double = js.native
    
    /* 0 */ val left: typingsJapgolly.winrt.Windows.UI.Text.HorizontalCharacterAlignment.left & Double = js.native
    
    /* 1 */ val right: typingsJapgolly.winrt.Windows.UI.Text.HorizontalCharacterAlignment.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LetterCase")
  @js.native
  object LetterCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.LetterCase & Double] = js.native
    
    /* 0 */ val lower: typingsJapgolly.winrt.Windows.UI.Text.LetterCase.lower & Double = js.native
    
    /* 1 */ val upper: typingsJapgolly.winrt.Windows.UI.Text.LetterCase.upper & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LineSpacingRule")
  @js.native
  object LineSpacingRule extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule & Double] = js.native
    
    /* 4 */ val atLeast: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.atLeast & Double = js.native
    
    /* 3 */ val double: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.double & Double = js.native
    
    /* 5 */ val exactly: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.exactly & Double = js.native
    
    /* 6 */ val multiple: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.multiple & Double = js.native
    
    /* 2 */ val oneAndHalf: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.oneAndHalf & Double = js.native
    
    /* 7 */ val percent: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.percent & Double = js.native
    
    /* 1 */ val single: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.single & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.LineSpacingRule.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.LinkType & Double] = js.native
    
    /* 5 */ val autoLink: typingsJapgolly.winrt.Windows.UI.Text.LinkType.autoLink & Double = js.native
    
    /* 6 */ val autoLinkEmail: typingsJapgolly.winrt.Windows.UI.Text.LinkType.autoLinkEmail & Double = js.native
    
    /* 8 */ val autoLinkPath: typingsJapgolly.winrt.Windows.UI.Text.LinkType.autoLinkPath & Double = js.native
    
    /* 7 */ val autoLinkPhone: typingsJapgolly.winrt.Windows.UI.Text.LinkType.autoLinkPhone & Double = js.native
    
    /* 2 */ val clientLink: typingsJapgolly.winrt.Windows.UI.Text.LinkType.clientLink & Double = js.native
    
    /* 4 */ val friendlyLinkAddress: typingsJapgolly.winrt.Windows.UI.Text.LinkType.friendlyLinkAddress & Double = js.native
    
    /* 3 */ val friendlyLinkName: typingsJapgolly.winrt.Windows.UI.Text.LinkType.friendlyLinkName & Double = js.native
    
    /* 1 */ val notALink: typingsJapgolly.winrt.Windows.UI.Text.LinkType.notALink & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.LinkType.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerAlignment")
  @js.native
  object MarkerAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.MarkerAlignment & Double] = js.native
    
    /* 2 */ val center: typingsJapgolly.winrt.Windows.UI.Text.MarkerAlignment.center & Double = js.native
    
    /* 1 */ val left: typingsJapgolly.winrt.Windows.UI.Text.MarkerAlignment.left & Double = js.native
    
    /* 3 */ val right: typingsJapgolly.winrt.Windows.UI.Text.MarkerAlignment.right & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.MarkerAlignment.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerStyle")
  @js.native
  object MarkerStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle & Double] = js.native
    
    /* 5 */ val minus: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.minus & Double = js.native
    
    /* 6 */ val noNumber: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.noNumber & Double = js.native
    
    /* 2 */ val parentheses: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.parentheses & Double = js.native
    
    /* 1 */ val parenthesis: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.parenthesis & Double = js.native
    
    /* 3 */ val period: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.period & Double = js.native
    
    /* 4 */ val plain: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.plain & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.MarkerStyle.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.MarkerType & Double] = js.native
    
    /* 3 */ val arabic: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.arabic & Double = js.native
    
    /* 18 */ val arabicAbjad: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.arabicAbjad & Double = js.native
    
    /* 17 */ val arabicDictionary: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.arabicDictionary & Double = js.native
    
    /* 12 */ val arabicWide: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.arabicWide & Double = js.native
    
    /* 10 */ val blackCircleWingding: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.blackCircleWingding & Double = js.native
    
    /* 2 */ val bullet: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.bullet & Double = js.native
    
    /* 9 */ val circledNumber: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.circledNumber & Double = js.native
    
    /* 23 */ val devanagariConsonant: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.devanagariConsonant & Double = js.native
    
    /* 24 */ val devanagariNumeric: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.devanagariNumeric & Double = js.native
    
    /* 22 */ val devanagariVowel: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.devanagariVowel & Double = js.native
    
    /* 19 */ val hebrew: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.hebrew & Double = js.native
    
    /* 16 */ val japanKorea: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.japanKorea & Double = js.native
    
    /* 15 */ val japanSimplifiedChinese: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.japanSimplifiedChinese & Double = js.native
    
    /* 4 */ val lowercaseEnglishLetter: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.lowercaseEnglishLetter & Double = js.native
    
    /* 6 */ val lowercaseRoman: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.lowercaseRoman & Double = js.native
    
    /* 1 */ val none: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.none & Double = js.native
    
    /* 13 */ val simplifiedChinese: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.simplifiedChinese & Double = js.native
    
    /* 20 */ val thaiAlphabetic: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.thaiAlphabetic & Double = js.native
    
    /* 21 */ val thaiNumeric: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.thaiNumeric & Double = js.native
    
    /* 14 */ val traditionalChinese: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.traditionalChinese & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.undefined & Double = js.native
    
    /* 8 */ val unicodeSequence: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.unicodeSequence & Double = js.native
    
    /* 5 */ val uppercaseEnglishLetter: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.uppercaseEnglishLetter & Double = js.native
    
    /* 7 */ val uppercaseRoman: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.uppercaseRoman & Double = js.native
    
    /* 11 */ val whiteCircleWingding: typingsJapgolly.winrt.Windows.UI.Text.MarkerType.whiteCircleWingding & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment & Double] = js.native
    
    /* 2 */ val center: typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment.center & Double = js.native
    
    /* 4 */ val justify: typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment.justify & Double = js.native
    
    /* 1 */ val left: typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment.left & Double = js.native
    
    /* 3 */ val right: typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment.right & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.ParagraphAlignment.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphStyle")
  @js.native
  object ParagraphStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle & Double] = js.native
    
    /* 3 */ val heading1: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading1 & Double = js.native
    
    /* 4 */ val heading2: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading2 & Double = js.native
    
    /* 5 */ val heading3: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading3 & Double = js.native
    
    /* 6 */ val heading4: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading4 & Double = js.native
    
    /* 7 */ val heading5: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading5 & Double = js.native
    
    /* 8 */ val heading6: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading6 & Double = js.native
    
    /* 9 */ val heading7: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading7 & Double = js.native
    
    /* 10 */ val heading8: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading8 & Double = js.native
    
    /* 11 */ val heading9: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.heading9 & Double = js.native
    
    /* 1 */ val none: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.none & Double = js.native
    
    /* 2 */ val normal: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.normal & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.ParagraphStyle.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.PointOptions")
  @js.native
  object PointOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.PointOptions & Double] = js.native
    
    /* 4 */ val allowOffClient: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.allowOffClient & Double = js.native
    
    /* 3 */ val clientCoordinates: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.clientCoordinates & Double = js.native
    
    /* 1 */ val includeInset: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.includeInset & Double = js.native
    
    /* 6 */ val noHorizontalScroll: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.noHorizontalScroll & Double = js.native
    
    /* 7 */ val noVerticalScroll: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.noVerticalScroll & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.none & Double = js.native
    
    /* 2 */ val start: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.start & Double = js.native
    
    /* 5 */ val transform: typingsJapgolly.winrt.Windows.UI.Text.PointOptions.transform & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.RangeGravity")
  @js.native
  object RangeGravity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.RangeGravity & Double] = js.native
    
    /* 1 */ val backward: typingsJapgolly.winrt.Windows.UI.Text.RangeGravity.backward & Double = js.native
    
    /* 2 */ val forward: typingsJapgolly.winrt.Windows.UI.Text.RangeGravity.forward & Double = js.native
    
    /* 3 */ val inward: typingsJapgolly.winrt.Windows.UI.Text.RangeGravity.inward & Double = js.native
    
    /* 4 */ val outward: typingsJapgolly.winrt.Windows.UI.Text.RangeGravity.outward & Double = js.native
    
    /* 0 */ val uIBehavior: typingsJapgolly.winrt.Windows.UI.Text.RangeGravity.uIBehavior & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionOptions")
  @js.native
  object SelectionOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions & Double] = js.native
    
    /* 3 */ val active: typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions.active & Double = js.native
    
    /* 1 */ val atEndOfLine: typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions.atEndOfLine & Double = js.native
    
    /* 2 */ val overtype: typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions.overtype & Double = js.native
    
    /* 4 */ val replace: typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions.replace & Double = js.native
    
    /* 0 */ val startActive: typingsJapgolly.winrt.Windows.UI.Text.SelectionOptions.startActive & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.SelectionType & Double] = js.native
    
    /* 3 */ val inlineShape: typingsJapgolly.winrt.Windows.UI.Text.SelectionType.inlineShape & Double = js.native
    
    /* 1 */ val insertionPoint: typingsJapgolly.winrt.Windows.UI.Text.SelectionType.insertionPoint & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Text.SelectionType.none & Double = js.native
    
    /* 2 */ val normal: typingsJapgolly.winrt.Windows.UI.Text.SelectionType.normal & Double = js.native
    
    /* 4 */ val shape: typingsJapgolly.winrt.Windows.UI.Text.SelectionType.shape & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabAlignment")
  @js.native
  object TabAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TabAlignment & Double] = js.native
    
    /* 4 */ val bar: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment.bar & Double = js.native
    
    /* 1 */ val center: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment.center & Double = js.native
    
    /* 3 */ val decimal: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment.decimal & Double = js.native
    
    /* 0 */ val left: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment.left & Double = js.native
    
    /* 2 */ val right: typingsJapgolly.winrt.Windows.UI.Text.TabAlignment.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabLeader")
  @js.native
  object TabLeader extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TabLeader & Double] = js.native
    
    /* 2 */ val dashes: typingsJapgolly.winrt.Windows.UI.Text.TabLeader.dashes & Double = js.native
    
    /* 1 */ val dots: typingsJapgolly.winrt.Windows.UI.Text.TabLeader.dots & Double = js.native
    
    /* 5 */ @JSName("equals")
    val equals_ : equals & Double = js.native
    
    /* 3 */ val lines: typingsJapgolly.winrt.Windows.UI.Text.TabLeader.lines & Double = js.native
    
    /* 0 */ val spaces: typingsJapgolly.winrt.Windows.UI.Text.TabLeader.spaces & Double = js.native
    
    /* 4 */ val thickLines: typingsJapgolly.winrt.Windows.UI.Text.TabLeader.thickLines & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextConstants")
  @js.native
  open class TextConstants ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Text.TextConstants
  /* static members */
  object TextConstants {
    
    @JSGlobal("Windows.UI.Text.TextConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.TextConstants.autoColor")
    @js.native
    def autoColor: Color = js.native
    inline def autoColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.maxUnitCount")
    @js.native
    def maxUnitCount: Double = js.native
    inline def maxUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.minUnitCount")
    @js.native
    def minUnitCount: Double = js.native
    inline def minUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedColor")
    @js.native
    def undefinedColor: Color = js.native
    inline def undefinedColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFloatValue")
    @js.native
    def undefinedFloatValue: Double = js.native
    inline def undefinedFloatValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFloatValue")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStretch")
    @js.native
    def undefinedFontStretch: FontStretch = js.native
    inline def undefinedFontStretch_=(x: FontStretch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStretch")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStyle")
    @js.native
    def undefinedFontStyle: FontStyle = js.native
    inline def undefinedFontStyle_=(x: FontStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStyle")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedInt32Value")
    @js.native
    def undefinedInt32Value: Double = js.native
    inline def undefinedInt32Value_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedInt32Value")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.TextGetOptions")
  @js.native
  object TextGetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions & Double] = js.native
    
    /* 1 */ val adjustCrlf: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.adjustCrlf & Double = js.native
    
    /* 4 */ val allowFinalEop: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.allowFinalEop & Double = js.native
    
    /* 7 */ val formatRtf: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.formatRtf & Double = js.native
    
    /* 6 */ val includeNumbering: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.includeNumbering & Double = js.native
    
    /* 5 */ val noHidden: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.noHidden & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.none & Double = js.native
    
    /* 2 */ val useCrlf: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.useCrlf & Double = js.native
    
    /* 3 */ val useObjectText: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions.useObjectText & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextRangeUnit")
  @js.native
  object TextRangeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit & Double] = js.native
    
    /* 21 */ val allCaps: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.allCaps & Double = js.native
    
    /* 14 */ val bold: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.bold & Double = js.native
    
    /* 0 */ val character: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.character & Double = js.native
    
    /* 9 */ val characterFormat: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.characterFormat & Double = js.native
    
    /* 13 */ val cluster: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.cluster & Double = js.native
    
    /* 26 */ val disabled: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.disabled & Double = js.native
    
    /* 30 */ val fontBound: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.fontBound & Double = js.native
    
    /* 12 */ val hardParagraph: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.hardParagraph & Double = js.native
    
    /* 22 */ val hidden: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.hidden & Double = js.native
    
    /* 25 */ val imprint: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.imprint & Double = js.native
    
    /* 15 */ val italic: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.italic & Double = js.native
    
    /* 4 */ val line: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.line & Double = js.native
    
    /* 19 */ val link: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.link & Double = js.native
    
    /* 31 */ val linkProtected: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.linkProtected & Double = js.native
    
    /* 11 */ val `object`: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.`object` & Double = js.native
    
    /* 23 */ val outline: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.outline & Double = js.native
    
    /* 3 */ val paragraph: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.paragraph & Double = js.native
    
    /* 10 */ val paragraphFormat: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.paragraphFormat & Double = js.native
    
    /* 18 */ val protectedText: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.protectedText & Double = js.native
    
    /* 27 */ val revised: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.revised & Double = js.native
    
    /* 6 */ val screen: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.screen & Double = js.native
    
    /* 7 */ val section: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.section & Double = js.native
    
    /* 2 */ val sentence: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.sentence & Double = js.native
    
    /* 24 */ val shadow: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.shadow & Double = js.native
    
    /* 20 */ val smallCaps: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.smallCaps & Double = js.native
    
    /* 5 */ val story: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.story & Double = js.native
    
    /* 17 */ val strikethrough: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.strikethrough & Double = js.native
    
    /* 28 */ val subscript: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.subscript & Double = js.native
    
    /* 29 */ val superscript: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.superscript & Double = js.native
    
    /* 16 */ val underline: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.underline & Double = js.native
    
    /* 8 */ val window: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.window & Double = js.native
    
    /* 1 */ val word: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit.word & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextScript")
  @js.native
  object TextScript extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TextScript & Double] = js.native
    
    /* 10 */ val default: typingsJapgolly.winrt.Windows.UI.Text.TextScript.default & Double = js.native
    
    /* 40 */ val aboriginal: typingsJapgolly.winrt.Windows.UI.Text.TextScript.aboriginal & Double = js.native
    
    /* 1 */ val ansi: typingsJapgolly.winrt.Windows.UI.Text.TextScript.ansi & Double = js.native
    
    /* 7 */ val arabic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.arabic & Double = js.native
    
    /* 20 */ val armenian: typingsJapgolly.winrt.Windows.UI.Text.TextScript.armenian & Double = js.native
    
    /* 8 */ val baltic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.baltic & Double = js.native
    
    /* 24 */ val bengali: typingsJapgolly.winrt.Windows.UI.Text.TextScript.bengali & Double = js.native
    
    /* 16 */ val big5: typingsJapgolly.winrt.Windows.UI.Text.TextScript.big5 & Double = js.native
    
    /* 45 */ val braille: typingsJapgolly.winrt.Windows.UI.Text.TextScript.braille & Double = js.native
    
    /* 39 */ val cherokee: typingsJapgolly.winrt.Windows.UI.Text.TextScript.cherokee & Double = js.native
    
    /* 3 */ val cyrillic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.cyrillic & Double = js.native
    
    /* 62 */ val deseret: typingsJapgolly.winrt.Windows.UI.Text.TextScript.deseret & Double = js.native
    
    /* 23 */ val devanagari: typingsJapgolly.winrt.Windows.UI.Text.TextScript.devanagari & Double = js.native
    
    /* 2 */ val eastEurope: typingsJapgolly.winrt.Windows.UI.Text.TextScript.eastEurope & Double = js.native
    
    /* 54 */ val emoji: typingsJapgolly.winrt.Windows.UI.Text.TextScript.emoji & Double = js.native
    
    /* 38 */ val ethiopic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.ethiopic & Double = js.native
    
    /* 14 */ val gB2312: typingsJapgolly.winrt.Windows.UI.Text.TextScript.gB2312 & Double = js.native
    
    /* 36 */ val georgian: typingsJapgolly.winrt.Windows.UI.Text.TextScript.georgian & Double = js.native
    
    /* 55 */ val glagolitic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.glagolitic & Double = js.native
    
    /* 61 */ val gothic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.gothic & Double = js.native
    
    /* 4 */ val greek: typingsJapgolly.winrt.Windows.UI.Text.TextScript.greek & Double = js.native
    
    /* 26 */ val gujarati: typingsJapgolly.winrt.Windows.UI.Text.TextScript.gujarati & Double = js.native
    
    /* 25 */ val gurmukhi: typingsJapgolly.winrt.Windows.UI.Text.TextScript.gurmukhi & Double = js.native
    
    /* 15 */ val hangul: typingsJapgolly.winrt.Windows.UI.Text.TextScript.hangul & Double = js.native
    
    /* 6 */ val hebrew: typingsJapgolly.winrt.Windows.UI.Text.TextScript.hebrew & Double = js.native
    
    /* 37 */ val jamo: typingsJapgolly.winrt.Windows.UI.Text.TextScript.jamo & Double = js.native
    
    /* 30 */ val kannada: typingsJapgolly.winrt.Windows.UI.Text.TextScript.kannada & Double = js.native
    
    /* 52 */ val kayahli: typingsJapgolly.winrt.Windows.UI.Text.TextScript.kayahli & Double = js.native
    
    /* 51 */ val kharoshthi: typingsJapgolly.winrt.Windows.UI.Text.TextScript.kharoshthi & Double = js.native
    
    /* 43 */ val khmer: typingsJapgolly.winrt.Windows.UI.Text.TextScript.khmer & Double = js.native
    
    /* 33 */ val lao: typingsJapgolly.winrt.Windows.UI.Text.TextScript.lao & Double = js.native
    
    /* 47 */ val limbu: typingsJapgolly.winrt.Windows.UI.Text.TextScript.limbu & Double = js.native
    
    /* 56 */ val lisu: typingsJapgolly.winrt.Windows.UI.Text.TextScript.lisu & Double = js.native
    
    /* 19 */ val mac: typingsJapgolly.winrt.Windows.UI.Text.TextScript.mac & Double = js.native
    
    /* 31 */ val malayalam: typingsJapgolly.winrt.Windows.UI.Text.TextScript.malayalam & Double = js.native
    
    /* 44 */ val mongolian: typingsJapgolly.winrt.Windows.UI.Text.TextScript.mongolian & Double = js.native
    
    /* 35 */ val myanmar: typingsJapgolly.winrt.Windows.UI.Text.TextScript.myanmar & Double = js.native
    
    /* 58 */ val nKo: typingsJapgolly.winrt.Windows.UI.Text.TextScript.nKo & Double = js.native
    
    /* 49 */ val newTaiLue: typingsJapgolly.winrt.Windows.UI.Text.TextScript.newTaiLue & Double = js.native
    
    /* 18 */ val oem: typingsJapgolly.winrt.Windows.UI.Text.TextScript.oem & Double = js.native
    
    /* 41 */ val ogham: typingsJapgolly.winrt.Windows.UI.Text.TextScript.ogham & Double = js.native
    
    /* 27 */ val oriya: typingsJapgolly.winrt.Windows.UI.Text.TextScript.oriya & Double = js.native
    
    /* 59 */ val osmanya: typingsJapgolly.winrt.Windows.UI.Text.TextScript.osmanya & Double = js.native
    
    /* 17 */ val pC437: typingsJapgolly.winrt.Windows.UI.Text.TextScript.pC437 & Double = js.native
    
    /* 60 */ val phagsPa: typingsJapgolly.winrt.Windows.UI.Text.TextScript.phagsPa & Double = js.native
    
    /* 42 */ val runic: typingsJapgolly.winrt.Windows.UI.Text.TextScript.runic & Double = js.native
    
    /* 13 */ val shiftJis: typingsJapgolly.winrt.Windows.UI.Text.TextScript.shiftJis & Double = js.native
    
    /* 32 */ val sinhala: typingsJapgolly.winrt.Windows.UI.Text.TextScript.sinhala & Double = js.native
    
    /* 50 */ val sylotiNagri: typingsJapgolly.winrt.Windows.UI.Text.TextScript.sylotiNagri & Double = js.native
    
    /* 11 */ val symbol: typingsJapgolly.winrt.Windows.UI.Text.TextScript.symbol & Double = js.native
    
    /* 21 */ val syriac: typingsJapgolly.winrt.Windows.UI.Text.TextScript.syriac & Double = js.native
    
    /* 48 */ val taiLe: typingsJapgolly.winrt.Windows.UI.Text.TextScript.taiLe & Double = js.native
    
    /* 28 */ val tamil: typingsJapgolly.winrt.Windows.UI.Text.TextScript.tamil & Double = js.native
    
    /* 29 */ val telugu: typingsJapgolly.winrt.Windows.UI.Text.TextScript.telugu & Double = js.native
    
    /* 22 */ val thaana: typingsJapgolly.winrt.Windows.UI.Text.TextScript.thaana & Double = js.native
    
    /* 12 */ val thai: typingsJapgolly.winrt.Windows.UI.Text.TextScript.thai & Double = js.native
    
    /* 34 */ val tibetan: typingsJapgolly.winrt.Windows.UI.Text.TextScript.tibetan & Double = js.native
    
    /* 63 */ val tifinagh: typingsJapgolly.winrt.Windows.UI.Text.TextScript.tifinagh & Double = js.native
    
    /* 5 */ val turkish: typingsJapgolly.winrt.Windows.UI.Text.TextScript.turkish & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.TextScript.undefined & Double = js.native
    
    /* 53 */ val unicodeSymbol: typingsJapgolly.winrt.Windows.UI.Text.TextScript.unicodeSymbol & Double = js.native
    
    /* 57 */ val vai: typingsJapgolly.winrt.Windows.UI.Text.TextScript.vai & Double = js.native
    
    /* 9 */ val vietnamese: typingsJapgolly.winrt.Windows.UI.Text.TextScript.vietnamese & Double = js.native
    
    /* 46 */ val yi: typingsJapgolly.winrt.Windows.UI.Text.TextScript.yi & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextSetOptions")
  @js.native
  object TextSetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions & Double] = js.native
    
    /* 6 */ val applyRtfDocumentDefaults: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.applyRtfDocumentDefaults & Double = js.native
    
    /* 4 */ val checkTextLimit: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.checkTextLimit & Double = js.native
    
    /* 5 */ val formatRtf: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.formatRtf & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.none & Double = js.native
    
    /* 3 */ val unhide: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.unhide & Double = js.native
    
    /* 1 */ val unicodeBidi: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.unicodeBidi & Double = js.native
    
    /* 2 */ val unlink: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions.unlink & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.UnderlineType")
  @js.native
  object UnderlineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.UnderlineType & Double] = js.native
    
    /* 6 */ val dash: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.dash & Double = js.native
    
    /* 7 */ val dashDot: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.dashDot & Double = js.native
    
    /* 8 */ val dashDotDot: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.dashDotDot & Double = js.native
    
    /* 5 */ val dotted: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.dotted & Double = js.native
    
    /* 4 */ val double: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.double & Double = js.native
    
    /* 12 */ val doubleWave: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.doubleWave & Double = js.native
    
    /* 13 */ val heavyWave: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.heavyWave & Double = js.native
    
    /* 14 */ val longDash: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.longDash & Double = js.native
    
    /* 1 */ val none: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.none & Double = js.native
    
    /* 2 */ val single: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.single & Double = js.native
    
    /* 10 */ val thick: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thick & Double = js.native
    
    /* 15 */ val thickDash: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thickDash & Double = js.native
    
    /* 16 */ val thickDashDot: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thickDashDot & Double = js.native
    
    /* 17 */ val thickDashDotDot: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thickDashDotDot & Double = js.native
    
    /* 18 */ val thickDotted: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thickDotted & Double = js.native
    
    /* 19 */ val thickLongDash: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thickLongDash & Double = js.native
    
    /* 11 */ val thin: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.thin & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.undefined & Double = js.native
    
    /* 9 */ val wave: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.wave & Double = js.native
    
    /* 3 */ val words: typingsJapgolly.winrt.Windows.UI.Text.UnderlineType.words & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
  @js.native
  object VerticalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment & Double] = js.native
    
    /* 1 */ val baseline: typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment.baseline & Double = js.native
    
    /* 2 */ val bottom: typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment.bottom & Double = js.native
    
    /* 0 */ val top: typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment.top & Double = js.native
  }
}
