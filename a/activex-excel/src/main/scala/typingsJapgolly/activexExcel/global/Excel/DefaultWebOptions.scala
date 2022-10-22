package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexOffice.Office.MsoCharacterSet
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.WebPageFont
import typingsJapgolly.activexOffice.Office.WebPageFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.DefaultWebOptions")
@js.native
/* private */ open class DefaultWebOptions ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.DefaultWebOptions {
  
  /* CompleteClass */
  var AllowPNG: Boolean = js.native
  
  /* CompleteClass */
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DownloadComponents: Boolean = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.DefaultWebOptions_typekey")
  var ExcelDotDefaultWebOptions_typekey: typingsJapgolly.activexExcel.Excel.DefaultWebOptions = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  override def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
  /* CompleteClass */
  @JSName("Fonts")
  override val Fonts_Original: WebPageFonts = js.native
  
  /* CompleteClass */
  var LoadPictures: Boolean = js.native
  
  /* CompleteClass */
  var LocationOfComponents: String = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PixelsPerInch: Double = js.native
  
  /* CompleteClass */
  var RelyOnCSS: Boolean = js.native
  
  /* CompleteClass */
  var RelyOnVML: Boolean = js.native
  
  /* CompleteClass */
  var SaveHiddenData: Boolean = js.native
  
  /* CompleteClass */
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  var UpdateLinksOnSave: Boolean = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
}
