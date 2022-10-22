package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadExtensionOptions extends StObject {
  
  /**
    * Whether to allow the extension to read local files over `file://` protocol and
    * inject content scripts into `file://` pages. This is required e.g. for loading
    * devtools extensions on `file://` URLs. Defaults to false.
    */
  var allowFileAccess: Boolean
}
object LoadExtensionOptions {
  
  inline def apply(allowFileAccess: Boolean): LoadExtensionOptions = {
    val __obj = js.Dynamic.literal(allowFileAccess = allowFileAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadExtensionOptions]
  }
  
  extension [Self <: LoadExtensionOptions](x: Self) {
    
    inline def setAllowFileAccess(value: Boolean): Self = StObject.set(x, "allowFileAccess", value.asInstanceOf[js.Any])
  }
}
