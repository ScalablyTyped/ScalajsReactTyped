package typingsJapgolly.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfig extends StObject {
  
  /** Google Cloud Storage location where input content is located. */
  var gcsSource: js.UndefOr[GcsSource] = js.undefined
}
object InputConfig {
  
  inline def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  
  extension [Self <: InputConfig](x: Self) {
    
    inline def setGcsSource(value: GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
