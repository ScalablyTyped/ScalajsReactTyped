package typingsJapgolly.nodeBrowserHistory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-browser-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getAllHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getChromeHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChromeHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getChromeHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChromeHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getFirefoxHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirefoxHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getFirefoxHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirefoxHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getIEHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIEHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getIEHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIEHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getMaxthonHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxthonHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getMaxthonHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxthonHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getOperaHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperaHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getOperaHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperaHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getSafariHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafariHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getSafariHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafariHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getSeaMonkeyHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeaMonkeyHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getSeaMonkeyHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeaMonkeyHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getTorchHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorchHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getTorchHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTorchHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  inline def getVivaldiHistory(): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVivaldiHistory")().asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  inline def getVivaldiHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVivaldiHistory")(historyTimeLength.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BrowserHistory]]]
  
  trait BrowserHistory extends StObject {
    
    var browser: String
    
    var title: String
    
    var url: String
    
    var utc_time: Double
  }
  object BrowserHistory {
    
    inline def apply(browser: String, title: String, url: String, utc_time: Double): BrowserHistory = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], utc_time = utc_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserHistory]
    }
    
    extension [Self <: BrowserHistory](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUtc_time(value: Double): Self = StObject.set(x, "utc_time", value.asInstanceOf[js.Any])
    }
  }
}
