package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadItemRef extends StObject {
  
  /** The name of the content reference. The maximum length is 2048 characters. */
  var name: js.UndefOr[String] = js.undefined
}
object UploadItemRef {
  
  inline def apply(): UploadItemRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadItemRef]
  }
  
  extension [Self <: UploadItemRef](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
