package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexWord.activexWordInts.`9999998`
import typingsJapgolly.activexWord.activexWordInts.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var AllCaps: Boolean | `9999999` | `9999998`
  
  var Animation: WdAnimation
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Bold: Boolean | `9999999` | `9999998`
  
  var BoldBi: Boolean | `9999999` | `9999998`
  
  var Borders: typingsJapgolly.activexWord.Word.Borders
  
  var Color: WdColor
  
  var ColorIndex: WdColorIndex
  
  var ColorIndexBi: WdColorIndex
  
  var ContextualAlternates: Double
  
  val Creator: Double
  
  var DiacriticColor: WdColor
  
  var DisableCharacterSpaceGrid: Boolean
  
  var DoubleStrikeThrough: Double
  
  val Duplicate: Font
  
  var Emboss: Boolean | `9999999` | `9999998`
  
  var EmphasisMark: WdEmphasisMark
  
  var Engrave: Boolean | `9999999` | `9999998`
  
  var Fill: FillFormat
  
  var Glow: GlowFormat
  
  def Grow(): Unit
  
  var Hidden: Double
  
  var Italic: Boolean | `9999999` | `9999998`
  
  var ItalicBi: Boolean | `9999999` | `9999998`
  
  var Kerning: Double
  
  var Ligatures: WdLigatures
  
  var Line: LineFormat
  
  var Name: String
  
  var NameAscii: String
  
  var NameBi: String
  
  var NameFarEast: String
  
  var NameOther: String
  
  var NumberForm: WdNumberForm
  
  var NumberSpacing: WdNumberSpacing
  
  var Outline: Double
  
  val Parent: Any
  
  var Position: Double
  
  var Reflection: ReflectionFormat
  
  def Reset(): Unit
  
  var Scaling: Double
  
  def SetAsTemplateDefault(): Unit
  
  val Shading: typingsJapgolly.activexWord.Word.Shading
  
  var Shadow: Double
  
  def Shrink(): Unit
  
  var Size: Double
  
  var SizeBi: Double
  
  var SmallCaps: Boolean | `9999999` | `9999998`
  
  var Spacing: Double
  
  var StrikeThrough: Double
  
  var StylisticSet: WdStylisticSet
  
  var Subscript: Boolean | `9999999` | `9999998`
  
  var Superscript: Boolean | `9999999` | `9999998`
  
  val TextColor: ColorFormat
  
  var TextShadow: ShadowFormat
  
  var ThreeD: ThreeDFormat
  
  var Underline: WdUnderline
  
  var UnderlineColor: WdColor
  
  /* private */ @JSName("Word.Font_typekey")
  var WordDotFont_typekey: Font
}
object Font {
  
