package typingsJapgolly.activexShdocvw.SHDocVw

import typingsJapgolly.activexShdocvw.activexShdocvwStrings.Cancel
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.Flags
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.Headers
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.PostData
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.Processed
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.TargetFrameName
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.URL
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.cItems
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.cVisits
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.fAvailableOffline
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.hItem
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.pDisp
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.strDate
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.strName
import typingsJapgolly.activexShdocvw.activexShdocvwStrings.strUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type InternetExplorerBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait InternetExplorerBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Any
    
    val Headers: Any
    
    val PostData: Any
    
    val TargetFrameName: Any
    
    val URL: Any
    
    val pDisp: Any
  }
  object InternetExplorerBeforeNavigate2Parameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Any,
      Headers: Any,
      PostData: Any,
      TargetFrameName: Any,
      URL: Any,
      pDisp: Any
    ): InternetExplorerBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternetExplorerBeforeNavigate2Parameter]
    }
    
    extension [Self <: InternetExplorerBeforeNavigate2Parameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Any): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: Any): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type InternetExplorerMediumBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait InternetExplorerMediumBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Any
    
    val Headers: Any
    
    val PostData: Any
    
    val TargetFrameName: Any
    
    val URL: Any
    
    val pDisp: Any
  }
  object InternetExplorerMediumBeforeNavigate2Parameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Any,
      Headers: Any,
      PostData: Any,
      TargetFrameName: Any,
      URL: Any,
      pDisp: Any
    ): InternetExplorerMediumBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternetExplorerMediumBeforeNavigate2Parameter]
    }
    
    extension [Self <: InternetExplorerMediumBeforeNavigate2Parameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Any): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: Any): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type ShellBrowserWindowBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait ShellBrowserWindowBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Any
    
    val Headers: Any
    
    val PostData: Any
    
    val TargetFrameName: Any
    
    val URL: Any
    
    val pDisp: Any
  }
  object ShellBrowserWindowBeforeNavigate2Parameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Any,
      Headers: Any,
      PostData: Any,
      TargetFrameName: Any,
      URL: Any,
      pDisp: Any
    ): ShellBrowserWindowBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellBrowserWindowBeforeNavigate2Parameter]
    }
    
    extension [Self <: ShellBrowserWindowBeforeNavigate2Parameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Any): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: Any): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type ShellNameSpaceFavoritesSelectionChangeArgNames = js.Tuple7[cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline]
  
  trait ShellNameSpaceFavoritesSelectionChangeParameter extends StObject {
    
    val cItems: Double
    
    val cVisits: Double
    
    val fAvailableOffline: Double
    
    val hItem: Double
    
    val strDate: String
    
    val strName: String
    
    val strUrl: String
  }
  object ShellNameSpaceFavoritesSelectionChangeParameter {
    
    inline def apply(
      cItems: Double,
      cVisits: Double,
      fAvailableOffline: Double,
      hItem: Double,
      strDate: String,
      strName: String,
      strUrl: String
    ): ShellNameSpaceFavoritesSelectionChangeParameter = {
      val __obj = js.Dynamic.literal(cItems = cItems.asInstanceOf[js.Any], cVisits = cVisits.asInstanceOf[js.Any], fAvailableOffline = fAvailableOffline.asInstanceOf[js.Any], hItem = hItem.asInstanceOf[js.Any], strDate = strDate.asInstanceOf[js.Any], strName = strName.asInstanceOf[js.Any], strUrl = strUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellNameSpaceFavoritesSelectionChangeParameter]
    }
    
    extension [Self <: ShellNameSpaceFavoritesSelectionChangeParameter](x: Self) {
      
      inline def setCItems(value: Double): Self = StObject.set(x, "cItems", value.asInstanceOf[js.Any])
      
      inline def setCVisits(value: Double): Self = StObject.set(x, "cVisits", value.asInstanceOf[js.Any])
      
      inline def setFAvailableOffline(value: Double): Self = StObject.set(x, "fAvailableOffline", value.asInstanceOf[js.Any])
      
      inline def setHItem(value: Double): Self = StObject.set(x, "hItem", value.asInstanceOf[js.Any])
      
      inline def setStrDate(value: String): Self = StObject.set(x, "strDate", value.asInstanceOf[js.Any])
      
      inline def setStrName(value: String): Self = StObject.set(x, "strName", value.asInstanceOf[js.Any])
      
      inline def setStrUrl(value: String): Self = StObject.set(x, "strUrl", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait WebBrowserBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Any
    
    val Headers: Any
    
    val PostData: Any
    
    val TargetFrameName: Any
    
    val URL: Any
    
    val pDisp: Any
  }
  object WebBrowserBeforeNavigate2Parameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Any,
      Headers: Any,
      PostData: Any,
      TargetFrameName: Any,
      URL: Any,
      pDisp: Any
    ): WebBrowserBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserBeforeNavigate2Parameter]
    }
    
    extension [Self <: WebBrowserBeforeNavigate2Parameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Any): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: Any): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserV1BeforeNavigateArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait WebBrowserV1BeforeNavigateParameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Double
    
    val Headers: String
    
    val PostData: Any
    
    val TargetFrameName: String
    
    val URL: String
  }
  object WebBrowserV1BeforeNavigateParameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Double,
      Headers: String,
      PostData: Any,
      TargetFrameName: String,
      URL: String
    ): WebBrowserV1BeforeNavigateParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserV1BeforeNavigateParameter]
    }
    
    extension [Self <: WebBrowserV1BeforeNavigateParameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserV1FrameBeforeNavigateArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait WebBrowserV1FrameBeforeNavigateParameter extends StObject {
    
    var Cancel: Boolean
    
    val Flags: Double
    
    val Headers: String
    
    val PostData: Any
    
    val TargetFrameName: String
    
    val URL: String
  }
  object WebBrowserV1FrameBeforeNavigateParameter {
    
    inline def apply(
      Cancel: Boolean,
      Flags: Double,
      Headers: String,
      PostData: Any,
      TargetFrameName: String,
      URL: String
    ): WebBrowserV1FrameBeforeNavigateParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserV1FrameBeforeNavigateParameter]
    }
    
    extension [Self <: WebBrowserV1FrameBeforeNavigateParameter](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserV1FrameNewWindowArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
  
  trait WebBrowserV1FrameNewWindowParameter extends StObject {
    
    val Flags: Double
    
    val Headers: String
    
    val PostData: Any
    
    var Processed: Boolean
    
    val TargetFrameName: String
    
    val URL: String
  }
  object WebBrowserV1FrameNewWindowParameter {
    
    inline def apply(
      Flags: Double,
      Headers: String,
      PostData: Any,
      Processed: Boolean,
      TargetFrameName: String,
      URL: String
    ): WebBrowserV1FrameNewWindowParameter = {
      val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], Processed = Processed.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserV1FrameNewWindowParameter]
    }
    
    extension [Self <: WebBrowserV1FrameNewWindowParameter](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setProcessed(value: Boolean): Self = StObject.set(x, "Processed", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserV1NewWindowArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
  
  trait WebBrowserV1NewWindowParameter extends StObject {
    
    val Flags: Double
    
    val Headers: String
    
    val PostData: Any
    
    var Processed: Boolean
    
    val TargetFrameName: String
    
    val URL: String
  }
  object WebBrowserV1NewWindowParameter {
    
    inline def apply(
      Flags: Double,
      Headers: String,
      PostData: Any,
      Processed: Boolean,
      TargetFrameName: String,
      URL: String
    ): WebBrowserV1NewWindowParameter = {
      val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], Processed = Processed.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserV1NewWindowParameter]
    }
    
    extension [Self <: WebBrowserV1NewWindowParameter](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setProcessed(value: Boolean): Self = StObject.set(x, "Processed", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
}
