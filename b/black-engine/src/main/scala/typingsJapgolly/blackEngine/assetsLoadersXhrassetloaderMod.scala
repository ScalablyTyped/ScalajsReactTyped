package typingsJapgolly.blackEngine

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.blackEngine.assetsLoadersAssetLoaderMod.AssetLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsLoadersXhrassetloaderMod {
  
  @JSImport("black-engine/assets/loaders/XHRAssetLoader", "XHRAssetLoader")
  @js.native
  open class XHRAssetLoader protected () extends AssetLoader {
    def this(url: Any) = this()
    
    /* protected */ var mRequest: XMLHttpRequest = js.native
    
    var mimeType: String = js.native
    
    var responseType: String = js.native
  }
}
