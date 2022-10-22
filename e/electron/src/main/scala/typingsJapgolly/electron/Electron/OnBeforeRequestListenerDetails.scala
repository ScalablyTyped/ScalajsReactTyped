package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`object`
import typingsJapgolly.electron.electronStrings.cspReport
import typingsJapgolly.electron.electronStrings.font
import typingsJapgolly.electron.electronStrings.image
import typingsJapgolly.electron.electronStrings.mainFrame
import typingsJapgolly.electron.electronStrings.media
import typingsJapgolly.electron.electronStrings.other
import typingsJapgolly.electron.electronStrings.ping
import typingsJapgolly.electron.electronStrings.script
import typingsJapgolly.electron.electronStrings.stylesheet
import typingsJapgolly.electron.electronStrings.subFrame
import typingsJapgolly.electron.electronStrings.webSocket
import typingsJapgolly.electron.electronStrings.xhr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeRequestListenerDetails extends StObject {
  
  var frame: js.UndefOr[WebFrameMain_] = js.undefined
  
  var id: Double
  
  var method: String
  
  var referrer: String
  
  /**
    * Can be `mainFrame`, `subFrame`, `stylesheet`, `script`, `image`, `font`,
    * `object`, `xhr`, `ping`, `cspReport`, `media`, `webSocket` or `other`.
    */
  var resourceType: mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket | other
  
  var timestamp: Double
  
  var uploadData: js.Array[UploadData]
  
  var url: String
  
  var webContents: js.UndefOr[WebContents_] = js.undefined
  
  var webContentsId: js.UndefOr[Double] = js.undefined
}
object OnBeforeRequestListenerDetails {
  
  inline def apply(
    id: Double,
    method: String,
    referrer: String,
    resourceType: mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket | other,
    timestamp: Double,
    uploadData: js.Array[UploadData],
    url: String
  ): OnBeforeRequestListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestListenerDetails]
  }
  
  extension [Self <: OnBeforeRequestListenerDetails](x: Self) {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setResourceType(
      value: mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket | other
    ): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUploadData(value: js.Array[UploadData]): Self = StObject.set(x, "uploadData", value.asInstanceOf[js.Any])
    
    inline def setUploadDataVarargs(value: UploadData*): Self = StObject.set(x, "uploadData", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebContents(value: WebContents_): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
    
    inline def setWebContentsId(value: Double): Self = StObject.set(x, "webContentsId", value.asInstanceOf[js.Any])
    
    inline def setWebContentsIdUndefined: Self = StObject.set(x, "webContentsId", js.undefined)
    
    inline def setWebContentsUndefined: Self = StObject.set(x, "webContents", js.undefined)
  }
}
