package typingsJapgolly.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorFlowVersion extends StObject {
  
  /** The resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** the tensorflow version. */
  var version: js.UndefOr[String] = js.undefined
}
object TensorFlowVersion {
  
  inline def apply(): TensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorFlowVersion]
  }
  
  extension [Self <: TensorFlowVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
