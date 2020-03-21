package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoCharacterSet
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.WebPageFont
import typingsJapgolly.activexOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var BrowserLevel: WdBrowserLevel = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  var CheckIfWordIsDefaultHTMLEditor: Boolean = js.native
  val Creator: Double = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var OptimizeForBrowser: Boolean = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  @JSName("Word.DefaultWebOptions_typekey")
  var WordDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

