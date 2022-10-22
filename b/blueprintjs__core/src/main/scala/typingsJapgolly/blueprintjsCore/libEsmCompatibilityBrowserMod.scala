package typingsJapgolly.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCompatibilityBrowserMod {
  
  object Browser {
    
    @JSImport("@blueprintjs/core/lib/esm/compatibility/browser", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
    
    inline def isInternetExplorer(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternetExplorer")().asInstanceOf[Boolean]
    
    inline def isWebkit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebkit")().asInstanceOf[Boolean]
  }
}
