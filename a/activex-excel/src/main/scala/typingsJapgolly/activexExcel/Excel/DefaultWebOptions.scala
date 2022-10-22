package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoCharacterSet
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.WebPageFont
import typingsJapgolly.activexOffice.Office.WebPageFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultWebOptions extends StObject {
  
  var AllowPNG: Boolean
  
  var AlwaysSaveInDefaultEncoding: Boolean
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var CheckIfOfficeIsHTMLEditor: Boolean
  
  val Creator: XlCreator
  
  var DownloadComponents: Boolean
  
  var Encoding: MsoEncoding
  
  /* private */ @JSName("Excel.DefaultWebOptions_typekey")
  var ExcelDotDefaultWebOptions_typekey: DefaultWebOptions
  
  val FolderSuffix: String
  
  def Fonts(Index: MsoCharacterSet): WebPageFont
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts
  
  var LoadPictures: Boolean
  
  var LocationOfComponents: String
  
  var OrganizeInFolder: Boolean
  
  val Parent: Any
  
  var PixelsPerInch: Double
  
  var RelyOnCSS: Boolean
  
  var RelyOnVML: Boolean
  
  var SaveHiddenData: Boolean
  
  var SaveNewWebPagesAsWebArchives: Boolean
  
  var ScreenSize: MsoScreenSize
  
  var TargetBrowser: MsoTargetBrowser
  
  var UpdateLinksOnSave: Boolean
  
  var UseLongFileNames: Boolean
}
object DefaultWebOptions {
  
  inline def apply(
    AllowPNG: Boolean,
    AlwaysSaveInDefaultEncoding: Boolean,
    Application: Application,
    CheckIfOfficeIsHTMLEditor: Boolean,
    Creator: XlCreator,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    ExcelDotDefaultWebOptions_typekey: DefaultWebOptions,
    FolderSuffix: String,
    Fonts: WebPageFonts,
    LoadPictures: Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    SaveHiddenData: Boolean,
    SaveNewWebPagesAsWebArchives: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UpdateLinksOnSave: Boolean,
    UseLongFileNames: Boolean
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], Fonts = Fonts.asInstanceOf[js.Any], LoadPictures = LoadPictures.asInstanceOf[js.Any], LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], SaveHiddenData = SaveHiddenData.asInstanceOf[js.Any], SaveNewWebPagesAsWebArchives = SaveNewWebPagesAsWebArchives.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UpdateLinksOnSave = UpdateLinksOnSave.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DefaultWebOptions_typekey")(ExcelDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
  
  extension [Self <: DefaultWebOptions](x: Self) {
    
    inline def setAllowPNG(value: Boolean): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    inline def setAlwaysSaveInDefaultEncoding(value: Boolean): Self = StObject.set(x, "AlwaysSaveInDefaultEncoding", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCheckIfOfficeIsHTMLEditor(value: Boolean): Self = StObject.set(x, "CheckIfOfficeIsHTMLEditor", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDownloadComponents(value: Boolean): Self = StObject.set(x, "DownloadComponents", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = StObject.set(x, "Excel.DefaultWebOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    inline def setFonts(value: WebPageFonts): Self = StObject.set(x, "Fonts", value.asInstanceOf[js.Any])
    
    inline def setLoadPictures(value: Boolean): Self = StObject.set(x, "LoadPictures", value.asInstanceOf[js.Any])
    
    inline def setLocationOfComponents(value: String): Self = StObject.set(x, "LocationOfComponents", value.asInstanceOf[js.Any])
    
    inline def setOrganizeInFolder(value: Boolean): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerInch(value: Double): Self = StObject.set(x, "PixelsPerInch", value.asInstanceOf[js.Any])
    
    inline def setRelyOnCSS(value: Boolean): Self = StObject.set(x, "RelyOnCSS", value.asInstanceOf[js.Any])
    
    inline def setRelyOnVML(value: Boolean): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    inline def setSaveHiddenData(value: Boolean): Self = StObject.set(x, "SaveHiddenData", value.asInstanceOf[js.Any])
    
    inline def setSaveNewWebPagesAsWebArchives(value: Boolean): Self = StObject.set(x, "SaveNewWebPagesAsWebArchives", value.asInstanceOf[js.Any])
    
    inline def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    inline def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinksOnSave(value: Boolean): Self = StObject.set(x, "UpdateLinksOnSave", value.asInstanceOf[js.Any])
    
    inline def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
