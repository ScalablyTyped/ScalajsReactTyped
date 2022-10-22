package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelStrings.Bold
import typingsJapgolly.activexExcel.activexExcelStrings.Italic
import typingsJapgolly.activexExcel.activexExcelStrings.Regular
import typingsJapgolly.activexExcel.activexExcelStrings.`Bold Italic`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var Background: XlBackground
  
  var Bold: Boolean
  
  var Color: XlRgbColor | Double
  
  var ColorIndex: Double | XlColorIndex
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: Font
  
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`)
  
  var Italic: Boolean
  
  var Name: String
  
  var OutlineFont: Any
  
  val Parent: Any
  
  var Shadow: Any
  
  var Size: Double
  
  var Strikethrough: Boolean
  
  var Subscript: Boolean
  
  var Superscript: Boolean
  
  var ThemeColor: XlThemeColor
  
  var ThemeFont: XlThemeFont
  
  var TintAndShade: Double
  
  var Underline: XlUnderlineStyle
}
object Font {
  
  inline def apply(
    Application: Application,
    Background: XlBackground,
    Bold: Boolean,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotFont_typekey: Font,
    FontStyle: Regular | Italic | Bold | (`Bold Italic`),
    Italic: Boolean,
    Name: String,
    OutlineFont: Any,
    Parent: Any,
    Shadow: Any,
    Size: Double,
    Strikethrough: Boolean,
    Subscript: Boolean,
    Superscript: Boolean,
    ThemeColor: XlThemeColor,
    ThemeFont: XlThemeFont,
    TintAndShade: Double,
    Underline: XlUnderlineStyle
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], ThemeFont = ThemeFont.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Font_typekey")(ExcelDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: XlBackground): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Double | XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotFont_typekey(value: Font): Self = StObject.set(x, "Excel.Font_typekey", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: Regular | Italic | Bold | (`Bold Italic`)): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlineFont(value: Any): Self = StObject.set(x, "OutlineFont", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: Boolean): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: Boolean): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeFont(value: XlThemeFont): Self = StObject.set(x, "ThemeFont", value.asInstanceOf[js.Any])
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: XlUnderlineStyle): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
