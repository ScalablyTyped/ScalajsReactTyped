package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoCharacterSet
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.WebPageFont
import typingsJapgolly.activexOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  @JSName("Excel.DefaultWebOptions_typekey")
  var ExcelDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var LoadPictures: Boolean = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var SaveHiddenData: Boolean = js.native
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

