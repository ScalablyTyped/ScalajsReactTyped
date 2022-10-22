package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRemovedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[Any] = js.undefined
}
object MetadataRemovedEventUIParam {
  
  inline def apply(): MetadataRemovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovedEventUIParam]
  }
  
  extension [Self <: MetadataRemovedEventUIParam](x: Self) {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
