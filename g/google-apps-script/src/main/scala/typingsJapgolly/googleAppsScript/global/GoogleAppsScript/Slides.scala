package typingsJapgolly.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slides {
  
  /**
    * The alignment position to apply.
    */
  @JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
  @js.native
  object AlignmentPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition & Double
      ] = js.native
    
    /* 0 */ val CENTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.CENTER & Double = js.native
    
    /* 1 */ val HORIZONTAL_CENTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.HORIZONTAL_CENTER & Double = js.native
    
    /* 2 */ val VERTICAL_CENTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.VERTICAL_CENTER & Double = js.native
  }
  
  /**
    * The kinds of start and end forms with which linear geometry can be rendered.
    *
    * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
    * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
  @js.native
  object ArrowStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle & Double] = js.native
    
    /* 3 */ val FILL_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_ARROW & Double = js.native
    
    /* 4 */ val FILL_CIRCLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_CIRCLE & Double = js.native
    
    /* 6 */ val FILL_DIAMOND: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_DIAMOND & Double = js.native
    
    /* 5 */ val FILL_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_SQUARE & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.NONE & Double = js.native
    
    /* 7 */ val OPEN_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_ARROW & Double = js.native
    
    /* 8 */ val OPEN_CIRCLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_CIRCLE & Double = js.native
    
    /* 10 */ val OPEN_DIAMOND: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_DIAMOND & Double = js.native
    
    /* 9 */ val OPEN_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_SQUARE & Double = js.native
    
    /* 2 */ val STEALTH_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.STEALTH_ARROW & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The types of auto text.
    */
  @JSGlobal("GoogleAppsScript.Slides.AutoTextType")
  @js.native
  object AutoTextType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoTextType & Double] = js.native
    
    /* 1 */ val SLIDE_NUMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoTextType.SLIDE_NUMBER & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.AutoTextType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The table cell merge states.
    */
  @JSGlobal("GoogleAppsScript.Slides.CellMergeState")
  @js.native
  object CellMergeState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.CellMergeState & Double] = js.native
    
    /* 1 */ val HEAD: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.HEAD & Double = js.native
    
    /* 2 */ val MERGED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.MERGED & Double = js.native
    
    /* 0 */ val NORMAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.NORMAL & Double = js.native
  }
  
  /**
    * The content alignments for a Shape or TableCell. The supported alignments
    * correspond to predefined text anchoring types from the ECMA-376 standard.
    *
    * More information on those alignments can be found in the description of
    * the ST_TextAnchoringType simple type in section 20.1.10.59 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
  @js.native
  object ContentAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment & Double
      ] = js.native
    
    /* 3 */ val BOTTOM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.BOTTOM & Double = js.native
    
    /* 2 */ val MIDDLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.MIDDLE & Double = js.native
    
    /* 1 */ val TOP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.TOP & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The kinds of dashes with which linear geometry can be rendered. These values are based on the
    * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.DashStyle")
  @js.native
  object DashStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle & Double] = js.native
    
    /* 3 */ val DASH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DASH & Double = js.native
    
    /* 4 */ val DASH_DOT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DASH_DOT & Double = js.native
    
    /* 2 */ val DOT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DOT & Double = js.native
    
    /* 5 */ val LONG_DASH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH & Double = js.native
    
    /* 6 */ val LONG_DASH_DOT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH_DOT & Double = js.native
    
    /* 1 */ val SOLID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.SOLID & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The kinds of fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.FillType")
  @js.native
  object FillType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.FillType & Double] = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.FillType.NONE & Double = js.native
    
    /* 2 */ val SOLID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.FillType.SOLID & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.FillType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The line category.
    *
    * The exact LineType created is determined based on the category and how it's routed to
    * connect to other page elements.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineCategory")
  @js.native
  object LineCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineCategory & Double] = js.native
    
    /* 2 */ val BENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineCategory.BENT & Double = js.native
    
    /* 3 */ val CURVED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineCategory.CURVED & Double = js.native
    
    /* 1 */ val STRAIGHT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineCategory.STRAIGHT & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineCategory.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The kinds of line fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineFillType")
  @js.native
  object LineFillType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFillType & Double] = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFillType.NONE & Double = js.native
    
    /* 2 */ val SOLID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFillType.SOLID & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineFillType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The line types.
    *
    * Derived from a subset of the values of the "ST_ShapeType" simple type in section 20.1.10.55 of
    * "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineType")
  @js.native
  object LineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType & Double] = js.native
    
    /* 2 */ val BENT_CONNECTOR_2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_2 & Double = js.native
    
    /* 3 */ val BENT_CONNECTOR_3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_3 & Double = js.native
    
    /* 4 */ val BENT_CONNECTOR_4: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_4 & Double = js.native
    
    /* 5 */ val BENT_CONNECTOR_5: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_5 & Double = js.native
    
    /* 6 */ val CURVED_CONNECTOR_2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_2 & Double = js.native
    
    /* 7 */ val CURVED_CONNECTOR_3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_3 & Double = js.native
    
    /* 8 */ val CURVED_CONNECTOR_4: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_4 & Double = js.native
    
    /* 9 */ val CURVED_CONNECTOR_5: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_5 & Double = js.native
    
    /* 1 */ val STRAIGHT_CONNECTOR_1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.STRAIGHT_CONNECTOR_1 & Double = js.native
    
    /* 10 */ val STRAIGHT_LINE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.STRAIGHT_LINE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LineType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The types of a Link.
    */
  @JSGlobal("GoogleAppsScript.Slides.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType & Double] = js.native
    
    /* 3 */ val SLIDE_ID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_ID & Double = js.native
    
    /* 4 */ val SLIDE_INDEX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_INDEX & Double = js.native
    
    /* 2 */ val SLIDE_POSITION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_POSITION & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType.UNSUPPORTED & Double = js.native
    
    /* 1 */ val URL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.LinkType.URL & Double = js.native
  }
  
  /**
    * Preset patterns of glyphs for lists in text.
    *
    * These presets use these glyphs:
    *
    * ARROW: An arrow, ➔, corresponding to a Unicode U+2794 code point
    *
    * ARROW3D: An arrow with 3D shading, ➢, corresponding to a Unicode U+27a2 code point
    *
    * CHECKBOX: A hollow square, ❏, corresponding to a Unicode U+274f code point
    *
    * CIRCLE: A hollow circle, ○, corresponding to a Unicode U+25cb code point
    *
    * DIAMOND: A solid diamond, ◆, corresponding to a Unicode U+25c6 code point
    *
    * `DIAMONDX: A diamond with an 'x', ❖, corresponding to a Unicode U+2756 code point
    *
    * HOLLOWDIAMOND: A hollow diamond, ◇, corresponding to a Unicode U+25c7 code point
    *
    * DISC: A solid circle, ●, corresponding to a Unicode U+25cf code point
    *
    * SQUARE: A solid square, ■, corresponding to a Unicode U+25a0 code point
    *
    * STAR: A star, ★, corresponding to a Unicode U+2605 code point
    *
    * ALPHA: A lowercase letter, like 'a', 'b', or 'c'.
    *
    * UPPERALPHA: An uppercase letter, like 'A', 'B', or 'C'.
    *
    * DIGIT: A number, like '1', '2', or '3'.
    *
    * ZERODIGIT: A number where single digit numbers are prefixed with a zero, like '01', '02',
    *       or '03'. Numbers with more than one digit are not prefixed a zero.
    *
    * ROMAN: A lowercase roman numeral, like 'i', 'ii', or 'iii'.
    *
    * UPPERROMAN: A uppercase roman numeral, like 'I', 'II', or 'III'.
    *
    * LEFTTRIANGLE: A triangle pointing left, ◄, corresponding to a Unicode U+25c4 code
    *       point
    */
  @JSGlobal("GoogleAppsScript.Slides.ListPreset")
  @js.native
  object ListPreset extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset & Double] = js.native
    
    /* 5 */ val ARROW3D_CIRCLE_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ARROW3D_CIRCLE_SQUARE & Double = js.native
    
    /* 3 */ val ARROW_DIAMOND_DISC: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ARROW_DIAMOND_DISC & Double = js.native
    
    /* 2 */ val CHECKBOX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.CHECKBOX & Double = js.native
    
    /* 1 */ val DIAMONDX_ARROW3D_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMONDX_ARROW3D_SQUARE & Double = js.native
    
    /* 7 */ val DIAMONDX_HOLLOWDIAMOND_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMONDX_HOLLOWDIAMOND_SQUARE & Double = js.native
    
    /* 8 */ val DIAMOND_CIRCLE_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMOND_CIRCLE_SQUARE & Double = js.native
    
    /* 9 */ val DIGIT_ALPHA_ROMAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_ALPHA_ROMAN & Double = js.native
    
    /* 10 */ val DIGIT_ALPHA_ROMAN_PARENS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_ALPHA_ROMAN_PARENS & Double = js.native
    
    /* 11 */ val DIGIT_NESTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_NESTED & Double = js.native
    
    /* 0 */ val DISC_CIRCLE_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DISC_CIRCLE_SQUARE & Double = js.native
    
    /* 6 */ val LEFTTRIANGLE_DIAMOND_DISC: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.LEFTTRIANGLE_DIAMOND_DISC & Double = js.native
    
    /* 4 */ val STAR_CIRCLE_SQUARE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.STAR_CIRCLE_SQUARE & Double = js.native
    
    /* 12 */ val UPPERALPHA_ALPHA_ROMAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.UPPERALPHA_ALPHA_ROMAN & Double = js.native
    
    /* 13 */ val UPPERROMAN_UPPERALPHA_DIGIT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.UPPERROMAN_UPPERALPHA_DIGIT & Double = js.native
    
    /* 14 */ val ZERODIGIT_ALPHA_ROMAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ZERODIGIT_ALPHA_ROMAN & Double = js.native
  }
  
  /**
    * The kinds of page backgrounds.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
  @js.native
  object PageBackgroundType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType & Double
      ] = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.NONE & Double = js.native
    
    /* 3 */ val PICTURE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.PICTURE & Double = js.native
    
    /* 2 */ val SOLID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.SOLID & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The page element type.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageElementType")
  @js.native
  object PageElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType & Double
      ] = js.native
    
    /* 5 */ val GROUP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.GROUP & Double = js.native
    
    /* 2 */ val IMAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.IMAGE & Double = js.native
    
    /* 6 */ val LINE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.LINE & Double = js.native
    
    /* 1 */ val SHAPE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.SHAPE & Double = js.native
    
    /* 8 */ val SHEETS_CHART: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.SHEETS_CHART & Double = js.native
    
    /* 4 */ val TABLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.TABLE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.UNSUPPORTED & Double = js.native
    
    /* 3 */ val VIDEO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.VIDEO & Double = js.native
    
    /* 7 */ val WORD_ART: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageElementType.WORD_ART & Double = js.native
  }
  
  /**
    * The page types.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageType")
  @js.native
  object PageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageType & Double] = js.native
    
    /* 2 */ val LAYOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageType.LAYOUT & Double = js.native
    
    /* 3 */ val MASTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageType.MASTER & Double = js.native
    
    /* 1 */ val SLIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageType.SLIDE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PageType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The types of text alignment for a paragraph.
    */
  @JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment & Double
      ] = js.native
    
    /* 2 */ val CENTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.CENTER & Double = js.native
    
    /* 3 */ val END: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.END & Double = js.native
    
    /* 4 */ val JUSTIFIED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.JUSTIFIED & Double = js.native
    
    /* 1 */ val START: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.START & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
    * ECMA-376 standard. More information on those shapes can be found in the description of the
    * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
    * Markup Language Reference", part 1 of ECMA-376 5th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
  @js.native
  object PlaceholderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType & Double
      ] = js.native
    
    /* 2 */ val BODY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.BODY & Double = js.native
    
    /* 5 */ val CENTERED_TITLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CENTERED_TITLE & Double = js.native
    
    /* 3 */ val CHART: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CHART & Double = js.native
    
    /* 4 */ val CLIP_ART: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CLIP_ART & Double = js.native
    
    /* 7 */ val DATE_AND_TIME: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.DATE_AND_TIME & Double = js.native
    
    /* 6 */ val DIAGRAM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.DIAGRAM & Double = js.native
    
    /* 8 */ val FOOTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.FOOTER & Double = js.native
    
    /* 9 */ val HEADER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.HEADER & Double = js.native
    
    /* 10 */ val MEDIA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.MEDIA & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.NONE & Double = js.native
    
    /* 11 */ val OBJECT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.OBJECT & Double = js.native
    
    /* 12 */ val PICTURE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.PICTURE & Double = js.native
    
    /* 17 */ val SLIDE_IMAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_IMAGE & Double = js.native
    
    /* 13 */ val SLIDE_NUMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_NUMBER & Double = js.native
    
    /* 14 */ val SUBTITLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SUBTITLE & Double = js.native
    
    /* 15 */ val TABLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.TABLE & Double = js.native
    
    /* 16 */ val TITLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.TITLE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * Predefined layouts. These are commonly found layouts in presentations. However, there is no
    * guarantee that these layouts are present in the current master as they could have been deleted or
    * not part of the used theme. Additionally, the placeholders on each layout may have been changed.
    */
  @JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
  @js.native
  object PredefinedLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout & Double
      ] = js.native
    
    /* 11 */ val BIG_NUMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.BIG_NUMBER & Double = js.native
    
    /* 1 */ val BLANK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.BLANK & Double = js.native
    
    /* 2 */ val CAPTION_ONLY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.CAPTION_ONLY & Double = js.native
    
    /* 10 */ val MAIN_POINT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.MAIN_POINT & Double = js.native
    
    /* 9 */ val ONE_COLUMN_TEXT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.ONE_COLUMN_TEXT & Double = js.native
    
    /* 7 */ val SECTION_HEADER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.SECTION_HEADER & Double = js.native
    
    /* 8 */ val SECTION_TITLE_AND_DESCRIPTION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.SECTION_TITLE_AND_DESCRIPTION & Double = js.native
    
    /* 3 */ val TITLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE & Double = js.native
    
    /* 4 */ val TITLE_AND_BODY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_AND_BODY & Double = js.native
    
    /* 5 */ val TITLE_AND_TWO_COLUMNS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_AND_TWO_COLUMNS & Double = js.native
    
    /* 6 */ val TITLE_ONLY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_ONLY & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.UNSUPPORTED & Double = js.native
  }
  
  /**
    * Type of Selection.
    *
    * The SelectionType represents the most specific type of one or more objects that are
    * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
    * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
    * using the Selection.getPageElementRange and the Page can be retrieved from the
    * Selection.getCurrentPage.
    */
  @JSGlobal("GoogleAppsScript.Slides.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType & Double] = js.native
    
    /* 6 */ val CURRENT_PAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.CURRENT_PAGE & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.NONE & Double = js.native
    
    /* 4 */ val PAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE & Double = js.native
    
    /* 5 */ val PAGE_ELEMENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE_ELEMENT & Double = js.native
    
    /* 3 */ val TABLE_CELL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TABLE_CELL & Double = js.native
    
    /* 2 */ val TEXT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TEXT & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SelectionType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
    * More information on those shapes can be found in the description of the "ST_ShapeType" simple
    * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
    * Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType & Double] = js.native
    
    /* 5 */ val ARC: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARC & Double = js.native
    
    /* 133 */ val ARROW_EAST: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_EAST & Double = js.native
    
    /* 135 */ val ARROW_NORTH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH & Double = js.native
    
    /* 134 */ val ARROW_NORTH_EAST: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH_EAST & Double = js.native
    
    /* 6 */ val BENT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BENT_ARROW & Double = js.native
    
    /* 7 */ val BENT_UP_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BENT_UP_ARROW & Double = js.native
    
    /* 8 */ val BEVEL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BEVEL & Double = js.native
    
    /* 9 */ val BLOCK_ARC: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BLOCK_ARC & Double = js.native
    
    /* 10 */ val BRACE_PAIR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BRACE_PAIR & Double = js.native
    
    /* 11 */ val BRACKET_PAIR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BRACKET_PAIR & Double = js.native
    
    /* 12 */ val CAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CAN & Double = js.native
    
    /* 13 */ val CHEVRON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CHEVRON & Double = js.native
    
    /* 14 */ val CHORD: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CHORD & Double = js.native
    
    /* 15 */ val CLOUD: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CLOUD & Double = js.native
    
    /* 141 */ val CLOUD_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CLOUD_CALLOUT & Double = js.native
    
    /* 16 */ val CORNER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CORNER & Double = js.native
    
    /* 17 */ val CUBE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CUBE & Double = js.native
    
    /* 18 */ val CURVED_DOWN_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_DOWN_ARROW & Double = js.native
    
    /* 19 */ val CURVED_LEFT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_LEFT_ARROW & Double = js.native
    
    /* 20 */ val CURVED_RIGHT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_RIGHT_ARROW & Double = js.native
    
    /* 21 */ val CURVED_UP_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_UP_ARROW & Double = js.native
    
    /* 142 */ val CUSTOM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CUSTOM & Double = js.native
    
    /* 22 */ val DECAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DECAGON & Double = js.native
    
    /* 23 */ val DIAGONAL_STRIPE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DIAGONAL_STRIPE & Double = js.native
    
    /* 24 */ val DIAMOND: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DIAMOND & Double = js.native
    
    /* 25 */ val DODECAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DODECAGON & Double = js.native
    
    /* 26 */ val DONUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DONUT & Double = js.native
    
    /* 27 */ val DOUBLE_WAVE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOUBLE_WAVE & Double = js.native
    
    /* 28 */ val DOWN_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW & Double = js.native
    
    /* 29 */ val DOWN_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW_CALLOUT & Double = js.native
    
    /* 4 */ val ELLIPSE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE & Double = js.native
    
    /* 139 */ val ELLIPSE_RIBBON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON & Double = js.native
    
    /* 140 */ val ELLIPSE_RIBBON_2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON_2 & Double = js.native
    
    /* 104 */ val FLOW_CHART_ALTERNATE_PROCESS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ALTERNATE_PROCESS & Double = js.native
    
    /* 105 */ val FLOW_CHART_COLLATE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_COLLATE & Double = js.native
    
    /* 106 */ val FLOW_CHART_CONNECTOR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_CONNECTOR & Double = js.native
    
    /* 107 */ val FLOW_CHART_DECISION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DECISION & Double = js.native
    
    /* 108 */ val FLOW_CHART_DELAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DELAY & Double = js.native
    
    /* 109 */ val FLOW_CHART_DISPLAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DISPLAY & Double = js.native
    
    /* 110 */ val FLOW_CHART_DOCUMENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DOCUMENT & Double = js.native
    
    /* 111 */ val FLOW_CHART_EXTRACT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_EXTRACT & Double = js.native
    
    /* 112 */ val FLOW_CHART_INPUT_OUTPUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INPUT_OUTPUT & Double = js.native
    
    /* 113 */ val FLOW_CHART_INTERNAL_STORAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INTERNAL_STORAGE & Double = js.native
    
    /* 114 */ val FLOW_CHART_MAGNETIC_DISK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DISK & Double = js.native
    
    /* 115 */ val FLOW_CHART_MAGNETIC_DRUM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DRUM & Double = js.native
    
    /* 116 */ val FLOW_CHART_MAGNETIC_TAPE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_TAPE & Double = js.native
    
    /* 117 */ val FLOW_CHART_MANUAL_INPUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_INPUT & Double = js.native
    
    /* 118 */ val FLOW_CHART_MANUAL_OPERATION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_OPERATION & Double = js.native
    
    /* 119 */ val FLOW_CHART_MERGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MERGE & Double = js.native
    
    /* 120 */ val FLOW_CHART_MULTIDOCUMENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MULTIDOCUMENT & Double = js.native
    
    /* 121 */ val FLOW_CHART_OFFLINE_STORAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFLINE_STORAGE & Double = js.native
    
    /* 122 */ val FLOW_CHART_OFFPAGE_CONNECTOR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFPAGE_CONNECTOR & Double = js.native
    
    /* 123 */ val FLOW_CHART_ONLINE_STORAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ONLINE_STORAGE & Double = js.native
    
    /* 124 */ val FLOW_CHART_OR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OR & Double = js.native
    
    /* 125 */ val FLOW_CHART_PREDEFINED_PROCESS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREDEFINED_PROCESS & Double = js.native
    
    /* 126 */ val FLOW_CHART_PREPARATION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREPARATION & Double = js.native
    
    /* 127 */ val FLOW_CHART_PROCESS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PROCESS & Double = js.native
    
    /* 128 */ val FLOW_CHART_PUNCHED_CARD: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_CARD & Double = js.native
    
    /* 129 */ val FLOW_CHART_PUNCHED_TAPE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_TAPE & Double = js.native
    
    /* 130 */ val FLOW_CHART_SORT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SORT & Double = js.native
    
    /* 131 */ val FLOW_CHART_SUMMING_JUNCTION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SUMMING_JUNCTION & Double = js.native
    
    /* 132 */ val FLOW_CHART_TERMINATOR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_TERMINATOR & Double = js.native
    
    /* 30 */ val FOLDED_CORNER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FOLDED_CORNER & Double = js.native
    
    /* 31 */ val FRAME: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FRAME & Double = js.native
    
    /* 32 */ val HALF_FRAME: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HALF_FRAME & Double = js.native
    
    /* 33 */ val HEART: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEART & Double = js.native
    
    /* 34 */ val HEPTAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEPTAGON & Double = js.native
    
    /* 35 */ val HEXAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEXAGON & Double = js.native
    
    /* 36 */ val HOME_PLATE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HOME_PLATE & Double = js.native
    
    /* 37 */ val HORIZONTAL_SCROLL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HORIZONTAL_SCROLL & Double = js.native
    
    /* 38 */ val IRREGULAR_SEAL_1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_1 & Double = js.native
    
    /* 39 */ val IRREGULAR_SEAL_2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_2 & Double = js.native
    
    /* 40 */ val LEFT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW & Double = js.native
    
    /* 41 */ val LEFT_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW_CALLOUT & Double = js.native
    
    /* 42 */ val LEFT_BRACE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACE & Double = js.native
    
    /* 43 */ val LEFT_BRACKET: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACKET & Double = js.native
    
    /* 44 */ val LEFT_RIGHT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW & Double = js.native
    
    /* 45 */ val LEFT_RIGHT_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW_CALLOUT & Double = js.native
    
    /* 46 */ val LEFT_RIGHT_UP_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_UP_ARROW & Double = js.native
    
    /* 47 */ val LEFT_UP_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_UP_ARROW & Double = js.native
    
    /* 48 */ val LIGHTNING_BOLT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LIGHTNING_BOLT & Double = js.native
    
    /* 49 */ val MATH_DIVIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_DIVIDE & Double = js.native
    
    /* 50 */ val MATH_EQUAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_EQUAL & Double = js.native
    
    /* 51 */ val MATH_MINUS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_MINUS & Double = js.native
    
    /* 52 */ val MATH_MULTIPLY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_MULTIPLY & Double = js.native
    
    /* 53 */ val MATH_NOT_EQUAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_NOT_EQUAL & Double = js.native
    
    /* 54 */ val MATH_PLUS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_PLUS & Double = js.native
    
    /* 55 */ val MOON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MOON & Double = js.native
    
    /* 57 */ val NOTCHED_RIGHT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.NOTCHED_RIGHT_ARROW & Double = js.native
    
    /* 56 */ val NO_SMOKING: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.NO_SMOKING & Double = js.native
    
    /* 58 */ val OCTAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.OCTAGON & Double = js.native
    
    /* 59 */ val PARALLELOGRAM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PARALLELOGRAM & Double = js.native
    
    /* 60 */ val PENTAGON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PENTAGON & Double = js.native
    
    /* 61 */ val PIE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PIE & Double = js.native
    
    /* 62 */ val PLAQUE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PLAQUE & Double = js.native
    
    /* 63 */ val PLUS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PLUS & Double = js.native
    
    /* 64 */ val QUAD_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW & Double = js.native
    
    /* 65 */ val QUAD_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW_CALLOUT & Double = js.native
    
    /* 2 */ val RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RECTANGLE & Double = js.native
    
    /* 66 */ val RIBBON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIBBON & Double = js.native
    
    /* 67 */ val RIBBON_2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIBBON_2 & Double = js.native
    
    /* 68 */ val RIGHT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW & Double = js.native
    
    /* 69 */ val RIGHT_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW_CALLOUT & Double = js.native
    
    /* 70 */ val RIGHT_BRACE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACE & Double = js.native
    
    /* 71 */ val RIGHT_BRACKET: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACKET & Double = js.native
    
    /* 75 */ val RIGHT_TRIANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_TRIANGLE & Double = js.native
    
    /* 72 */ val ROUND_1_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_1_RECTANGLE & Double = js.native
    
    /* 73 */ val ROUND_2_DIAGONAL_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_DIAGONAL_RECTANGLE & Double = js.native
    
    /* 74 */ val ROUND_2_SAME_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_SAME_RECTANGLE & Double = js.native
    
    /* 3 */ val ROUND_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_RECTANGLE & Double = js.native
    
    /* 76 */ val SMILEY_FACE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SMILEY_FACE & Double = js.native
    
    /* 77 */ val SNIP_1_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_1_RECTANGLE & Double = js.native
    
    /* 78 */ val SNIP_2_DIAGONAL_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_DIAGONAL_RECTANGLE & Double = js.native
    
    /* 79 */ val SNIP_2_SAME_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_SAME_RECTANGLE & Double = js.native
    
    /* 80 */ val SNIP_ROUND_RECTANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_ROUND_RECTANGLE & Double = js.native
    
    /* 136 */ val SPEECH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SPEECH & Double = js.native
    
    /* 137 */ val STARBURST: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STARBURST & Double = js.native
    
    /* 81 */ val STAR_10: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_10 & Double = js.native
    
    /* 82 */ val STAR_12: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_12 & Double = js.native
    
    /* 83 */ val STAR_16: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_16 & Double = js.native
    
    /* 84 */ val STAR_24: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_24 & Double = js.native
    
    /* 85 */ val STAR_32: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_32 & Double = js.native
    
    /* 86 */ val STAR_4: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_4 & Double = js.native
    
    /* 87 */ val STAR_5: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_5 & Double = js.native
    
    /* 88 */ val STAR_6: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_6 & Double = js.native
    
    /* 89 */ val STAR_7: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_7 & Double = js.native
    
    /* 90 */ val STAR_8: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_8 & Double = js.native
    
    /* 91 */ val STRIPED_RIGHT_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STRIPED_RIGHT_ARROW & Double = js.native
    
    /* 92 */ val SUN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SUN & Double = js.native
    
    /* 138 */ val TEARDROP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TEARDROP & Double = js.native
    
    /* 1 */ val TEXT_BOX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TEXT_BOX & Double = js.native
    
    /* 93 */ val TRAPEZOID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TRAPEZOID & Double = js.native
    
    /* 94 */ val TRIANGLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TRIANGLE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UNSUPPORTED & Double = js.native
    
    /* 95 */ val UP_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW & Double = js.native
    
    /* 96 */ val UP_ARROW_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW_CALLOUT & Double = js.native
    
    /* 97 */ val UP_DOWN_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_DOWN_ARROW & Double = js.native
    
    /* 98 */ val UTURN_ARROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UTURN_ARROW & Double = js.native
    
    /* 99 */ val VERTICAL_SCROLL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.VERTICAL_SCROLL & Double = js.native
    
    /* 100 */ val WAVE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WAVE & Double = js.native
    
    /* 101 */ val WEDGE_ELLIPSE_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ELLIPSE_CALLOUT & Double = js.native
    
    /* 102 */ val WEDGE_RECTANGLE_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_RECTANGLE_CALLOUT & Double = js.native
    
    /* 103 */ val WEDGE_ROUND_RECTANGLE_CALLOUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ROUND_RECTANGLE_CALLOUT & Double = js.native
  }
  
  /**
    * The Sheets chart's embed type.
    */
  @JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
  @js.native
  object SheetsChartEmbedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType & Double
      ] = js.native
    
    /* 1 */ val IMAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType.IMAGE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The mode of links between slides.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
  @js.native
  object SlideLinkingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode & Double
      ] = js.native
    
    /* 1 */ val LINKED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.LINKED & Double = js.native
    
    /* 2 */ val NOT_LINKED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.NOT_LINKED & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The relative position of a Slide.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlidePosition")
  @js.native
  object SlidePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlidePosition & Double] = js.native
    
    /* 2 */ val FIRST_SLIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.FIRST_SLIDE & Double = js.native
    
    /* 3 */ val LAST_SLIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.LAST_SLIDE & Double = js.native
    
    /* 0 */ val NEXT_SLIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.NEXT_SLIDE & Double = js.native
    
    /* 1 */ val PREVIOUS_SLIDE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.PREVIOUS_SLIDE & Double = js.native
  }
  
  /**
    * The different modes for paragraph spacing.
    */
  @JSGlobal("GoogleAppsScript.Slides.SpacingMode")
  @js.native
  object SpacingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SpacingMode & Double] = js.native
    
    /* 2 */ val COLLAPSE_LISTS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.COLLAPSE_LISTS & Double = js.native
    
    /* 1 */ val NEVER_COLLAPSE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.NEVER_COLLAPSE & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The text vertical offset from its normal position.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
  @js.native
  object TextBaselineOffset extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset & Double
      ] = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.NONE & Double = js.native
    
    /* 3 */ val SUBSCRIPT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.SUBSCRIPT & Double = js.native
    
    /* 2 */ val SUPERSCRIPT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.SUPERSCRIPT & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The directions text can flow in.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextDirection & Double] = js.native
    
    /* 1 */ val LEFT_TO_RIGHT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextDirection.LEFT_TO_RIGHT & Double = js.native
    
    /* 2 */ val RIGHT_TO_LEFT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextDirection.RIGHT_TO_LEFT & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextDirection.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The name of an entry in the page's color scheme.
    */
  @JSGlobal("GoogleAppsScript.Slides.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType & Double] = js.native
    
    /* 5 */ val ACCENT1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT1 & Double = js.native
    
    /* 6 */ val ACCENT2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT2 & Double = js.native
    
    /* 7 */ val ACCENT3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT3 & Double = js.native
    
    /* 8 */ val ACCENT4: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT4 & Double = js.native
    
    /* 9 */ val ACCENT5: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT5 & Double = js.native
    
    /* 10 */ val ACCENT6: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT6 & Double = js.native
    
    /* 1 */ val DARK1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.DARK1 & Double = js.native
    
    /* 3 */ val DARK2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.DARK2 & Double = js.native
    
    /* 12 */ val FOLLOWED_HYPERLINK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.FOLLOWED_HYPERLINK & Double = js.native
    
    /* 11 */ val HYPERLINK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.HYPERLINK & Double = js.native
    
    /* 2 */ val LIGHT1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.LIGHT1 & Double = js.native
    
    /* 4 */ val LIGHT2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.LIGHT2 & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * The video source types.
    */
  @JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
  @js.native
  object VideoSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType & Double
      ] = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType.UNSUPPORTED & Double = js.native
    
    /* 1 */ val YOUTUBE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType.YOUTUBE & Double = js.native
  }
}
