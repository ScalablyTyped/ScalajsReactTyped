package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpFrameColors
import typingsJapgolly.activexPowerpoint.PowerPoint.PpHTMLVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.WebOptions")
@js.native
/* private */ open class WebOptions ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.WebOptions {
  
  /* CompleteClass */
  var AllowPNG: MsoTriState = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  var FrameColors: PpFrameColors = js.native
  
  /* CompleteClass */
  var HTMLVersion: PpHTMLVersion = js.native
  
  /* CompleteClass */
  var IncludeNavigation: MsoTriState = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.WebOptions = js.native
  
  /* CompleteClass */
  var RelyOnVML: MsoTriState = js.native
  
  /* CompleteClass */
  var ResizeGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var ShowSlideAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
  
  /* CompleteClass */
  var UseLongFileNames: MsoTriState = js.native
}
