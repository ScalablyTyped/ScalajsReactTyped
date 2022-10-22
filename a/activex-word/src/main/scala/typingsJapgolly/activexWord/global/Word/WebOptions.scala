package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexWord.Word.WdBrowserLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.WebOptions")
@js.native
/* private */ open class WebOptions ()
  extends StObject
     with typingsJapgolly.activexWord.Word.WebOptions {
  
  /* CompleteClass */
  var AllowPNG: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var BrowserLevel: WdBrowserLevel = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  var OptimizeForBrowser: Boolean = js.native
  
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
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.WebOptions_typekey")
  var WordDotWebOptions_typekey: typingsJapgolly.activexWord.Word.WebOptions = js.native
}
