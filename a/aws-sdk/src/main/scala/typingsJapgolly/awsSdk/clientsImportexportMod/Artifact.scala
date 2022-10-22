package typingsJapgolly.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.Description] = js.undefined
  
  var URL: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.URL] = js.undefined
}
object Artifact {
  
  inline def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setURL(value: URL): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}
