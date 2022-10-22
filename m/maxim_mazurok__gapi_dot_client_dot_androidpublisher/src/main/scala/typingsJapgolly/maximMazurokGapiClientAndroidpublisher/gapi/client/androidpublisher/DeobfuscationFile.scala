package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeobfuscationFile extends StObject {
  
  /** The type of the deobfuscation file. */
  var symbolType: js.UndefOr[String] = js.undefined
}
object DeobfuscationFile {
  
  inline def apply(): DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeobfuscationFile]
  }
  
  extension [Self <: DeobfuscationFile](x: Self) {
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
  }
}