  inline def apply(
    AllCaps: Boolean | `9999999` | `9999998`,
    Animation: WdAnimation,
    Application: Application,
    Bold: Boolean | `9999999` | `9999998`,
    BoldBi: Boolean | `9999999` | `9999998`,
    Borders: Borders,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    ColorIndexBi: WdColorIndex,
    ContextualAlternates: Double,
    Creator: Double,
    DiacriticColor: WdColor,
    DisableCharacterSpaceGrid: Boolean,
    DoubleStrikeThrough: Double,
    Duplicate: Font,
    Emboss: Boolean | `9999999` | `9999998`,
    EmphasisMark: WdEmphasisMark,
    Engrave: Boolean | `9999999` | `9999998`,
    Fill: FillFormat,
    Glow: GlowFormat,
    Grow: Callback,
    Hidden: Double,
    Italic: Boolean | `9999999` | `9999998`,
    ItalicBi: Boolean | `9999999` | `9999998`,
    Kerning: Double,
    Ligatures: WdLigatures,
    Line: LineFormat,
    Name: String,
    NameAscii: String,
    NameBi: String,
    NameFarEast: String,
    NameOther: String,
    NumberForm: WdNumberForm,
    NumberSpacing: WdNumberSpacing,
    Outline: Double,
    Parent: Any,
    Position: Double,
    Reflection: ReflectionFormat,
    Reset: Callback,
    Scaling: Double,
    SetAsTemplateDefault: Callback,
    Shading: Shading,
    Shadow: Double,
    Shrink: Callback,
    Size: Double,
    SizeBi: Double,
    SmallCaps: Boolean | `9999999` | `9999998`,
    Spacing: Double,
    StrikeThrough: Double,
    StylisticSet: WdStylisticSet,
    Subscript: Boolean | `9999999` | `9999998`,
    Superscript: Boolean | `9999999` | `9999998`,
    TextColor: ColorFormat,
    TextShadow: ShadowFormat,
    ThreeD: ThreeDFormat,
    Underline: WdUnderline,
    UnderlineColor: WdColor,
    WordDotFont_typekey: Font
  ): Font = {
    val __obj = js.Dynamic.literal(AllCaps = AllCaps.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], BoldBi = BoldBi.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], ColorIndexBi = ColorIndexBi.asInstanceOf[js.Any], ContextualAlternates = ContextualAlternates.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DiacriticColor = DiacriticColor.asInstanceOf[js.Any], DisableCharacterSpaceGrid = DisableCharacterSpaceGrid.asInstanceOf[js.Any], DoubleStrikeThrough = DoubleStrikeThrough.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], EmphasisMark = EmphasisMark.asInstanceOf[js.Any], Engrave = Engrave.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Grow = Grow.toJsFn, Hidden = Hidden.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], ItalicBi = ItalicBi.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Ligatures = Ligatures.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameBi = NameBi.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], NumberForm = NumberForm.asInstanceOf[js.Any], NumberSpacing = NumberSpacing.asInstanceOf[js.Any], Outline = Outline.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Reset = Reset.toJsFn, Scaling = Scaling.asInstanceOf[js.Any], SetAsTemplateDefault = SetAsTemplateDefault.toJsFn, Shading = Shading.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Shrink = Shrink.toJsFn, Size = Size.asInstanceOf[js.Any], SizeBi = SizeBi.asInstanceOf[js.Any], SmallCaps = SmallCaps.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], StylisticSet = StylisticSet.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextShadow = TextShadow.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], UnderlineColor = UnderlineColor.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Font_typekey")(WordDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setAllCaps(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "AllCaps", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: WdAnimation): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setBoldBi(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "BoldBi", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setColor(value: WdColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: WdColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setColorIndexBi(value: WdColorIndex): Self = StObject.set(x, "ColorIndexBi", value.asInstanceOf[js.Any])
    
    inline def setContextualAlternates(value: Double): Self = StObject.set(x, "ContextualAlternates", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDiacriticColor(value: WdColor): Self = StObject.set(x, "DiacriticColor", value.asInstanceOf[js.Any])
    
    inline def setDisableCharacterSpaceGrid(value: Boolean): Self = StObject.set(x, "DisableCharacterSpaceGrid", value.asInstanceOf[js.Any])
    
    inline def setDoubleStrikeThrough(value: Double): Self = StObject.set(x, "DoubleStrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: Font): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    inline def setEmboss(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Emboss", value.asInstanceOf[js.Any])
    
    inline def setEmphasisMark(value: WdEmphasisMark): Self = StObject.set(x, "EmphasisMark", value.asInstanceOf[js.Any])
    
    inline def setEngrave(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Engrave", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    inline def setGrow(value: Callback): Self = StObject.set(x, "Grow", value.toJsFn)
    
    inline def setHidden(value: Double): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setItalicBi(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "ItalicBi", value.asInstanceOf[js.Any])
    
    inline def setKerning(value: Double): Self = StObject.set(x, "Kerning", value.asInstanceOf[js.Any])
    
    inline def setLigatures(value: WdLigatures): Self = StObject.set(x, "Ligatures", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameAscii(value: String): Self = StObject.set(x, "NameAscii", value.asInstanceOf[js.Any])
    
    inline def setNameBi(value: String): Self = StObject.set(x, "NameBi", value.asInstanceOf[js.Any])
    
    inline def setNameFarEast(value: String): Self = StObject.set(x, "NameFarEast", value.asInstanceOf[js.Any])
    
    inline def setNameOther(value: String): Self = StObject.set(x, "NameOther", value.asInstanceOf[js.Any])
    
    inline def setNumberForm(value: WdNumberForm): Self = StObject.set(x, "NumberForm", value.asInstanceOf[js.Any])
    
    inline def setNumberSpacing(value: WdNumberSpacing): Self = StObject.set(x, "NumberSpacing", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: Double): Self = StObject.set(x, "Outline", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setScaling(value: Double): Self = StObject.set(x, "Scaling", value.asInstanceOf[js.Any])
    
    inline def setSetAsTemplateDefault(value: Callback): Self = StObject.set(x, "SetAsTemplateDefault", value.toJsFn)
    
    inline def setShading(value: Shading): Self = StObject.set(x, "Shading", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Double): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setShrink(value: Callback): Self = StObject.set(x, "Shrink", value.toJsFn)
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeBi(value: Double): Self = StObject.set(x, "SizeBi", value.asInstanceOf[js.Any])
    
    inline def setSmallCaps(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "SmallCaps", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "Spacing", value.asInstanceOf[js.Any])
    
    inline def setStrikeThrough(value: Double): Self = StObject.set(x, "StrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setStylisticSet(value: WdStylisticSet): Self = StObject.set(x, "StylisticSet", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: Boolean | `9999999` | `9999998`): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: ColorFormat): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextShadow(value: ShadowFormat): Self = StObject.set(x, "TextShadow", value.asInstanceOf[js.Any])
    
    inline def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: WdUnderline): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColor(value: WdColor): Self = StObject.set(x, "UnderlineColor", value.asInstanceOf[js.Any])
    
    inline def setWordDotFont_typekey(value: Font): Self = StObject.set(x, "Word.Font_typekey", value.asInstanceOf[js.Any])
  }
}
