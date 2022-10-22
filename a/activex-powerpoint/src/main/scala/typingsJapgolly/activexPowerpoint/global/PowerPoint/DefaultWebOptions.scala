package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoCharacterSet
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.WebPageFont
import typingsJapgolly.activexOffice.Office.WebPageFonts
import typingsJapgolly.activexPowerpoint.PowerPoint.PpFrameColors
import typingsJapgolly.activexPowerpoint.PowerPoint.PpHTMLVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.DefaultWebOptions")
@js.native
/* private */ open class DefaultWebOptions ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.DefaultWebOptions {
  
  /* CompleteClass */
  var AllowPNG: MsoTriState = js.native
  
  /* CompleteClass */
  var AlwaysSaveInDefaultEncoding: MsoTriState = js.native
  
  /* CompleteClass */
  var CheckIfOfficeIsHTMLEditor: MsoTriState = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  override def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
  /* CompleteClass */
  @JSName("Fonts")
  override val Fonts_Original: WebPageFonts = js.native
  
  /* CompleteClass */
  var FrameColors: PpFrameColors = js.native
  
  /* CompleteClass */
  var HTMLVersion: PpHTMLVersion = js.native
  
  /* CompleteClass */
  var IncludeNavigation: MsoTriState = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.DefaultWebOptions_typekey")
  var PowerPointDotDefaultWebOptions_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.DefaultWebOptions = js.native
  
  /* CompleteClass */
  var RelyOnVML: MsoTriState = js.native
  
  /* CompleteClass */
  var ResizeGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var SaveNewWebPagesAsWebArchives: MsoTriState = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var ShowSlideAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  var UpdateLinksOnSave: MsoTriState = js.native
  
  /* CompleteClass */
  var UseLongFileNames: MsoTriState = js.native
}
