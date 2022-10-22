package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterProperties extends StObject {
  
  /** The human-readable name of the master. */
  var displayName: js.UndefOr[String] = js.undefined
}
object MasterProperties {
  
  inline def apply(): MasterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterProperties]
  }
  
  extension [Self <: MasterProperties](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
