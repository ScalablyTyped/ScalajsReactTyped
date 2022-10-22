package typingsJapgolly.azureKeyvaultKeys.mod

import typingsJapgolly.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyOptions
  extends StObject
     with OperationOptions {
  
  /**
    * The version of the secret to retrieve. If not
    * specified the latest version of the secret will be retrieved.
    */
  var version: js.UndefOr[String] = js.undefined
}
object GetKeyOptions {
  
  inline def apply(): GetKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyOptions]
  }
  
  extension [Self <: GetKeyOptions](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
