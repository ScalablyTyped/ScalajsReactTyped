package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoScreenSize
import typingsJapgolly.activexOffice.Office.MsoTargetBrowser
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebOptions extends StObject {
  
  var AllowPNG: MsoTriState
  
  var Encoding: MsoEncoding
  
  val FolderSuffix: String
  
  var FrameColors: PpFrameColors
  
  var HTMLVersion: PpHTMLVersion
  
  var IncludeNavigation: MsoTriState
  
  var OrganizeInFolder: MsoTriState
  
  /* private */ @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: WebOptions
  
  var RelyOnVML: MsoTriState
  
  var ResizeGraphics: MsoTriState
  
  var ScreenSize: MsoScreenSize
  
  var ShowSlideAnimation: MsoTriState
  
  var TargetBrowser: MsoTargetBrowser
  
  def UseDefaultFolderSuffix(): Unit
  
  var UseLongFileNames: MsoTriState
}
object WebOptions {
  
  inline def apply(
    AllowPNG: MsoTriState,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FrameColors: PpFrameColors,
    HTMLVersion: PpHTMLVersion,
    IncludeNavigation: MsoTriState,
    OrganizeInFolder: MsoTriState,
    PowerPointDotWebOptions_typekey: WebOptions,
    RelyOnVML: MsoTriState,
    ResizeGraphics: MsoTriState,
    ScreenSize: MsoScreenSize,
    ShowSlideAnimation: MsoTriState,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: Callback,
    UseLongFileNames: MsoTriState
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FrameColors = FrameColors.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], IncludeNavigation = IncludeNavigation.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ResizeGraphics = ResizeGraphics.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], ShowSlideAnimation = ShowSlideAnimation.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = UseDefaultFolderSuffix.toJsFn, UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.WebOptions_typekey")(PowerPointDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  extension [Self <: WebOptions](x: Self) {
    
    inline def setAllowPNG(value: MsoTriState): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    inline def setFrameColors(value: PpFrameColors): Self = StObject.set(x, "FrameColors", value.asInstanceOf[js.Any])
    
    inline def setHTMLVersion(value: PpHTMLVersion): Self = StObject.set(x, "HTMLVersion", value.asInstanceOf[js.Any])
    
    inline def setIncludeNavigation(value: MsoTriState): Self = StObject.set(x, "IncludeNavigation", value.asInstanceOf[js.Any])
    
    inline def setOrganizeInFolder(value: MsoTriState): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotWebOptions_typekey(value: WebOptions): Self = StObject.set(x, "PowerPoint.WebOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setRelyOnVML(value: MsoTriState): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    inline def setResizeGraphics(value: MsoTriState): Self = StObject.set(x, "ResizeGraphics", value.asInstanceOf[js.Any])
    
    inline def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    inline def setShowSlideAnimation(value: MsoTriState): Self = StObject.set(x, "ShowSlideAnimation", value.asInstanceOf[js.Any])
    
    inline def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultFolderSuffix(value: Callback): Self = StObject.set(x, "UseDefaultFolderSuffix", value.toJsFn)
    
    inline def setUseLongFileNames(value: MsoTriState): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
