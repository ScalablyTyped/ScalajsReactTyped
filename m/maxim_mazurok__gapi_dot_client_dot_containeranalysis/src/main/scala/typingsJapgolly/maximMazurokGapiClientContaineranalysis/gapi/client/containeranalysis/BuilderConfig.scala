package typingsJapgolly.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderConfig extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object BuilderConfig {
  
  inline def apply(): BuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderConfig]
  }
  
  extension [Self <: BuilderConfig](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
